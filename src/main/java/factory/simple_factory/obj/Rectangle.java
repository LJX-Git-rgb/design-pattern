package factory.simple_factory.obj;

public class Rectangle implements Shape {
  @Override public void draw(float width, float height) {
    System.out.println("this rectangle area is " + width * height + "");
  }
}
