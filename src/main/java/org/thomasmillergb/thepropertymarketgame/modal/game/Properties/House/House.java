/*
 * All code is copyright free MIT. The code is used as a educational project for Thomas Miller. The Author of this project is Thomas Miller
 */

package org.thomasmillergb.thepropertymarketgame.modal.game.Properties.House;

import com.google.common.collect.ImmutableList;
import org.thomasmillergb.thepropertymarketgame.modal.game.Properties.Property;

import java.math.BigDecimal;
import java.util.List;

public class House implements Property {
    private BigDecimal value_;
    private BigDecimal rentValue_;
    private boolean occupied_;
    private BigDecimal minimumAcceptance_;
    private BigDecimal raise_;
    private int offersBeforeRejections_;
    private int rooms_;
    private List<HouseExtras> houseExtras_;

    public House(BigDecimal value, BigDecimal rentValue, boolean occupied, BigDecimal raise, int offersBeforeRejections, int rooms, List<HouseExtras> houseExtras) {
        value_ = value;
        rentValue_ = rentValue;
        occupied = occupied;
        raise_ = raise;
        offersBeforeRejections_ = offersBeforeRejections;
        rooms_ = rooms;
        houseExtras_ = houseExtras;

    }

    public BigDecimal getValue() {
        return value_;
    }

    public void setValue(BigDecimal value) {
        value_ = value;
    }

    @Override
    public BigDecimal getRentValue() {
        return rentValue_;
    }

    @Override
    public void setRentValue(BigDecimal rentValue) {
        rentValue_ = rentValue;
    }

    @Override
    public boolean isOccupied() {
        return occupied_;
    }

    @Override
    public void setOccupied(boolean occupied) {
        occupied_ = occupied;
    }

    public BigDecimal getMinimumAcceptance() {
        return minimumAcceptance_;
    }

    public void setMinimumAcceptance(BigDecimal minimumAcceptance) {
        minimumAcceptance_ = minimumAcceptance;
    }

    public BigDecimal getRaise() {
        return raise_;
    }

    public void setRaise(BigDecimal raise) {
        raise_ = raise;
    }

    public int getOffersBeforeRejections() {
        return offersBeforeRejections_;
    }

    public void setOffersBeforeRejections(int offersBeforeRejections) {
        offersBeforeRejections_ = offersBeforeRejections;
    }

    public int getRooms() {
        return rooms_;
    }

    public void setRooms(int rooms) {
        rooms_ = rooms;
    }

    public List<HouseExtras> getHouseExtras() {
        return houseExtras_;
    }

    public void setHouseExtras(ImmutableList<HouseExtras> houseExtras) {
        houseExtras_ = houseExtras;
    }

}
