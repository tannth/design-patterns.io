package c1_interface.first;

public class Employee {
    CategoryA salaryCalculator;
    String name;

    public Employee(String s, CategoryA c) {
        name = s;
        salaryCalculator = c;
    }

    public void display() {
        System.out.println("Name=" + name);
        System.out.println("salary= " + salaryCalculator.getSalary());
    }
}
