package Meals;

public class Lunch extends Meal {
    private boolean highProtein;

    public Lunch(String mealName, String drink, int calories, boolean highProtein) {
        super(mealName, drink, calories, MealType.LUNCH);
        this.highProtein = highProtein;
    }

    public boolean isHighProtein() {
        return highProtein;
    }

    public void setHighProtein(boolean highProtein) {
        this.highProtein = highProtein;
    }

    @Override
    public void displayMealDetails() {
        System.out.println(getMealType() + " " + getMealName() + " Drink: " + getDrink() + ", Calories: " +
                getCalories() + ", High Protein: " + isHighProtein());
    }
}
