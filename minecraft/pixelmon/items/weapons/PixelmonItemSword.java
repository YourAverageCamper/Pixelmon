package pixelmon.items.weapons;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemSword;

public class PixelmonItemSword extends ItemSword {

	String textureName;
	public PixelmonItemSword(int par1, EnumToolMaterial par2EnumToolMaterial, String textureName) {
		super(par1, par2EnumToolMaterial);
		this.textureName = textureName;
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void func_94581_a(IconRegister par1IconRegister) {
		this.iconIndex = par1IconRegister.func_94245_a(textureName);
	}

}
