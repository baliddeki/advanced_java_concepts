package use_of_super;

import java.util.Scanner;

public class Parent {
    public void display_PName(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your parent's name: ");
        String Pname = scan.nextLine();
        System.out.println("Your parent's name is "+Pname);
    }

}
