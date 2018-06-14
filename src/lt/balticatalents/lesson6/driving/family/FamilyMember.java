package lt.balticatalents.lesson6.driving.family;

public abstract class FamilyMember {
    private final String name;
    private final int age;

    public FamilyMember(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
