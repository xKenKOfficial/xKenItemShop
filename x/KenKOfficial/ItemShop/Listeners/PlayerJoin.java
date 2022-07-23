package x.KenKOfficial.ItemShop.Listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;
import x.KenKOfficial.ItemShop.Utils.ChatUtil;
import x.KenKOfficial.ItemShop.Basic.Main;
import org.bukkit.event.player.PlayerJoinEvent;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.event.Listener;

public class PlayerJoin implements Listener
{
    private static final /* synthetic */ String[] IIl;
    private static final /* synthetic */ int[] lIl;
    
    static {
        lIlIl();
        IIlIl();
    }
    
    private static void IIlIl() {
        (IIl = new String[PlayerJoin.lIl[13]])[PlayerJoin.lIl[0]] = lIIIl("Jz8EIwA5DBgqDzg=", "WSqDi");
        PlayerJoin.IIl[PlayerJoin.lIl[1]] = IlIIl("Vo+PRbrsKDeVlLZxw8Wg0hci4Z1h2RbJAm/B4KfcQc4=", "tFkUJ");
        PlayerJoin.IIl[PlayerJoin.lIl[2]] = lIIIl("XEx8FVpHSWdEWkdJZ0RaR0lnRDxcR3wVHzERNDATHxkJEQgKUmJfCydJZ0RaR0lnRFpHSWdEWkc=", "ztZyg");
        PlayerJoin.IIl[PlayerJoin.lIl[3]] = IlIIl("kfYZXZdyG+U=", "guozw");
        PlayerJoin.IIl[PlayerJoin.lIl[4]] = IlIIl("2BhwAreLJg+aX69u0kqOlToryUFgqWkhKUSZ1Yj8emI=", "meRyG");
        PlayerJoin.IIl[PlayerJoin.lIl[5]] = llIIl("LH0SLRn7NT8=", "iucOo");
        PlayerJoin.IIl[PlayerJoin.lIl[6]] = IlIIl("Te6uxWhnMH/ntOdZT8GW9u4ic+tOu9LC", "dMUAq");
        PlayerJoin.IIl[PlayerJoin.lIl[7]] = lIIIl("cw==", "Shbzf");
        PlayerJoin.IIl[PlayerJoin.lIl[8]] = llIIl("1qzn9sspDfO6Qe9pDoT3wlXPXmuT3gthWZQvAmbhDPI=", "TOOKq");
        PlayerJoin.IIl[PlayerJoin.lIl[9]] = llIIl("gDr8JgRIDVk=", "VPhET");
        PlayerJoin.IIl[PlayerJoin.lIl[10]] = llIIl("UrKy/TsRVxUb2MQGZLqYMJUU6+8ZF3qIXfraUN9V4gncH4g2L7ulnMWoxay82Qj8DTLuuwVUsBA=", "RxiHU");
        PlayerJoin.IIl[PlayerJoin.lIl[11]] = lIIIl("eA==", "XgcbH");
        PlayerJoin.IIl[PlayerJoin.lIl[12]] = llIIl("F5ELc4sDas7THGbdLHPfSOEU3CXGUPmD5zkKfEtRSpnN2LP0b3Xnzt5mg34RfUU50xxm3Sxz30gy8kgXNBN65Q==", "BPUXD");
    }
    
    private static boolean lllIl(final int IIlIlIIIlllllll, final int llIIlIIIlllllll) {
        return IIlIlIIIlllllll < llIIlIIIlllllll;
    }
    
