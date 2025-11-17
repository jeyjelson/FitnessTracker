package FitnessTracker;

import Meals.*;
import workouts.*;

public final class CertifiedTrainer implements PersonalTrainer {
    private String trainerName;

    public CertifiedTrainer(String trainerName) {
        this.trainerName = trainerName;
    }

    @Override
    public void assignWorkoutPlan(FitnessMember member) {
        System.out.println(trainerName + " is assigning a workout plan for " + member.getName());
        WorkoutSession workout = new WorkoutSession("Full body routine", 60, DifficultyLevel.Medium) {
            @Override
            public String toString() {
                return "Workout: " + getSessionName() + ", Duration: " + getDuration();
            }
        };

        member.addWorkoutSession(workout);
    }

    @Override
    public void assignMealPlan(FitnessMember member) {
        System.out.println(trainerName + " has assigned a meal plan for " + member.getName());
        Breakfast breakfast = new Breakfast("Oatmeal", "Black Coffee", 300, true);
        member.addMeal(breakfast);
    }

    public void displayTrainerInfo() {
        System.out.println("Certified Trainer: " + trainerName);
    }
}
