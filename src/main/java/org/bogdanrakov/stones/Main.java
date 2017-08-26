package org.bogdanrakov.stones;

import org.bogdanrakov.stones.model.entity.Necklace;
import org.bogdanrakov.stones.model.entity.dao.*;
import org.bogdanrakov.stones.model.entity.service.NecklaceBuilderService;
import org.bogdanrakov.stones.model.entity.service.NecklaceBuilderServiceImpl;
import org.bogdanrakov.stones.model.entity.service.NecklaceService;
import org.bogdanrakov.stones.model.entity.service.NecklaceServiceImpl;

import static org.bogdanrakov.stones.model.entity.dao.GemsDAO.*;
import static org.bogdanrakov.stones.model.entity.dao.ChainsDAO.*;

public class Main {

    public static void main(String[] args) {
        NecklaceBuilderService necklaceBuilderService = new NecklaceBuilderServiceImpl(
                ChainsDAO.getChain(GOLDEN_CHAIN)
        );

        Necklace necklace = necklaceBuilderService.addGem(GemsDAO.getGem(RUBY_01))
                .addGem(GemsDAO.getGem(RUBY_02))
                .addGem(GemsDAO.getGem(TOPAZ_02))
                .build();

        NecklaceService necklaceService = new NecklaceServiceImpl();

        System.out.println(necklace);
        System.out.println(necklaceService.getGemsBetweenTransparency(
                necklace,4,8));

        System.out.println(necklaceService.getPrice(necklace));
        System.out.println(necklaceService.getWeight(necklace));
    }
}
