package generics.rawtypes;


import generics.model.LootBox;
import generics.model.Weapon;

import java.io.Serializable;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //raw type
        LootBox rawLootBox = new LootBox();

        LootBox<Weapon> lootBox = new LootBox<>(new Weapon());

        rawLootBox = lootBox;
        //rawLootBox.setWeapon(new Weapon()); //unchecked warning
        //lootBox = rawLootBox; //unchecked warning


        //type inference
        Serializable serializable = pick("d", new ArrayList<String>());

    }

    static <T> T pick(T a1, T a2) { return a2; }
}
