package proxy.pro;

public class Product implements ProductImpl{

    @Override
    public void saleProduct(Float money){
        System.out.println("卖了 " + money + " 块钱");
    }
}
