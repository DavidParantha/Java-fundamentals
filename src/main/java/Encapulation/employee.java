package Encapulation;

public class employee {

    private String name;
    private int empID;
    private String companyName;
    private boolean isPermanentEmployee;
    private long salary;
    private long phoneNumber;

    public employee(String name, int empID, String companyName, boolean isPermanentEmployee,
                    long salary, long phoneNumber) {
        this.name = name;
        this.empID = empID;
        this.companyName = companyName;
        this.isPermanentEmployee = isPermanentEmployee;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public employee setName(String name) {
        this.name = name;
        return this;
    }

    public int getEmpID() {
        return empID;
    }

    public employee setEmpID(int empID) {
        this.empID = empID;
        return this;
    }

    public String getCompanyName() {
        return companyName;
    }

    public employee setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public boolean isPermanentEmployee() {
        return isPermanentEmployee;
    }

    public employee setPermanentEmployee(boolean permanentEmployee) {
        isPermanentEmployee = permanentEmployee;
        return this;
    }

    public long getSalary() {
        return salary;
    }

    public employee setSalary(long salary) {
        this.salary = salary;
        return this;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public employee setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String info() {
        return "Employee{" +
                "name=" + name +
                ", empID=" + empID +
                ", companyName=" + companyName +
                ", isPermanentEmployee=" + isPermanentEmployee +
                ", salary=" + salary +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}



