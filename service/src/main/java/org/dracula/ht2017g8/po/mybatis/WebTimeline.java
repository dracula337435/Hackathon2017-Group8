package org.dracula.ht2017g8.po.mybatis;

public class WebTimeline {
    private Integer id;

    private String custnm;

    private String custid;

    private String datetime;

    private String channel;

    private String action;

    private String acttype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustnm() {
        return custnm;
    }

    public void setCustnm(String custnm) {
        this.custnm = custnm == null ? null : custnm.trim();
    }

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid == null ? null : custid.trim();
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime == null ? null : datetime.trim();
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action == null ? null : action.trim();
    }

    public String getActtype() {
        return acttype;
    }

    public void setActtype(String acttype) {
        this.acttype = acttype == null ? null : acttype.trim();
    }
}