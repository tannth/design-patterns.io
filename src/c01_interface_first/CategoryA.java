package c01_interface_first;

public class CategoryA {
    double baseSalary;
    double OT;

    public CategoryA(double base, double overTime) {
        baseSalary = base;
        OT = overTime;
    }

    public double getSalary() {
        return (baseSalary + OT);
    }
}
