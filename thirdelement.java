import java.util.ArrayList;
import java.util.Scanner;

public class thirdelement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter");
        int size = Integer.valueOf(sc.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter the element at index %d \n", i + 1);
            list.add(sc.nextLine());
        }
        System.out.printf("The element at index 3 is " + list.get(2));
    }
}