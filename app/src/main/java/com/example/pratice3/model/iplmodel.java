package com.example.pratice3.model;

public class iplmodel {
    String teamname;
    int trophies,teamimage;

    public iplmodel(String teamname, int trophies, int teamimage) {
        this.teamname = teamname;
        this.trophies = trophies;
        this.teamimage = teamimage;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public int getTrophies() {
        return trophies;
    }

    public void setTrophies(int trophies) {
        this.trophies = trophies;
    }

    public int getTeamimage() {
        return teamimage;
    }

    public void setTeamimage(int teamimage) {
        this.teamimage = teamimage;
    }
}
