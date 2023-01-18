package Con_Chaining;

public class Con_Chaining {
    Con_Chaining(){
        this("boy");
        System.out.println("This is the constructor 1");
    }

    Con_Chaining(String name){
        this("boy", 12);
        System.out.println("This is the constructor 2");
    }

    Con_Chaining(String name, int age){
        System.out.println("This is constructor 3");
    }

    public static void main(String[] args) {
        new Con_Chaining();
    }
}
