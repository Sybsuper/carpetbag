package us.jusybiberman.carpetbag.item.swords;

import us.jusybiberman.carpetbag.item.CarpetbagTab;
import us.jusybiberman.carpetbag.material.Materials;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.NonNullList;

import javax.annotation.Nonnull;

import static us.jusybiberman.carpetbag.Carpetbag.MOD_ID;

public class OnimaruKunitsuna extends ItemSword {
	public OnimaruKunitsuna() {
		super(Materials.TAMAHAGANE);
		setTranslationKey("onimaru_kunitsuna");
		setRegistryName(MOD_ID, "onimaru_kunitsuna");
		setCreativeTab(CarpetbagTab.tabCarpetbagItems);
	}


	/*public void getSubItems(@Nonnull CreativeTabs tab, @Nonnull final NonNullList<ItemStack> list) {
		if (isInCreativeTab(tab)) {
			ItemStack is = new ItemStack(this);
			list.add(is);

			is = new ItemStack(this);
			// TODO: Add all upgrades for weapon or smth
			list.add(is);
		}
	}*/
}