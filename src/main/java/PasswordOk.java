import sun.security.util.Password;

import java.util.Scanner;


public class PasswordOk {
    
    public static void main(String[] args) {
        Pass obj1 = new Pass();
        System.out.println(obj1.passwordIsValid("poPut1!"));

        Pass.passwordIsOkay();
        System.out.println(Pass.passwordIsOkay());
    }
   }




