/*
 * All code is copyright free MIT. The code is used as a educational project for Thomas Miller. The Author of this project is Thomas Miller
 */

package org.thomasmillergb.thepropertymarketgame.game;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Thomas
 *         Created by Thomas on 29/05/2016.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
enum State {
    NEW("New Game"),
    INITIALISE("Initialising Game"),
    IN_PROGRESS("Game in Progress"),
    PASUED("Game Paused"),
    END("Game Ended");

    String displayName_;

    State(String displayName) {
        displayName_ = displayName;
    }

    public String getDisplayName() {
        return displayName_;
    }
}
