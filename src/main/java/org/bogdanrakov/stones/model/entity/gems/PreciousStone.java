package org.bogdanrakov.stones.model.entity.gems;

import java.math.BigDecimal;

public class PreciousStone extends Gemstone {

    public PreciousStone(String name, BigDecimal price, int transparency, double carats) {
        super(name, price, transparency, carats);
    }
}
