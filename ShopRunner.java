public class ShopRunner {
    public static void main(String[] args) {
        Shop shop = () -> {
            System.out.println("Customers are buying items from the shop");
        };
        shop.buy();
    }
}
