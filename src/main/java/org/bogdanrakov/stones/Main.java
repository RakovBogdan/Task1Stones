package org.bogdanrakov.stones;

import org.bogdanrakov.stones.model.entity.Necklace;
import org.bogdanrakov.stones.model.entity.gems.PreciousStone;
import org.bogdanrakov.stones.model.entity.gems.SemiPreciousStone;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Necklace necklace = new Necklace();
        necklace.addGem(new PreciousStone("Ruby", new BigDecimal(10), 2, 0.1));
        necklace.addGem(new SemiPreciousStone("Perl", new BigDecimal(20), 5, 0.3));
        necklace.addGem(new PreciousStone("Ruby", new BigDecimal(14), 8, 0.4));

        System.out.println(necklace);
        System.out.println(necklace.getPrice());
        System.out.println(necklace.getWeight());

        System.out.println(necklace.getGemsBetweenTransparency(2, 6));
    }
}
