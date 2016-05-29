/*
 * All code is copyright free MIT. The code is used as a educational project for Thomas Miller. The Author of this project is Thomas Miller
 */

package org.thomasmillergb.thepropertymarketgame.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thomasmillergb.thepropertymarketgame.game.Game;

/**
 * @author Thomas
 *         Created by Thomas on 23/04/2016.
 */
@RestController
public class GameController {

    @RequestMapping(value = RestApi.start, method = RequestMethod.GET)
    public Game newGame() {
        Game game = new Game();
        game.initialiseGame();
        return game;
    }

}
