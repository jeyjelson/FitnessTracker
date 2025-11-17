package Meals;

public abstract class Meal {
    private String mealName;
    private String drink;
    private int calories;
    private MealType mealType;

    public Meal(String mealName, String drink, int calories, MealType mealType) {
        this.mealName = mealName;
        this.drink = drink;
        this.calories = calories;
        this.mealType = mealType;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    public abstract void displayMealDetails();
}
