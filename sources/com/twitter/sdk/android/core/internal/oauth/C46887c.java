package com.twitter.sdk.android.core.internal.oauth;

import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterAuthToken;
import com.twitter.sdk.android.core.internal.p1845a.C46858f;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okio.ByteString;

/* renamed from: com.twitter.sdk.android.core.internal.oauth.c */
final class C46887c {

    /* renamed from: a */
    private static final SecureRandom f120222a = new SecureRandom();

    /* renamed from: b */
    private final TwitterAuthConfig f120223b;

    /* renamed from: c */
    private final TwitterAuthToken f120224c;

    /* renamed from: d */
    private final String f120225d;

    /* renamed from: e */
    private final String f120226e;

    /* renamed from: f */
    private final String f120227f;

    /* renamed from: g */
    private final Map<String, String> f120228g;

    /* renamed from: c */
    private static String m146666c() {
        return Long.toString(System.currentTimeMillis() / 1000);
    }

    /* renamed from: b */
    private static String m146665b() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(System.nanoTime()));
        sb.append(String.valueOf(Math.abs(f120222a.nextLong())));
        return sb.toString();
    }

    /* renamed from: d */
    private String m146667d() {
        String str;
        if (this.f120224c != null) {
            str = this.f120224c.f120107c;
        } else {
            str = null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C46858f.m146567a(this.f120223b.f120105b));
        sb.append('&');
        sb.append(C46858f.m146567a(str));
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo118004a() {
        String b = m146665b();
        String c = m146666c();
        return m146662a(b, c, m146660a(m146661a(b, c)));
    }

    /* renamed from: a */
    private String m146660a(String str) {
        try {
            String d = m146667d();
            byte[] bytes = str.getBytes("UTF8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(d.getBytes("UTF8"), "HmacSHA1");
            Mac instance = Mac.getInstance("HmacSHA1");
            instance.init(secretKeySpec);
            byte[] doFinal = instance.doFinal(bytes);
            return ByteString.m23796of(doFinal, 0, doFinal.length).base64();
        } catch (InvalidKeyException unused) {
            return "";
        } catch (NoSuchAlgorithmException unused2) {
            return "";
        } catch (UnsupportedEncodingException unused3) {
            return "";
        }
    }

    /* renamed from: a */
    private static String m146663a(TreeMap<String, String> treeMap) {
        StringBuilder sb = new StringBuilder();
        int size = treeMap.size();
        int i = 0;
        for (Entry entry : treeMap.entrySet()) {
            sb.append(C46858f.m146570b(C46858f.m146570b((String) entry.getKey())));
            sb.append("%3D");
            sb.append(C46858f.m146570b(C46858f.m146570b((String) entry.getValue())));
            i++;
            if (i < size) {
                sb.append("%26");
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    private String m146661a(String str, String str2) {
        URI create = URI.create(this.f120227f);
        TreeMap a = C46858f.m146569a(create, true);
        if (this.f120228g != null) {
            a.putAll(this.f120228g);
        }
        if (this.f120225d != null) {
            a.put("oauth_callback", this.f120225d);
        }
        a.put("oauth_consumer_key", this.f120223b.f120104a);
        a.put("oauth_nonce", str);
        a.put("oauth_signature_method", "HMAC-SHA1");
        a.put("oauth_timestamp", str2);
        if (!(this.f120224c == null || this.f120224c.f120106b == null)) {
            a.put("oauth_token", this.f120224c.f120106b);
        }
        a.put("oauth_version", "1.0");
        StringBuilder sb = new StringBuilder();
        sb.append(create.getScheme());
        sb.append("://");
        sb.append(create.getHost());
        sb.append(create.getPath());
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f120226e.toUpperCase(Locale.ENGLISH));
        sb3.append('&');
        sb3.append(C46858f.m146570b(sb2));
        sb3.append('&');
        sb3.append(m146663a(a));
        return sb3.toString();
    }

    /* renamed from: a */
    private static void m146664a(StringBuilder sb, String str, String str2) {
        if (str2 != null) {
            sb.append(' ');
            sb.append(C46858f.m146570b(str));
            sb.append("=\"");
            sb.append(C46858f.m146570b(str2));
            sb.append("\",");
        }
    }

    /* renamed from: a */
    private String m146662a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder("OAuth");
        m146664a(sb, "oauth_callback", this.f120225d);
        m146664a(sb, "oauth_consumer_key", this.f120223b.f120104a);
        m146664a(sb, "oauth_nonce", str);
        m146664a(sb, "oauth_signature", str3);
        m146664a(sb, "oauth_signature_method", "HMAC-SHA1");
        m146664a(sb, "oauth_timestamp", str2);
        if (this.f120224c != null) {
            str4 = this.f120224c.f120106b;
        } else {
            str4 = null;
        }
        m146664a(sb, "oauth_token", str4);
        m146664a(sb, "oauth_version", "1.0");
        return sb.substring(0, sb.length() - 1);
    }

    C46887c(TwitterAuthConfig twitterAuthConfig, TwitterAuthToken twitterAuthToken, String str, String str2, String str3, Map<String, String> map) {
        this.f120223b = twitterAuthConfig;
        this.f120224c = twitterAuthToken;
        this.f120225d = str;
        this.f120226e = str2;
        this.f120227f = str3;
        this.f120228g = map;
    }
}
