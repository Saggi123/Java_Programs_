import java.util.ArrayList;
import java.util.Scanner;

public class secondplusthird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int input = 1;
        while (input != 0) {
            int i = sc.nextInt();
            System.out.println("");
            if (i != 0)
                list.add(i);
            else {
                input = 0;
            }
        }
        int result = list.get(1) + list.get(2);
        System.out.println("The result is " + result);
        sc.close();
    }
}
