package generics.advanced;

import generics.factory.GunCraftFactory;
import generics.model.Gun;

import java.util.Arrays;
import java.util.List;

public class WeaponShop<W>{

    public List<Gun> buyGuns() {
        return Arrays.asList(GunCraftFactory.craftAshuraRiffle(),
                GunCraftFactory.craftBuryaRevolver(),
                GunCraftFactory.craftCrusherShotgun());

    }
}
