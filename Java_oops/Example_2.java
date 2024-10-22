class Studnet{
    String name;
    int age;
    public void printInfo(String name){
        System.out.println(this.name);
    }
    public void printInfo(int age){
        System.out.println(this.age);
    }
    public void printInfo(String name, int age){
        System.out.println(name+" "+age);
    }
    Studnet(Student s2){
        this.name= s2.name;
        this.age= s2.age;


    }
    void Student(){

    }
    
}


public class Example_2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Saad";
        s1.age= 20;
        Studnet s2  = new Studnet(s1);

        s2.printInfo(s1.name);
        s2.printInfo(s1.age);
        s2.printInfo(s1.name,s1.age);
    } 
}
