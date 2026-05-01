import java.util.Scanner;
// ISHAQKHAN-73423// ISHAQKHAN-73423// ISHAQKHAN-73423
public class Main {
    public static void main(String[] args){// ISHAQKHAN-73423
        Scanner s=new Scanner(System.in);
        int num,temp,r=0;
        System.out.println("Enter Number:");
        num=s.nextInt();
        temp=num;// ISHAQKHAN-73423
        while(num>0){
            r=r*10+(num%10);
            num/=10;
        }// ISHAQKHAN-73423
        if(temp==r)
            System.out.println(temp+" Is Palindrome");// ISHAQKHAN-73423
        else
            System.out.println(temp+" Is Not Palindrome");
    }
}
