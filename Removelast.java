import java.util.Scanner;
import java.util.ArrayList;

public class Removelast {
    public static void remove_last(ArrayList<String> List) {
        if (List.size() > 0)
            List.remove(List.size() - 1);
        else
            return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("Mary");
        list.add("Percy");
        list.add("Jake");
        list.add("Jerry");
        remove_last(list);
        for (String element : list)
            System.out.println(element);
        scanner.close();
    }
}
