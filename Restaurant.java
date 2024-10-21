package com.pcwk.ehr.restaurant;

import java.awt.Menu;
import java.util.List;
import java.util.Objects;

public class Restaurant {
	
	private String category; // 레스토랑 카테고리
	private String name; // 레스토랑 이름
    private List<Menu> menus; // 레스토랑 메뉴
 
	public Restaurant() {
		super();		
	}

	public Restaurant(String name, String category, List<Menu> menus) {
		super();
		this.name = name;
		this.category = category;
		this.menus = menus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", category=" + category + ", menus=" + menus + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(category, menus, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(category, other.category) && Objects.equals(menus, other.menus)
				&& Objects.equals(name, other.name);
	}
    
	
    

}
