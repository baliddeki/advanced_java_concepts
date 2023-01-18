package exceptions;

import java.util.*;

public class Mail {
    public void checkPIN(String PIN) throws PINInvalidException{
        if(PIN.length() != 4){
            throw new PINInvalidException("You have entered the wrong number of digits. Check your PIN!");
        } else{
            System.out.println("Proceed to confirm your PIN");
        }
    }

    public static void main(String[] args) {
        try{
            Mail obj = new Mail();
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your PIN");
            String PIN = scan.nextLine();
            obj.checkPIN(PIN);


        }
        catch(Exception e){
            System.out.println("A problem has occured! \n"+e.getMessage());

        }
    }
}
