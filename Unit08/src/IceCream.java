import food.Edible;
import food.RefrigeratorItem;

/**
 * Created by tianrui on 3/11/14.
 */
public class IceCream implements Edible, RefrigeratorItem {

    private int calories;
    private String name;

    public IceCream(String n, int c) {
        calories = c;
        name = n;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public String getFoodGroup() {
        return "Dairy";
    }

    @Override
    public boolean isFrozen() {
        return true;
    }

    @Override
    public int getDaysToExpiration() {
        return 60;
    }
}
