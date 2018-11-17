package com.monsanto.mbt;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ShipmentTest {
	Shipment shipment;
	List<Widget> widgets;

	@Before
	public void init() {
		shipment = new Shipment();
		widgets = WidgetUtils.getSampleWidgets();

	}

	@Test
	public void testShipment_Sorted_By_Color() {
		List<Widget> shipmentSortedByColor = shipment.Shipment_Sorted_By_Color(widgets);
		
		// maximum of 10 Widgets.
		assertEquals(10, shipmentSortedByColor.size());
		assertEquals(2, shipmentSortedByColor.get(0).getSerialNumber());
		assertEquals(6, shipmentSortedByColor.get(1).getSerialNumber());
		assertEquals(8, shipmentSortedByColor.get(2).getSerialNumber());
		assertEquals(10, shipmentSortedByColor.get(3).getSerialNumber());
		assertEquals(20, shipmentSortedByColor.get(4).getSerialNumber());
		assertEquals(22, shipmentSortedByColor.get(5).getSerialNumber());
		assertEquals(4, shipmentSortedByColor.get(6).getSerialNumber());
		assertEquals(5, shipmentSortedByColor.get(7).getSerialNumber());
		assertEquals(7, shipmentSortedByColor.get(8).getSerialNumber());
		assertEquals(11, shipmentSortedByColor.get(9).getSerialNumber());
	}

	@Test
	public void testShipment_Sorted_By_Date() {
		List<Widget> sortedWidgetList = shipment.Shipment_Sorted_By_Date(widgets);

		// maximum of 10 Widgets.
		assertEquals(10, sortedWidgetList.size());
		assertEquals(9, sortedWidgetList.get(0).getSerialNumber());
		assertEquals(19, sortedWidgetList.get(1).getSerialNumber());
		assertEquals(1, sortedWidgetList.get(2).getSerialNumber());
		assertEquals(21, sortedWidgetList.get(3).getSerialNumber());
		assertEquals(3, sortedWidgetList.get(4).getSerialNumber());
		assertEquals(23, sortedWidgetList.get(5).getSerialNumber());
		assertEquals(2, sortedWidgetList.get(6).getSerialNumber());
		assertEquals(22, sortedWidgetList.get(7).getSerialNumber());
		assertEquals(7, sortedWidgetList.get(8).getSerialNumber());
		assertEquals(17, sortedWidgetList.get(9).getSerialNumber());

	}
}
