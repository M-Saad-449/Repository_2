
class Student{
    String name;
    int age;

    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
}
public class Function_overloading_polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Saad";
        s1.age= 20;

        s1.printInfo(s1.name,s1.age);
    }
}
