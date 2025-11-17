package workouts;

import java.util.ArrayList;
import java.util.List;

public abstract class WorkoutSession{
    private String sessionName;
    private Integer duration;
    private DifficultyLevel difficultyLevel;
    private List<StrengthSession> strengthSessions;
    private List<CardioSession> cardioSessions;

public WorkoutSession(String sessionName, Integer duration, DifficultyLevel difficultyLevel){
    this.sessionName = sessionName;
    this.duration = duration;
    this.difficultyLevel = difficultyLevel;
    this.strengthSessions = new ArrayList<>();
    this.cardioSessions = new ArrayList<>();

}

public List<StrengthSession> getStrengthSessions() {
    return strengthSessions;
}

public void setStrengthSessions(List<StrengthSession> strengthSessions) {
    this.strengthSessions = strengthSessions;
}

public List<CardioSession> getCardioSessions() {
    return cardioSessions;
}

public void setCardioSessions(List<CardioSession> cardioSessions) {
    this.cardioSessions = cardioSessions;
}

public String getSessionName() {
    return sessionName;
}

public void setSessionName(String sessionName) {
    this.sessionName = sessionName;
}

public Integer getDuration() {
    return duration;
}

public void setDuration(Integer duration) {
    this.duration = duration;
}

public DifficultyLevel getDifficultyLevel() {
    return difficultyLevel;
}

public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
    this.difficultyLevel = difficultyLevel;
}

public void addStrengthSession(StrengthSession session){
    if (session != null){
        session.setParentWorkout(this);
        strengthSessions.add(session);
    }
}

public void addCardioSession(CardioSession session){
    if (session != null){
        session.setParentWorkout(this);
        cardioSessions.add(session);
    }
}


public abstract String toString();
}
    