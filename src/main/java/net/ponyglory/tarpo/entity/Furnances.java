package net.ponyglory.tarpo.entity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityType;


public class Furnances extends TileEntity {
    
    // private final ItemStackHandler itemHandler = createHandler();
    // private final LazyOptional<IItemHandler> handler = LazyOptional.of(()-> itemHandler);

    public Furnances (TileEntityType<?> tileEntityTypeIn) {super(tileEntityTypeIn);}

    // private ItemStackHandler createHandler() {
    //     return new ItemStackHandler(2) {
    //         @Override
    //         protected void onContentsChanged(int slot) {
    //             markDirty();
    //         }

    //         @Override
    //         puvlic boolean isItemValid(int slot, @Nonull ItemStack stack) {
    //             return super.
    //         }
    //     };
    // }
}
