package Entities;

public class Retangulo {

	public double height;
	public double width;
	
	public double area() {
		return this.height*this.width;
	}
	public double perimeter() {
		return ((2*this.height)+(2*this.height));
	}
	public double diagonal() {
		double diagonal_ret = Math.sqrt((Math.pow(this.height,2))+(Math.pow(this.width,2)));
		return diagonal_ret;
	}
}
