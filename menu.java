package com.pcwk.ehr.restaurant;

import java.util.Objects;

public class menu {

	private String name; // 메뉴 이름
	private int price; //  가격
	
	public menu() {
		super();		
	}

	public menu(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "menu [name=" + name + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		menu other = (menu) obj;
		return Objects.equals(name, other.name) && price == other.price;
	}
	
	
	
	
	
}
