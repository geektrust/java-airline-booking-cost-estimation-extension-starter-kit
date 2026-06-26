public class Main {

    private static Booking booking = new Booking();

    public static void main(String[] args) {
        for (String arg : args) {
            handle(arg);
        }
    }

    private static void handle(String input) {

        String[] inputListForOneCommand = input.trim().split(" ");
        String command = inputListForOneCommand[0];

        switch (command) {

            case "PASSENGER":
                String passengerType = inputListForOneCommand[1];
                int numberOfPassengers = Integer.parseInt(inputListForOneCommand[2]);

                booking.setPassenger(passengerType, numberOfPassengers);
                break;

            case "ADD_SERVICE":

                /*
                 * Extension point.
                 *
                 * You should implement support for:
                 * SHUTTLE
                 * LOUNGE_ACCESS
                 */

                break;

            case "TOTAL_COST":
                System.out.println(
                        "Total Booking Cost: " + booking.calculateFlightCost());
                break;

            default:
                System.out.println("INVALID_COMMAND");
        }
    }
}