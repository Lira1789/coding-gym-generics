package generics.erasure;

import generics.model.Katana;
import generics.model.LootBox;

public class Main {

    public static void main(String[] args) {
        //before erasure
        LootBox<Katana> katanaLootBox = new LootBox<>();
        Katana katana = katanaLootBox.getWeapon();

        //after erasure
        LootBox lootBox = new LootBox();
        Katana weapon = (Katana) lootBox.getWeapon();

    }
}
