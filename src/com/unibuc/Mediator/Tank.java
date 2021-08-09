package com.unibuc.Mediator;

public class Tank implements TeamMember{
    private TeamLeader teamLeader;

    public Tank(TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
    }

    @Override
    public void push() {
        if (teamLeader.displayStrategy().equals("Defense"))
        {
            System.out.println("Tank Is Pushing the Payload!");
        }
    }

    @Override
    public void attack() {
        if (teamLeader.displayStrategy().equals("Offense"))
        {
            System.out.println("Tank Is Tanking Against the Enemy Team!");
        }
    }
}