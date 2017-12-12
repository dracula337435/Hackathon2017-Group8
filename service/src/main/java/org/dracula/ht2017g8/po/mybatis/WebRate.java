package org.dracula.ht2017g8.po.mybatis;

public class WebRate {
    private Integer id;

    private String curr;

    private Double currin;

    private Double cashin;

    private Double currout;

    private Double cashout;

    private Double midrate;

    private String reldate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCurr() {
        return curr;
    }

    public void setCurr(String curr) {
        this.curr = curr == null ? null : curr.trim();
    }

    public Double getCurrin() {
        return currin;
    }

    public void setCurrin(Double currin) {
        this.currin = currin;
    }

    public Double getCashin() {
        return cashin;
    }

    public void setCashin(Double cashin) {
        this.cashin = cashin;
    }

    public Double getCurrout() {
        return currout;
    }

    public void setCurrout(Double currout) {
        this.currout = currout;
    }

    public Double getCashout() {
        return cashout;
    }

    public void setCashout(Double cashout) {
        this.cashout = cashout;
    }

    public Double getMidrate() {
        return midrate;
    }

    public void setMidrate(Double midrate) {
        this.midrate = midrate;
    }

    public String getReldate() {
        return reldate;
    }

    public void setReldate(String reldate) {
        this.reldate = reldate == null ? null : reldate.trim();
    }
}