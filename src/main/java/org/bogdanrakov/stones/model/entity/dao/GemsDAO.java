package org.bogdanrakov.stones.model.entity.dao;

import org.bogdanrakov.stones.model.entity.gems.Gemstone;

import java.math.BigDecimal;

public enum GemsDAO {

    RUBY_01("Small Ruby", new BigDecimal(10), 5, 1),
    RUBY_02("Big Ruby", new BigDecimal(50), 10, 3),
    TOPAZ_01("Small Topaz", new BigDecimal(10), 5, 1),
    TOPAZ_02("Big Topaz", new BigDecimal(30), 15, 3),;

    GemsDAO(String name, BigDecimal price, int transparency, double carats) {
        this.name = name;
        this.price = price;
        this.transparency = transparency;
        this.carats = carats;
    }

    private String name;
    private BigDecimal price;
    private int transparency;
    private double carats;

    public static Gemstone getGem(GemsDAO gemsDAO) {
        return new Gemstone(
                gemsDAO.name, gemsDAO.price, gemsDAO.transparency, gemsDAO.carats);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public double getCarats() {
        return carats;
    }

    public void setCarats(double carats) {
        this.carats = carats;
    }
}
