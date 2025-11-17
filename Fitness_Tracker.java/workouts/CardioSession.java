package workouts;

public class CardioSession {
    private int caloriesBurned;
    private WorkoutSession parentWorkout;
    public CardioSession(int caloriesBurned, WorkoutSession parentWorkout) {
        this.caloriesBurned = caloriesBurned;
        this.parentWorkout = null;
    }
    public int getCaloriesBurned() {
        return caloriesBurned;
    }
    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
    public WorkoutSession getParentWorkout() {
        return parentWorkout;
    }
    public void setParentWorkout(WorkoutSession parentWorkout) {
        this.parentWorkout = parentWorkout;
    }

    @Override
    public String toString(){
        return "Cardio Session - Calories Burned:" + caloriesBurned ;
    }
    

}
