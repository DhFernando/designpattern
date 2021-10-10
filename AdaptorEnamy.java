import java.util.Random;

public class AdaptorEnamy {
    public static void main(String args[]) {
        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobart fredTheRobart = new EnemyRobart();
        EnamyAttacker robarAdaptor = new EnemyRobortAdaptor(fredTheRobart);

        System.out.println("The robort");
        fredTheRobart.reactToHuman("paul");
        fredTheRobart.walkForward();
        fredTheRobart.smashWithHands();

        System.out.println("The Enemy Tank");
        rx7Tank.assignDriver("Frank");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();

        System.out.println("The robort with adaptor");
        robarAdaptor.assignDriver("MArk");
        robarAdaptor.driveForward();
        robarAdaptor.fireWeapon();
    }
}

interface EnamyAttacker {
    public void fireWeapon();

    public void driveForward();

    public void assignDriver(String driverName);
}

class EnemyTank implements EnamyAttacker {

    Random generator = new Random();

    @Override
    public void fireWeapon() {
        int attackDamage = generator.nextInt(10) + 1;

        System.out.println("Enemy Tank Does " + attackDamage + " Damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(10) + 1;

        System.out.println("Enemy Tank moves " + movement + " Spaces");

    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");

    }

}

class EnemyRobart {
    Random generator = new Random();

    public void smashWithHands() {
        int attackDamage = generator.nextInt(10) + 1;
        System.out.println("EnemyRobart Causes " + attackDamage + " Damage with his hands");
    }

    public void walkForward() {
        int movement = generator.nextInt(10) + 1;

        System.out.println("Enemy robot  moves " + movement + " Spaces");

    }

    public void reactToHuman(String driverName) {
        System.out.println("Enemy robot tramps on " + driverName);
    }
}

class EnemyRobortAdaptor implements EnamyAttacker {

    EnemyRobart theRobart;

    EnemyRobortAdaptor(EnemyRobart newRobart) {
        this.theRobart = newRobart;
    }

    @Override
    public void fireWeapon() {
        theRobart.smashWithHands();

    }

    @Override
    public void driveForward() {
        theRobart.walkForward();

    }

    @Override
    public void assignDriver(String driverName) {
        theRobart.reactToHuman(driverName);

    }

}