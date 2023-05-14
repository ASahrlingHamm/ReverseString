import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a string and I'll reverse it.");
        String input = scanner.nextLine();
        StringBuilder stringbuildervariable = new StringBuilder();

        stringbuildervariable.append(input);
        stringbuildervariable.reverse();

        System.out.println("Reversed string : " + stringbuildervariable);
    }
}