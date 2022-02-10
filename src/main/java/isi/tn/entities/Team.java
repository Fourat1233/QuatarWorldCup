package isi.tn.entities;

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
   // @JsonIgnore
    //@JsonBackReference
    private Set<Match> matches;


    public Team(Long id, String name, String country, Set<Match> matches) {
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
