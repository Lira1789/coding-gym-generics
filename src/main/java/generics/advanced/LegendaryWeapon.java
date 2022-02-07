package generics.advanced;

//compile error
/*
public class LegendaryWeapon<T> {

    public static T getInstance() {
        if (instance == null)
            instance = new LegendaryWeapon<T>();

        return instance;
    }

    private static T instance = null;
}

*/
