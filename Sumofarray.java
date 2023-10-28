import java.util.Scanner;

public class Sumofarray {
    public static void arraysum(int[] Elements) {
        int length = Elements.length;
        int sum = 0;
        int index = 0;
        while (index < length) {
            sum += Elements[index++];
        }
        System.out.printf("The sum of the elemets are %d", sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements do you want to sum");
        int no_of_elements = Integer.valueOf(scanner.nextLine());
        int[] elements = new int[no_of_elements];
        System.out.println("Eneter the elements");
        int index = 0;
        while (index < no_of_elements) {
            elements[index++] = Integer.valueOf(scanner.nextLine());
        }
        arraysum(elements);
        scanner.close();
    }
}
