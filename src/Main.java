import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] capacities = {72, 56, 24, 70};

        for (int i = 0; i < capacities.length - 1; i++) {
            for (int j = 0; j < capacities.length - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Capacities: " + Arrays.toString(capacities));
    }
}
