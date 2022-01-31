package generics.model;

public class Revolver extends Gun {

    public Revolver(int damage, int ammoCount) {
        super(damage, ammoCount);
    }

    @Override
    public void fire() {
        int ammoForOneShot = 1;

        if (ammoCount < ammoForOneShot) {
            System.out.println("Reloading.....");
            ammoCount++;
        }

        System.out.println(String.format("Fire: %d bullet", ammoForOneShot));
        ammoCount--;
    }

    public void doThermalDamage() {
        System.out.println("Thermal Damage");
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "ammoCount=" + ammoCount +
                ", damage=" + damage +
                '}';
    }
}
