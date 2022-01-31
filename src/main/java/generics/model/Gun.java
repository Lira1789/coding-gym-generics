package generics.model;

public class Gun extends Weapon {

    protected int ammoCount;

    public Gun() {
    }

    public Gun(int damage, int ammoCount) {
        super(damage);
        this.ammoCount = ammoCount;
    }

    public void fire() {
        int ammoForOneShot = 5;

        if (ammoCount < ammoForOneShot) {
            System.out.println("Reloading.....");
            ammoCount++;
        }

        System.out.println(String.format("Fire: %d bullet", ammoForOneShot));
        ammoCount--;
    }

    public int getAmmoCount() {
        return ammoCount;
    }

    public void setAmmoCount(int ammoCount) {
        this.ammoCount = ammoCount;
    }

    @Override
    public String toString() {
        return "Gun{" +
                "ammoCount=" + ammoCount +
                ", damage=" + damage +
                '}';
    }
}
