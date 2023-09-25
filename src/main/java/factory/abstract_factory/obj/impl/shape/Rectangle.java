package factory.abstract_factory.obj.impl.shape;

import factory.abstract_factory.obj.Shape;

public class Rectangle implements Shape {
  @Override public void draw(float width, float height) {
    System.out.println("this rectangle area is " + width * height + "");
  }
}
