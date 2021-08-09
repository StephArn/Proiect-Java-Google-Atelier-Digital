package com.unibuc.Mediator;

public class DamageDealer implements TeamMember{
    private TeamLeader teamLeader;

    public DamageDealer(TeamLeader teamLeader) {
        this.teamLeader = teamLeader;
    }

    @Override
    public void push() {
        if (teamLeader.displayStrategy().equals("Defense"))
        {
            System.out.println("Damage Dealer Is Pushing the Payload!");
        }
    }

    @Override
    public void attack() {
        if (teamLeader.displayStrategy().equals("Offense"))
        {
            System.out.println("Damage Dealer Is Attacking the Enemy Team!");
        }
    }
}
