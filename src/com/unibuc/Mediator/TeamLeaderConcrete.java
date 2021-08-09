package com.unibuc.Mediator;

public class TeamLeaderConcrete implements TeamLeader{

    TeamMember damageDealer, tank, support;
    String strategy;

    @Override
    public void createTeam(TeamMember damageDealer, TeamMember tank, TeamMember support) {
        this.damageDealer = damageDealer;
        this.tank = tank;
        this.support = support;

        System.out.println("Created New Team!");
    }

    @Override
    public void determineStrategy(int strategySelection) {
        if (strategySelection == 1)
            strategy = "Defense";
        else
            strategy = "Offense";
    }

    @Override
    public void pushPayload(TeamMember teamMember) {
        teamMember.push();
    }

    @Override
    public void attackPayload(TeamMember teamMember) {
        teamMember.attack();
    }

    @Override
    public String displayStrategy() {
        return strategy;
    }
}
