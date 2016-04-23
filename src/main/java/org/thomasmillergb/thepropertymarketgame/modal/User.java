package org.thomasmillergb.thepropertymarketgame.modal;

import java.math.BigDecimal;

/**
 * @author Thomas
 *         Created by Thomas on 23/04/2016.
 */
public class User {
    private BigDecimal money_;
    private BigDecimal salary_;
    private BigDecimal bills_;

    public User(BigDecimal money, BigDecimal sallary, BigDecimal bills) {
        money_ = money;
        salary_ = sallary;
        bills_ = bills;
    }

    public BigDecimal getMoney() {
        return money_;
    }

    public void setMoney(BigDecimal money) {
        money_ = money;
    }

    public BigDecimal getSalary() {
        return salary_;
    }

    public void setSalary(BigDecimal salary) {
        salary_ = salary;
    }

    public BigDecimal getBills() {
        return bills_;
    }

    public void setBills(BigDecimal bills) {
        bills_ = bills;
    }
}
