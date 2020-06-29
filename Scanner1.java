import java.util.Scanner;

public class Scanner1 {
    public static void main(String args[]){
        KK ob=new KK();
        ob.main(); 

    }
}
class KK{
    void main(){
      Scanner input=new Scanner(System.in);
      System.out.println("anter your age:  ");
      int x=input.nextInt();
      System.out.println(x);
    }
}