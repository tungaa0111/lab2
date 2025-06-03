import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        double baseSalary = sc.nextDouble();
        double sales = sc.nextDouble();

        Employee emp = new Employee(name, baseSalary, sales);
        double total = emp.calculateTotalSalary();

        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
