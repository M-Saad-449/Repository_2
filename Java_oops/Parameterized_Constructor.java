class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
     this.name = name;
     this.age = age;   
    }
}
public class Parameterized_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Saad",20);
        
        
        s1.printInfo();
    }
    
}
