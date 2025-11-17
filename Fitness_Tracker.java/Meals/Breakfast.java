package Meals;

public class Breakfast extends Meal {
    private boolean isVegan;

    public Breakfast(String mealName, String drink, int calories, boolean isVegan) {
        super(mealName, drink, calories, MealType.BREAKFAST);
        this.isVegan = isVegan;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean isVegan) {
        this.isVegan = isVegan;
    }

    @Override
    public void displayMealDetails() {
        System.out.println(getMealType() + " " + getMealName() + " Drink: " + getDrink() + ", Calories: " +
                getCalories() + ", Vegan: " + isVegan());
    }
}
