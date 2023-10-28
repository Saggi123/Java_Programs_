import java.util.Scanner;
import java.util.ArrayList;

public class GreatestinList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        boolean flag = true;
        int greatest;
        System.out.println("Enter the numbers: ");
        while (flag) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number != 9999)
                list.add(number);
            else
                flag = false;
        }
        greatest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > greatest)
                greatest = list.get(i);
        }
        System.out.printf("The Greatest number is %d", greatest);
        scanner.close();
    }
}
