package factory.abstract_factory.obj.impl.color;

import factory.abstract_factory.obj.Color;

public class Green implements Color {
  @Override public void fill() {
    System.out.println("fill green");
  }
}
