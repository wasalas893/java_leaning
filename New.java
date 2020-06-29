public class New {
    public static void main(String args[]){
      D ob=new D();
    }
}
class C{
    void run(int a){
        System.out.println("print C a="+a);
    }
    C(int a,int b){
         
        System.out.println("print C a+b="+(a+b));
    }
}
class D extends C{
    D(){
        super(10, 20);
        super.run(10);
        System.out.println("print D");
    }
}