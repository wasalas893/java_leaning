class Encapsulation{
    public static void main(String args[]){
      Encap ob=new Encap();
      ob.setAge(25);
      ob.setName("sunnada");

      System.out.println("Age is :"+ ob.getAge());
      System.out.println("Name is :"+ ob.getString());
    }
}
class Encap{
    private int age;
    private String name;


    public void setAge(int age1){
        this.age=age1;
    }
    public void setName(String name1){
        this.name=name1;
    }
    public int getAge(){
        return age;
    }
    public String getString(){
        return name;
    }
}