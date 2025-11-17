package workouts;

public class StrengthSession {
    private String exercises;
    private int sets;
    private int reps;
    private WorkoutSession parentWorkout;


    public StrengthSession(String exercises, int sets, int reps, WorkoutSession parentWorkout) {
        this.exercises = exercises;
        this.sets = sets;
        this.reps = reps;
        this.parentWorkout = null;
    }


    public String getExercises() {
        return exercises;
    }


    public void setExercises(String exercises) {
        this.exercises = exercises;
    }


    public int getSets() {
        return sets;
    }


    public void setSets(int sets) {
        this.sets = sets;
    }


    public int getReps() {
        return reps;
    }


    public void setReps(int reps) {
        this.reps = reps;
    }


    public WorkoutSession getParentWorkout() {
        return parentWorkout;
    }


    public void setParentWorkout(WorkoutSession parentWorkout) {
        this.parentWorkout = parentWorkout;
    }



    @Override
        public String toString() {
        return "Strength Session - Excercises : ," + exercises + "Sets:,  " + sets + "Reps:, " + reps;
    } 
}