package org.bogdanrakov.stones.model.entity;

import org.bogdanrakov.stones.model.entity.decorations.Decoration;
import org.bogdanrakov.stones.model.entity.gems.Gemstone;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Necklace {

    private List<Gemstone> gems = new ArrayList<>();
    private List<Decoration> decorations = new ArrayList<>();

    public void addGem(Gemstone gem) {
        gems.add(gem);
        gems.sort((gem1, gem2) -> gem2.getPrice().compareTo(gem1.getPrice()));
    }

    public void addDecoration(Decoration decoration) {
        decorations.add(decoration);
    }

    public List<Gemstone> getGems() {
        return gems;
    }

    public List<Decoration> getDecorations() {
        return decorations;
    }

    @Override
    public String toString() {
        return "Necklace{" +
                "gems=" + gems +
                ", decorations=" + decorations +
                '}';
    }
}
