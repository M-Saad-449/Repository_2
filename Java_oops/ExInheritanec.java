class parent{
    public String p = "deeclared in parent class";
}
class child extends parent{
    void changeP(){
        p = "change in child class";
    }
}


public class ExInheritanec {
    public static void main(String[] args) {
        child c = new child();
        System.out.println(c.p);
        c.changeP();
        System.out.println(c.p);
        
    }
    
}
