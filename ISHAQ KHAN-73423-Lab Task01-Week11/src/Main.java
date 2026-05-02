import java.util.Scanner;
class Main{//ISHAQKHAN--73423
    public static void main(String[] args){
        int a,b,c;//ISHAQKHAN--73423
        Calculator d=new Calculator();
        Scanner s=new Scanner(System.in);//ISHAQKHAN--73423
        System.out.println("Enter Values");
        a=s.nextInt();//ISHAQKHAN--73423
        b=s.nextInt();//ISHAQKHAN--73423
        c=s.nextInt();//ISHAQKHAN--73423
        int result= d.sum(a, b);
        System.out.println("The Sum Of "+a+" And "+b+" Is:"+result);
        result= d.sum(a,b,c);
        System.out.println("The Sum Of "+a+","+b+" And "+c+" Is:"+result);
    }
}
