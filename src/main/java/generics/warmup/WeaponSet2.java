package generics.warmup;


import generics.model.BladeWeapon;
import generics.model.Gun;

//after Java 5 with Generics
public class WeaponSet2 <G extends Gun, B extends BladeWeapon> {

    private G gun;
    private B bladeWeapon;

    public WeaponSet2(G gun, B bladeWeapon) {
        this.gun = gun;
        this.bladeWeapon = bladeWeapon;
    }

    public void showWeaponSet() {
        System.out.println(gun);
        System.out.println(bladeWeapon);
    }

    public void attack() {
        gun.fire();
        bladeWeapon.stub();
    }

    public <M> M method(G gun) {
        return (M) gun;
    }

    public int  compareWithAnotherSet(WeaponSet2<?, ?> anotherSet) {
        int damage = gun.getDamage() + bladeWeapon.getDamage();

        int anotherDamage = anotherSet.gun.getDamage() + anotherSet.bladeWeapon.getDamage();

        return damage - anotherDamage;
    }



}
