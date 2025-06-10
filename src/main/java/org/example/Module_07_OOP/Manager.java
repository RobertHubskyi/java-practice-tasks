package org.example.Module_07_OOP;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }

    @Override
    public void info() {
        System.out.println("Ім'я менеджера: " + getName() + ", зарплата: " + getSalary() + ", посада: " + department);
    }

    public static void main(String[] args) {
        Employee[] staff = {
                new Employee("Bob", 2100),
                new Manager("Nas", 4100, "manager"),
                new Manager("Sol", 3100, "manager")
        };

        for (Employee employees : staff){
            employees.info();
        }
    }
}
