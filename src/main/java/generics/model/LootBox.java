package generics.model;

public class LootBox <W> {

    private W weapon;

    public LootBox() {
    }

    public LootBox(W weapon) {
        this.weapon = weapon;
    }

    public W getWeapon() {
        return weapon;
    }

    public void setWeapon(W weapon) {
        this.weapon = weapon;
    }
}
