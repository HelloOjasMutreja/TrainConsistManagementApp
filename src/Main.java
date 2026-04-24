import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // ---- UC11 CORE: REGEX VALIDATION ----
        boolean isTrainValid = Pattern.matches("TRN-\\d{4}", trainId);
        boolean isCargoValid = Pattern.matches("PET-[A-Z]{2}", cargoCode);

        System.out.println("Train ID Valid: " + isTrainValid);
        System.out.println("Cargo Code Valid: " + isCargoValid);
    }
}
