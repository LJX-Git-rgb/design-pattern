import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import proxy.Product;
import proxy.ProductImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxy {
    public static void main(String[] args) {
        Product product = new Product();

        //基于接口
        ProductImpl proimpl = (ProductImpl) Proxy.newProxyInstance(product.getClass().getClassLoader(),
                product.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object returnValue = null;
                Float money = (Float) args[0];
                if ("saleProduct".equals(method.getName())){
                    returnValue = method.invoke(product,money * 0.8f);
                }
                return returnValue;
            }
        });
        proimpl.saleProduct(1000f);

        //基于子类 cglib 
        Product product1 = (Product) Enhancer.create(product.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                Object returnValue = null;
                Float money = (Float) objects[0];
                if ("saleProduct".equals(method.getName())){
                    returnValue = method.invoke(product,money * 0.8f);
                }
                return returnValue;
            }
        });
        product1.saleProduct(1000f);
    }
}
