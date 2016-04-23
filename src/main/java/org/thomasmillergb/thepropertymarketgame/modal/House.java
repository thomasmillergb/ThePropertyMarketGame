package org.thomasmillergb.thepropertymarketgame.modal;

import com.google.common.collect.ImmutableList;

import java.awt.*;
import java.math.BigDecimal;
import java.util.List;

/**
 * The type House.
 *
 * @author Thomas  Created by Thomas on 23/04/2016.
 */
public class House {
    private BigDecimal value_;
    private BigDecimal minimumAcceptance_;
    private BigDecimal raise_;
    private int offersBeforeRejections_;
    private int rooms_;
    private List<HouseExtras> houseExtras_;
    private Color dateTime_;

    /**
     * Instantiates a new House.
     *
     * @param value                  the value
     * @param minimumAcceptance      the minimum acceptance
     * @param raise                  the raise
     * @param offersBeforeRejections the offers before rejections
     * @param rooms                  the rooms
     * @param houseExtras            the house extras
     */
    public House(BigDecimal value, BigDecimal minimumAcceptance, BigDecimal raise, int offersBeforeRejections, int rooms, List<HouseExtras> houseExtras) {
        value_ = value;
        minimumAcceptance_ = minimumAcceptance;
        raise_ = raise;
        offersBeforeRejections_ = offersBeforeRejections;
        rooms_ = rooms;
        houseExtras_ = houseExtras;
        dateTime_ = Color.BLACK;

    }

    /**
     * Gets value.
     *
     * @return the value
     */
    public BigDecimal getValue() {
        return value_;
    }

    /**
     * Sets value.
     *
     * @param value the value
     */
    public void setValue(BigDecimal value) {
        value_ = value;
    }

    /**
     * Gets minimum acceptance.
     *
     * @return the minimum acceptance
     */
    public BigDecimal getMinimumAcceptance() {
        return minimumAcceptance_;
    }

    /**
     * Sets minimum acceptance.
     *
     * @param minimumAcceptance the minimum acceptance
     */
    public void setMinimumAcceptance(BigDecimal minimumAcceptance) {
        minimumAcceptance_ = minimumAcceptance;
    }

    /**
     * Gets raise.
     *
     * @return the raise
     */
    public BigDecimal getRaise() {
        return raise_;
    }

    /**
     * Sets raise.
     *
     * @param raise the raise
     */
    public void setRaise(BigDecimal raise) {
        raise_ = raise;
    }

    /**
     * Gets offers before rejections.
     *
     * @return the offers before rejections
     */
    public int getOffersBeforeRejections() {
        return offersBeforeRejections_;
    }

    /**
     * Sets offers before rejections.
     *
     * @param offersBeforeRejections the offers before rejections
     */
    public void setOffersBeforeRejections(int offersBeforeRejections) {
        offersBeforeRejections_ = offersBeforeRejections;
    }

    /**
     * Gets rooms.
     *
     * @return the rooms
     */
    public int getRooms() {
        return rooms_;
    }

    /**
     * Sets rooms.
     *
     * @param rooms the rooms
     */
    public void setRooms(int rooms) {
        rooms_ = rooms;
    }

    /**
     * Gets house extras.
     *
     * @return the house extras
     */
    public List<HouseExtras> getHouseExtras() {
        return houseExtras_;
    }

    /**
     * Sets house extras.
     *
     * @param houseExtras the house extras
     */
    public void setHouseExtras(ImmutableList<HouseExtras> houseExtras) {
        houseExtras_ = houseExtras;
    }

    public Color getDateTime() {
        return dateTime_;
    }
}
