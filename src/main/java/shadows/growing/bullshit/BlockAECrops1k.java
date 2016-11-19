package shadows.growing.bullshit;

import java.util.Random;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockAECrops1k extends BlockCrops{
	public BlockAECrops1k() {
		setUnlocalizedName(AE2Growable.MODID + ".crop1k");
		setRegistryName("crop1k");
		GameRegistry.register(this);
		GameRegistry.register(new ItemBlock(this), getRegistryName());
	}
	@Override
	protected Item getSeed() {
		return ModRegistry.itemMESeed1k;
	}
	@Override
	protected Item getCrop() {
		return Item.getByNameOrId("appliedenergistics2:storage_cell_1k");
	}
	//@Override
	//public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state){
	//	return false;
//	}
	@SideOnly(Side.CLIENT)
	public void initModel(){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
	
}