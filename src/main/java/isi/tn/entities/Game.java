package isi.tn.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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


    public Game(Long id, Team team1) {
        this.id = id;
        this.team1 = team1;

    }

    public Game() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }




}
