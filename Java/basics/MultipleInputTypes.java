package basics;

import java.util.Scanner;

public class MultipleInputTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Sentence: ");
        String sentence = sc.nextLine();
        System.out.println("You entered the sentence: " + sentence);

        System.out.println("Enter a Integer Value: ");
        int val = Integer.parseInt(sc.nextLine());
        System.out.println("You entered Int Value: " + val);

        System.out.println("Enter a Float value: ");
        float aFloat = Float.parseFloat(sc.nextLine());
        System.out.println("You entered Float Value: " + aFloat);

        sc.close();
    }
}
