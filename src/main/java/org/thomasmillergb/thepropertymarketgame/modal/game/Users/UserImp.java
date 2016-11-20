/*
 * All code is copyright free MIT. The code is used as a educational project for Thomas Miller. The Author of this project is Thomas Miller
 */

package org.thomasmillergb.thepropertymarketgame.modal.game.Users;

import org.thomasmillergb.thepropertymarketgame.modal.game.Jobs.Job;
import org.thomasmillergb.thepropertymarketgame.modal.game.Jobs.JobImp;
import org.thomasmillergb.thepropertymarketgame.modal.game.Properties.Property;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

/**
 * @author Thomas
 *         Created by Thomas on 29/05/2016.
 */
public class UserImp implements User {

    private Job            job_;
    private List<Property> properties_;

    public UserImp() {
        job_ = new JobImp("Unemployed", BigDecimal.ZERO, 0);
        properties_ = Collections.emptyList();
    }

    public UserImp(Job job, List<Property> properties) {
        job_ = job;
        properties_ = properties;
    }

    @Override
    public Job getJob() {
        return job_;
    }

    @Override
    public void setJob(Job job) {
        job_ = job;
    }

    @Override
    public List<Property> getPropertyList() {
        return properties_;
    }

    @Override
    public void setPropertyList(List<Property> property) {
        properties_ = property;
    }
}
