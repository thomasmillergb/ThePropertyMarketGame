package org.thomasmillergb.thepropertymarketgame.modal.game.Properties;

import java.math.BigDecimal;

/**
 * @author Thomas
 *         Created by Thomas on 29/05/2016.
 */
public interface Property {
    BigDecimal getValue();

    void setValue(BigDecimal value);

    BigDecimal getRentValue();

    void setRentValue(BigDecimal rentValue);

    boolean isOccupied();

    void setOccupied(boolean occupied);
}
