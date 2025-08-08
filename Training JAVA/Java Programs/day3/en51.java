package day3;
//Car class: encapsulate engine status, speed, fuelLevel.
public class en51 {
    private boolean engineOn;
    private int speed;
    private int fuel;

    public void setEngineOn(boolean status) {
        engineOn = status;
    }

    public void setFuel(int f) {
        fuel = f;
    }

    public void setSpeed(int s) {
        if (engineOn && fuel > 0) {
            speed = s;
            fuel--;
        } 
    }

    public boolean getEngineOn() {
        return engineOn;
    }

    public int getSpeed() {
        return speed;
    }

    public int getFuel() {
        return fuel;
    }

    public static void main(String[] args) {
        en51 c = new en51();

        c.setEngineOn(true);  
        c.setFuel(2);        
        c.setSpeed(60);       

        System.out.println("Engine: " + c.getEngineOn());
        System.out.println("Speed: " + c.getSpeed());
        System.out.println("Fuel: " + c.getFuel());
    }
}
