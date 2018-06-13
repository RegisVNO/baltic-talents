package lt.balticatalents.lesson4.car;

/**
 * Sukurti public klase CarMain su main methodu
 * <p>
 * po ja tame paciame faile sukurti klase Car su laukais:
 * String gearBox;
 * int maxSpeed;
 * <p>
 * sukurti get ir set metodus Car klaseje, kurie keistu
 * ir grazintu lauku reiksmes atitinkamai
 * <p>
 * setGearBox
 * setMaxSpeed
 * <p>
 * getGearbox()
 * getMaxSpeed()
 * <p>
 * sukurti Car klases konstruktorius su abiem parametrais, be parametru,
 * su vienu parametru (2 konstruktoriai)
 * <p>
 * <p>
 * Uzdavinys:
 * prideti klaseje Car laukeli name, kuriame bus saugomas automobilio pavadinimas
 * <p>
 * sukurti masyva is 5 skirtingu automobiliu
 * automobiliai gali tureti gearBox reiksme "manual" arba "automatic"
 * maxSpeed gali buti tik teigiamas skaicius
 * <p>
 * atspausdinti automobilio pavadinima su dydziausiu greiciu
 * suskaiciuoti automobilius ir atspasdinti kiek turi automatine ir mechanine pavaru deze
 */

public class CarMain {
    public static void main(String[] args) {
        Car[] cars = new Car[5];

        for (int i = 0; i < cars.length; i++) {
            int j = i + 1;
            cars[i] = new Car("name" + j, (i % 2 == 0) ? "manual" : "automatic", j * 50);
        }

        for (Car c : cars) {
            System.out.println(c.getName() + "-" + c.staticName + " " + c.getGearBox() + "|" + c.getGearBox());
        }

        cars[2].staticName = "static?";
        cars[2].setName("non-static");
        System.out.println();

        for (Car c : cars) {
            System.out.println(c.getName() + "-" + c.staticName + " " + c.getGearBox() + "|" + c.getMaxSpeed());
        }
    }
}

class Car {
    final static int MIN_SPEED = 0;
    final static String MANUAL = "manual";
    final static String AUTOMATIC = "automatic";
    static String staticName = "static";

    private String name;
    private String gearBox;
    private int maxSpeed;

    public Car(String name, String gearBox, int maxSpeed) {
        this.name = name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {// manual arba automatic | equals
        if (gearBox.equals(MANUAL) || gearBox.equals(AUTOMATIC)) {
            this.gearBox = gearBox;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed > MIN_SPEED) {
            this.maxSpeed = maxSpeed;
        }
    }
}