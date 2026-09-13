package basics;

public class VariableScope {

    // Instance Variable
    private int instanceVar = 10;

    // Static Variable
    static int staticVar = 100;

    // Constructor demonstrating parameter scope
    public VariableScope(int instanceVar) {

        // Parameter Scope
        this.instanceVar = instanceVar;
    }

    // Method to demonstrate local, parameter, and block scope
    public void showScopes(int paramVar) {

        // Local Variable
        int localVar = 20;

        System.out.println("Instance Variable: " + instanceVar); //50
        System.out.println("Static Variable: " + staticVar); //100
        System.out.println("Method Parameter: " + paramVar); //30
        System.out.println("Local Variable: " + localVar); //20

        // Block Scope
        if (localVar > 10) {
            int blockVar = 5;
            System.out.println("Block Variable: " + blockVar); //5
        }
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope(50);
        obj.showScopes(30);
    }
}
