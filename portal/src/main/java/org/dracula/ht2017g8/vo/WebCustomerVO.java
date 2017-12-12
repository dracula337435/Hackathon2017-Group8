package org.dracula.ht2017g8.vo;

public class WebCustomerVO {

    private WebCustomer_BaseVO base;

    private WebCustomer_LevelVO level;

    private WebCustomer_LoyaltyVO loyalty;

    private WebCustomer_PotentialVO potential;

    private WebCustomer_SticknessVO stickness;

    public WebCustomer_BaseVO getBase() {
        return base;
    }

    public void setBase(WebCustomer_BaseVO base) {
        this.base = base;
    }

    public WebCustomer_LevelVO getLevel() {
        return level;
    }

    public void setLevel(WebCustomer_LevelVO level) {
        this.level = level;
    }

    public WebCustomer_LoyaltyVO getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(WebCustomer_LoyaltyVO loyalty) {
        this.loyalty = loyalty;
    }

    public WebCustomer_PotentialVO getPotential() {
        return potential;
    }

    public void setPotential(WebCustomer_PotentialVO potential) {
        this.potential = potential;
    }

    public WebCustomer_SticknessVO getStickness() {
        return stickness;
    }

    public void setStickness(WebCustomer_SticknessVO stickness) {
        this.stickness = stickness;
    }
}
