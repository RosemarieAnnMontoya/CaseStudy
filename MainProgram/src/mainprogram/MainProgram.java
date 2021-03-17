
package mainprogram;

public class MainProgram {
   
    public static void main(String[] args) {
       
        HomeCare salesPerson = new HomeCare();
        
        HomeCare customer1 = new HomeCare();
        HomeCare customer2 = new HomeCare(); 
        
            customer1.setSofaType ("5 seater");
            customer1.setCustName ("John");
            customer1.setCustAddress ("Tarlac");
            customer1.setDelDate ("8/30/2020");
            
            salesPerson.takeOrder (customer1.getSofaType(),customer1.getCustName(),
                    customer1.getCustAddress(),customer1.getDelDate() );
            
            salesPerson.result (customer1.getSofaType(),customer1.getCustName(),
                    customer1.getCustAddress(),customer1.getDelDate() );
            
         customer2.setSofaType ("10 seater");
         customer2.setCustName ("Peter");
         customer2.setCustAddress ("Manila");
         customer2.setDelDate ("9/02/2020");
         
         salesPerson.takeOrder (customer2.getSofaType(),customer2.getCustName(),
                    customer2.getCustAddress(),customer2.getDelDate() );
            
            salesPerson.result (customer2.getSofaType(),customer2.getCustName(),
                    customer2.getCustAddress(),customer2.getDelDate() );
    }
    
}