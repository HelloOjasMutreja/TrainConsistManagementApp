public class Main {

    public static void main(String[] args) {

        String[] bogieIds = {}; // empty train

        String searchId = "BG101";

        // ---- FAIL FAST ----
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search.");
        }

        boolean found = false;

        for (String id : bogieIds) {
            if (id.equals(searchId)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bogie Found: " + searchId);
        } else {
            System.out.println("Bogie Not Found");
        }
    }
}
