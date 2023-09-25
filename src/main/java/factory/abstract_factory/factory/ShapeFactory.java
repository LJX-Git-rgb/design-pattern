package factory.abstract_factory.factory;

import factory.abstract_factory.Contents;
import factory.abstract_factory.obj.Color;
import factory.abstract_factory.obj.Shape;
import factory.abstract_factory.obj.impl.shape.*;

public class ShapeFactory implements Factory {
  @Override public Color getColor(Contents.ColorType type) {
    return null;
  }

  public Shape getShape(Contents.ShapeType shapeType) {
    if (shapeType == null) {
      return null;
    }
    if (shapeType.equals(Contents.ShapeType.CIRCLE)) {
      return new Circle();
    } else if (shapeType.equals(Contents.ShapeType.RECTANGLE)) {
      return new Rectangle();
    } else if (shapeType.equals(Contents.ShapeType.TRIANGLE)) {
      return new Triangle();
    }
    return null;
  }
}
