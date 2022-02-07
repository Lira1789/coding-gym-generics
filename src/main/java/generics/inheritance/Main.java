package generics.inheritance;



import generics.model.EpicLootBox;
import generics.model.Gun;
import generics.model.LootBox;
import generics.model.Weapon;


public class Main {

    public static void main(String[] args) {
        // Java expected behavior
        Weapon weapon = new Weapon();

        Gun gun = new Gun();

        weapon = gun;
        //gun = weapon; compile error


        LootBox<Weapon> weaponLootBox= new LootBox<>();
        LootBox<Gun> gunLootBox= new LootBox<>();

        //weaponLootBox = gunLootBox; //compile error


        EpicLootBox<Weapon> epicLootBox = new EpicLootBox<>(new Weapon());
        weaponLootBox = epicLootBox;
        //epicLootBox = weaponLootBox; //compile error

        EpicLootBox<Gun> gunEpicLootBox = new EpicLootBox<>(gun);

        //weaponLootBox = gunEpicLootBox; //compile error

    }
}
