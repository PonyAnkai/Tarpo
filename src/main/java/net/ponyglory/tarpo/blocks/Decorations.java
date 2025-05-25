package net.ponyglory.tarpo.blocks;

import java.util.stream.Stream;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.ponyglory.tarpo.Tarpo;

public class Decorations {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Tarpo.MOD_ID);

    public static class Taburet extends Block {
        public Taburet(Properties properties) {super(properties);}

        private final VoxelShape SHAPE = Stream.of(
                Block.box(1, 0, 1, 3, 8, 3),
                Block.box(13, 0, 1, 15, 8, 3),
                Block.box(1, 8, 1, 15, 10, 15),
                Block.box(13, 0, 13, 15, 8, 15),
                Block.box(1, 0, 13, 3, 8, 15),
                Block.box(3, 4, 1, 13, 6, 3),
                Block.box(3, 4, 13, 13, 6, 15),
                Block.box(1, 4, 3, 3, 6, 13),
                Block.box(13, 4, 3, 15, 6, 13)
            ).reduce((v1, v2) -> VoxelShapes.join(v1, v2, IBooleanFunction.OR)).get();

        @Override
        public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
            return SHAPE;
        }
    }
}
