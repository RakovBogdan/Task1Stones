package org.bogdanrakov.stones.model.entity.service;

import org.bogdanrakov.stones.model.entity.Necklace;
import org.bogdanrakov.stones.model.entity.decorations.Decoration;
import org.bogdanrakov.stones.model.entity.gems.Gemstone;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NecklaceServiceImpl implements NecklaceService {

    @Override
    public List<Gemstone> getGemsBetweenTransparency(Necklace necklace,
                                                            int lowerBound, int upperBound) {
        List<Gemstone> gemsBetweenTransparency = new ArrayList<>();

        int gemTransparency;
        for (Gemstone gem : necklace.getGems()) {
            gemTransparency = gem.getTransparency();
            if ( gemTransparency >= lowerBound && gemTransparency <= upperBound) {
                gemsBetweenTransparency.add(gem);
            }
        }

        return gemsBetweenTransparency;
    }

    @Override
    public double getWeight(Necklace necklace) {
        double sum = 0.0;

        for (Gemstone gem : necklace.getGems()) {
            sum += gem.getCarats();
        }

        for (Decoration decoration: necklace.getDecorations()) {
            sum += decoration.getWeight();
        }

        return sum;
    }

    @Override
    public BigDecimal getPrice(Necklace necklace) {
        BigDecimal sum = new BigDecimal(0);

        for (Gemstone gem : necklace.getGems()) {
            sum = sum.add(gem.getPrice());
        }

        for (Decoration decoration : necklace.getDecorations()) {
            sum = sum.add(decoration.getPrice());
        }

        return sum;
    }
}
