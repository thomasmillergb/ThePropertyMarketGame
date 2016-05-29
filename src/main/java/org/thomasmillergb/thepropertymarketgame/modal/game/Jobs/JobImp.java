/*
 * All code is copyright free MIT. The code is used as a educational project for Thomas Miller. The Author of this project is Thomas Miller
 */

package org.thomasmillergb.thepropertymarketgame.modal.game.Jobs;

import java.math.BigDecimal;

/**
 * @author Thomas
 *         Created by Thomas on 29/05/2016.
 */
public class JobImp implements Job {
    private int moves;
    private BigDecimal salary;
    private String title;

    public JobImp(String title, BigDecimal salary, int moves) {
        this.title = title;
        this.salary = salary;
        this.moves = moves;
    }

    @Override
    public int getMoves() {
        return moves;
    }

    @Override
    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String jobTitle() {
        return title;
    }
}
