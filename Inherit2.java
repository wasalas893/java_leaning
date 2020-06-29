public class Inherit2 {
    public static void main(String args[]){
     
        Subanimal ob=new Subanimal();
        ob.dog();

        ob.cat();
    }
    
}
class Animal{
    void cat(){
        System.out.println("print the cat");
    }
}
class Subanimal extends Animal{
    void dog(){
        System.out.println("print the Dog..");
    }
}