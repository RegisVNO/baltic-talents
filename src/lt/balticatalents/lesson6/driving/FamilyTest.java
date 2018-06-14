package lt.balticatalents.lesson6.driving;

import lt.balticatalents.lesson6.driving.family.Daughter;
import lt.balticatalents.lesson6.driving.family.FamilyMember;
import lt.balticatalents.lesson6.driving.family.Father;
import lt.balticatalents.lesson6.driving.family.Mother;
import lt.balticatalents.lesson6.driving.family.Son;

public class FamilyTest {
    public static void main(String[] args) {
        FamilyMember[] family1 = new FamilyMember[4];
        family1[0] = new Father("Stasys", 21);
        family1[1] = new Mother("Stasija", 21);
        family1[2] = new Son("Stasiukas", 3);
        family1[3] = new Daughter("Stasyte", 3);

        FamilyMember[] family2 = new FamilyMember[3];
        family2[0] = new Father("Zigmas", 40);
        family2[1] = new Mother("Anastasija", 37);
        family2[2] = new Son("Saulius", 19);
    }
}
