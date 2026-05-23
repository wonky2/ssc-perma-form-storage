package wonky.sscpermaformstorage.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import wonky.sscpermaformstorage.item.ModItems;

import java.util.Objects;

public class EmptyGildedEchoShardItem extends Item {
    public EmptyGildedEchoShardItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        return super.use(world, user, hand);
    }

    //public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
    //    ItemStack itemStack = super.finishUsing(stack, world, user);
    //    Objects.requireNonNull(user);
    //    return user instanceof PlayerEntity && ((PlayerEntity)user).getAbilities().creativeMode ? itemStack : new ItemStack(ModItems.GILDED_ECHO_SHARD);
    //}
}
