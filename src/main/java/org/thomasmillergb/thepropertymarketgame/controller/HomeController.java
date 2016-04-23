package org.thomasmillergb.thepropertymarketgame.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thomasmillergb.thepropertymarketgame.modal.House;
import org.thomasmillergb.thepropertymarketgame.modal.HouseExtras;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @author Thomas
 * Created by Thomas on 23/04/2016.
 */
@RestController
public class HomeController {

    @RequestMapping(value = RestApi.home, method = RequestMethod.GET)
    public House home() {
        ArrayList<HouseExtras> houseExtrases = new ArrayList<>();
        houseExtrases.add(HouseExtras.BASEMENT);

        return new House(new BigDecimal(100000), BigDecimal.ONE, BigDecimal.ONE, 3, 3, houseExtrases);
    }

}
