package com.monsanto.mbt;

import java.util.Comparator;
import java.util.Date;

public class Widget {
	private int serialNumber;
	private String color;
	private Date productionDate;

	public Widget(int serialNumber, String color, Date productionDate) {
		this.serialNumber = serialNumber;
		this.color = color;
		this.productionDate = productionDate;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getProductionDate() {
		return productionDate;
	}

	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}

	public static Comparator<Widget> colorComp = new Comparator<Widget>() {

		
		public int compare(Widget widget1, Widget widget2) {

			return widget1.getColor().toUpperCase()
					.compareTo(widget2.getColor().toUpperCase());
		}
	};

	public static Comparator<Widget> ProdDateComp = new Comparator<Widget>() {

		
		public int compare(Widget widjet1, Widget widjet2) {

			if (widjet1.getProductionDate().before(widjet2.getProductionDate())) {
				return -1;
			} else if (widjet1.getProductionDate().after(
					widjet2.getProductionDate())) {
				return 1;
			} else {
				return 0;
			}
		}

	};
}
