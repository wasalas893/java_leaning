public class Override {
    public static void main(String args[]){
       Small ob=new Small();
       ob.run();
    }
}
class Big{
    public void run(){
        System.out.println("Super run");
    }
}
class Small extends Big{
    public void run(){
       super.run();
       System.out.println("Sub is run");
       
    }
}