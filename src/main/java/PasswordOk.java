import sun.security.util.Password;

import java.util.Scanner;


public class PasswordOk {



    public static void main(String[] args) {
        /*Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your password");
        String password = userInput.nextLine();
*/
        //Pass.passwordIsValid(password);
        Pass obj1 = new Pass();

        System.out.println(obj1.passwordIsValid("poPut1!"));

        Pass.passwordIsOkay();
        System.out.println(Pass.passwordIsOkay());

    }


    }




