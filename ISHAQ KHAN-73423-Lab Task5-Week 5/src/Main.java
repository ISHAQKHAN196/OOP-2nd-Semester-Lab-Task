import java.util.Scanner;
// ISHAQKHAN-73423
public class Main {// ISHAQKHAN-73423
    static void fact(){
        Scanner s=new Scanner(System.in);// ISHAQKHAN-73423
        int a;
        System.out.println("Enter Number For Factorial:");
        a=s.nextInt();// ISHAQKHAN-73423
        int fact=1;
        for(int i=1;i<=a;i++)// ISHAQKHAN-73423
            fact*=i;// ISHAQKHAN-73423
        System.out.println("Factorial Of "+a+" Is = "+fact);
    }
    public static void main(String[] args){
        fact();
    }// ISHAQKHAN-73423
}
