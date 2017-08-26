package org.bogdanrakov.stones.model.entity.service;

import org.bogdanrakov.stones.model.entity.Necklace;
import org.bogdanrakov.stones.model.entity.gems.Gemstone;

public interface NecklaceBuilderService {

    Necklace build();
    NecklaceBuilderService addGem(Gemstone gem);
}
