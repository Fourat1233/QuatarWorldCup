package isi.tn.controllers;

import isi.tn.entities.Team;
import isi.tn.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiTeam")
public class TeamController {

    @Autowired
    TeamService teamService ;


    @GetMapping("/teams")
    public List<Team> getAllTeams() {
        List<Team> allTeams = teamService.findAllTeams();
        return allTeams;
    }

    @PostMapping("/addTeam")
    public Team createTeam( @RequestBody Team team) {
        return teamService.saveTeam(team);
    }

    @GetMapping("/team/{id}")
    public Optional<Team> getTeamById(@PathVariable(value = "id") Long Id) {
        return teamService.getTeambyId(Id);
    }

    @DeleteMapping("/team/")
    public void deleteTeam(@RequestBody Team team) {
        teamService.deletTeam(team);
    }

    @DeleteMapping("/team/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable(value = "id") Long teamId) {
        Optional<Team> team = teamService.getTeambyId(teamId);
        teamService.deleteTeambyId(teamId);
        return ResponseEntity.ok().build();
    }
}
