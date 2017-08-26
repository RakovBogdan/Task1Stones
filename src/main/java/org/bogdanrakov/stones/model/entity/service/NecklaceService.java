package org.bogdanrakov.stones.model.entity.service;

import org.bogdanrakov.stones.model.entity.Necklace;
import org.bogdanrakov.stones.model.entity.gems.Gemstone;

import java.math.BigDecimal;
import java.util.List;

public interface NecklaceService {

    List<Gemstone> getGemsBetweenTransparency(
            Necklace necklace, int lowerBound, int upperBound);

    double getWeight(Necklace necklace);

    BigDecimal getPrice(Necklace necklace);
}
