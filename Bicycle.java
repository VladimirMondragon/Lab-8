public class Bicycle extends Vehicle {
    private boolean hasBell;

    // Constructor
    public Bicycle(int speed, double fuel, boolean hasBell) {
        super(speed, fuel);
        this.hasBell = hasBell;
    }

    // Override start method
    @Override
    public void start() {
        System.out.println("The bicycle has started. Pedal away!");
    }

    // Bicycle-specific method
    public void ringBell() {
        if (hasBell) {
            System.out.println("Ring Ring!");
    } else {
        System.out.println("This bicycle has no bell.");
    }
}

// Getter and Setter for hasBell
public boolean getHasBell() {
    return hasBell;
}

public void setHasBell(boolean hasBell) {
    this.hasBell = hasBell;
}
}
