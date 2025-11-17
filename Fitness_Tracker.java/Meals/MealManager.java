package Meals;

import java.util.ArrayList;
import java.util.List;

public class MealManager {
    private static final List<Meal> meals = new ArrayList<>();

    private MealManager() {}

    public static void addMeal(Meal meal) {
        if (meal != null) {
            meals.add(meal);
            System.out.println("Meal Added: " + meal.getMealName());
        }
    }

    public static void displayAllMeals() {
        if (meals.isEmpty()) {
            System.out.println("Meals unavailable");
        } else {
            System.out.println("Meals:");
            for (Meal meal : meals) {
                meal.displayMealDetails();
            }
        }
    }

    public static int calculateTotalCalories() {
        int totalCalories = 0;
        for (Meal meal : meals) {
            totalCalories += meal.getCalories();
        }
        return totalCalories;
    }
}
