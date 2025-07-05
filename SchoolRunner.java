public class SchoolRunner {
    public static void main(String[] args) {
        School school = () -> {
            System.out.println("The school opens at 9 AM");
        };
        school.open();
    }
}
