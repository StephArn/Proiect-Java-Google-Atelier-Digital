package com.unibuc.Mediator;


public class Support implements TeamMember{
    private TeamLeader teamLeader;

    public Support(TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
    }

    @Override
    public void push() {
        if (teamLeader.displayStrategy().equals("Defense"))
        {
            System.out.println("Support Is Pushing the Payload!");
        }
    }

    @Override
    public void attack() {
        if (teamLeader.displayStrategy().equals("Offense"))
        {
            System.out.println("Support Is Healing Our Team!");
        }
    }
}
