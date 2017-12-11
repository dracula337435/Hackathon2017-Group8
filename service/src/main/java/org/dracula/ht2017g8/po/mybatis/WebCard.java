package org.dracula.ht2017g8.po.mybatis;

public class WebCard {
    private Integer id;

    private String cardCode;

    private String proName;

    private String picLink;

    private String proIntroduct;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode == null ? null : cardCode.trim();
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public String getPicLink() {
        return picLink;
    }

    public void setPicLink(String picLink) {
        this.picLink = picLink == null ? null : picLink.trim();
    }

    public String getProIntroduct() {
        return proIntroduct;
    }

    public void setProIntroduct(String proIntroduct) {
        this.proIntroduct = proIntroduct == null ? null : proIntroduct.trim();
    }
}