package com.oakleafknight.exnihiloadscensio.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class DustBlock extends FallingBlock{
    private final int dustColor;

    public DustBlock(int dustColorIn, Block.Properties properties) {
        super(properties);
        this.dustColor = dustColorIn;
    }

    @OnlyIn(Dist.CLIENT)
    public int getDustColor(BlockState state) {
        return this.dustColor;
    }


    }

