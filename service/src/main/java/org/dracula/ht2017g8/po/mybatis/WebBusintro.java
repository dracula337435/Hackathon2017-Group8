package org.dracula.ht2017g8.po.mybatis;

public class WebBusintro {
    private Integer id;

    private String businame;

    private String busiintro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusiname() {
        return businame;
    }

    public void setBusiname(String businame) {
        this.businame = businame == null ? null : businame.trim();
    }

    public String getBusiintro() {
        return busiintro;
    }

    public void setBusiintro(String busiintro) {
        this.busiintro = busiintro == null ? null : busiintro.trim();
    }
}