import unknown.Main;
class Shape {
    public void area() {
        System.out.println("Display area ");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Hierarchial_inheritance {
    public static void main(String[] args){
        Account ac= new Account();
        ac.name = "customer1";
        System.out.println(ac.name);
    }
}
