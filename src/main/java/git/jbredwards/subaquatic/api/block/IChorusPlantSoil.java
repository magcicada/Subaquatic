package git.jbredwards.subaquatic.api.block;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

import javax.annotation.Nonnull;

/**
 * Blocks that can support chorus plants implement this.
 * @author jbred
 *
 */
public interface IChorusPlantSoil
{
    static boolean isSoil(@Nonnull IBlockState state) {
        return state.getBlock() == Blocks.END_STONE || state.getBlock() instanceof IChorusPlantSoil
                && ((IChorusPlantSoil)state.getBlock()).canSupportChorusPlant(state);
    }

    default boolean canSupportChorusPlant(@Nonnull IBlockState soil) { return true; }
}
