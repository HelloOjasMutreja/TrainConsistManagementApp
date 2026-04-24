public class Main {

    static class InvalidCapacityException extends Exception {
        InvalidCapacityException(String msg) {
            super(msg);
        }
    }

    static class PassengerBogie {
        int capacity;

        PassengerBogie(int capacity) throws InvalidCapacityException {
            if (capacity <= 0) {
                throw new InvalidCapacityException("Capacity must be > 0");
            }
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        try {
            PassengerBogie b = new PassengerBogie(-10);
        } catch (InvalidCapacityException e) {
            System.out.println(e.getMessage());
        }
    }
}
