﻿package homework;

public class Point<T> {
	
	private Double x, y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double printX() {
		return x;
	}
	
	public double printY() {
		return y;
	}
	
	public void editX(double x) {
		this.x = x;
	}
	
	public void editY(double y) {
		this.y = y;
	}
	
	public String toString() {
		return "(" + x.toString() + "," + y.toString() + ")";
	}
	
	public void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("马平川".compareTo("习近平"));
	}

}
