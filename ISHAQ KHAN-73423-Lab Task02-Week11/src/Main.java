import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double r,h;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Radius(r): ");
        r=s.nextDouble();
        System.out.print("Enter height(h): ");
        h=s.nextDouble();
        Shape S=new Shape();
        S.draw();
        S.calculateArea();
        Cylinder C=new Cylinder();
        C.calculateArea(r,h);
        Circle c=new Circle();
        c.draw();
    }
}
