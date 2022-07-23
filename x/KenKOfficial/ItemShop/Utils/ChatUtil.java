package x.KenKOfficial.ItemShop.Utils;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ChatUtil
{
    private static final /* synthetic */ String[] Ill;
    private static final /* synthetic */ int[] lll;
    
    private static void llIll() {
        (lll = new int[9])[0] = ((0x4A ^ 0x2D ^ (0x3F ^ 0x4D)) & (0x2D ^ 0x7D ^ (0x29 ^ 0x6C) ^ -" ".length()));
        ChatUtil.lll[1] = " ".length();
        ChatUtil.lll[2] = "  ".length();
        ChatUtil.lll[3] = "   ".length();
        ChatUtil.lll[4] = (0x4F ^ 0x4B);
        ChatUtil.lll[5] = (0xAA ^ 0xAF);
        ChatUtil.lll[6] = (0xA1 ^ 0xA7);
        ChatUtil.lll[7] = (0x40 ^ 0x47);
        ChatUtil.lll[8] = (0x57 ^ 0x49 ^ (0x34 ^ 0x22));
    }
    
    private static boolean IIlll(final int llIIIlllIllllll, final int IlIIIlllIllllll) {
        return llIIIlllIllllll < IlIIIlllIllllll;
    }
    
    private static void IlIll() {
        (Ill = new String[ChatUtil.lll[8]])[ChatUtil.lll[0]] = IIIll("Vg==", "plWtg");
        ChatUtil.Ill[ChatUtil.lll[1]] = IIIll("w5A=", "wMFTT");
        ChatUtil.Ill[ChatUtil.lll[2]] = IIIll("f2c=", "AYWus");
        ChatUtil.Ill[ChatUtil.lll[3]] = lIIll("woi5276hnXc=", "eImxD");
        ChatUtil.Ill[ChatUtil.lll[4]] = IIIll("Tmk=", "rUETN");
        ChatUtil.Ill[ChatUtil.lll[5]] = lIIll("UTDMkorTKGc=", "XKLhI");
        ChatUtil.Ill[ChatUtil.lll[6]] = lIIll("txHwhWpHl7g=", "UwacG");
        ChatUtil.Ill[ChatUtil.lll[7]] = lIIll("7LHkVwsKubg=", "euYNd");
    }
    
    private static String IIIll(String llIlllllIllllll, final String llllllllIllllll) {
        llIlllllIllllll = new String(Base64.getDecoder().decode(llIlllllIllllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder IlllllllIllllll = new StringBuilder();
        final char[] lIllllllIllllll = llllllllIllllll.toCharArray();
        int IIllllllIllllll = ChatUtil.lll[0];
        final short IllIllllIllllll = (Object)llIlllllIllllll.toCharArray();
        final long lIlIllllIllllll = IllIllllIllllll.length;
        float IIlIllllIllllll = ChatUtil.lll[0];
        while (IIlll((int)IIlIllllIllllll, (int)lIlIllllIllllll)) {
            final char lIIIIIIIlllllll = IllIllllIllllll[IIlIllllIllllll];
            IlllllllIllllll.append((char)(lIIIIIIIlllllll ^ lIllllllIllllll[IIllllllIllllll % lIllllllIllllll.length]));
            "".length();
            ++IIllllllIllllll;
            ++IIlIllllIllllll;
            "".length();
            if (-" ".length() > -" ".length()) {
                return null;
            }
        }
        return String.valueOf(IlllllllIllllll);
    }
    
    private static String lIIll(final String lIIlIlllIllllll, final String IIIlIlllIllllll) {
        try {
            final SecretKeySpec IlllIlllIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(IIIlIlllIllllll.getBytes(StandardCharsets.UTF_8)), ChatUtil.lll[8]), "DES");
            final Cipher lIllIlllIllllll = Cipher.getInstance("DES");
            lIllIlllIllllll.init(ChatUtil.lll[2], IlllIlllIllllll);
            return new String(lIllIlllIllllll.doFinal(Base64.getDecoder().decode(lIIlIlllIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception IIllIlllIllllll) {
            IIllIlllIllllll.printStackTrace();
            return null;
        }
    }
    
    public static String fixColor(final String IIllIIIIlllllll) {
        return IIllIIIIlllllll.replaceAll(ChatUtil.Ill[ChatUtil.lll[0]], ChatUtil.Ill[ChatUtil.lll[1]]).replace(ChatUtil.Ill[ChatUtil.lll[2]], ChatUtil.Ill[ChatUtil.lll[3]]).replace(ChatUtil.Ill[ChatUtil.lll[4]], ChatUtil.Ill[ChatUtil.lll[5]]).replace(ChatUtil.Ill[ChatUtil.lll[6]], ChatUtil.Ill[ChatUtil.lll[7]]);
    }
    
    static {
        llIll();
        IlIll();
    }
}
