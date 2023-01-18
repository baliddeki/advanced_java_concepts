package clone;

import java.lang.*;
import java.util.Scanner;

public class Students_Details implements Cloneable {
    String f_Name, l_Name;
    int age;

    Students_Details(String f_Name, String l_Name, int age) {
        this.age = age;
        this.f_Name = f_Name;
        this.l_Name = l_Name;
    }

       public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {
        try {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter your first name, last name and age");
            String f_Name = scan.next();
            String l_Name = scan.next();
            int age = scan.nextInt();
            Students_Details obj = new Students_Details(f_Name, l_Name, age);
            Students_Details obj1 = (Students_Details) obj.clone();
            System.out.println("Your name is "+obj1.f_Name+" "+obj1.l_Name+" and you're aged "+obj1.age+" years");
        } catch (CloneNotSupportedException c){
            System.out.println("There has been a system error. Try again later");
        }

    }

}
