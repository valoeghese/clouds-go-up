package io.github.valoeghese.clouds;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.client.render.SkyProperties;

@Mixin(SkyProperties.class)
public class MixinCloudsGoUp {
	@Inject(at = @At("RETURN"), method = "getCloudsHeight", cancellable = true)
	private void getCloudsHeight(CallbackInfoReturnable<Float> info) {
		if (info.getReturnValueF() == 128.0F) {
			info.setReturnValue(200.0F);
		}
	}
}