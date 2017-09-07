package com.monsanto.mbt;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ShipmentTest {
	Shipment shipment;
	List<Widget> widgets;
	List<Date> sortedDates;

	@Before
	public void init() {
		shipment = new Shipment();
		widgets = WidgetUtils.getSampleWidgets();
		sortedDates = new ArrayList<Date>();
		for (Widget widget: widgets) {
			sortedDates.add(widget.getProductionDate());
		}

		Collections.sort(sortedDates);
	}


	@Test
	public void testShipment_Sorted_By_Color() {
		List<Widget> sortedWidgetList = shipment.sortShipmentByColor(widgets);
		
		//Constraints on shipment creation is that a shipment can hold a maximum of 10 Widgets.
		assertEquals(10, sortedWidgetList.size());
		
		for(int i=0; i< sortedWidgetList.size(); i++) {
			if (i < sortedWidgetList.size() - 1 ) {
				assertTrue(sortedWidgetList.get(i).getColor().equals(sortedWidgetList.get(i +1 ).getColor()) 
						|| (sortedWidgetList.get(i).getColor().compareTo(sortedWidgetList.get(i + 1).getColor()) < 0) );
			}
		}
	}
	
	@Test
	public void testShipment_Sorted_By_Date() {
		List<Widget> sortedWidgetList = shipment.sortShipmentByDate(widgets);
		List<Date> limitedSortedDates = sortedDates.subList(0, 10);
		
		//Constraints on shipment creation is that a shipment can hold a maximum of 10 Widgets.
		assertEquals(10, sortedWidgetList.size());
		
		for(int i=0; i< sortedWidgetList.size(); i++) {
			assertEquals(limitedSortedDates.get(i), sortedWidgetList.get(i).getProductionDate());
			if (i < sortedWidgetList.size() - 1 ) {
				assertTrue(sortedWidgetList.get(i).getProductionDate().equals(sortedWidgetList.get(i +1 ).getProductionDate()) 
						|| sortedWidgetList.get(i).getProductionDate().before(sortedWidgetList.get(i + 1).getProductionDate()));
			}
		}
	}
}
