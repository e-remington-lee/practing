package main.java.MasterClass.Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class League<T extends TeamLeague> implements Comparable<Team>{
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public void addTeam(T team) {
        for (T x : teams) {
            if (x.getName().equalsIgnoreCase(team.getName())) {
                System.out.println(team.getName()+" already taken");
            } else {
                System.out.println("Team added!");
                teams.add(team);
            }
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    @Override
    public int compareTo(Team o) {
        return 0;
    }
}
