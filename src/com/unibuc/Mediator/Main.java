package com.unibuc.Mediator;

// mediator - TeamLeader (interfata) cu TeamLeaderConcrete
// DamageDealer, Tank, Support - clase de tip Colleague

//am simulat un management simplificat al unei echipe dintr-un joc de tip push the payload

public class Main {

    public static void main(String[] args) {

        TeamLeader teamLeader = new TeamLeaderConcrete();

        TeamMember damageDealer = new DamageDealer(teamLeader);
        TeamMember tank = new Tank(teamLeader);
        TeamMember support = new Support(teamLeader);

        teamLeader.createTeam(damageDealer, tank, support);

        teamLeader.determineStrategy(1);

        teamLeader.pushPayload(damageDealer);

        teamLeader.determineStrategy(2);

        teamLeader.attackPayload(tank);

        teamLeader.attackPayload(support);

        teamLeader.determineStrategy(1);

        teamLeader.pushPayload(tank);

        teamLeader.determineStrategy(2);

        teamLeader.attackPayload(damageDealer);
    }
}
