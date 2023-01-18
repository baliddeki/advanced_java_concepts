package serialization;

import java.io.*;

public class Deserialization {
    public static void main(String[] args) {
        S_D obj =null;
        try{
            FileInputStream fis = new FileInputStream("student_details.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = (S_D) ois.readObject();
            ois.close();
            fis.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(obj.name);
        System.out.println(obj.course);
        System.out.println(obj.age);
    }
}
