package basics;

class PQR  {

   static {
        System.out.println("I am Static Block");
    }
    {
        System.out.println("I am Instance Block");
    }

    static {
        System.out.println("I am Static Block 2");
    }

    PQR() {
        System.out.println("I am constructor");
    }
    PQR(String a) {
        System.out.println("I am constructor");
    }
}
public class StaticBlocks {

    public static void main(String[] args) {
        new PQR();
        new PQR("Hello");
    }
}
