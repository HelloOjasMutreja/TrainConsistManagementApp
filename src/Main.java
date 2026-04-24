public class Main {

    static class CargoSafetyException extends RuntimeException {
        CargoSafetyException(String msg) {
            super(msg);
        }
    }

    static class GoodsBogie {
        String type;
        String cargo;

        void assignCargo(String type, String cargo) {
            this.type = type;
            if (type.equals("Rectangular") && cargo.equals("Petroleum")) {
                throw new CargoSafetyException("Unsafe cargo assignment!");
            }
            this.cargo = cargo;
        }
    }

    public static void main(String[] args) {

        GoodsBogie bogie = new GoodsBogie();

        try {
            bogie.assignCargo("Rectangular", "Petroleum");
            System.out.println("Cargo assigned");
        } catch (CargoSafetyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Operation completed.");
        }
    }
}
