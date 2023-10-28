import java.util.Scanner;
import java.util.ArrayList;

public class Averagelist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = true;
        float average = 0.00f;
        int sum = 0;
        System.out.println("Enter the elements:");
        while (flag) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number != -1)
                list.add(number);
            else
                flag = false;
        }
        for (int number : list) {
            sum += number;
            System.out.println(number);
        }
        System.out.println(sum);
        average = (float) sum / list.size();
        System.out.printf("The average is %.2f\n", average);
    }
}
