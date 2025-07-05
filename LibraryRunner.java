public class LibraryRunner {
    public static void main(String[] args) {
        Library library = () -> {
            System.out.println("People read books quietly in the library");
        };
        library.read();
    }
}
