abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    public void eat (){
        System.out.println("Animal Eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a horse");
    }
    public void walk(){
        System.out.println("Walks on four legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on two legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        //We cannot make animal here if we made it here it will give a error at run time so it is called rum time error becuase at the time of compilation there is  no error
        horse.eat();
    }
}
