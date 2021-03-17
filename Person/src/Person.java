public class Person{
    private String pName;

    public Person(String pName){
        this.pName=pName;
    }
    public void getName(String pName){
        this.pName=pName;
    }
    public String getName(){
        return pName;
    }
}