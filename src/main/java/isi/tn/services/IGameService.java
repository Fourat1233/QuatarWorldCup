package isi.tn.services;

import isi.tn.entities.Game;
import isi.tn.entities.Team;

import java.util.List;
import java.util.Optional;

public interface IGameService {
    Game saveGame(Game game);

    List<Game> findAllGames();

    Optional<Game> getGameById(long id);


    void deleteGame(Game game);

    Game deleteGameById (long id );
}
