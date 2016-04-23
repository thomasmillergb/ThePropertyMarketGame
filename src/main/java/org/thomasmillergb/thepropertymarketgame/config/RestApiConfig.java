package org.thomasmillergb.thepropertymarketgame.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thomasmillergb.thepropertymarketgame.controller.RestApi;

/**
 * Created by Thomas on 23/04/2016.
 */
@Configuration
@ComponentScan(basePackages = "org.thomasmillergb.thepropertymarketgame.controller")
@RequestMapping(RestApi.endpointPrefix)
public class RestApiConfig {
}
