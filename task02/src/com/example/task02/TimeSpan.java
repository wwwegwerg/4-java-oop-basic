package com.example.task02;

public class TimeSpan {
    private int seconds;
    private int minutes;
    private int hours;

    public TimeSpan(int hours, int minutes, int seconds) {
        int totalSeconds = getTotalTimeInSeconds(hours, minutes, seconds);
        this.hours = totalSeconds / 3600;
        totalSeconds /= 3600;
        this.minutes = totalSeconds / 60;
        totalSeconds /= 60;
        this.seconds = totalSeconds;
    }

    void add(TimeSpan time) {
        int totalSeconds1 = getTotalTimeInSeconds();
        int totalSeconds2 = time.getTotalTimeInSeconds();
        int totalSeconds = totalSeconds1 + totalSeconds2;
        hours = totalSeconds / 3600;
        totalSeconds /= 3600;
        minutes = totalSeconds / 60;
        totalSeconds /= 60;
        seconds = totalSeconds;
    }

    void subtract(TimeSpan time) {
        int totalSeconds1 = getTotalTimeInSeconds();
        int totalSeconds2 = time.getTotalTimeInSeconds();
        int totalSeconds = totalSeconds1 - totalSeconds2;
        hours = totalSeconds / 3600;
        totalSeconds /= 3600;
        minutes = totalSeconds / 60;
        totalSeconds /= 60;
        seconds = totalSeconds;
    }

    public String toString() {
        return String.format("h: %d; m: %d; s: %d", hours, minutes, seconds);
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    private static int getTotalTimeInSeconds(int hours, int minutes, int seconds) {
        return hours * 3600 + minutes * 60 + seconds;
    }

    private int getTotalTimeInSeconds() {
        return hours * 3600 + minutes * 60 + seconds;
    }
}
