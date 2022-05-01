package isi.tn.controllers;

import isi.tn.entities.Game;
import isi.tn.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apiGame")
public class GameController {

    @Autowired
    GameService gameService;


    @GetMapping("/games")
    public List<Game> getAllgames() {
       List<Game> allGames = gameService.findAllGames();
       return allGames;
    }

    @PostMapping("/addgame")
    public Game creategame( @RequestBody Game game) {
        return gameService.saveGame(game);
    }

    @GetMapping("/game/{id}")
    public Optional<Game> getgameById(@PathVariable(value = "id") Long Id) {
        return gameService.getGameById(Id);
    }

    @DeleteMapping("/game/")
    public void deletegame(@RequestBody Game game) {
        gameService.deleteGame(game);
    }

    @DeleteMapping("/game/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable(value = "id") Long gameId) {
        Optional<Game> game = gameService.getGameById(gameId);
        gameService.deleteGameById(gameId);
        return ResponseEntity.ok().build();
    }
}
