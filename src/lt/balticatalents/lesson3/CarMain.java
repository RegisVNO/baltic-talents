package lt.balticatalents.lesson3;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.name = "Toyota";
        car1.gearBox = "manual";
        car1.maxSpeed = 180;

        Car car2 = new Car();
    }
}

class Car {
    String name;
    String gearBox;
    int maxSpeed;

    public Car(String gearBox, int maxSpeed) {
        this.gearBox = gearBox;
        this.maxSpeed = maxSpeed;
    }

    public Car(String gearBox) {
        this.gearBox = gearBox;
    }

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Car() {
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}

