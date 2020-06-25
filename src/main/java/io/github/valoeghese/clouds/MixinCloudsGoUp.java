package io.github.valoeghese.clouds;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import net.minecraft.client.render.SkyProperties;

@Mixin(SkyProperties.Overworld.class)
public class MixinCloudsGoUp {
	@Overwrite
	public float getCloudsHeight() {
		return 200;
	}
}