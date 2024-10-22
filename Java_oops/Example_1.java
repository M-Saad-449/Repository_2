class Student{
    String name;
    String father_name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.father_name);
        System.out.println(this.age);
    }
}

public class  Example_1{
    public static void main(String[] args) {
        Student sc = new Student();
        sc.name = "Saad";
        sc.father_name="Babar";
        sc.age= 20;

        sc.printInfo();
    }
    
}
