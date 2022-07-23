package x.KenKOfficial.ItemShop.Basic;

import org.bukkit.command.CommandExecutor;
import x.KenKOfficial.ItemShop.Commands.ItemShopCommand;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.bukkit.plugin.Plugin;
import org.bukkit.event.Listener;
import x.KenKOfficial.ItemShop.Listeners.PlayerJoin;
import org.bukkit.Bukkit;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
    private static final /* synthetic */ int[] l;
    private static final /* synthetic */ String[] I;
    private static /* synthetic */ Main plugin;
    
    private static boolean lIl(final int IIllllIllllllll, final int llIlllIllllllll) {
        return IIllllIllllllll < llIlllIllllllll;
    }
    
    private static String l(String IIlIlIlllllllll, final String llIIlIlllllllll) {
        IIlIlIlllllllll = (Exception)new String(Base64.getDecoder().decode(((String)IIlIlIlllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllIlIlllllllll = new StringBuilder();
        final char[] IllIlIlllllllll = llIIlIlllllllll.toCharArray();
        int lIlIlIlllllllll = Main.l[0];
        final double llllIIlllllllll = (Object)((String)IIlIlIlllllllll).toCharArray();
        final boolean IlllIIlllllllll = llllIIlllllllll.length != 0;
        int lIllIIlllllllll = Main.l[0];
        while (lIl(lIllIIlllllllll, IlllIIlllllllll ? 1 : 0)) {
            final char IlIllIlllllllll = llllIIlllllllll[lIllIIlllllllll];
            lllIlIlllllllll.append((char)(IlIllIlllllllll ^ IllIlIlllllllll[lIlIlIlllllllll % IllIlIlllllllll.length]));
            "".length();
            ++lIlIlIlllllllll;
            ++lIllIIlllllllll;
            "".length();
            if ((0xEE ^ 0xC3 ^ (0xA3 ^ 0x8B)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllIlIlllllllll);
    }
    
    public void onDisable() {
        this.saveDefaultConfig();
        System.out.println(Main.I[Main.l[7]]);
        System.out.println(Main.I[Main.l[8]]);
        System.out.println(Main.I[Main.l[9]]);
        System.out.println(String.valueOf(new StringBuilder().append(Main.I[Main.l[10]]).append(Bukkit.getBukkitVersion())));
        System.out.println(Main.I[Main.l[11]]);
        System.out.println(Main.I[Main.l[12]]);
        System.out.println(Main.I[Main.l[13]]);
    }
    
    public void registerListeners() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.I[Main.l[16]]).append(this.getName())));
        Bukkit.getPluginManager().registerEvents((Listener)new PlayerJoin(), (Plugin)this);
    }
    
    private static void IIl() {
        (l = new int[18])[0] = ((0x5B ^ 0x64) & ~(0x1E ^ 0x21));
        Main.l[1] = " ".length();
        Main.l[2] = "  ".length();
        Main.l[3] = "   ".length();
        Main.l[4] = (146 + 22 - 83 + 105 ^ 153 + 177 - 243 + 99);
        Main.l[5] = (0xAC ^ 0xA9);
        Main.l[6] = (0x39 ^ 0x3F);
        Main.l[7] = (0xBB ^ 0xBC);
        Main.l[8] = (149 + 72 - 108 + 58 ^ 152 + 23 - 51 + 39);
        Main.l[9] = (0x6E ^ 0x67);
        Main.l[10] = (0x20 ^ 0x1F ^ (0x14 ^ 0x21));
        Main.l[11] = (0x65 ^ 0xE ^ (0xB ^ 0x6B));
        Main.l[12] = (0x27 ^ 0x2B);
        Main.l[13] = (0x32 ^ 0x12 ^ (0x9A ^ 0xB7));
        Main.l[14] = (0x3A ^ 0x7A ^ (0x60 ^ 0x2E));
        Main.l[15] = (0x3F ^ 0x30);
        Main.l[16] = (0x19 ^ 0x9);
        Main.l[17] = (0x54 ^ 0x45);
    }
    
    public static Main getPlugin() {
        return Main.plugin;
    }
    
    public void onEnable() {
        (Main.plugin = this).saveDefaultConfig();
        this.registerCommands();
        this.registerListeners();
        System.out.println(Main.I[Main.l[0]]);
        System.out.println(Main.I[Main.l[1]]);
        System.out.println(Main.I[Main.l[2]]);
        System.out.println(String.valueOf(new StringBuilder().append(Main.I[Main.l[3]]).append(Bukkit.getBukkitVersion())));
        System.out.println(Main.I[Main.l[4]]);
        System.out.println(Main.I[Main.l[5]]);
        System.out.println(Main.I[Main.l[6]]);
    }
    
    private static String Il(final String lllIIllllllllll, final String IllIIllllllllll) {
        try {
            final SecretKeySpec IIllIllllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(IllIIllllllllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llIlIllllllllll = Cipher.getInstance("Blowfish");
            llIlIllllllllll.init(Main.l[2], IIllIllllllllll);
            return new String(llIlIllllllllll.doFinal(Base64.getDecoder().decode(lllIIllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IlIlIllllllllll) {
            IlIlIllllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void ll() {
        (I = new String[Main.l[17]])[Main.l[0]] = I("KawNrKe2+C8prA2sp7b4LymsDayntvgvKawNrKe2+C8prA2sp7b4LymsDayntvgvKawNrKe2+C9lQiIxYUyYyg==", "xfDCy");
        Main.I[Main.l[1]] = l("CBkVIyIENx0eAx8i", "pRpMk");
        Main.I[Main.l[2]] = l("AQ8DGwg3UFFZTGZHMw0WNw==", "Vjqhb");
        Main.I[Main.l[3]] = l("AxAfFBMgCFQRDyYaHgdKFhwfDQMgU1Q=", "Titfj");
        Main.I[Main.l[4]] = l("FBohEi06BjQFI3Q=", "UqUkZ");
        Main.I[Main.l[5]] = Il("C4ygvwxfBtbjuCaKhUk2YCR6L4wRIiwHkQ5c/8bdSimEuQPA4UDsLLabubZ/jzFsHPT+xXbYiW8r4u1K7ShcwA==", "uCvZx");
        Main.I[Main.l[6]] = Il("6Rz42ZY7XyPpHPjZljtfI+kc+NmWO18j6Rz42ZY7XyPpHPjZljtfI+kc+NmWO18j6Rz42ZY7XyM88P7iQlv6fw==", "bQkFc");
        Main.I[Main.l[7]] = l("S0JtUERLQm1QREtCbVBES0JtUERLQm1QREtCbVBES0JtUERLQm1QREtCbVBES0JtUERLQm1QREtCbVA=", "haNsg");
        Main.I[Main.l[8]] = Il("lgFrq7prb9NXs9fn8bNzhg==", "jfpqO");
        Main.I[Main.l[9]] = l("BxAgICExT3JiZWBYEDY/MQ==", "PuRSK");
        Main.I[Main.l[10]] = Il("XEF/boTmA2ie+3JTPJ0pfkIA1ub2qweS", "eGywA");
        Main.I[Main.l[11]] = l("JyMbMgwXPxY8EAIoGHI=", "cFaSg");
        Main.I[Main.l[12]] = Il("GHTVFzLQF77Pf9e2v2FcjgUwDwHDvI7bl4a3y+UTbpD5Xbggn/siA/skBGuAI0si4Q7OcfMNWGp5Jh6pmCk3HA==", "efHCv");
        Main.I[Main.l[13]] = l("Sll6WmlKWXpaaUpZelppSll6WmlKWXpaaUpZelppSll6WmlKWXpaaUpZelppSll6WmlKWXpaaUpZelo=", "izYyJ");
        Main.I[Main.l[14]] = l("ChQrDjEnGyYEZi0aIgQoIlU1QTYqACgIKDNPbw==", "FuOaF");
        Main.I[Main.l[15]] = Il("9sJKQg/pSkmBGVCL5eeR1A==", "DajlU");
        Main.I[Main.l[16]] = Il("stA1x99nGQ/OZ4TZA9YGtOVroXBdhgYRaBe9w1jIrj4=", "zDemt");
    }
    
    private static String I(final String IIlIIIlllllllll, final String llIIIIlllllllll) {
        try {
            final SecretKeySpec lllIIIlllllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llIIIIlllllllll.getBytes(StandardCharsets.UTF_8)), Main.l[8]), "DES");
            final Cipher IllIIIlllllllll = Cipher.getInstance("DES");
            IllIIIlllllllll.init(Main.l[2], lllIIIlllllllll);
            return new String(IllIIIlllllllll.doFinal(Base64.getDecoder().decode(IIlIIIlllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lIlIIIlllllllll) {
            lIlIIIlllllllll.printStackTrace();
            return null;
        }
    }
    
    public void registerCommands() {
        this.getLogger().info(String.valueOf(new StringBuilder().append(Main.I[Main.l[14]]).append(this.getName())));
        this.getCommand(Main.I[Main.l[15]]).setExecutor((CommandExecutor)new ItemShopCommand());
    }
    
    static {
        IIl();
        ll();
    }
}
