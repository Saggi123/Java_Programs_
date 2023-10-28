import java.util.ArrayList;
import java.util.Scanner;

public class ListSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        boolean input = true;
        System.out.println("Enter the elements");
        while (input) {
            String element = sc.nextLine();
            if (!element.equals("no"))
                list.add(element);
            else
                input = false;
        }
        System.out.println(list.size());
    }
}
