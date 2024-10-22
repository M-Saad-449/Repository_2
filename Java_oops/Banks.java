

class Account{
     public String name;
     protected String email;
     private String password;

     //Getters and Stters
     public String getPassword(){
       return this.password;
     }

     public void setPassword(String pass){
        this.password = pass;
     }
}

public class Banks {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Saad";
        account1.email = "saadbabarchahal@email.com";
        account1.setPassword("saadi_chahal");
        System.out.println(account1.getPassword());
    }
}
