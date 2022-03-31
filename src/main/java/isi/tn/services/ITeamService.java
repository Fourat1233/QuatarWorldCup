package isi.tn.services;

import isi.tn.entities.Team;
import isi.tn.entities.User;

import java.util.List;
import java.util.Optional;

public interface ITeamService {
    Team saveTeam(Team team);

    List<Team> findAllTeams();

    Optional<Team> getTeambyId(long id);


    void deletTeam(Team team);

    Team deleteTeambyId (long id );
}
