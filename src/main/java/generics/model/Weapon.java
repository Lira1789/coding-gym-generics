package generics.model;

public class Weapon {

    protected int damage;

    public Weapon() {
    }

    public Weapon(int damage) {
        this.damage = damage;
    }

    public void showDamage() {
        System.out.println("My damage is " + damage);
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "damage=" + damage +
                '}';
    }
}
