import java.util.Scanner;
// ISHAQKHAN-73423
public class Main {
    public static void main(String[] args){// ISHAQKHAN-73423
        Scanner s=new Scanner(System.in);// ISHAQKHAN-73423
        int a,b;// ISHAQKHAN-73423
        System.out.println("Enter Values For Swap:");
        a=s.nextInt();
        b=s.nextInt();// ISHAQKHAN-73423
        a=a+b;
        b=a-b;
        a=a-b;// ISHAQKHAN-73423
        System.out.println("Values After Swap Are:");
        System.out.println("a= "+a);// ISHAQKHAN-73423
        System.out.println("b= "+b);
    }
}
