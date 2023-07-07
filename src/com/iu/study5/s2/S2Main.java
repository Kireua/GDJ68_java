package com.iu.study5.s2;

public class S2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tv tv = new Tv();
		tv.setVendor("SAMSUNG");
		tv.setModel("QLED TV");
		tv.setColor("Black");
		tv.setInch(90);
		tv.setPrice(3200000);
		tv.setPoint(32000);
		
		Computer computer = new Computer();
		computer.setVendor("LG");
		computer.setModel("GRAM");
		computer.setColor("White");
		computer.setCpu("I7-카키브레이크");
		computer.setPrice(1860000);
		computer.setPoint(18600);
		
		Phone phone = new Phone();
		phone.setVendor("APPLE");
		phone.setModel("IPHONE 23");
		phone.setOs("IOS");
		phone.setPrice(1300000);
		phone.setPoint(13200);
		
		ElectronicProduct[] electronicProduct = new ElectronicProduct[2];
		electronicProduct[0]=tv;
		electronicProduct[1]=phone;
		
		
		Customer winter = new Customer();
//		winter.buy(tv);
		
		winter.buy(electronicProduct);
	}

}
