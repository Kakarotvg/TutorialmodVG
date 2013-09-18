package kakarotvg.common.tutorial.egg;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.item.ItemEgg;

public class CustomEgg extends ItemEgg {

    public CustomEgg(int par1) {
        super(par1);
    }

    public static int getUniqueID() {
        int EntityID = 300;
        do {
            EntityID++;
        } while (EntityList.getStringFromID(EntityID) != null);
        return EntityID;
    }

    public static void registerCustomEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) {
        int id = getUniqueID();
        EntityList.IDtoClassMapping.put(id, entity);
        EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
    }
}
