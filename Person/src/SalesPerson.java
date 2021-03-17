public class SalesPerson extends Employee{
    private String commision;
    private double basicSalary;
    private int employeeNum;

    public SalesPerson(String spName){
        super(spName);
    }
    public void spEmpNum(int employeeNum){
        this.employeeNum=employeeNum;
    }
    public int spEmpNum(){
        return employeeNum;
    }
    public void spSalary(double basicSalary){
        this.basicSalary=basicSalary;
    }
    public double spSalary(){
        return basicSalary;
    }
    public void spCom(String commision){
        this.commision=commision;
    }
    public String spCom(){
        return commision;
    }


   
}
