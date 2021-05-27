package com.example.importdatabaze;

import java.io.Serializable;

public class Ekspon implements Serializable {
    private long ID;
    private String Name;
    private int Year;
    private int YearInSchool;
    private String History;
    public Ekspon(long ID, String Name,int Year, int YearInSchool, String History) {
        this.ID = ID;
        this.Name = Name;
        this.Year = Year;
        this.YearInSchool = YearInSchool;
        this.History=History;
    }

    public long getId() { return ID; }

    public String getName() {
        return Name;
    }

    public int getYear() {
        return Year;
    }

    public int getYearInSchool() {
        return YearInSchool;
    }

    public String getHistory() {
        return History;
    }
}