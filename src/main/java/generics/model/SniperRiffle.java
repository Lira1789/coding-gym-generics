package generics.model;

public class SniperRiffle extends Gun {

    public SniperRiffle(int damage, int ammoCount) {
        super(damage, ammoCount);
    }

    @Override
    public void fire() {
        int ammoForOneShot = 5;

        if (ammoCount < ammoForOneShot) {
            System.out.println("Reloading.....");
            ammoCount += ammoForOneShot;
        }

        System.out.println(String.format("Fire: %d bullet", ammoForOneShot));
        ammoCount -= ammoForOneShot;
    }

    public void doElectricalDamage() {
        System.out.println("Electrical Damage");
    }

    @Override
    public String toString() {
        return "SniperRiffle{" +
                "ammoCount=" + ammoCount +
                ", damage=" + damage +
                '}';
    }
}
