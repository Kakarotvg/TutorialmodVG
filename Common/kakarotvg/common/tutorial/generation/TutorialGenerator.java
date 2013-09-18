package kakarotvg.common.tutorial.generation;

import java.util.Random;

import kakarotvg.common.tutorial.handlers.BlockHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import cpw.mods.fml.common.IWorldGenerator;

public class TutorialGenerator implements IWorldGenerator {

    // switches between end, surface, and nether
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case 1:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);
            case -1:
                generateNether(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    // generates blocks in the end
    private void generateEnd(World world, Random random, int chunkX, int chunkZ) {

    }

    // generates a block in the surface
    private void generateSurface(World world, Random random, int chunkX, int chunkZ) {
        for (int i = 0; i < 20; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(16);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinable(BlockHandler.tutorialblock.blockID, 12)).generate(world, random, coordX, coordY, coordZ);
        }
    }

    // generates the block in the nether
    private void generateNether(World world, Random random, int chunkX, int chunkZ) {
        for (int i = 0; i < 50; i++) {
            int coordX = random.nextInt(16) + chunkX;
            int coordY = random.nextInt(89);
            int coordZ = random.nextInt(16) + chunkZ;

            (new WorldGenMinableNether(new ItemStack(BlockHandler.tutorialblock, 1, 1), 1, 12)).generate(world, random, coordX, coordY, coordZ);
        }
    }

}
