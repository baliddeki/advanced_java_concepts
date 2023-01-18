package Mutable_Immutable;

import java.util.Scanner;

public class Immutable {
    private final String F_Name, M_Name;

    //constructor for the Immutable class
    public Immutable(final String F_Name,  final String M_Name){
        this.F_Name = F_Name;
        this.M_Name = M_Name;
    }

    //method to read father's name
    public String getF_name(final String F_name ){
        return F_name;
    }

    //method to read mother's name
    public String getM_name(final String M_name ){
        return M_name;
    }

    public static void main(String[] args) {
        Immutable person = new Immutable("Joe Alwyn", "Taylor Swift");
        System.out.println("Your father's name is "+person.getF_name(person.F_Name));
        System.out.println("Your mother's name is "+person.getM_name(person.M_Name));
    }
}
