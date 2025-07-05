public class HospitalRunner {
    public static void main(String[] args) {
        Hospital hospital = () -> {
            System.out.println("The hospital serves 24/7");
        };
        hospital.serve();
    }
}
