package factory.simple_factory;

import factory.abstract_factory.Contents;
import factory.simple_factory.obj.*;

public class ShapeFactory {
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
