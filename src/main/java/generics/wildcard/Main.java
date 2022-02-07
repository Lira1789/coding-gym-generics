package generics.wildcard;

import generics.factory.BladeWeaponCraftFactory;
import generics.factory.GunCraftFactory;
import generics.model.BladeWeapon;
import generics.model.Gun;
import generics.model.Katana;
import generics.model.Knife;
import generics.model.Machete;
import generics.model.Revolver;
import generics.model.Shotgun;
import generics.model.SniperRiffle;
import generics.model.Weapon;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Revolver comradeHammerRevolver = GunCraftFactory.craftComradeHammerRevolver();
        SniperRiffle ashuraRiffle = GunCraftFactory.craftAshuraRiffle();
        SniperRiffle nekomataRiffle = GunCraftFactory.craftNekomataRiffle();
        Shotgun crusherShotgun = GunCraftFactory.craftCrusherShotgun();

        Katana satoriKatana = BladeWeaponCraftFactory.craftSatoriKatana();
        Katana scalpelKatana = BladeWeaponCraftFactory.craftScalpelKatana();
        Knife stingerKnife = BladeWeaponCraftFactory.craftStingerKnife();
        Machete machete =  BladeWeaponCraftFactory.craftMachete();

        //what we can add to this list?
        List<? extends Weapon> weapons = new ArrayList<>();
        //weapons.add(ashuraRiffle); //compilation error
        //weapons.add(comradeHammerRevolver); //compilation error
        //weapons.add(crusherShotgun); //compilation error
        //weapons.add(new Weapon()); //compilation error
        //weapons.add(new Gun()); //compilation error
        //weapons.add(new BladeWeapon()); //compilation error
        //weapons.add(new Object()); //compilation error
        weapons.add(null);

        //what we can assign?
        weapons = new ArrayList<Weapon>();
        weapons = new ArrayList<Gun>();
        weapons =  new ArrayList<BladeWeapon>();
        weapons = new ArrayList<Katana>();
        weapons = new ArrayList<SniperRiffle>();
        //weapons = new ArrayList<Object>();  compilation error

        //what we get
        Weapon weapon = weapons.get(1);

        process(weapons);

        //what we can add to this list?
        List<? super BladeWeapon> bladeWeapons = new ArrayList<>();

        bladeWeapons.add(satoriKatana);
        bladeWeapons.add(new BladeWeapon());
        bladeWeapons.add(stingerKnife);
        //bladeWeapons.add(new Weapon()); //compilation error
        //bladeWeapons.add(new Object()); //compilation error


        //what we can assign?
        bladeWeapons = new ArrayList<Object>();
        bladeWeapons = new ArrayList<BladeWeapon>();
        bladeWeapons = new ArrayList<Weapon>();
        //bladeWeapons = new ArrayList<Katana>(); //compilation error

        //what we get
        Object object = bladeWeapons.get(1);

        process2(bladeWeapons);

    }

    //safe only for ArrayList<SniperRiffle>(), but the compiler knows that weapons can refer to other array lists
    public static void process(List<? extends Weapon> weapons) {
        //weapons.add(GunCraftFactory.craftAshuraRiffle()); //compilation error
    }

    //adding Object is safe only for ArrayList<Object>(), but the compiler knows that bladeWeapons can refer to other array lists
    public static void process2(List<? super BladeWeapon> bladeWeapons) {
        bladeWeapons.add(new BladeWeapon());
        bladeWeapons.add(BladeWeaponCraftFactory.craftScalpelKatana());
        //bladeWeapons.add(new Object());
    }

}
