package example.product;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];

        productOrders[0] = new ProductOrder();
        productOrders[0].productName = "두부";
        productOrders[0].price = 2000;
        productOrders[0].quantity = 2;

        productOrders[1] = new ProductOrder();
        productOrders[1].productName = "김치";
        productOrders[1].price = 5000;
        productOrders[1].quantity = 1;

        productOrders[2] = new ProductOrder();
        productOrders[2].productName = "콜라";
        productOrders[2].price = 1500;
        productOrders[2].quantity = 2;

        int result = 0;
        for(ProductOrder productOrder : productOrders) {
            System.out.printf("상품명: %s, ", productOrder.productName);
            System.out.printf("상품명: %d, ", productOrder.price);
            System.out.printf("상품명: %d", productOrder.quantity);
            System.out.println();

            result += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액: "  + result);
    }
}
