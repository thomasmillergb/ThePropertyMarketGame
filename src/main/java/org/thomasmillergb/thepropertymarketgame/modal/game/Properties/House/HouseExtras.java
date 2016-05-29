/*
 * All code is copyright free MIT. The code is used as a educational project for Thomas Miller. The Author of this project is Thomas Miller
 */

package org.thomasmillergb.thepropertymarketgame.modal.game.Properties.House;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Thomas
 *         Created by Thomas on 23/04/2016.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum HouseExtras {
    CAR_PARKING("Car Parking", 1.2),
    BASEMENT("basement", 1.3),
    Gardarn("heating", 1.4);

    private String displayName_;
    private double v_;

    HouseExtras(String name, Double v) {
        displayName_ = name;
        v_ = v;
    }

    public String getDisplayName() {
        return displayName_;
    }

    public Double getV() {
        return v_;
    }
}
