package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("입력할 주문의 개수를 입력하세요 :");
        int orderNum = scanner.nextInt();

        ProductOrder[] orders = new ProductOrder[orderNum];
        scanner.nextLine();
        for (int i = 0; i < orderNum; i++) {
            orders[i] = new ProductOrder();
            System.out.println(i + "번 째 주문 정보를 입력하세요.");
            System.out.println("상품 명 :");
            orders[i].productName = scanner.nextLine();
            System.out.println("가격 :");
            orders[i].price = scanner.nextInt();
            System.out.println("수량 :");
            orders[i].quantity = scanner.nextInt();
            scanner.nextLine();
        }

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);
        System.out.println("총 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return productOrder;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품 명 : " + order.productName + " 가격 : " + order.price + " 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] productOrders) {
        int totalAmount = 0;
        for (ProductOrder productOrder : productOrders) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        return totalAmount;
    }
}

