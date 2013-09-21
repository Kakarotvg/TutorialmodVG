package kakarotvg.common.tutorial;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;

import kakarotvg.common.tutorial.info.TutorialModInfo;

import net.minecraft.network.INetworkManager;
import net.minecraft.network.packet.Packet250CustomPayload;
import cpw.mods.fml.common.network.IPacketHandler;
import cpw.mods.fml.common.network.Player;

public class TutorialPacketHandler implements IPacketHandler {

    @Override
    public void onPacketData(INetworkManager manager, Packet250CustomPayload packet, Player player) {
        if (packet.channel.equals(TutorialModInfo.MOD_C)) {
            handlePacket(packet);
        }
    }

    public void handlePacket(Packet250CustomPayload packet) {
        DataInputStream inputstream = new DataInputStream(new ByteArrayInputStream(packet.data));

        int randomInt1;
        int randomInt2;

        try {
            randomInt1 = inputstream.readInt();
            randomInt2 = inputstream.readInt();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println(randomInt1 + "" + randomInt2);
    }
}
