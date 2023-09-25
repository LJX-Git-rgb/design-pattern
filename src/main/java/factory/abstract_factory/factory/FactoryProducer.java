package factory.abstract_factory.factory;

import factory.abstract_factory.Contents;

public class FactoryProducer {
  public static Factory getFactory(Contents.FactoryType choice) {
    if (choice == Contents.FactoryType.SHAPE) {
      return new ShapeFactory();
    } else if (choice == Contents.FactoryType.COLOR) {
      return new ColorFactory();
    }
    return null;
  }
}
