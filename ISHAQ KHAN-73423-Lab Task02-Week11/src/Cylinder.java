public class Cylinder extends Shape {

    double calculateArea(double r, double h){
        double Pi=3.14;
        double area=2*Pi*r*h+2*Pi*(r*r);
        return area;
    }
}
