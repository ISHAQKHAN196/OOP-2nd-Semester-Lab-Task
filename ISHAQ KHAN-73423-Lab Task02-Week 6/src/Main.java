import java.util.Scanner;
class University{
    Scanner s=new Scanner(System.in);//ISHAQKHAN--73423
    String a;
    int b;//ISHAQKHAN--73423
    String c;
    void dep(){
        System.out.println("Enter Your Department:");
        a=s.nextLine();
    }//ISHAQKHAN--73423
    void sem(){
        System.out.println("Enter Your Semester:");
        b=s.nextInt();//ISHAQKHAN--73423
    }
}//ISHAQKHAN--73423
class Faculty extends University{
    Scanner s=new Scanner(System.in);//ISHAQKHAN--73423
    void f_name(){
        System.out.println("Enter Your Faculty Name:");
        c=s.nextLine();
    }//ISHAQKHAN--73423//ISHAQKHAN--73423//ISHAQKHAN--73423
}
class Main{
    public static void main(String[]args){
        Faculty f=new Faculty();
        f.dep();
        f.sem();
        f.f_name();
        System.out.println("\n----- Student Information -----");
        System.out.println("Department: " + f.a);
        System.out.println("Semester: " + f.b);
        System.out.println("Faculty Name: " + f.c);
    }//ISHAQKHAN--73423
}//ISHAQKHAN--73423
