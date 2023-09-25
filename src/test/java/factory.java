import factory.abstract_factory.Contents;
import factory.abstract_factory.factory.Factory;
import factory.abstract_factory.factory.FactoryProducer;
import factory.simple_factory.obj.Shape;
import factory.simple_factory.ShapeFactory;
import org.junit.jupiter.api.Test;

public class factory {
  /**
   * 工厂模式可以帮助我们封装对象的创建逻辑，提供统一的接口来创建不同类型的对象，从而使得客户端代码更加灵活和可维护。
   * 同时，工厂模式也支持扩展，可以方便地引入新的产品类型，而无需修改现有的客户端代码。
   *
   * 简单工厂模式（Simple Factory Pattern）：由一个具体工厂类负责创建所有产品的实例。
   * 客户端通过向工厂传递不同的参数来请求创建不同类型的产品。
   * 简单工厂模式通常只有一个具体工厂类，适用于创建对象较少且创建逻辑相对简单的情况。
   * @param args
   */

  @Test public static void simpleFactory(String[] args) {
    ShapeFactory shapeFactory = new ShapeFactory();
    Shape circle = shapeFactory.getShape(Contents.ShapeType.CIRCLE);
    Shape rectangle = shapeFactory.getShape(Contents.ShapeType.RECTANGLE);
    Shape triangle = shapeFactory.getShape(Contents.ShapeType.TRIANGLE);

    circle.draw(10, 0);
    rectangle.draw(5, 10);
    triangle.draw(20, 10);
  }

  @Test public static void abstractFactory(String[] args) {
    Factory shapeFactory = FactoryProducer
        .getFactory(Contents.FactoryType.SHAPE);
    Factory colorFactory = FactoryProducer
        .getFactory(Contents.FactoryType.COLOR);

    factory.abstract_factory.obj.Shape shape1 = shapeFactory
        .getShape(Contents.ShapeType.CIRCLE);
    factory.abstract_factory.obj.Shape shape2 = shapeFactory
        .getShape(Contents.ShapeType.RECTANGLE);
    factory.abstract_factory.obj.Shape shape3 = shapeFactory
        .getShape(Contents.ShapeType.TRIANGLE);
    shape1.draw(10, 0);
    shape2.draw(5, 10);
    shape3.draw(20, 10);
    
    factory.abstract_factory.obj.Color color1 = colorFactory.getColor(Contents.ColorType.RED);
    factory.abstract_factory.obj.Color color2 = colorFactory.getColor(Contents.ColorType.GREEN);
    factory.abstract_factory.obj.Color color3 = colorFactory.getColor(Contents.ColorType.YELLOW);
    color1.fill();
    color2.fill();
    color3.fill();
  }
}
