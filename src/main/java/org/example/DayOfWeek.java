package org.example;

public enum DayOfWeek {
    MONDAY ("Monday", false),
    TUESDAY ("Tuesday", false),
    WEDNESDAY ("Wednesday", false),
    THURSDAY ("Thursday", false),
    FRIDAY ("Friday", false),
    SATURDAY ("Saturday", true),
    SUNDAY ("Sunday", true);


    private final String day;
    private final boolean weekend;

    DayOfWeek(String day, boolean weekend) {
        this.weekend = weekend;
        this.day = day;
    }
    public String getDay() {
        return day;
    }
    public boolean isWeekend() {
        return weekend;
    }
    public String getDayOrWeekend() {
        return isWeekend() ? "Weekend" : day;
    }

}
