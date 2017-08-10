package org.bogdanrakov.stones.model.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Necklace {

    private List<Gem> gems = new ArrayList<>();

    public void addGem(Gem gem) {
        gems.add(gem);
    }

    public List<Gem> getGems() {
        return gems;
    }

    public BigDecimal getPrice() {
        BigDecimal sum = new BigDecimal(0);

        for (Gem gem : gems) {
            sum = sum.add(gem.getPrice());
        }

        return sum;
    }

    public double getWeight() {
        double sum = 0.0;

        for (Gem gem : gems) {
            sum += gem.getCarats();
        }

        return sum;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "gems=" + gems +
                '}';
    }
}
