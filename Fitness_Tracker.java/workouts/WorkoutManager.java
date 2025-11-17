package workouts;

import java.util.ArrayList;
import java.util.List;

public class WorkoutManager {
    private static final List<WorkoutSession> sessions = new ArrayList<>();

    private WorkoutManager(){}

    public static void addSession(WorkoutSession session){
        if (session != null) {
            sessions.add(session);
            System.out.println("Added a new Workout Session" + session);

        }else {
            System.out.println("Workout Session Cannot be Empty !");
        
        }
    }

    public static List<WorkoutSession> getSessions(){
        return new ArrayList<>(sessions);
    }
    public static int calculateTotalDuration(){
        int totalDuration = 0;
        for(WorkoutSession session : sessions) {
            totalDuration += session.getDuration();
        }
        return totalDuration;
    }
    public static void displayAllSessions(){
        if (sessions.isEmpty()){
            System.out.println("Workout Sessions unavaiable");
        }else{
            System.out.println("Workout Sessions:");
            for(WorkoutSession session : sessions){
                System.out.println(session);
            }
        }

        }
    }



