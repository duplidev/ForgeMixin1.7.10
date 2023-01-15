package com.example.examplemod.mixins;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MinecraftMixin {

    // Add "--tweakClass org.spongepowered.asm.launch.MixinTweaker --mixin mixins.examplemod.json" to get mixins working in a dev environment

    @Inject(method = "startGame", at = @At("RETURN"))
    public void startGame(CallbackInfo ci){
        System.out.println("Injected Mixin");
        Display.setTitle("Injected Mixin");
    }
}