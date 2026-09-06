package basics;

class ABC {
    ABC() {
        System.out.println("1st argument constructor");
    }
    ABC(String a) {
        System.out.println("2nd argument constructor");
    }
    ABC(int a, int b) {
        System.out.println("3rd argument constructor");
    }
    {
        System.out.println("Instance Block");
    }
}

public class InstanceBlocks {

    public static void main(String[] args) {
        new ABC();
        new ABC("Hello");
        new ABC(10, 20);
    }
}
