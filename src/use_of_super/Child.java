package use_of_super;

public class Child extends Parent {
    public void display_PName(){
        super.display_PName();
    }

    public static void main(String[] args) {
        Parent BSSE = new Child();
        BSSE.display_PName();
    }
}
