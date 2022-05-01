package isi.tn.services;

import isi.tn.entities.Game;
import isi.tn.entities.Team;
import isi.tn.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class GameService implements IGameService{
    @Autowired
    GameRepository gameRepository;
    @Override
    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public List<Game> findAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public Optional<Game> getGameById(long id) {
        return gameRepository.findById(id);    }

    @Override
    public void deleteGame(Game game) {
        gameRepository.delete(game);

    }

    @Override
    public Game deleteGameById(long id) {
        Game game = gameRepository.findById(id).orElseThrow(() -> new NullPointerException() );
        gameRepository.deleteById(id);
        return game;
    }
}
