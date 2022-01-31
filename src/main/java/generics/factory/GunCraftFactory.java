package generics.factory;

import generics.model.Revolver;
import generics.model.Shotgun;
import generics.model.SniperRiffle;

import java.util.Random;

public class GunCraftFactory {

    private static final Random RANDOM = new Random();

    private GunCraftFactory() {
    }

    public static Revolver craftComradeHammerRevolver() {

        return new Revolver(RANDOM.nextInt(5000), 10);
    }

    public static Revolver craftBuryaRevolver() {
        return new Revolver(RANDOM.nextInt(3000), 20);
    }

    public static Shotgun craftCrusherShotgun() {
        return new Shotgun(RANDOM.nextInt(2000), 100);
    }

    public static SniperRiffle craftAshuraRiffle() {
        return new SniperRiffle(RANDOM.nextInt(4500), 50);
    }

    public static SniperRiffle craftNekomataRiffle() {
        return new SniperRiffle(RANDOM.nextInt(500), 50);
    }
}
