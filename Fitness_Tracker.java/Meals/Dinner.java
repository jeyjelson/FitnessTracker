package Meals;

public class Dinner extends Meal {
    private boolean lowCarb;

    public Dinner(String mealName, String drink, int calories, boolean lowCarb) {
        super(mealName, drink, calories, MealType.DINNER);
        this.lowCarb = lowCarb;
    }

    public boolean isLowCarb() {
        return lowCarb;
    }

    public void setLowCarb(boolean lowCarb) {
        this.lowCarb = lowCarb;
    }

    @Override
    public void displayMealDetails() {
        System.out.println(getMealType() + " " + getMealName() + " Drink: " + getDrink() + ", Calories: " +
                getCalories() + ", Low Carbs: " + isLowCarb());
    }
}
