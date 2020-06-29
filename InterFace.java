public class InterFace {
    public static void main(String args[]){
        NN ob=new NN();
        ob.run(10);
        ob.print();
        ob.main();

    }
}
interface B{
    public static final int a=5;
    public void run(int a);
}
class M{
    void print(){
        System.out.println("class run");
      
    }
   
}

class NN extends M implements B{

    public void run(int a){
        System.out.println("hdhsd");
    }
    
    void main(){
        System.out.println("String");
    }

}