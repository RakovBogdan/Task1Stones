package org.bogdanrakov.stones.model.entity.service;

import org.bogdanrakov.stones.model.entity.Necklace;
import org.bogdanrakov.stones.model.entity.decorations.Chain;
import org.bogdanrakov.stones.model.entity.decorations.Decoration;
import org.bogdanrakov.stones.model.entity.gems.Gemstone;

public class NecklaceBuilderServiceImpl implements NecklaceBuilderService {

    private Necklace necklace = new Necklace();

    public NecklaceBuilderServiceImpl(Chain chain) {
        necklace.addDecoration(chain);
    }

    public NecklaceBuilderService addGem(Gemstone gem) {
        necklace.addGem(gem);
        return this;
    }

    public NecklaceBuilderServiceImpl addDecoration(Decoration decoration) {
        necklace.addDecoration(decoration);
        return this;
    }

    @Override
    public Necklace build() {
        return necklace;
    }
}
