package com.monsanto.mbt;

import java.util.Collections;
import java.util.List;

public class Shipment {

	public List<Widget> Shipment_Sorted_By_Date(List<Widget> widgetList) {

		Collections.sort(widgetList, Widget.ProdDateComp);
		List<Widget> sortedWidgets = widgetList.subList(0, 10);
		return sortedWidgets;
	}

	public List<Widget> Shipment_Sorted_By_Color(List<Widget> widgetList) {
		Collections.sort(widgetList, Widget.colorComp);
		List<Widget> sortedWidgets = widgetList.subList(0, 10);
		return sortedWidgets;

	}

}