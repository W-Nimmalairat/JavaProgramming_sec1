
public class Rectangle extends Shape{
 private double width;
 private double length;
 public Rectangle(double width,double length,String color){
	 super(color);
	 this.width  = width;
	 this.length = length;
 }
 public double getArea() {//บังคับใส่มาจาก abstract
	 return this.width*this.length;
 }
 public String toString() {
	 return "Rectangle[width = "+this.width+",length = "+this.length+","+super.toString()+"]";
 }
 public double getWidth() {
	 return this.width;
 }
 public double getLength() {
	 return this.length;
 }
}
