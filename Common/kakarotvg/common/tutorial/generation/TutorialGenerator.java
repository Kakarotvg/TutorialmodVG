package kakarotvg.common.tutorial.generation;

import java.util.Random;

import kakarotvg.common.tutorial.handlers.blocks.BlockHandler;
import net.minecraft.block.Block;
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
    private void generateSurface(World world, Random random, int x, int z) {
        this.addOreSpawn(BlockHandler.tutorialblock, 0, 1, world, random, x, z, 16, 16, 3 + random.nextInt(4), 5, 2, 16);
    }

    // generates the block in the nether
    private void generateNether(World world, Random random, int x, int z) {
        this.addOreSpawn2(BlockHandler.tutorialblock, 1, world, random, x, z, 16, 16, 6 + random.nextInt(8), 50, 2, 128);

    }

    /**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     * 
     * @param block: The Block to spawn
     * @param metadata: An Int The blocks metadata
     * @param target: An Int The target block id (stone being 1)
     * @param world: The World to spawn in
     * @param random: A Random object for retrieving random positions within the world to spawn the Block
     * @param blockXPos: An int for passing the X-Coordinate for the Generation method
     * @param block2Pos: An int for passing the Z-Coordinate for the Generation method
     * @param maxX: An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param maxZ: An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param maxVeinSize: An int for setting the maximum size of a vein
     * @param chancesToSpawn: An int for the Number of chances available for the Block to spawn per-chunk
     * @param minY: An int for the minimum Y-Coordinate height at which this block may spawn
     * @param maxY: An int for the maximum Y-Coordinate height at which this block may spawn
     **/
    public void addOreSpawn(Block block, int metadata, int target, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block.blockID, metadata, maxVeinSize, target)).generate(world, random, posX, posY, posZ);
        }

    }

    /**
     * Adds an Ore Spawn to Minecraft. Simply register all Ores to spawn with this method in your Generation method in your IWorldGeneration extending Class
     * 
     * @param block: The Block to spawn
     * @param metadata: The blocks metadata
     * @param world: The World to spawn in
     * @param random: A Random object for retrieving random positions within the world to spawn the Block
     * @param blockXPos: An int for passing the X-Coordinate for the Generation method
     * @param block2Pos: An int for passing the Z-Coordinate for the Generation method
     * @param maxX: An int for setting the maximum X-Coordinate values for spawning on the X-Axis on a Per-Chunk basis
     * @param maxZ: An int for setting the maximum Z-Coordinate values for spawning on the Z-Axis on a Per-Chunk basis
     * @param maxVeinSize: An int for setting the maximum size of a vein
     * @param chancesToSpawn: An int for the Number of chances available for the Block to spawn per-chunk
     * @param minY: An int for the minimum Y-Coordinate height at which this block may spawn
     * @param maxY: An int for the maximum Y-Coordinate height at which this block may spawn
     * 
     **/
    public void addOreSpawn2(Block block, int metadata, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
        int maxPossY = minY + (maxY - 1);
        assert maxY > minY : "The maximum Y must be greater than the Minimum Y";
        assert maxX > 0 && maxX <= 16 : "addOreSpawn: The Maximum X must be greater than 0 and less than 16";
        assert minY > 0 : "addOreSpawn: The Minimum Y must be greater than 0";
        assert maxY < 256 && maxY > 0 : "addOreSpawn: The Maximum Y must be less than 256 but greater than 0";
        assert maxZ > 0 && maxZ <= 16 : "addOreSpawn: The Maximum Z must be greater than 0 and less than 16";

        int diffBtwnMinMaxY = maxY - minY;
        for (int x = 0; x < chancesToSpawn; x++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(diffBtwnMinMaxY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinableNether(block.blockID, metadata, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }

}
