package org.dracula.ht2017g8.po;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="web_timeline")
public class WebTimeLine {

    @Id
    private long id;

    private String custid;

    private String custnm;

    private String custdate;

    private String carddata;

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

    @Override
    public String toString() {
        return "WebTimeLine{" +
                "id=" + id +
                ", custid='" + custid + '\'' +
                ", custnm='" + custnm + '\'' +
                ", custdate='" + custdate + '\'' +
                ", carddata='" + carddata + '\'' +
                ", carddate='" + carddate + '\'' +
                ", ccarddate='" + ccarddate + '\'' +
                ", trandate='" + trandate + '\'' +
                ", tottran='" + tottran + '\'' +
                ", totin='" + totin + '\'' +
                ", totout='" + totout + '\'' +
                ", totfee1='" + totfee1 + '\'' +
                ", totfee2='" + totfee2 + '\'' +
                ", totfee3='" + totfee3 + '\'' +
                ", totfee4='" + totfee4 + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getCustnm() {
        return custnm;
    }

    public void setCustnm(String custnm) {
        this.custnm = custnm;
    }

    public String getCustdate() {
        return custdate;
    }

    public void setCustdate(String custdate) {
        this.custdate = custdate;
    }

    public String getCarddata() {
        return carddata;
    }

    public void setCarddata(String carddata) {
        this.carddata = carddata;
    }

    public String getCarddate() {
        return carddate;
    }

    public void setCarddate(String carddate) {
        this.carddate = carddate;
    }

    public String getCcarddate() {
        return ccarddate;
    }

    public void setCcarddate(String ccarddate) {
        this.ccarddate = ccarddate;
    }

    public String getTrandate() {
        return trandate;
    }

    public void setTrandate(String trandate) {
        this.trandate = trandate;
    }

    public String getTottran() {
        return tottran;
    }

    public void setTottran(String tottran) {
        this.tottran = tottran;
    }

    public String getTotin() {
        return totin;
    }

    public void setTotin(String totin) {
        this.totin = totin;
    }

    public String getTotout() {
        return totout;
    }

    public void setTotout(String totout) {
        this.totout = totout;
    }

    public String getTotfee1() {
        return totfee1;
    }

    public void setTotfee1(String totfee1) {
        this.totfee1 = totfee1;
    }

    public String getTotfee2() {
        return totfee2;
    }

    public void setTotfee2(String totfee2) {
        this.totfee2 = totfee2;
    }

    public String getTotfee3() {
        return totfee3;
    }

    public void setTotfee3(String totfee3) {
        this.totfee3 = totfee3;
    }

    public String getTotfee4() {
        return totfee4;
    }

    public void setTotfee4(String totfee4) {
        this.totfee4 = totfee4;
    }
}
