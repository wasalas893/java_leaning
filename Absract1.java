public class Absract1 {
    public static void main(String args[]){
      Animall ob=new fly();

      ob.run();
      ob.print();

  
      
    }
}
abstract class Animall{
    Animall(){
       System.out.println("constorctor run");
    }
    abstract void run();

    void print(){
        System.out.println("normal method is run ");
    }
}
class fly extends Animall{
    void run(){
        System.out.println("hello fly");
    }
}