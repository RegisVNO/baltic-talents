package lt.balticatalents.lesson6.driving.family;

public class Son extends FamilyMember implements Driver {
    public Son(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean canDriveACar() {
        return getAge() >= 18 ? true : false;
    }

    @Override
    public boolean canRideABike() {
        return true;
    }
}
