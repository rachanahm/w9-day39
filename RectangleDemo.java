//Write a Java class called Rectangle that has fields for the rectangle's width and height. Write a custom Comparator implementation called AreaComparator that sorts Rectangle objects in ascending order based on their area (i.e., width x height). Then, modify the Rectangle class to implement the Comparable interface, so that Rectangle objects are sorted in ascending order based on their perimeter (i.e., 2 x width + 2 x height). Test your implementation by creating a list of Rectangle objects and sorting them using both the AreaComparator and the Comparable implementation.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
class Rectangle implements Comparable<Rectangle>{
  double width;
  double height;
  Rectangle(double width,double height){
    this.width=width;
    this.height=height;
  }
   public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
class AreaComparator implements Comparator<Rectangle>{
  public int compare(Rectangle r1, Rectangle r2) {
      double area1 = r1.getWidth() * r1.getHeight();
      double area2 = r2.getWidth() * r2.getHeight();
      if (area1 > area2) {
        return 1;
      } else if (area1 < area2) {
        return -1;
      } else {
        return 0;
      }
    }
  }
  public int compareTo(Rectangle r){
    double perimeter1 = 2 * width + 2 * height;
    double perimeter2 = 2 * r.width + 2 * r.height;
    if(perimeter1 > perimeter2){
      return 1;
    } else if(perimeter1 < perimeter2){
      return -1;
    } else{
      return 0;
    }
  }
}

class RectangleDemo{
  public static void main(String args[]){
    ArrayList<Rectangle> rectangles=new ArrayList<Rectangle>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<3;i++){
      rectangles.add(new Rectangle(sc.nextDouble(),sc.nextDouble()));
    }
    for(Rectangle r : rectangles){
      System.out.println("Width: " + r.getWidth() + ", Height: " + r.getHeight());
    }

    Collections.sort(rectangles, AreaComparator());

    System.out.println("\nAfter sorting based on area:");
    for(Rectangle r : rectangles){
      System.out.println( r.getWidth() +" " + r.getHeight());
    }

    Collections.sort(rectangles);
    for(Rectangle r : rectangles){
      System.out.println(r.getWidth() +" " + r.getHeight());
    }
  }
}