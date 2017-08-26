package org.bogdanrakov.stones.model.entity.decorations;

import java.math.BigDecimal;

public class Chain implements Decoration {

    private BigDecimal price;
    private Material material;
    private double weight;

    public Chain() {
    }

    public Chain(BigDecimal price, Material material, double weight) {
        this.price = price;
        this.material = material;
        this.weight = weight;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Chain{" +
                "price=" + price +
                ", material=" + material +
                ", weight=" + weight +
                '}';
    }
}
