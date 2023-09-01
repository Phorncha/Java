package week_3;

public class Employee {

    private int id;
    private String fullName;
    private double salary;

    // Constructor
    public Employee(int id, String fullName, double salary) {
        this.id = id;
        this.fullName = fullName;
        this.salary = salary;
    }


    
    // Getter สำหรับ id
    public int getId() {
        return id;
    }

    // Getter for fullName
    public String getFullName() {
        return fullName;
    }

    // Setter for fullName
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // Calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }
 // Increase salary by percentage
    public void increaseSalary(double percentage) {
        salary += (salary * (percentage / 100));
    }
}
