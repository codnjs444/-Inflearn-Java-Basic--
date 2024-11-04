package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        ProductOrder menu1 = new ProductOrder();
        menu1.productName = "두부";
        menu1.price = 3000;
        menu1.quantity = 3;
        productOrders[0] = menu1;

        ProductOrder menu2 = new ProductOrder();
        menu2.productName = "토마토";
        menu2.price = 1000;
        menu2.quantity = 4;
        productOrders[1] = menu2;

        ProductOrder menu3  = new ProductOrder();
        menu3.productName = "감자";
        menu3.price = 6000;
        menu3.quantity = 5;
        productOrders[2] = menu3;

        int totalPrice = 0;
        for (ProductOrder productOrder : productOrders) {
            totalPrice += productOrder.price * productOrder.quantity;
            System.out.println(productOrder.productName + productOrder.price + productOrder.quantity);
        }
        System.out.println("총 가격은 = " + totalPrice);

    }
}
