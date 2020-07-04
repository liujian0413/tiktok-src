package shark.internal;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: shark.internal.m */
public final class C48807m {

    /* renamed from: a */
    public static final Charset f124068a;

    static {
        Charset forName = Charset.forName("UTF-8");
        C7573i.m23582a((Object) forName, "Charset.forName(\"UTF-8\")");
        f124068a = forName;
    }

    /* renamed from: a */
    public static final String m150709a(String str) {
        C7573i.m23587b(str, "$this$createSHA1Hash");
        return m150711a(str, "SHA-1");
    }

    /* renamed from: b */
    private static byte[] m150712b(String str) {
        C7573i.m23587b(str, "$this$getBytes");
        byte[] bytes = str.getBytes(f124068a);
        C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    /* renamed from: a */
    public static final String m150710a(String str, char c) {
        C7573i.m23587b(str, "$this$lastSegment");
        int b = C7634n.m23757b((CharSequence) str, '.', C7634n.m23780f(str), false);
        if (b == -1) {
            return str;
        }
        String substring = str.substring(b + 1);
        C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* renamed from: a */
    private static final String m150711a(String str, String str2) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(m150712b(str));
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString(b & 255));
            }
            String sb2 = sb.toString();
            C7573i.m23582a((Object) sb2, "hexString.toString()");
            return sb2;
        } catch (NoSuchAlgorithmException unused) {
            StringBuilder sb3 = new StringBuilder("Unable to construct MessageDigest for ");
            sb3.append(str2);
            throw new AssertionError(sb3.toString());
        }
    }
}
