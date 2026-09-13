package net.blockhost.anarchymod.mixin;

import com.mojang.patchy.BlockedServers;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockedServers.class)
public class BlockedServersMixin {

    // Vanilla has already checked `server` against Mojang's full blockedservers hash
    // list by this point (at RETURN); unblock anything it flagged instead of only the
    // small curated Domains list, so every Mojang-blocked server is reachable.
    @Inject(method = "isBlockedServerHostName", at = @At("RETURN"), cancellable = true, remap = false)
    //? if <1.17 {
    /*private static void isBlockedServerHostName(String server, CallbackInfoReturnable<Boolean> cir) {
    *///?} else {
    public void isBlockedServerHostName(String server, CallbackInfoReturnable<Boolean> cir) {
    //?}
        if (cir.getReturnValueZ()) {
            cir.setReturnValue(false);
        }
    }
}
