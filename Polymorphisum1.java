public class Polymorphisum1 {
    public static void main(String args[]){

        Person ob=new Temple();
               ob.run();
             ob= new Town();
             ob.run();       

    }
}
class Person{
    void run(){
        System.out.println("I am going to the vehicle");
    }
}
class Town extends Person{
    void run(){
        System.out.println("I am going to the town from villagegebus");
    }
}
class Compus extends Person{
    void run(){
        System.out.println("I am going to the campus from publicbus");
    }
}
class Temple extends Person{
    void run(){
        System.out.println("I am going to the temple from ven");
    }
}