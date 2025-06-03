public class Employee {
    private String name;
    private double baseSalary;
    private double sales;

    public Employee(String name, double baseSalary, double sales) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.sales = sales;
    }

    public double calculateTotalSalary() {
        return baseSalary + (sales * 0.15);
    }
}
