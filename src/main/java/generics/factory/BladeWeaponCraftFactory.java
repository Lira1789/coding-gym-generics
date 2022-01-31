package generics.factory;

import generics.model.Katana;
import generics.model.Knife;
import generics.model.Machete;

import java.util.Random;

public class BladeWeaponCraftFactory {

    private static final Random RANDOM = new Random();

    private BladeWeaponCraftFactory() {
    }

    public static Katana craftSatoriKatana() {

        return new Katana(RANDOM.nextInt(10000), 10);
    }

    public static Katana craftScalpelKatana() {
        return new Katana(RANDOM.nextInt(5000), 20);
    }

    public static Knife craftStingerKnife() {
        return new Knife(RANDOM.nextInt(3400), 100);
    }

    public static Machete craftMachete() {
        return new Machete(RANDOM.nextInt(4500), 50);
    }
}
