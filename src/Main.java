import java.util.*;

public class Main {

    static class GoodsBogie {
        String type;
        String cargo;

        GoodsBogie(String type, String cargo) {
            this.type = type;
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        List<GoodsBogie> goodsBogies = new ArrayList<>();

        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));

        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        (b.type.equals("Cylindrical") && b.cargo.equals("Petroleum")) ||
                        (b.type.equals("Rectangular") && !b.cargo.equals("Petroleum"))
                );

        System.out.println("Safety Compliance: " + isSafe);
    }
}
