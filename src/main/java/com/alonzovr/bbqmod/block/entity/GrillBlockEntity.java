package com.alonzovr.bbqmod.block.entity;

import java.util.Optional;

import com.alonzovr.bbqmod.block.GrillBlock;
import com.alonzovr.bbqmod.util.SaucedItemsRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.Inventories;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.network.packet.s2c.play.BlockEntityUpdateS2CPacket;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Clearable;
import net.minecraft.util.ItemScatterer;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.event.GameEvent.Emitter;
import org.jetbrains.annotations.Nullable;

public class GrillBlockEntity extends BlockEntity implements Clearable {
    private static final int field_31330 = 2;
    private static final int field_31331 = 4;
    private final DefaultedList<ItemStack> itemsBeingCooked;
    private final int[] cookingTimes;
    private final int[] cookingTotalTimes;
    private final RecipeManager.MatchGetter<Inventory, CampfireCookingRecipe> matchGetter;

    public GrillBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.GRILL_BLOCK_ENTITY_BLOCK_ENTITY_TYPE, pos, state);
        this.itemsBeingCooked = DefaultedList.ofSize(4, ItemStack.EMPTY);
        this.cookingTimes = new int[4];
        this.cookingTotalTimes = new int[4];
        this.matchGetter = RecipeManager.createCachedMatchGetter(RecipeType.CAMPFIRE_COOKING);
    }

    public static void litServerTick(World world, BlockPos pos, BlockState state, GrillBlockEntity grill) {
        boolean bl = false;

        for(int i = 0; i < grill.itemsBeingCooked.size(); ++i) {
            ItemStack itemStack = (ItemStack)grill.itemsBeingCooked.get(i);
            if (!itemStack.isEmpty()) {
                bl = true;
                int var10002 = grill.cookingTimes[i]++;
                if (grill.cookingTimes[i] >= grill.cookingTotalTimes[i]) {
                    Inventory inventory = new SimpleInventory(new ItemStack[]{itemStack});
                    ItemStack itemStack2 = (ItemStack)grill.matchGetter.getFirstMatch(inventory, world).map((recipe) -> {
                        return recipe.craft(inventory, world.getRegistryManager());
                    }).orElse(itemStack);
                    if (itemStack2.isItemEnabled(world.getEnabledFeatures())) {
                        ItemScatterer.spawn(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ(), itemStack2);
                        grill.itemsBeingCooked.set(i, ItemStack.EMPTY);
                        world.updateListeners(pos, state, state, 3);
                        world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, Emitter.of(state));
                    }
                }
            }
        }

        if (bl) {
            markDirty(world, pos, state);
        }

    }

    public static void unlitServerTick(World world, BlockPos pos, BlockState state, GrillBlockEntity grill) {
        boolean bl = false;

        for(int i = 0; i < grill.itemsBeingCooked.size(); ++i) {
            if (grill.cookingTimes[i] > 0) {
                bl = true;
                grill.cookingTimes[i] = MathHelper.clamp(grill.cookingTimes[i] - 2, 0, grill.cookingTotalTimes[i]);
            }
        }

        if (bl) {
            markDirty(world, pos, state);
        }

    }

    public static void clientTick(World world, BlockPos pos, BlockState state, GrillBlockEntity grill) {
        Random random = world.random;
        int i;
        if (random.nextFloat() < 0.11F) {
            for(i = 0; i < random.nextInt(2) + 2; ++i) {
                GrillBlock.spawnSmokeParticle(world, pos, (Boolean)state.get(GrillBlock.SIGNAL_FIRE), false);
            }
        }

        i = ((Direction)state.get(GrillBlock.FACING)).getHorizontal();

        for(int j = 0; j < grill.itemsBeingCooked.size(); ++j) {
            if (!((ItemStack)grill.itemsBeingCooked.get(j)).isEmpty() && random.nextFloat() < 0.2F) {
                Direction direction = Direction.fromHorizontal(Math.floorMod(j + i, 4));
                float f = 0.3125F;
                double d = (double)pos.getX() + 0.5 - (double)((float)direction.getOffsetX() * 0.2F) + (double)((float)direction.rotateYClockwise().getOffsetX() * 0.21F);
                double e = (double)pos.getY() + 1;
                double g = (double)pos.getZ() + 0.5 - (double)((float)direction.getOffsetZ() * 0.2F) + (double)((float)direction.rotateYClockwise().getOffsetZ() * 0.21F);

                for(int k = 0; k < 4; ++k) {
                    world.addParticle(ParticleTypes.SMOKE, d, e, g, 0.0, 5.0E-4, 0.0);
                }
            }
        }

    }

    public DefaultedList<ItemStack> getItemsBeingCooked() {
        return this.itemsBeingCooked;
    }

    public void readNbt(NbtCompound nbt) {
        super.readNbt(nbt);
        this.itemsBeingCooked.clear();
        Inventories.readNbt(nbt, this.itemsBeingCooked);
        int[] is;
        if (nbt.contains("CookingTimes", 11)) {
            is = nbt.getIntArray("CookingTimes");
            System.arraycopy(is, 0, this.cookingTimes, 0, Math.min(this.cookingTotalTimes.length, is.length));
        }

        if (nbt.contains("CookingTotalTimes", 11)) {
            is = nbt.getIntArray("CookingTotalTimes");
            System.arraycopy(is, 0, this.cookingTotalTimes, 0, Math.min(this.cookingTotalTimes.length, is.length));
        }

    }

    protected void writeNbt(NbtCompound nbt) {
        super.writeNbt(nbt);
        Inventories.writeNbt(nbt, this.itemsBeingCooked, true);
        nbt.putIntArray("CookingTimes", this.cookingTimes);
        nbt.putIntArray("CookingTotalTimes", this.cookingTotalTimes);
    }

    public BlockEntityUpdateS2CPacket toUpdatePacket() {
        return BlockEntityUpdateS2CPacket.create(this);
    }

    public NbtCompound toInitialChunkDataNbt() {
        NbtCompound nbtCompound = new NbtCompound();
        Inventories.writeNbt(nbtCompound, this.itemsBeingCooked, true);
        return nbtCompound;
    }

    public Optional<CampfireCookingRecipe> getRecipeFor(ItemStack stack) {
        return this.itemsBeingCooked.stream().noneMatch(ItemStack::isEmpty) ? Optional.empty() : this.matchGetter.getFirstMatch(new SimpleInventory(new ItemStack[]{stack}), this.world);
    }

    public boolean addItem(@Nullable Entity user, ItemStack stack, int cookTime) {
        for(int i = 0; i < this.itemsBeingCooked.size(); ++i) {
            ItemStack itemStack = (ItemStack)this.itemsBeingCooked.get(i);
            if (itemStack.isEmpty()) {
                this.cookingTotalTimes[i] = (int) ((double) cookTime / 2.0);
                this.cookingTimes[i] = 0;
                this.itemsBeingCooked.set(i, stack.split(1));
                this.world.emitGameEvent(GameEvent.BLOCK_CHANGE, this.getPos(), Emitter.of(user, this.getCachedState()));
                this.updateListeners();
                return true;
            }
        }

        return false;
    }

    private void updateListeners() {
        this.markDirty();
        this.getWorld().updateListeners(this.getPos(), this.getCachedState(), this.getCachedState(), 3);
    }

    public void clear() {
        this.itemsBeingCooked.clear();
    }

    public void spawnItemsBeingCooked() {
        if (this.world != null) {
            this.updateListeners();
        }

    }

    public boolean applySauceToItems(ItemStack sauceItem, PlayerEntity player) {
        boolean anyItemsSauced = false;
        for (int i = 0; i < this.itemsBeingCooked.size(); ++i) {
            ItemStack itemStack = this.itemsBeingCooked.get(i);
            if (!itemStack.isEmpty()) {
                Item saucedItem = SaucedItemsRegistry.getSaucedItem(sauceItem.getItem(), itemStack.getItem());
                if (saucedItem != itemStack.getItem()) {
                    this.itemsBeingCooked.set(i, new ItemStack(saucedItem, itemStack.getCount()));
                    this.cookingTimes[i] = 0;
                    anyItemsSauced = true;
                }
            }
        }
        if (anyItemsSauced) {
            this.updateListeners();
            if (!player.getAbilities().creativeMode) {
                sauceItem.decrement(1);
                if (sauceItem.isEmpty()) {
                    player.setStackInHand(player.getActiveHand(), new ItemStack(Items.GLASS_BOTTLE));
                } else {
                    player.giveItemStack(new ItemStack(Items.GLASS_BOTTLE));
                }
            }
        }
        return anyItemsSauced;
    }

    public boolean canItemsBeSauced(ItemStack sauceItem) {
        for (ItemStack itemStack : this.itemsBeingCooked) {
            if (!itemStack.isEmpty() && SaucedItemsRegistry.getSaucedItem(sauceItem.getItem(), itemStack.getItem()) != itemStack.getItem()) {
                return true;
            }
        }
        return false;
    }
}
