package org.bogdanrakov.stones.model.entity;

import org.bogdanrakov.stones.model.entity.gems.Gemstone;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Necklace {

    private List<Gemstone> gems = new ArrayList<>();

    public void addGem(Gemstone gem) {
        gems.add(gem);
        gems.sort((gem1, gem2) -> gem2.getPrice().compareTo(gem1.getPrice()));
    }

    public List<Gemstone> getGems() {
        return gems;
    }

    public BigDecimal getPrice() {
        BigDecimal sum = new BigDecimal(0);

        for (Gemstone gem : gems) {
            sum = sum.add(gem.getPrice());
        }

        return sum;
    }

    public double getWeight() {
        double sum = 0.0;

        for (Gemstone gem : gems) {
            sum += gem.getCarats();
        }

        return sum;
    }

    public List<Gemstone> getGemsBetweenTransparency (int lowerBound, int upperBound) {
        List<Gemstone> gemsBetweenTransparency = new ArrayList<>();

        int gemTransparency;
        for (Gemstone gem : gems) {
            gemTransparency = gem.getTransparency();
            if ( gemTransparency >= lowerBound && gemTransparency <= upperBound) {
                gemsBetweenTransparency.add(gem);
            }
        }

        return gemsBetweenTransparency;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "gems=" + gems +
                ", Necklace price=" + getPrice() +
                ", Necklace weight=" + getWeight() +
                '}';
    }
}
