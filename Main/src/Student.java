public class Student{
    private String studNo;
    private int q1;
    private int q2;
    private int me;
    private int total;
 // Note: Assume that these fields below have already been declared using private access specifiers.
        //  Variable studNo is String
         // Variables total, q1, q2 and me are int data types.
      public Student(){
          String studNo = "none";
          int q1 = 0;
          int q2 = 0;
          int me = 0;
	}
	public Student(String sNo,String sName,int q1, int q2, int me){
		this.studNo=sNo;
		this.q1 =q1;
		this.q2 =q2;
		this.me=me;
	}   
	public void studentNo(String studNo){
            this.studNo = studNo;
        }// Assume that this method set the value of field studNo.
	public String studentNo(){
            return studNo;
        }// Assume that this method return the value of studNo.
	public void quiz1(int q1){
            this.q1 = q1;
        } // Assume that this method set the value of field q1.
	public int quiz1(){
            return q1;
        }// Assume that this method return the value of q1;
	public void quiz2(int q2){
            this.q2 = q2;
        } // Assume that this method set the value of field q2.
	public int quiz2(){
            return q2;
        } // Assume that this method return the value of q2.
	public void midExam(int me){
            this.me = me;
        }// Assume that this method set the value of field me.
	public int midExam(){
            return me;
        }// Assume that this method return the value of me.
  	public void compute(Student s){int total = s.quiz1()+s.quiz2();
}
    public String quiz(){
  		if ((total>=100) && (total <=200))
  		 	return "1.25";
  	 	else if ((total>=50) && (total<100))
  	 		return "2.5";
  	 	else 
  	 		return "3.0";
  		}
    public String meResult(){
  		if (me >=50) 
  		    return "Passed";
  		else
     		return "Failed";
    } 
    public void print(Student s){System.out.println(s.studentNo()+ ","+ s.quiz()+","+s.meResult());}       
} // end of Student class