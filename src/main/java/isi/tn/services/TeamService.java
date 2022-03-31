package isi.tn.services;

import isi.tn.entities.Team;
import isi.tn.entities.User;
import isi.tn.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService implements ITeamService {
    @Autowired
    TeamRepository teamRepository;


    @Override
    public Team saveTeam(Team team) {
        return teamRepository.save(team);
    }

    @Override
    public List<Team> findAllTeams() {
        return teamRepository.findAll();
    }

    @Override
    public Optional<Team> getTeambyId(long id) {
        return teamRepository.findById(id);
    }

    @Override
    public void deletTeam(Team team) {
        teamRepository.delete(team);

    }

    @Override
    public Team deleteTeambyId(long id) {
        Team team = teamRepository.findById(id).orElseThrow(() -> new NullPointerException() );
        teamRepository.deleteById(id);
        return team;
    }
}
