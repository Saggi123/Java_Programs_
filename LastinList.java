import java.util.ArrayList;
import java.util.Scanner;

public class LastinList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        boolean flag = true;
        System.out.println("Enter the Elements: ");
        while (flag) {
            String name = sc.nextLine();
            if (!name.equals(" "))
                list.add(name);
            else
                flag = false;
        }
        System.out.println(list.get(list.size() - 1));
    }
}
