package quiz3;

import static java.lang.Math.sqrt;

public class Triangle extends GeometricObject{
	
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle( double side1, double side2, double side3){
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(){}
	
	public double getSide1() {
		return side1;
	}
	public void setSide1(double side1) {
		this.side1 = side1;
	}
	public double getSide2() {
		return side2;
	}
	public void setSide2(double side2) {
		this.side2 = side2;
	}
	public double getSide3() {
		return side3;
	}
	public void setSide3(double side3) {
		this.side3 = side3;
	}

	public double getPerimeter(){
		return(this.side1 + this.side2 + this.side3);
	}
	
	public double getArea(){
		double SemiPerimeter = getPerimeter() / 2;
		return Math.sqrt(SemiPerimeter * ((SemiPerimeter - this.side1) * (SemiPerimeter - this.side2) * 
				(SemiPerimeter - this.side3)));
	}
	
	public String toString(){
		return "Triangle Describtion: Side 1 = " + side1 + " Side 2 = " + side2 + " Side 3 = " + side3;
	
	}
	
}
