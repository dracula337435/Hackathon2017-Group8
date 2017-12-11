package org.dracula.ht2017g8.po.mybatis;

public class WebTimeline {
    private Integer id;

    private String custid;

    private String custnm;

    private String custdate;

    private String carddate;

    private String ccarddate;

    private String trandate;

    private String tottran;

    private String totin;

    private String totout;

    private String totfee1;

    private String totfee2;

    private String totfee3;

    private String totfee4;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid == null ? null : custid.trim();
    }

    public String getCustnm() {
        return custnm;
    }

    public void setCustnm(String custnm) {
        this.custnm = custnm == null ? null : custnm.trim();
    }

    public String getCustdate() {
        return custdate;
    }

    public void setCustdate(String custdate) {
        this.custdate = custdate == null ? null : custdate.trim();
    }

    public String getCarddate() {
        return carddate;
    }

    public void setCarddate(String carddate) {
        this.carddate = carddate == null ? null : carddate.trim();
    }

    public String getCcarddate() {
        return ccarddate;
    }

    public void setCcarddate(String ccarddate) {
        this.ccarddate = ccarddate == null ? null : ccarddate.trim();
    }

    public String getTrandate() {
        return trandate;
    }

    public void setTrandate(String trandate) {
        this.trandate = trandate == null ? null : trandate.trim();
    }

    public String getTottran() {
        return tottran;
    }

    public void setTottran(String tottran) {
        this.tottran = tottran == null ? null : tottran.trim();
    }

    public String getTotin() {
        return totin;
    }

    public void setTotin(String totin) {
        this.totin = totin == null ? null : totin.trim();
    }

    public String getTotout() {
        return totout;
    }

    public void setTotout(String totout) {
        this.totout = totout == null ? null : totout.trim();
    }

    public String getTotfee1() {
        return totfee1;
    }

    public void setTotfee1(String totfee1) {
        this.totfee1 = totfee1 == null ? null : totfee1.trim();
    }

    public String getTotfee2() {
        return totfee2;
    }

    public void setTotfee2(String totfee2) {
        this.totfee2 = totfee2 == null ? null : totfee2.trim();
    }

    public String getTotfee3() {
        return totfee3;
    }

    public void setTotfee3(String totfee3) {
        this.totfee3 = totfee3 == null ? null : totfee3.trim();
    }

    public String getTotfee4() {
        return totfee4;
    }

    public void setTotfee4(String totfee4) {
        this.totfee4 = totfee4 == null ? null : totfee4.trim();
    }
}