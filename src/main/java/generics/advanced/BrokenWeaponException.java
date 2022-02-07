package generics.advanced;

// compile error
/*public class BrokenWeaponException <W> extends Exception {

    private final W weapon;

    public BrokenWeaponException(W weapon) {
        this.weapon = weapon;
    }

    public W getWeapon() {
        return weapon;
    }
}*/
