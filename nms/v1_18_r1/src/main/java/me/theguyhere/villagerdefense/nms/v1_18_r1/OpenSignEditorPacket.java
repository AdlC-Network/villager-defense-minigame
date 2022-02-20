package me.theguyhere.villagerdefense.nms.v1_18_r1;

import net.minecraft.core.BlockPosition;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.PacketPlayOutOpenSignEditor;

public class OpenSignEditorPacket extends VersionNMSPacket {
    private final Packet<?> rawPacket;

    OpenSignEditorPacket(BlockPosition position) {
        PacketSetter packetSetter = PacketSetter.get();

        // Sign location
        packetSetter.writePosition(position);

        this.rawPacket = new PacketPlayOutOpenSignEditor(packetSetter);
    }

    @Override
    public Packet<?> getRawPacket() {
        return rawPacket;
    }
}
