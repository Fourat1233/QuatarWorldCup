package isi.tn.repositories;

import isi.tn.entities.Game;
import isi.tn.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface GameRepository extends JpaRepository<Game,Long> {

}
