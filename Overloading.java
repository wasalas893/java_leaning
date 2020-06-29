class Overloading{
 public static void main(String args[]){
     A ob=new A();
     ob.sum();
     System.out.println(ob.sum(10));
     System.out.println(ob.sum("sunnnda"));

 }
}
class A{
    public void sum(){
     System.out.println("hello world");
    }
    public int sum(int x){
        return x;

    }
    public String sum(String name){
        return name;
    }
}