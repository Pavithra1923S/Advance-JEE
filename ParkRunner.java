public class ParkRunner {
    public static void main(String[] args) {
        Park park = () -> {
            System.out.println("People walk and relax in the park");
        };
        park.walk();
    }
}
