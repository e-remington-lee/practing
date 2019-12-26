package main.java.MasterClass.Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SoccerPlayer p1 = new SoccerPlayer("Bob");
        BaseballPlayer p2 = new BaseballPlayer("Erik");
        BaseballPlayer p3 = new BaseballPlayer("Eric");

        Team<BaseballPlayer> team = new Team<>("tigers");

        team.addPlayer(p2);
        team.addPlayer(p3);

        for (Player player : team.getMembers()) {
            System.out.println(player.getName());
        }
    }
}
