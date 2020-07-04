package net.openid.appauth;

import android.util.Base64;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.regex.Pattern;
import net.openid.appauth.p1889c.C48254a;

/* renamed from: net.openid.appauth.k */
public final class C48271k {

    /* renamed from: a */
    private static final Pattern f123305a = Pattern.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    /* renamed from: a */
    public static String m149761a() {
        return m149762a(new SecureRandom(), 64);
    }

    /* renamed from: b */
    public static String m149764b() {
        try {
            MessageDigest.getInstance("SHA-256");
            return "S256";
        } catch (NoSuchAlgorithmException unused) {
            return "plain";
        }
    }

    /* renamed from: a */
    public static void m149763a(String str) {
        boolean z;
        boolean z2 = false;
        if (43 <= str.length()) {
            z = true;
        } else {
            z = false;
        }
        C48280n.m149791a(z, (Object) "codeVerifier length is shorter than allowed by the PKCE specification");
        if (str.length() <= 128) {
            z2 = true;
        }
        C48280n.m149791a(z2, (Object) "codeVerifier length is longer than allowed by the PKCE specification");
        C48280n.m149791a(f123305a.matcher(str).matches(), (Object) "codeVerifier string contains illegal characters");
    }

    /* renamed from: b */
    public static String m149765b(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str.getBytes("ISO_8859_1"));
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException e) {
            C48254a.m149689c("SHA-256 is not supported on this device! Using plain challenge", e);
            return str;
        } catch (UnsupportedEncodingException e2) {
            C48254a.m149690d("ISO-8859-1 encoding not supported on this device!", e2);
            throw new IllegalStateException("ISO-8859-1 encoding not supported", e2);
        }
    }

    /* renamed from: a */
    private static String m149762a(SecureRandom secureRandom, int i) {
        C48280n.m149789a(secureRandom, (Object) "entropySource cannot be null");
        C48280n.m149791a(true, (Object) "entropyBytes is less than the minimum permitted");
        C48280n.m149791a(true, (Object) "entropyBytes is greater than the maximum permitted");
        byte[] bArr = new byte[64];
        secureRandom.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
