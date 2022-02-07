package generics.warmup;

import generics.factory.BladeWeaponCraftFactory;
import generics.factory.GunCraftFactory;
import generics.model.Katana;
import generics.model.Knife;
import generics.model.Machete;
import generics.model.Shotgun;
import generics.model.SniperRiffle;
import generics.model.Revolver;



public class Main {

    public static void main(String[] args) {

        Revolver comradeHammerRevolver = GunCraftFactory.craftComradeHammerRevolver();
        SniperRiffle ashuraRiffle = GunCraftFactory.craftAshuraRiffle();
        SniperRiffle nekomataRiffle = GunCraftFactory.craftNekomataRiffle();
        Shotgun crusherShotgun = GunCraftFactory.craftCrusherShotgun();

        Katana satoriKatana = BladeWeaponCraftFactory.craftSatoriKatana();
        Katana scalpelKatana = BladeWeaponCraftFactory.craftScalpelKatana();
        Knife stingerKnife = BladeWeaponCraftFactory.craftStingerKnife();
        Machete machete = BladeWeaponCraftFactory.craftMachete();

        WeaponSet weaponSet = new WeaponSet(ashuraRiffle, stingerKnife);

        WeaponSet2<Revolver, Katana> weaponSet2 = new WeaponSet2<>(comradeHammerRevolver, satoriKatana);

        weaponSet.showWeaponSet();
        weaponSet2.showWeaponSet();

        weaponSet2.attack();

        WeaponSet2<SniperRiffle, Katana> weaponSet3 = new WeaponSet2<>(ashuraRiffle, scalpelKatana);

        weaponSet2.compareWithAnotherSet(weaponSet3);

    }

}
