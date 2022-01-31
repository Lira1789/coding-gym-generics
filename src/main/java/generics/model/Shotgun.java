package generics.model;

public class Shotgun extends Gun {

    public Shotgun(int damage, int ammoCount) {
        super(damage, ammoCount);
    }

    @Override
    public void fire() {
        int ammoForOneShot = 2;

        if (ammoCount < ammoForOneShot) {
            System.out.println("Reloading.....");
            ammoCount += ammoForOneShot;
        }

        System.out.println(String.format("Fire: %d bullet", ammoForOneShot));
        ammoCount -= ammoForOneShot;
    }

    public void doChemicalDamage() {
        System.out.println("Chemical damage");
    }

    @Override
    public String toString() {
        return "Shotgun{" +
                "ammoCount=" + ammoCount +
                ", damage=" + damage +
                '}';
    }
}
