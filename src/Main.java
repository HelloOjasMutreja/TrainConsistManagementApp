import java.util.*;

/**
 * ============================================================
 * MAIN CLASS – UseCase7TrainConsistMgmt
 * ============================================================
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * Description:
 * This class sorts passenger bogies based on seating
 * capacity using a custom Comparator.
 *
 * At this stage, the application:
 * - Creates bogie objects
 * - Stores them in a List
 * - Displays unsorted data
 * - Sorts using Comparator logic
 * - Displays sorted results
 *
 * @author Developer
 * @version 7.0
 */

public class Main {

    // Inner Bogie class
    static class Bogie {
        String name;
        int capacity;

        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator)");
        System.out.println("=================================\n");

        // List instead of Map
        List<Bogie> bogies = new ArrayList<>();

        // ---- Insert bogie data ----
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- Sort using Comparator ----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\nAfter Sorting (by Capacity):");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC7 sorting completed...");
    }
}
