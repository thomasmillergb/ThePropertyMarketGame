package org.thomasmillergb.thepropertymarketgame.modal.game.Jobs;

import java.math.BigDecimal;

/**
 * @author Thomas
 *         Created by Thomas on 29/05/2016.
 */
public interface Job {

    int getMoves();

    BigDecimal getSalary();

    String jobTitle();
}
