package generics.warmup;

// before Java 5
public class WeaponSet {

    private Object gun;
    private Object bladeWeapon;

    public WeaponSet(Object gun, Object bladeWeapon) {
        this.gun = gun;
        this.bladeWeapon = bladeWeapon;
    }

    public void showWeaponSet() {
        System.out.println(gun);
        System.out.println(bladeWeapon);
    }
}
