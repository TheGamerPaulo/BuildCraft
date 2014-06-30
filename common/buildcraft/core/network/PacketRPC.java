/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.core.network;

import net.minecraft.entity.player.EntityPlayer;

public abstract class PacketRPC extends BuildCraftPacket {

	@Override
	public final int getID() {
		return PacketIds.RPC;
	}

	public abstract void call(EntityPlayer sender);
}