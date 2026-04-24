import java.util.*;
import java.util.stream.Collectors;

/**
 * ============================================================
 * MAIN CLASS – UseCase8TrainConsistMgmt
 * ============================================================
 *
 * Use Case 8: Filter Passenger Bogies Using Streams
 *
 * Description:
 * This class filters passenger bogies based on seating
 * capacity using Java Stream API.
 *
 * @author Developer
 * @version 8.0
 */

public class Main {

    // Reuse Bogie class from UC7
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
        System.out.println(" UC8 - Filter Passenger Bogies Using Streams");
        System.out.println("=================================\n");

        // Same list as UC7
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));

        System.out.println("All Bogies:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- NEW PART (UC8 CORE) ----
        List<Bogie> filteredBogies = bogies.stream()
                .filter(b -> b.capacity > 60)   // business rule
                .collect(Collectors.toList());

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie b : filteredBogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC8 filtering completed...");
    }
}
