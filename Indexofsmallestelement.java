import java.util.Scanner;
import java.util.ArrayList;

public class Indexofsmallestelement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        boolean flag = true;
        int smallest = 0;
        System.out.println("Enter the elements");
        while (flag) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number != 9999)
                list.add(number);
            else
                flag = false;
        }
        smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < smallest)
                smallest = list.get(i);
        }
        System.out.printf("The Smallest number is %d\n", smallest);
        int index = list.indexOf(smallest);
        System.out.printf("The index is %d\n", index);
        int index1 = 0;
        while (index1 < list.size()) {
            if (list.get(index1) == smallest)
                System.out.printf("The index of the smallest number is %d\n", index1);
            index1++;
        }
    }
}
