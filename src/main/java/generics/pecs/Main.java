package generics.pecs;

import generics.factory.BladeWeaponCraftFactory;
import generics.factory.GunCraftFactory;
import generics.model.Katana;
import generics.model.LootBox;
import generics.model.Revolver;
import generics.model.Weapon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Main {

    public static void main(String[] args) {

        List<Revolver> revolvers = new ArrayList<>();
        revolvers.add(GunCraftFactory.craftBuryaRevolver());
        revolvers.add(GunCraftFactory.craftComradeHammerRevolver());

        List<Katana> katanas = new ArrayList<>();
        katanas.add(BladeWeaponCraftFactory.craftScalpelKatana());
        katanas.add(BladeWeaponCraftFactory.craftSatoriKatana());

        System.out.println(katanas);
        System.out.println("Upgrading");
        superUpgrade(katanas, katana -> katana.setDamage(10000));
        System.out.println(katanas);

        System.out.println(revolvers);
        Revolver maxWeapon = findMaxWeapon(revolvers, Comparator.comparingInt(Revolver::getDamage));
        System.out.println(maxWeapon);

    }

    public static <W> void superUpgrade(List<? extends W> weapons, Upgrade<? super W> upgrade) {
        for (W weapon: weapons) {
            upgrade.upgradeWeapon(weapon);
        }
    }

    public static <W> W findMaxWeapon(List<? extends W> weapons, Comparator<? super W> comparator) {
        Optional<? extends W> max = weapons.stream().max(comparator);

        return max.get();
    }
}
