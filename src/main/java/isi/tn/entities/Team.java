package isi.tn.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.util.Set;
@EnableAutoConfiguration
@Entity

public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Name;
    private String Country;

    @OneToMany(mappedBy="team1",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JsonIgnore
    @JsonBackReference
    private Set<Game> matches;


    public Team(Long id, String name, String country, Set<Game> matches) {
        this.id = id;
        Name = name;
        Country = country;
        this.matches = matches;
    }

    public Team(Long id, String name, String country) {
        this.id = id;
        Name = name;
        Country = country;
    }

    public Team() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }


}
