class Student{
    String name;
    static String school_name;
    public static void changeSchool() {
        school_name = "newSchool";
    }
}

public class Static_Keyword {
    public static void main(String[] args) {
        Student.school_name= "JMV";
        Student student1 = new Student();
        student1.name = "Saad";
        System.out.println(student1.school_name);
    }
}
