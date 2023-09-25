package factory.simple_factory.obj;

public class Circle implements Shape {
  @Override public void draw(float radius, float x) {
    // print circle的面积
    System.out.println("this circle area is " + radius * radius * 3.14);
  }
}
