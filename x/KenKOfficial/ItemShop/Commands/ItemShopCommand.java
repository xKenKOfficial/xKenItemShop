package x.KenKOfficial.ItemShop.Commands;

import java.util.Iterator;
import java.util.List;
import org.bukkit.entity.Player;
import x.KenKOfficial.ItemShop.Basic.Main;
import org.bukkit.Bukkit;
import x.KenKOfficial.ItemShop.Utils.ChatUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.bukkit.command.CommandExecutor;

public class ItemShopCommand implements CommandExecutor
{
    private static final /* synthetic */ String COMMAND_USAGE;
    private static final /* synthetic */ String WRONG_ARGS;
    private static final /* synthetic */ String PREFIX;
    private static final /* synthetic */ String NOT_FIND_RANK;
    private static final /* synthetic */ String OFFLINE_PLAYER;
    private static final /* synthetic */ String[] Il;
    private static final /* synthetic */ int[] ll;
    private static final /* synthetic */ String NO_PERM;
    
    private static boolean IIll(final int IIlllIlIlllllll, final int llIllIlIlllllll) {
        return IIlllIlIlllllll < llIllIlIlllllll;
    }
    
    private static void lIIl() {
        (Il = new String[ItemShopCommand.ll[24]])[ItemShopCommand.ll[0]] = Ill("EzIEOxofPAwmGwQpTzQXBjAPexofPAwmGwQp", "kYaUs");
        ItemShopCommand.Il[ItemShopCommand.ll[1]] = Ill("UQ==", "qNmaR");
        ItemShopCommand.Il[ItemShopCommand.ll[2]] = lll("AfosSVDs1GA=", "WIxNk");
        ItemShopCommand.Il[ItemShopCommand.ll[3]] = Ill("dw==", "WnpQc");
        ItemShopCommand.Il[ItemShopCommand.ll[4]] = Ill("PCAzPTk9OyYPIzsLITUoew==", "UTVPJ");
        ItemShopCommand.Il[ItemShopCommand.ll[5]] = IIIl("hP+HfCiKS/04PepLDaz4j1czHzDLqokn", "sOatT");
        ItemShopCommand.Il[ItemShopCommand.ll[6]] = lll("7hnFG4K79+o=", "apIpQ");
        ItemShopCommand.Il[ItemShopCommand.ll[7]] = Ill("KDwOCT0pJxs7Jy8XHAEsbw==", "AHkdN");
        ItemShopCommand.Il[ItemShopCommand.ll[8]] = lll("9sXWQyCTzzbGRiVoChjboU+3Dmy7OkI4", "wREJP");
        ItemShopCommand.Il[ItemShopCommand.ll[9]] = lll("4m34599k6g6kDFj1JCEeLsodGm8hisuI", "xYAZw");
        ItemShopCommand.Il[ItemShopCommand.ll[10]] = lll("0pqnbmLTiCkEXjHv5DfaeQ==", "VjVqA");
        ItemShopCommand.Il[ItemShopCommand.ll[11]] = IIIl("gigMY8hCt3U=", "cxudp");
        ItemShopCommand.Il[ItemShopCommand.ll[12]] = lll("VNHaTQluWbc=", "YjwUu");
        ItemShopCommand.Il[ItemShopCommand.ll[13]] = Ill("", "Dwbwg");
        ItemShopCommand.Il[ItemShopCommand.ll[14]] = Ill("CzInNzQqCA==", "puuvw");
        ItemShopCommand.Il[ItemShopCommand.ll[15]] = IIIl("zO5Ae813HmO7BxaEfqCbPw==", "UHXBD");
        ItemShopCommand.Il[ItemShopCommand.ll[16]] = Ill("bg==", "Nudiu");
        ItemShopCommand.Il[ItemShopCommand.ll[17]] = lll("/Das5+RU5x0=", "PuOrs");
        ItemShopCommand.Il[ItemShopCommand.ll[18]] = Ill("EwMPESMb", "cqjwJ");
        ItemShopCommand.Il[ItemShopCommand.ll[19]] = Ill("Ijs6MiE+OQwxNyU7Cw==", "LTeBD");
        ItemShopCommand.Il[ItemShopCommand.ll[20]] = lll("m+EdK+xsNAWh8nT7bYt0Rg==", "ukRyA");
        ItemShopCommand.Il[ItemShopCommand.ll[21]] = Ill("BiUMIgcHJjU+Agg6Dzw=", "iCjNn");
        ItemShopCommand.Il[ItemShopCommand.ll[22]] = Ill("IRARIQQgCwQTFCcJGS0ZLDsBPxYvAQ==", "HdtLw");
        ItemShopCommand.Il[ItemShopCommand.ll[23]] = IIIl("GVEX7jPNwH16K2YkHy86d2uT01ZUg0Kg", "ZqEhB");
    }
    
