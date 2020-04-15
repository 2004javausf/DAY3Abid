package com.reavture.beans;

public class Cat {
	
	private String color;
	private String origin;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	@Override
	public String toString() {
		return "Cat [color=" + color + ", origin=" + origin + "]";
	}
	
	
	

}
