import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    String[] arr = input.split(" ");
    int x1 = Integer.parseInt(arr[0]);
    int y1 = Integer.parseInt(arr[1]);
    int x2 = Integer.parseInt(arr[2]);
    int y2 = Integer.parseInt(arr[3]);
    if ((x1 == x2 || y1 == y2 || Math.abs(x1 - x2) == Math.abs(y1 - y2)) || (x1 +1 == x2 && y1 +2 == y2 || x1+2 == x2 && y1 +1 == y2)){
        System.out.println("YES");
    } else {
        System.out.println("NO");
    }

  }
}

      