    private static boolean IIIIl(final int lIlIlIlIlllllll) {
        return lIlIlIlIlllllll != 0;
    }
    
    private static String IIIl(final String llIlIIIllllllll, final String IIllIIIllllllll) {
        try {
            final SecretKeySpec IIIIlIIllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIllIIIllllllll.getBytes(StandardCharsets.UTF_8)), ItemShopCommand.ll[8]), "DES");
            final Cipher llllIIIllllllll = Cipher.getInstance("DES");
            llllIIIllllllll.init(ItemShopCommand.ll[2], IIIIlIIllllllll);
            return new String(llllIIIllllllll.doFinal(Base64.getDecoder().decode(llIlIIIllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlllIIIllllllll) {
            IlllIIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean Illl(final Object lllIlIlIlllllll) {
        return lllIlIlIlllllll == null;
    }
    
    private static boolean lIll(final int IIIIIllIlllllll, final int lllllIlIlllllll) {
        return IIIIIllIlllllll == lllllIlIlllllll;
    }
    
    private static boolean llll(final Object lIIllIlIlllllll) {
        return lIIllIlIlllllll != null;
    }
    
    private static String lll(final String IIIlIllIlllllll, final String lllIIllIlllllll) {
        try {
            final SecretKeySpec llIlIllIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllIIllIlllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher IlIlIllIlllllll = Cipher.getInstance("Blowfish");
            IlIlIllIlllllll.init(ItemShopCommand.ll[2], llIlIllIlllllll);
            return new String(IlIlIllIlllllll.doFinal(Base64.getDecoder().decode(IIIlIllIlllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIIlIllIlllllll) {
            lIIlIllIlllllll.printStackTrace();
            return null;
        }
    }
    
    private static String Ill(String IIIllllIlllllll, final String lllIlllIlllllll) {
        IIIllllIlllllll = (char)new String(Base64.getDecoder().decode(((String)IIIllllIlllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llIllllIlllllll = new StringBuilder();
        final char[] IlIllllIlllllll = lllIlllIlllllll.toCharArray();
        int lIIllllIlllllll = ItemShopCommand.ll[0];
        final short llIIlllIlllllll = (Object)((String)IIIllllIlllllll).toCharArray();
        final String IlIIlllIlllllll = (String)llIIlllIlllllll.length;
        byte lIIIlllIlllllll = (byte)ItemShopCommand.ll[0];
        while (IIll(lIIIlllIlllllll, (int)IlIIlllIlllllll)) {
            final char IllllllIlllllll = llIIlllIlllllll[lIIIlllIlllllll];
            llIllllIlllllll.append((char)(IllllllIlllllll ^ IlIllllIlllllll[lIIllllIlllllll % IlIllllIlllllll.length]));
            "".length();
            ++lIIllllIlllllll;
            ++lIIIlllIlllllll;
            "".length();
            if (((0x59 ^ 0x55) & ~(0x67 ^ 0x6B)) > ((0x90 ^ 0xB4) & ~(0x7C ^ 0x58))) {
                return null;
            }
        }
        return String.valueOf(llIllllIlllllll);
    }
    
    public boolean onCommand(final CommandSender llIIIlIllllllll, final Command IlIIIlIllllllll, final String lIIIIlIllllllll, final String[] IllllIIllllllll) {
        if (llIl(llIIIlIllllllll.hasPermission(ItemShopCommand.Il[ItemShopCommand.ll[0]]) ? 1 : 0)) {
            llIIIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(ItemShopCommand.PREFIX).append(ItemShopCommand.Il[ItemShopCommand.ll[1]]).append(ItemShopCommand.NO_PERM))));
            return ItemShopCommand.ll[0] != 0;
        }
        if (IIll(IllllIIllllllll.length, ItemShopCommand.ll[1])) {
            llIIIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(ItemShopCommand.PREFIX).append(ItemShopCommand.Il[ItemShopCommand.ll[2]]).append(ItemShopCommand.COMMAND_USAGE))));
            return ItemShopCommand.ll[0] != 0;
        }
        if (lIll(IllllIIllllllll.length, ItemShopCommand.ll[2])) {
            final Player IllIIlIllllllll = Bukkit.getPlayer(IllllIIllllllll[ItemShopCommand.ll[0]]);
            final String lIlIIlIllllllll = IllllIIllllllll[ItemShopCommand.ll[1]];
            if (Illl(IllIIlIllllllll)) {
                llIIIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(ItemShopCommand.PREFIX).append(ItemShopCommand.Il[ItemShopCommand.ll[3]]).append(ItemShopCommand.OFFLINE_PLAYER))));
                return ItemShopCommand.ll[0] != 0;
            }
            if (llll(Main.getPlugin().getConfig().getString(String.valueOf(new StringBuilder().append(ItemShopCommand.Il[ItemShopCommand.ll[4]]).append(lIlIIlIllllllll))))) {
                final String IlIlIlIllllllll = Main.getPlugin().getConfig().getString(String.valueOf(new StringBuilder().append(ItemShopCommand.Il[ItemShopCommand.ll[5]]).append(lIlIIlIllllllll).append(ItemShopCommand.Il[ItemShopCommand.ll[6]])));
                final String lIIlIlIllllllll = Main.getPlugin().getConfig().getString(String.valueOf(new StringBuilder().append(ItemShopCommand.Il[ItemShopCommand.ll[7]]).append(lIlIIlIllllllll).append(ItemShopCommand.Il[ItemShopCommand.ll[8]])));
                final List<String> IIIlIlIllllllll = (List<String>)Main.getPlugin().getConfig().getStringList(String.valueOf(new StringBuilder().append(ItemShopCommand.Il[ItemShopCommand.ll[9]]).append(lIlIIlIllllllll).append(ItemShopCommand.Il[ItemShopCommand.ll[10]])));
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), lIIlIlIllllllll.replace(ItemShopCommand.Il[ItemShopCommand.ll[11]], IllIIlIllllllll.getName()).replace(ItemShopCommand.Il[ItemShopCommand.ll[12]], lIlIIlIllllllll));
                "".length();
                String lllIIlIllllllll = ItemShopCommand.Il[ItemShopCommand.ll[13]];
                final boolean lllIlIIllllllll = (boolean)Bukkit.getOnlinePlayers().iterator();
                while (IIIIl(((Iterator)lllIlIIllllllll).hasNext() ? 1 : 0)) {
                    final Player llIlIlIllllllll = ((Iterator<Player>)lllIlIIllllllll).next();
                    int IIllIlIllllllll = ItemShopCommand.ll[0];
                    while (IIll(IIllIlIllllllll, IIIlIlIllllllll.size())) {
                        lllIIlIllllllll = String.valueOf(IIIlIlIllllllll.get(IIllIlIllllllll).replace(ItemShopCommand.Il[ItemShopCommand.ll[14]], IllIIlIllllllll.getName()).replace(ItemShopCommand.Il[ItemShopCommand.ll[15]], IlIlIlIllllllll));
                        llIlIlIllllllll.sendMessage(ChatUtil.fixColor(lllIIlIllllllll));
                        ++IIllIlIllllllll;
                        "".length();
                        if ((0x15 ^ 0x4D ^ (0xEE ^ 0xB2)) != (75 + 187 - 260 + 196 ^ 78 + 150 - 74 + 40)) {
                            return ((93 + 220 - 290 + 200 ^ 18 + 124 - 62 + 60) & (0xD ^ 0x25 ^ (0x72 ^ 0x9) ^ -" ".length())) != 0x0;
                        }
                    }
                    "".length();
                    if (((0x8F ^ 0x84) & ~(0x50 ^ 0x5B)) != 0x0) {
                        return ((0x7C ^ 0x65) & ~(0x83 ^ 0x9A)) != 0x0;
                    }
                }
                "".length();
                if ("   ".length() > "   ".length()) {
                    return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
                }
            }
            else {
                llIIIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(ItemShopCommand.PREFIX).append(ItemShopCommand.Il[ItemShopCommand.ll[16]]).append(ItemShopCommand.NOT_FIND_RANK))));
            }
            "".length();
            if (-"  ".length() >= 0) {
                return ((174 + 115 - 286 + 207 ^ 95 + 10 + 14 + 32) & (0xC5 ^ 0x81 ^ " ".length() ^ -" ".length()) & (((123 + 8 - 79 + 79 ^ 113 + 63 - 160 + 147) & (45 + 23 - 48 + 110 ^ 123 + 15 - 105 + 129 ^ -" ".length())) ^ -" ".length())) != 0x0;
            }
        }
        else {
            llIIIlIllllllll.sendMessage(ChatUtil.fixColor(String.valueOf(new StringBuilder().append(ItemShopCommand.PREFIX).append(ItemShopCommand.Il[ItemShopCommand.ll[17]]).append(ItemShopCommand.WRONG_ARGS))));
        }
        return ItemShopCommand.ll[0] != 0;
    }
    
    private static void IlIl() {
        (ll = new int[25])[0] = (" ".length() & (" ".length() ^ -" ".length()));
        ItemShopCommand.ll[1] = " ".length();
        ItemShopCommand.ll[2] = "  ".length();
        ItemShopCommand.ll[3] = "   ".length();
        ItemShopCommand.ll[4] = (0xB5 ^ 0xB1);
        ItemShopCommand.ll[5] = (0x30 ^ 0x72 ^ (0xEE ^ 0xA9));
        ItemShopCommand.ll[6] = (35 + 32 - 51 + 127 ^ 52 + 53 + 8 + 24);
        ItemShopCommand.ll[7] = (0x92 ^ 0x95);
        ItemShopCommand.ll[8] = (0xCB ^ 0xC3);
        ItemShopCommand.ll[9] = (0x44 ^ 0x4D);
        ItemShopCommand.ll[10] = (0x5C ^ 0x56);
        ItemShopCommand.ll[11] = (118 + 128 - 222 + 116 ^ 90 + 94 - 75 + 26);
        ItemShopCommand.ll[12] = (41 + 143 - 171 + 150 ^ 116 + 29 - 12 + 42);
        ItemShopCommand.ll[13] = (91 + 141 - 141 + 58 ^ 41 + 130 - 125 + 106);
        ItemShopCommand.ll[14] = (0x16 ^ 0x18);
        ItemShopCommand.ll[15] = (0x6B ^ 0x64);
        ItemShopCommand.ll[16] = (0x78 ^ 0x68);
        ItemShopCommand.ll[17] = (0x30 ^ 0x19 ^ (0xBD ^ 0x85));
        ItemShopCommand.ll[18] = (0x30 ^ 0x22);
        ItemShopCommand.ll[19] = (0x14 ^ 0x7);
        ItemShopCommand.ll[20] = (0x7 ^ 0x13);
        ItemShopCommand.ll[21] = (0xF6 ^ 0x9B ^ (0xDD ^ 0xA5));
        ItemShopCommand.ll[22] = (76 + 84 - 12 + 21 ^ 47 + 143 - 137 + 138);
        ItemShopCommand.ll[23] = (0x37 ^ 0x5 ^ (0x3C ^ 0x19));
        ItemShopCommand.ll[24] = (40 + 37 - 63 + 139 ^ 32 + 45 + 16 + 36);
    }
    
    private static boolean llIl(final int llIIlIlIlllllll) {
        return llIIlIlIlllllll == 0;
    }
    
    static {
        IlIl();
        lIIl();
        PREFIX = Main.getPlugin().getConfig().getString(ItemShopCommand.Il[ItemShopCommand.ll[18]]);
        NO_PERM = Main.getPlugin().getConfig().getString(ItemShopCommand.Il[ItemShopCommand.ll[19]]);
        WRONG_ARGS = Main.getPlugin().getConfig().getString(ItemShopCommand.Il[ItemShopCommand.ll[20]]);
        OFFLINE_PLAYER = Main.getPlugin().getConfig().getString(ItemShopCommand.Il[ItemShopCommand.ll[21]]);
        COMMAND_USAGE = Main.getPlugin().getConfig().getString(ItemShopCommand.Il[ItemShopCommand.ll[22]]);
        NOT_FIND_RANK = Main.getPlugin().getConfig().getString(ItemShopCommand.Il[ItemShopCommand.ll[23]]);
    }
}
