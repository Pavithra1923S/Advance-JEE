public class CinemaRunner {
    public static void main(String[] args) {
        Cinema cinema = () -> {
            System.out.println("A movie is playing in the cinema");
        };
        cinema.playMovie();
    }
}
