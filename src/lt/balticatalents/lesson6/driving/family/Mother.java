package lt.balticatalents.lesson6.driving.family;

public class Mother extends FamilyMember implements Driver {
    public Mother(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return true;
    }

    @Override
    public boolean canRideABike() {
        return true;
    }
}
