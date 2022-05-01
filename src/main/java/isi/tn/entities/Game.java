package isi.tn.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
@EnableAutoConfiguration
@Entity

public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne//(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    @JsonIgnore

    private Team team1;

    @ManyToOne//(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonManagedReference
    @JsonIgnore
    private Team team2;


    public Game(Long id, Team team1,Team team2) {
        this.id = id;
        this.team1 = team1;
        this.team2 = team2;

    }

    public Game() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    @JsonIgnoreProperties("matches")
    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    @JsonIgnoreProperties("matches")
    public Team getTeam2() {
        return team2;
    }


    public void setTeam2(Team team2) {
        this.team2 = team2;
    }
}
