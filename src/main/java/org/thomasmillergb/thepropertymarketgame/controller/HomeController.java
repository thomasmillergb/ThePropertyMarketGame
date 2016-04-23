package org.thomasmillergb.thepropertymarketgame.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Thomas on 23/04/2016.
 */
@RestController
public class HomeController {

    @RequestMapping(RestApis.home)
    public String home() {
        return "This is my!";
    }

}
