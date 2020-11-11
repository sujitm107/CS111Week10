public class Elevator {
    private int maxNumFloors;
    private int maxWeight;
    private int currentFloor;
    private int currentWeight;

    //Constructor
    public Elevator(int maxNumFloors, int maxWeight) {
        this.maxNumFloors = maxNumFloors;
        this.maxWeight = maxWeight;
        this.currentFloor = 1;
        this.currentWeight = 0;
    }

    public boolean moveElevator(int numFloors) {
        boolean goUp = true;
        boolean elevatorStatus = true;
        if (numFloors < 0) {
            goUp = false;
            numFloors = Math.abs(numFloors);
            if (currentFloor - numFloors < 1) {
                System.out.println("Error: cant go below floor 1");
                return false;
            }
        } else if (numFloors > 0) {
            goUp = true;
            numFloors = Math.abs(numFloors);
            if (currentFloor + numFloors > maxNumFloors) {
                System.out.println("Error: cant go past the max number of floors: " + maxNumFloors);
                return false;
            }
        } else {
            System.out.println("Error: can't move 0 floors");
            return false;
        }
        
        this.currentFloor += numFloors;

        return elevatorStatus;
    }

    public boolean goUpOneFloor() {
        if (currentFloor + 1 > maxNumFloors) {
            System.out.println("Error: cant go past the max number of floors: " + maxNumFloors);
            return false;
        } else {
            this.currentFloor += 1;
            return true;
        }
    }

    public boolean goDownOneFloor() {
        if (currentFloor - 1 < 1) {
            System.out.println("Error: cant go below floor 1");
            return false;
        } else {
            this.currentFloor -= 1;
            return true;
        }
    }

    public boolean addPassenger(int passengerWeight) {
        if (passengerWeight <= 0) {
            System.out.println("Error: passenger must have positive weight");
            return false;
        }
        if (currentWeight + passengerWeight > maxWeight) {
            System.out.println("Error: you have surpassed max weight, cannot add passenger");
            return false;
        } else {
            currentWeight += passengerWeight;
            return true;
        }
    }

    public boolean removePassenger(int passengerWeight) {
        if (passengerWeight <= 0) {
            System.out.println("Error: passenger must have positive weight");
            return false;
        }
        if (currentWeight - passengerWeight < 0) {
            System.out.println("Error: you are tryong to remove a passenger from an empty elevator");
            return false;
        } else {
            currentWeight -= passengerWeight;
            return true;
        }
    }

    public int getCurrentWeight() {
        return currentWeight;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}