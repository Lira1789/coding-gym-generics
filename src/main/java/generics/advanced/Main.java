package generics.advanced;


import generics.model.Gun;

public class Main {

    public static void main(String[] args) {

        WeaponShop weaponShop = new WeaponShop();

        //doesn't compile
        /*for (Gun gun:weaponShop.buyGuns()) {
            System.out.println(gun);
        }*/

        //how to fix
        WeaponShop<?> weaponShop2 = new WeaponShop();

        for (Gun gun:weaponShop2.buyGuns()) {
            System.out.println(gun);
        }


        Class<Gun> gunClass = Gun.class;
        Gun gun = new Gun();

        Class<? extends Gun> aClass = gun.getClass();
    }
}
