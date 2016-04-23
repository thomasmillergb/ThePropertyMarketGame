package org.thomasmillergb.thepropertymarketgame.modal;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * @author Thomas
 *         Created by Thomas on 23/04/2016.
 */
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum HouseExtras {
    CARBOX("carbox"),
    BASEMENT("basement"),
    CELLA("cella"),
    HEATING("heating");

    private String name_;

    HouseExtras(String name) {
        name_ = name;
    }

    public String getName() {
        return name_;
    }

}
