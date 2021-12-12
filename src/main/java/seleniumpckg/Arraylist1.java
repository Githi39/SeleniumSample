package seleniumpckg;
import java.util.*;
public class Arraylist1 {
    public static void main (String args[])
    {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("violet");
        list_Strings.add("indigo");
        list_Strings.add("Blue");
        list_Strings.add("green");list_Strings.add("orange");
        list_Strings.add("red");
        list_Strings.add(6, "VIBGYOR");
        list_Strings.set(2, "Yellow");

        System.out.println(list_Strings);
        String element = list_Strings.get(0);
        System.out.println("First element: "+element);
        element = list_Strings.get(6);
        System.out.println("Fiveth element: "+element);
        System.out.println(list_Strings);
        list_Strings.remove(4);
        System.out.println(list_Strings);
        if (list_Strings.contains("red")) {
            System.out.println("Found the element");
        } else {
            System.out.println("There is no such element");
        }

    }
}
