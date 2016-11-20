/*
 * All code is copyright free MIT. The code is used as a educational project for Thomas Miller. The Author of this project is Thomas Miller
 */

package org.thomasmillergb.thepropertymarketgame.game;

import org.apache.commons.lang3.RandomUtils;
import org.thomasmillergb.thepropertymarketgame.modal.game.Properties.House.House;
import org.thomasmillergb.thepropertymarketgame.modal.game.Properties.House.HouseExtras;
import org.thomasmillergb.thepropertymarketgame.modal.game.Properties.Property;
import org.thomasmillergb.thepropertymarketgame.modal.game.Users.User;
import org.thomasmillergb.thepropertymarketgame.modal.game.Users.UserImp;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * @author Thomas Created by Thomas on 29/05/2016.
 */
public class Game
{
    private State state_;
    private HashSet<Property> propertiesForSale_;

    public Game()
    {
        state_ = State.NEW;
    }

    public void initialiseGame()
    {
        state_ = State.INITIALISE;
        User user = new UserImp();
        generateHouses();
    }

    private void generateHouses()
    {
        propertiesForSale_ = new HashSet<>();
        Random r = new Random();
        DoubleStream doubles = r.doubles();
        doubles
            .filter(d -> d > 0.15)
            .limit(2000000)
            .forEach(d -> propertiesForSale_.add(generateRamonHouse(d)));
    }

    private Property generateRamonHouse(double d)
    {


        BigDecimal areaValue = new BigDecimal(d * 1000.0);
        int rooms = RandomUtils.nextInt(0, 6);
        List<HouseExtras> houseExtrases = genHouseExtras();
        double houseMutilplyer = houseExtrases.stream()
            .reduce(1.0, (sum, houseExtras) -> sum * houseExtras.getV(), (u, u2) -> u * u2);

        BigDecimal houseValue = calcHouseValue(areaValue, rooms, houseMutilplyer);
        BigDecimal rentValue = calcRent(houseValue);
        BigDecimal rasie = areaValue.divide(new BigDecimal(10000));
        return new House(houseValue, rentValue, false, rasie, RandomUtils.nextInt(1, 5), rooms, houseExtrases);
    }

    private BigDecimal calcHouseValue(BigDecimal areaValue, int rooms, double houseMutilplyer)
    {
        double logScale = Math.log(5.0 * Double.valueOf(String.valueOf(rooms)));
        return areaValue
            .multiply(BigDecimal.valueOf(houseMutilplyer))
//                .multiply(BigDecimal.valueOf(logScale))
            .setScale(0, BigDecimal.ROUND_CEILING);

    }

    private List<HouseExtras> genHouseExtras()
    {
        List<HouseExtras> houseExtrases = new ArrayList<>();
        HouseExtras[] values = HouseExtras.values();
        Random r = new Random();
        IntStream intStream = r.ints(0, values.length);
        intStream
            .limit(RandomUtils.nextInt(0, values.length))
            .forEach(i -> houseExtrases.add(values[i]));
        return houseExtrases;


    }


    private BigDecimal calcRent(BigDecimal houseValue)
    {
        int yearsToPayOff = 25;
        return houseValue.divide(BigDecimal.valueOf(yearsToPayOff * 12), 0, BigDecimal.ROUND_CEILING);
    }


    public State getState()
    {
        return state_;
    }

    public void setState(State state)
    {
        state_ = state;
    }

    public HashSet<Property> getPropertiesForSale()
    {
        return propertiesForSale_;
    }
}
