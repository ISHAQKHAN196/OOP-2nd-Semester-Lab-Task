import java.util.Scanner;// ISHAQKHAN-73423
public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a , b, temp;// ISHAQKHAN-73423
        System.out.println("Enter Values For Swap:");
        a=s.nextInt();// ISHAQKHAN-73423
        b=s.nextInt();
        temp=a;// ISHAQKHAN-73423
        a=b;// ISHAQKHAN-73423
        b=temp;// ISHAQKHAN-73423
        System.out.println("Values After Swap Are:");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
}
