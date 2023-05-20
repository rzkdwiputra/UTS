
// Import package "Myprogram"
import Myprogram.*;

// Kelas Main
public class Main {
    public static void main(String[] args) {
        // Membuat objek karyawan biasa
        Employee employee = new Employee("Atep Kasbon", 25, 5000000);
        employee.displayInfo();

        System.out.println();

        // Membuat objek karyawan manajer
        Manager manager = new Manager("Atep Subur", 35, 12000000, "Head Sales");
        manager.displayInfo();
        manager.manageTeam();
    }
}
