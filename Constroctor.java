 public class Constroctor {
    public static void main(String args[]){
        Ab ob=new Ab();
       System.out.println(ob.x);
       System.out.println(ob.y);
    

       Ab ob1=new Ab(20);
       System.out.println(ob1.x);
       System.out.println(ob1.y);
      

       Ab ob2=new Ab(20,30);
       System.out.println(ob2.x);
       System.out.println(ob2.y);
       System.out.println(ob2.sum("wasala"));

    }
    
}
class Ab{
    int x;
    int y;
      public Ab(){
          x=10;
          y=20; 
       }

       public Ab(int p){
           this.x=p;
           y=100;
       }
       public Ab(int p, int q){
           this.x=p;
           this.y=q;
       }
       public String sum(String name){
          return name;
       }
}