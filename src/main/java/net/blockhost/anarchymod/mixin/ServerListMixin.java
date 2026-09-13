package net.blockhost.anarchymod.mixin;

import net.blockhost.anarchymod.Domains;
//? if <1.14.4 {
/*import net.minecraft.client.options.ServerEntry;
import net.minecraft.client.options.ServerList;
*///?} else {
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
//?}
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;
import java.util.TreeSet;

@Mixin(ServerList.class)
public class ServerListMixin {

    //? if <1.14.4 {
    /*@Shadow
    @Final
    private List<ServerEntry> serverEntries;
    *///?} else {
    @Shadow
    @Final
    private List<ServerData> serverList;
    //?}

    //? if <1.14.4 {
    /*@Inject(method = "loadFile", at = @At("RETURN"))
    public void afterLoad(CallbackInfo ci) {
        int index = 0;
        for (String host : new TreeSet<>(Domains.getKnownHosts())) {
            if (serverEntries.stream().noneMatch(data -> Domains.matches(data.address, "*." + host))) {
                serverEntries.add(index++, new ServerEntry(host, host, false));
            }
        }
    }
    *///?} else {
    @Inject(method = "load", at = @At("RETURN"))
    public void afterLoad(CallbackInfo ci) {
        int index = 0;
        for (String host : new TreeSet<>(Domains.getKnownHosts())) {
            if (serverList.stream().noneMatch(data -> Domains.matches(data.ip, "*." + host))) {
                //? if <1.20.2 {
                /*serverList.add(index++, new ServerData(host, host, false));
                *///?} else {
                serverList.add(index++, new ServerData(host, host, ServerData.Type.OTHER));
                //?}
            }
        }
    }
    //?}
}
