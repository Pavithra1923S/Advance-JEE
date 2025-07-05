public class RestaurantRunner {
    public static void main(String[] args) {
        Restaurant restaurant = () -> {
            System.out.println("Delicious food is being served");
        };
        restaurant.serveFood();
    }
}
