public class MainClass {
    public static void main(String args[]){
    Printer p1=new Printer();
    Customer c1=new Customer("Mary Rose Llio");
    Employee emp1=new Employee("Anna Marie Casti");
    Manager m1=new Manager("Rosemarie Ann ");
    SalesPerson sp1=new SalesPerson("Anne Castle");
    Secretary s1=new Secretary("Rose Ann Mons");
    

    //input for customer
    c1.purchase("109 Talimundoc San Miguel Concepcion, Tarlac");
    c1.getBudget(22000);
    //output for customer
    p1.customer(c1);
    

    //input for employee
    emp1.getEmployeeNumber(123456);
    emp1.getBasicSalary(15000);
    //output for employee
    p1.employee(emp1);
    


    //input for manager
    m1.mEmpNum(78910);
    m1.mAllowance(10000);
    m1.mSalary(20000);
    //output for manager
    p1.manager(m1);


    //input for salesPerson
    sp1.spEmpNum(67867);
    sp1.spSalary(10000);
    sp1.spCom("Sales Lady");
    //output for salesPerson
    p1.salesPerson(sp1);

    
    //input for secretary
    s1.sEmpNum(54321);
    s1.sSalary(17000);
    //output for secretary
    p1.secretary(s1);



}
}