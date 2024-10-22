interface Animal{
    int eyes = 2;
   public void walk();
    
}
interface Herbivores{

}
class Horse implements Animal, Herbivores{
    public void walk() {
        System.out.println("Walks on four legs") ;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
}
