package factory.abstract_factory.factory;

import factory.abstract_factory.Contents;
import factory.abstract_factory.obj.Color;
import factory.abstract_factory.obj.Shape;
import factory.abstract_factory.obj.impl.color.Green;
import factory.abstract_factory.obj.impl.color.Yellow;

public class ColorFactory implements Factory {

  @Override public Color getColor(Contents.ColorType type) {
    if (type == null) {
      return null;
    }
    if (type.equals(Contents.ColorType.GREEN)) {
      return new Green();
    } else if (type.equals(Contents.ColorType.YELLOW)) {
      return new Yellow();
    }
    return null;
  }

  @Override public Shape getShape(Contents.ShapeType shape) {
    return null;
  }
}
