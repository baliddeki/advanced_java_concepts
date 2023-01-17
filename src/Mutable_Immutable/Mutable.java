package Mutable_Immutable;


/* Program to read old name and change into a new name */

import java.util.Scanner;

public class Mutable {

    //original name
    public String or_Name;

    //constructor
    Mutable(String or_Name){
        this.or_Name = or_Name;
    }

    //method to return original name
    public String getOr_Name(String or_Name){
        return or_Name;
    }

    //method to change to a new name
    public String setOr_Name(String n_Name){
        this.or_Name = n_Name;
        return n_Name;
    }

    public static void main(String[] args) {
        Mutable person = new Mutable("Aliddeki Francisco");
        System.out.println("The current name in the system is: "+person.getOr_Name(person.or_Name));
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your new name: ");
        String n_Name = scan.nextLine();
        System.out.println("The new name is: "+person.setOr_Name(n_Name));

    }

}
