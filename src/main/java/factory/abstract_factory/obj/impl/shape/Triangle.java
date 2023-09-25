package factory.abstract_factory.obj.impl.shape;

import factory.abstract_factory.obj.Shape;

public class Triangle implements Shape {
  @Override public void draw(float height, float bottom) {
    System.out.println("this triangle area is " + height * bottom / 2 + "");
  }
}
