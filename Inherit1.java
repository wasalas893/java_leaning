public class Inherit1{
    public static void main(String args[]){
       Trangle ob=new Trangle(20.0, 10.0);
       ob.sum();
    }
    
}
class Poligon{
    double x=20.0;
    double y=30.0;
}
class Trangle extends Poligon{

    public Trangle(double p,double q){
        this.x=p;
        this.y=q;
    }
    public void sum(){
        double z=x*y*0.5;
        System.out.println(z);
    }
}

