public class CompanyRunner {
    public static void main(String[] args) {
        Company company = () -> {
            System.out.println("Employees are working in the company");
        };
        company.work();
    }
}
