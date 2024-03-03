import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String inputs = scan.nextLine();
        inputs = scan.nextLine();
        String[] ints = inputs.split("");
        boolean firsttime = true;
        ArrayList<Integer> myArray = new ArrayList();
        int counter = 0;
        int perf = 0;
        int gr = 0;
        int miss = 0;
        for(int i = 0; i < input; i++)
        {
            if(ints[i].equals("*"))
            {
                if(firsttime != true)
                {
                    counter++;
                    myArray.add(counter);
                }
                perf++;
                firsttime = false;
            }
            if(ints[i].equals("o"))
            {
                if(firsttime != true)
                {
                    counter++;
                    myArray.add(counter);
                }
                firsttime = false;
                gr++;
            }
            if(ints[i].equals("x"))
            {
                counter = 0;
                firsttime = true;
                miss++;
            }
        }

        int sum = 0;
        for(int i = 0; i < myArray.size(); i++)
        {
            sum += myArray.get(i);
        }
        perf *= 100;
        gr *= 50;
        System.out.println(perf + gr + sum);




    }
}

      
