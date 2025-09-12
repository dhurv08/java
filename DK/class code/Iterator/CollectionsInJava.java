import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollectionsInJava {
    public static void main(String args[]) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("TATA");

        for (String element: cars) {
                System.out.println(element);
        }

        // Get the iterator
        Iterator<String> it = cars.iterator();

        while(it.hasNext()) {
            System.out.println(it.next());
        }

        ArrayList<String> items = new ArrayList<String>();
        items.add("Shoes");
        items.add("Toys");

        // Add one or more elements
        Collections.addAll(items, "Fruits", "Bat", "Ball", "Utensils", "Spoon");

        // // Printing the list contents
        for (int i = 0; i < items.size(); i++) {
            System.out.print(items.get(i) + " ");
        }

        System.out.println();

        for (String item: items) {
                System.out.print(item);
        }
    }
}
