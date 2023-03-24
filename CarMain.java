import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CarMain {
    public static void main(String args[]) {
        System.out.println("hello world!");
        Map<String, List<String>> data = new HashMap<String, List<String>>();
        data.put("car", Arrays.asList("toyato", "bmw", "honda"));
        data.put("fruit", Arrays.asList("apple", "banana", "grapes"));
        data.put("computer", Arrays.asList("acer", "asus", "ibm"));
        Scanner sc = new Scanner(System.in);
        String v = sc.nextLine();
        for (Map.Entry<String, List<String>> m : data.entrySet()) {
            if (m.getValue().contains(v.toLowerCase()) ){
                System.out.println(m.getKey());
            }
        }
    }
}
