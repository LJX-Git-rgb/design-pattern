package factory.simple_factory.obj;

public class Triangle implements Shape {
  @Override public void draw(float height, float bottom) {
    System.out.println("this triangle area is " + height * bottom / 2 + "");
  }
}
