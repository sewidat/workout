package com.example.workout.model;

public class Workouts {
    private String workoutName;
    private String duration;
    private String level;
    private String gifURL;

    public Workouts(String workoutName, String duration, String level, String gifURL) {
        this.workoutName = workoutName;
        this.duration = duration;
        this.level = level;
        this.gifURL = gifURL;
    }

    public String getWorkoutName() {
        return workoutName;
    }

    public void setWorkoutName(String workoutName) {
        this.workoutName = workoutName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getGifURL() {
        return gifURL;
    }

    public void setGifURL(String gifURL) {
        this.gifURL = gifURL;
    }

    @Override
    public String toString() {
        return "Workouts{" +
                "workoutName='" + workoutName + '\'' +
                ", duration='" + duration + '\'' +
                ", level='" + level + '\'' +
                ", gifURL='" + gifURL + '\'' +
                '}';
    }
}
