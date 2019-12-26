package main.java.MasterClass.Generics;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(T player) {
        if (!members.contains(player)){
            members.add(player);
        } else {
            System.out.println(player.getName() + " is already on the team");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<T> getMembers() {
        return members;
    }

    public void setMembers(ArrayList members) {
        this.members = members;
    }
}
