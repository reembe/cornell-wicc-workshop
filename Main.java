import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        if (input.equals("Has a stripe"))
        {
            System.out.println("Viceroy");
        }
        else if(input.equals("Does not have a stripe"))
        {
            System.out.println("Monarch");
        }

    }
}
