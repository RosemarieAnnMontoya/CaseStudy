public class Employee extends Person{
    private int employeeNum;
    private double basicSalary;
    public Employee(String empName){
        super(empName);
    }
    public void getEmployeeNumber(int employeeNum){
        this.employeeNum=employeeNum;
    }
    public int getEmployeeNumber(){
        return employeeNum;
    }
    public void getBasicSalary(int basicSalary){
        this.basicSalary=basicSalary;
    }
    public double getBasicSalary(){
        return basicSalary;
    }
}
