class Animal{
    void eat() {
        System.out.println("Eating-----------");//ISHAQKHAN--73423
    }//ISHAQKHAN--73423
    void sleep(){
        System.out.println("Sleeping---------");//ISHAQKHAN--73423
    }
}
class Dog extends Animal{//ISHAQKHAN--73423
    void barking(){
        System.out.println("Barking-----------");//ISHAQKHAN--73423
    }
}
class Main{
    public static void main(String[]args){//ISHAQKHAN--73423
        Dog d=new Dog();
        d.barking();
        d.eat();
        d.sleep();
    }
}//ISHAQKHAN--73423
//ISHAQKHAN--73423