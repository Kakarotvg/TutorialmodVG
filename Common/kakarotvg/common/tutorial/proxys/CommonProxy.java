package kakarotvg.common.tutorial.proxys;

import kakarotvg.common.tutorial.egg.CustomEgg;
import kakarotvg.common.tutorial.entity.mobs.EntityTutorialAnimal;
import kakarotvg.common.tutorial.entity.mobs.EntityTutorialMob;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class CommonProxy {

    // registers renders
    public void registerRenders() {

    }

    // registers render info
    public void registerRenderInformation() {

    }

    // registers things
    public void registerRenderThings() {

    }

    // initializes stuff
    public void init() {
        // spawns mobs and creates spawn eggs
        EntityRegistry.registerGlobalEntityID(EntityTutorialAnimal.class, "Tutorial Animal", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntityTutorialAnimal.class, 5, 3, 8, EnumCreatureType.ambient, BiomeGenBase.beach, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.extremeHills, BiomeGenBase.desert, BiomeGenBase.icePlains);
        LanguageRegistry.instance().addStringLocalization("entity.Tutorial Animal.name", "Tutorial Animal");
        CustomEgg.registerCustomEntityEgg(EntityTutorialAnimal.class, 0x6DD1F2, 0xD82AE8);

        EntityRegistry.registerGlobalEntityID(EntityTutorialMob.class, "Tutorial Mob", EntityRegistry.findGlobalUniqueEntityId());
        EntityRegistry.addSpawn(EntityTutorialMob.class, 5, 3, 8, EnumCreatureType.ambient, BiomeGenBase.beach, BiomeGenBase.plains, BiomeGenBase.taiga, BiomeGenBase.extremeHills, BiomeGenBase.desert, BiomeGenBase.icePlains);
        LanguageRegistry.instance().addStringLocalization("entity.Tutorial Mob.name", "Tutorial Mob");
        CustomEgg.registerCustomEntityEgg(EntityTutorialMob.class, 0xAAF24B, 0xF2914B);

        registerRenderInformation();
        registerRenderThings();
    }

    // adds the armor as an armor
    public int addArmor(String armor) {
        return 0;
    }

}
