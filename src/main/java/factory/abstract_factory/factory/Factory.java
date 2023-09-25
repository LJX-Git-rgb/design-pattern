package factory.abstract_factory.factory;

import factory.abstract_factory.Contents;
import factory.abstract_factory.obj.Color;
import factory.abstract_factory.obj.Shape;

public interface Factory {
  Color getColor(Contents.ColorType type);

  Shape getShape(Contents.ShapeType type);
}
