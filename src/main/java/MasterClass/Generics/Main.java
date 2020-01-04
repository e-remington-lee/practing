package main.java.MasterClass.Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        SoccerPlayer p1 = new SoccerPlayer("Bob");
//        BaseballPlayer p2 = new BaseballPlayer("Erik");
//        BaseballPlayer p3 = new BaseballPlayer("Eric");
//
//        Team<BaseballPlayer> team = new Team<>("tigers");
//
//        team.addPlayer(p2);
//        team.addPlayer(p3);
//
//        for (Player player : team.getMembers()) {
//            System.out.println(player.getName());
//        }

        League<BaseBallTeams> b = new League<>("Base Ball");
        League<SoccerTeams> s = new League<>("Soccer!");
        SoccerTeams team1 = new SoccerTeams("Team 1", 1);
        SoccerTeams team2 = new SoccerTeams("Team 2", 2);
        SoccerTeams team3 = new SoccerTeams("Team 3", 3);

        BaseBallTeams b1 = new BaseBallTeams("b1", 1);
        s.addTeam(team1);
        s.addTeam(team2);
        s.addTeam(team3);
    }
}
