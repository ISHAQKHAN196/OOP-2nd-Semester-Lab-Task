abstract class Employee {

    abstract void dispalyInfo();
    abstract void calculateSalary();
    public static void main(String[]args){
        Employee e = new Manager();
        e.dispalyInfo();
        e.calculateSalary();
        System.out.println("-----------------------------------------------");
        Employee p=new Programmer();
        p.dispalyInfo();
        p.calculateSalary();
    }
}
