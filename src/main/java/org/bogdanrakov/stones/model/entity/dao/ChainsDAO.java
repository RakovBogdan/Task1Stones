package org.bogdanrakov.stones.model.entity.dao;

import org.bogdanrakov.stones.model.entity.decorations.Chain;
import org.bogdanrakov.stones.model.entity.decorations.Decoration;
import org.bogdanrakov.stones.model.entity.decorations.Material;

import java.math.BigDecimal;

public enum ChainsDAO {

    GOLDEN_CHAIN(Material.GOLD, new BigDecimal(40), 0.1),
    SILVER_CHAIN(Material.SILVER, new BigDecimal(20), 0.15);

    ChainsDAO(Material material, BigDecimal price, double weight) {
        this.material = material;
        this.price = price;
        this.weight = weight;
    }

    private Material material;
    private BigDecimal price;
    private double weight;

    public static Chain getChain(ChainsDAO chain) {
        return new Chain(chain.price, chain.material, chain.weight);
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
