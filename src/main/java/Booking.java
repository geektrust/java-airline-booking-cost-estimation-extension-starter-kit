class Booking {

    private static final int BASE_FARE = 5000;

    private String passengerType;
    private int passengerCount;

    public void setPassenger(String passengerType, int passengerCount) {
        this.passengerType = passengerType;
        this.passengerCount = passengerCount;

    }

    public int calculateFlightCost() {

        switch (passengerType) {

            case "ADULT":
                return passengerCount * BASE_FARE;

            case "CHILD":
                return passengerCount * BASE_FARE / 2;

            case "SENIOR":
                return passengerCount * BASE_FARE;

            default:
                return 0;

        }
    }
}