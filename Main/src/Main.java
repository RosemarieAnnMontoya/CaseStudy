public class Main {
    public static void main(String[]args){
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        Student s6 = new Student();
        Student s7 = new Student("2023-B","Mr.White",80,40,50);
        Student s8 = new Student("2023-C","Ms.Black",20,10,90);
        Student s9 = new Student("2023-D","Mr.Green",60,60,80);
        Student s10 = new Student();
        s1.studentNo("2023-A");
        s1.quiz1(0);
        s1.quiz2(150);
        s1.midExam(90);
        s1.compute(s1);
        s1.print(s1);
        s2.quiz1(100);
        s2.quiz2(75);
        s2.midExam(40);
        s2.compute(s2);
        s2.print(s2);
        s3.quiz1(50);
        s3.quiz2(25);
        s3.midExam(65);
        s3.compute(s3);
        s3.print(s3);
        s4.quiz1(100);
        s4.midExam(80);
        s4.compute(s4);
        s4.print(s4);
        s5.quiz1(100);
        s5.compute(s5);
        s5.print(s5);
        s6.midExam(30);
        s6.compute(s6);
        s6.print(s6);
        s7.compute(s7);
        s7.print(s7);
        s8.compute(s8);
        s8.print(s8);
        s9.compute(s9);
        s9.print(s9);
        s10.compute(s10);
        s10.print(s10);
    }
}