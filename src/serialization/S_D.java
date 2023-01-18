package serialization;

import java.util.*;

import java.io.*;

public class S_D implements Serializable {
    String name, course;
    int age;

    //Class Constructor
    public S_D(String name, String course, int age){
        this.name= name;
        this.course = course;
        this.age =age;

    }

    //method to print student details
    public void printDetails(String name, String course, int age){
        System.out.println("\n Name: "+name+"\n Course: "+course+" \n Age: "+age);

    }

    public static void main(String[] args) {

        //input from the user

        Scanner scan = new Scanner(System.in);
        System.out.println("-------ENTER YOUR DETAILS HERE-------");
        System.out.println("Name: Course: Age");
        String name = scan.next();
        String course = scan.next();
        int age = scan.nextInt();

        //try block to catch FileNotFoundException

        try {

            //creating class object

            S_D obj = new S_D(name, course, age);
            FileOutputStream fos = new FileOutputStream("student_details.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            obj.printDetails(name, course, age);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        }catch (Exception e){
            e.printStackTrace();
        }



    }
}
