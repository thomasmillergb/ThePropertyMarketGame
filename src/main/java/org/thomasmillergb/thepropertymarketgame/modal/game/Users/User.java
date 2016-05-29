package org.thomasmillergb.thepropertymarketgame.modal.game.Users;

import org.thomasmillergb.thepropertymarketgame.modal.game.Jobs.Job;
import org.thomasmillergb.thepropertymarketgame.modal.game.Properties.Property;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author Thomas
 *         Created by Thomas on 29/05/2016.
 */

public interface User {

    default int getMoves() {
        int moves = 10;
        return moves - getJob().getMoves();
    }

    Job getJob();

    void setJob(Job job);

    List<Property> getPropertyList();

    void setPropertyList(List<Property> property);

    default BigDecimal totalValue() {
        return getPropertyList()
                .stream()
                .reduce(BigDecimal.ZERO, (sum, property) -> sum.add(property.getValue()), (bigDecimal, augend) -> bigDecimal.add(augend));
    }

    default BigDecimal totalIncome() {
        return getPropertyList()
                .stream()
                .reduce(BigDecimal.ZERO, (sum, property) -> property.isOccupied() ? sum.add(property.getValue()) : sum, BigDecimal::add);
    }
}
