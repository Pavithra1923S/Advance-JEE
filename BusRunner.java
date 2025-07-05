public class BusRunner {
    public static void main(String[] args) {
        Bus bus = () -> {
            System.out.println("The bus is traveling to the city");
        };
        bus.travel();
    }
}
