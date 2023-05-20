// Package "Myprogram"
package Myprogram;

// Subclass Manager yang mewarisi dari kelas Employee
public class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int age, int salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    // Getter dan Setter untuk department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Override method displayInfo() untuk menampilkan informasi karyawan
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department\t: " + department);
    }

    // Method khusus untuk manajer
    public void manageTeam() {
        System.out.println("Manager is managing a team.");
    }
}
