class Shape{
    public void area(){
        System.out.println("Displays Area");
        
    }
}
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        
    }
    
}
