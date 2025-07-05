public class GymRunner {
    public static void main(String[] args) {
        Gym gym = () -> {
            System.out.println("People are exercising in the gym");
        };
        gym.exercise();
    }
}
