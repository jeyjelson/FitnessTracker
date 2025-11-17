import FitnessTracker.*;
import Meals.*;
import workouts.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Create a FitnessMember instance
            FitnessMember member = new FitnessMember("Jithin Jelson", 21, 70.0, 1.7);
            member.displayHealthSummary();

            // Create a CertifiedTrainer instance
            CertifiedTrainer trainer = new CertifiedTrainer("Chris Bumstead");

            // Assign meals to the FitnessMember
            trainer.assignMealPlan(member);

            // Add additional meals: Breakfast, Lunch, and Dinner
            Breakfast breakfast = new Breakfast(" Oatmeal ", "Black Coffee", 300, true);
            Lunch lunch = new Lunch(" Grilled Chicken ", "Orange Juice", 600, true);
            Dinner dinner = new Dinner(" Salmon ", "Green Tea", 500, false);

            member.addMeal(breakfast);
            member.addMeal(lunch);
            member.addMeal(dinner);

            // Add meals to the global MealManager
            MealManager.addMeal(breakfast);
            MealManager.addMeal(lunch);
            MealManager.addMeal(dinner);

            // Assign workout plan to the FitnessMember
            trainer.assignWorkoutPlan(member);

            // Add workout sessions: Strength and Cardio
            WorkoutSession workout = new WorkoutSession("Full body routine", 60, DifficultyLevel.Medium) {
                @Override
                public String toString() {
                    return "Workout: " + getSessionName() + ", Duration: " + getDuration() + " minutes";
                }
            };
            member.addWorkoutSession(workout);

            StrengthSession strengthSession = new StrengthSession("Push-ups, Squats", 3, 15, workout);
            CardioSession cardioSession = new CardioSession(300, workout);

            workout.addStrengthSession(strengthSession);
            workout.addCardioSession(cardioSession);

            // Add workout sessions to the global WorkoutManager
            WorkoutManager.addSession(workout);

            // Print all meals assigned to the member
            System.out.println("\nAll Meals Assigned:");
            MealManager.displayAllMeals();

            // Print all workout sessions assigned to the member
            System.out.println("\nAll Workout Sessions Assigned:");
            WorkoutManager.displayAllSessions();

            // Display member health summary again after assigning workout and meal plans
            member.displayHealthSummary();

        } catch (InvalidHealthException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