    private static String llIIl(final String IIlllIIIlllllll, final String llIllIIIlllllll) {
        try {
            final SecretKeySpec lllllIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIllIIIlllllll.getBytes(StandardCharsets.UTF_8)), PlayerJoin.lIl[8]), "DES");
            final Cipher IllllIIIlllllll = Cipher.getInstance("DES");
            IllllIIIlllllll.init(PlayerJoin.lIl[2], lllllIIIlllllll);
            return new String(IllllIIIlllllll.doFinal(Base64.getDecoder().decode(IIlllIIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlllIIIlllllll) {
            lIlllIIIlllllll.printStackTrace();
            return null;
        }
    }
    
    @EventHandler
    public void onJoin(final PlayerJoinEvent IlIlIIlIlllllll) {
        final Player llIlIIlIlllllll = IlIlIIlIlllllll.getPlayer();
        if (IllIl(Main.getPlugin().getConfig().getBoolean(PlayerJoin.IIl[PlayerJoin.lIl[0]]) ? 1 : 0) && IllIl(llIlIIlIlllllll.hasPermission(PlayerJoin.IIl[PlayerJoin.lIl[1]]) ? 1 : 0)) {
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[2]]));
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[3]]));
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[4]]));
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[5]]));
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[6]]));
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[7]]));
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(PlayerJoin.IIl[PlayerJoin.lIl[8]]).append(Bukkit.getBukkitVersion()))));
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[9]]));
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[10]]));
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[11]]));
            llIlIIlIlllllll.sendMessage(ChatUtil.fixColor(PlayerJoin.IIl[PlayerJoin.lIl[12]]));
        }
    }
    
    private static String lIIIl(String lIIlllIIlllllll, final String lIllllIIlllllll) {
        lIIlllIIlllllll = (long)new String(Base64.getDecoder().decode(((String)lIIlllIIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IIllllIIlllllll = new StringBuilder();
        final char[] llIlllIIlllllll = lIllllIIlllllll.toCharArray();
        int IlIlllIIlllllll = PlayerJoin.lIl[0];
        final short IIlIllIIlllllll = (Object)((String)lIIlllIIlllllll).toCharArray();
        final double llIIllIIlllllll = IIlIllIIlllllll.length;
        int IlIIllIIlllllll = PlayerJoin.lIl[0];
        while (lllIl(IlIIllIIlllllll, (int)llIIllIIlllllll)) {
            final char llllllIIlllllll = IIlIllIIlllllll[IlIIllIIlllllll];
            IIllllIIlllllll.append((char)(llllllIIlllllll ^ llIlllIIlllllll[IlIlllIIlllllll % llIlllIIlllllll.length]));
            "".length();
            ++IlIlllIIlllllll;
            ++IlIIllIIlllllll;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(IIllllIIlllllll);
    }
    
    private static boolean IllIl(final int lIIIlIIIlllllll) {
        return lIIIlIIIlllllll != 0;
    }
    
    private static void lIlIl() {
        (lIl = new int[14])[0] = ((0x28 ^ 0x6A) & ~(0x4A ^ 0x8));
        PlayerJoin.lIl[1] = " ".length();
        PlayerJoin.lIl[2] = "  ".length();
        PlayerJoin.lIl[3] = "   ".length();
        PlayerJoin.lIl[4] = ("   ".length() ^ (0xA9 ^ 0xAE));
        PlayerJoin.lIl[5] = (0xA3 ^ 0xC2 ^ (0xD5 ^ 0xB1));
        PlayerJoin.lIl[6] = (0x41 ^ 0x47);
        PlayerJoin.lIl[7] = (0x7B ^ 0x7C);
        PlayerJoin.lIl[8] = (0x59 ^ 0x51);
        PlayerJoin.lIl[9] = (0x3E ^ 0x37);
        PlayerJoin.lIl[10] = (0xD1 ^ 0x83 ^ (0x2D ^ 0x75));
        PlayerJoin.lIl[11] = (122 + 85 - 205 + 142 ^ 126 + 20 - 48 + 57);
        PlayerJoin.lIl[12] = (0x4F ^ 0x3F ^ (0xCD ^ 0xB1));
        PlayerJoin.lIl[13] = (0x96 ^ 0x9B);
    }
    
    private static String IlIIl(final String lIIlIlIIlllllll, final String IIIlIlIIlllllll) {
        try {
            final SecretKeySpec IIllIlIIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IIIlIlIIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIlIlIIlllllll = Cipher.getInstance("Blowfish");
            llIlIlIIlllllll.init(PlayerJoin.lIl[2], IIllIlIIlllllll);
            return new String(llIlIlIIlllllll.doFinal(Base64.getDecoder().decode(lIIlIlIIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIlIIlllllll) {
            IlIlIlIIlllllll.printStackTrace();
            return null;
        }
    }
}
