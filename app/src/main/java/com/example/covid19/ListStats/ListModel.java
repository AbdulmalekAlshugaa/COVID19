package com.example.covid19.ListStats;

import java.io.Serializable;

public class ListModel implements Serializable {
    private String CName, Confiremed,Recovery,Death;
    private String NewCases, NewDeathCases, NewCritical, NewActive;
    private String Total;

    public ListModel(String CName, String confiremed, String recovery, String death, String newCases, String newDeathCases, String newCritical, String newActive, String total) {
        this.CName = CName;
        Confiremed = confiremed;
        Recovery = recovery;
        Death = death;
        NewCases = newCases;
        NewDeathCases = newDeathCases;
        NewCritical = newCritical;
        NewActive = newActive;
        Total = total;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

    public ListModel() {
    }

    public String getNewCases() {
        return NewCases;
    }

    public void setNewCases(String newCases) {
        NewCases = newCases;
    }

    public String getNewDeathCases() {
        return NewDeathCases;
    }

    public void setNewDeathCases(String newDeathCases) {
        NewDeathCases = newDeathCases;
    }

    public String getNewCritical() {
        return NewCritical;
    }

    public void setNewCritical(String newCritical) {
        NewCritical = newCritical;
    }

    public String getNewActive() {
        return NewActive;
    }

    public void setNewActive(String newActive) {
        NewActive = newActive;
    }

    public String getCName() {
        return CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    public String getConfiremed() {
        return Confiremed;
    }

    public void setConfiremed(String confiremed) {
        Confiremed = confiremed;
    }

    public String getRecovery() {
        return Recovery;
    }

    public void setRecovery(String recovery) {
        Recovery = recovery;
    }

    public String getDeath() {
        return Death;
    }

    public void setDeath(String death) {
        Death = death;
    }
}
