package com.unibuc.Mediator;

public interface TeamLeader {
    void createTeam(TeamMember damageDealer, TeamMember tank, TeamMember support);
    void determineStrategy(int strategySelection);
    void pushPayload(TeamMember teamMember);
    void attackPayload(TeamMember teamMember);
    String displayStrategy();
}
