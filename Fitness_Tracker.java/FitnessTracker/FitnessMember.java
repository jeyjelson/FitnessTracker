package FitnessTracker;

import Meals.Meal;
import workouts.WorkoutSession;

import java.util.ArrayList;
import java.util.List;

public class FitnessMember extends IndividualDetails {
    private static final double BMI_THRESHOLD = 25.0;
    private static int memberCount = 0;

    private List<Meal> meals;
    private List<WorkoutSession> workoutSessions;

    public FitnessMember(String name, int age, double weight, double height) throws InvalidHealthException {
        super(name, age, weight, height);
        this.meals = new ArrayList<>();
        this.workoutSessions = new ArrayList<>();
        memberCount++;
    }

    public void addMeal(Meal meal) {
        if (meal != null) {
            meals.add(meal);
        }
    }

    public void addWorkoutSession(WorkoutSession workout) {
        if (workout != null) {
            workoutSessions.add(workout);
        }
    }

    public List<WorkoutSession> getWorkoutSessions() {
        return workoutSessions;
    }

    public double calculateBMI() {
        return getWeight() / Math.pow(getHeight(), 2);
    }

    public HealthEnum evaluateHealthStatus() {
        double bmi = calculateBMI();
        if (bmi < 18.5) return HealthEnum.POOR;
        if (bmi < 24.9) return HealthEnum.GOOD;
        if (bmi <= BMI_THRESHOLD) return HealthEnum.FAIR;
        return HealthEnum.POOR;
    }

    public static int getMemberCount() {
        return memberCount;
    }

    @Override
    public void displayHealthSummary() {
        System.out.println("Health Summary for " + getName());
        System.out.println("Age: " + getAge() + ", BMI: " + String.format("%.2f", calculateBMI()));
        System.out.println("Health Status: " + evaluateHealthStatus());
    }
}
