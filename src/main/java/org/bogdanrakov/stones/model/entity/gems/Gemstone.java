package org.bogdanrakov.stones.model.entity.gems;

import java.math.BigDecimal;

public class Gemstone {

    private String name;
    private BigDecimal price;
    private int transparency;
    private double carats;

    public Gemstone() {
    }

    public Gemstone(String name, BigDecimal price, int transparency, double carats) {
        this.name = name;
        this.price = price;
        this.transparency = transparency;
        this.carats = carats;
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

    @Override
    public String toString() {
        return "Gemstone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", transparency=" + transparency +
                ", carats=" + carats +
                '}';
    }
}
