package magicbees.item;

import elec332.core.api.client.IColoredItem;
import elec332.core.compat.forestry.bee.IDefaultHiveFrame;
import elec332.core.item.AbstractTexturedItem;
import magicbees.MagicBees;
import magicbees.bees.EnumBeeModifiers;
import forestry.api.apiculture.IBeeModifier;
import magicbees.util.MagicBeesResourceLocation;

import javax.annotation.Nonnull;

/**
 * Created by Elec332 on 22-8-2016.
 */
public class ItemMagicBeesFrame extends AbstractTexturedItem implements IDefaultHiveFrame, IColoredItem {

    public ItemMagicBeesFrame(EnumBeeModifiers modifier) {
        super(new MagicBeesResourceLocation("frames."+modifier.name().toLowerCase()));
        setMaxDamage(modifier.getMaxDamage());
        setCreativeTab(MagicBees.creativeTab);
        this.modifier = modifier;
    }

    private final EnumBeeModifiers modifier;

    @Override
    @Nonnull
    public IBeeModifier getBeeModifier() {
        return modifier;
    }

}
