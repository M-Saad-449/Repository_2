class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("Contructor called");
    }
}
public class Non_Parametarized_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Saad";
        s1.age= 20;
        
        s1.printInfo();
    }
    
}
