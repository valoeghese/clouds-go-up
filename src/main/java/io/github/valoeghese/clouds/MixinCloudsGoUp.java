package io.github.valoeghese.clouds;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.client.render.SkyProperties;

@Mixin(SkyProperties.Overworld.class)
public class MixinCloudsGoUp {
	public float getCloudsHeight() {
		return 200;
	}
}