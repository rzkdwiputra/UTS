// Package "Myprogram"
package Myprogram;

// Kelas Employee
public class Employee {
    private String name;
    private int age;
    private int salary;

    // Constructor
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter dan Setter untuk name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter untuk age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter dan Setter untuk salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Method untuk menampilkan informasi karyawan
    public void displayInfo() {
        System.out.println("Name\t\t: " + name);
        System.out.println("Age\t\t: " + age);
        System.out.println("Salary\t\t: Rp." + salary);
    }
}