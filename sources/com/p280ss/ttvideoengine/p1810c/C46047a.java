package com.p280ss.ttvideoengine.p1810c;

import com.C1642a;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TimeZone;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ss.ttvideoengine.c.a */
public final class C46047a {

    /* renamed from: a */
    protected static final char[] f117631a = "0123456789ABCDEF".toCharArray();

    /* renamed from: b */
    private static Mac f117632b = null;

    /* renamed from: c */
    private static MessageDigest f117633c = null;

    /* renamed from: d */
    private static String f117634d = "HmacSHA256";

    /* renamed from: e */
    private String f117635e;

    /* renamed from: f */
    private String f117636f;

    /* renamed from: g */
    private String f117637g;

    /* renamed from: h */
    private String f117638h;

    /* renamed from: i */
    private String f117639i;

    /* renamed from: j */
    private String f117640j;

    /* renamed from: k */
    private TreeMap<String, String> f117641k;

    /* renamed from: l */
    private TreeMap<String, String> f117642l;

    /* renamed from: m */
    private boolean f117643m;

    /* renamed from: n */
    private String f117644n;

    /* renamed from: o */
    private boolean f117645o;

    /* renamed from: p */
    private final String f117646p;

    /* renamed from: q */
    private final String f117647q;

    /* renamed from: r */
    private final String f117648r;

    /* renamed from: s */
    private String f117649s;

    /* renamed from: t */
    private String f117650t;

    /* renamed from: u */
    private String f117651u;

    /* renamed from: com.ss.ttvideoengine.c.a$a */
    public static class C46049a {

        /* renamed from: a */
        public String f117652a;

        /* renamed from: b */
        public String f117653b;

        /* renamed from: c */
        public String f117654c;

        /* renamed from: d */
        public String f117655d;

        /* renamed from: e */
        public String f117656e;

        /* renamed from: f */
        public String f117657f;

        /* renamed from: g */
        public TreeMap<String, String> f117658g;

        /* renamed from: h */
        public TreeMap<String, String> f117659h;

        /* renamed from: i */
        public String f117660i;

        /* renamed from: j */
        public boolean f117661j;

        /* renamed from: a */
        public final C46049a mo112134a() {
            this.f117661j = true;
            return this;
        }

        /* renamed from: b */
        public final C46047a mo112139b() {
            return new C46047a(this);
        }

        /* renamed from: b */
        public final C46049a mo112137b(String str) {
            this.f117655d = str;
            return this;
        }

        /* renamed from: c */
        public final C46049a mo112140c(String str) {
            this.f117656e = str;
            return this;
        }

        /* renamed from: d */
        public final C46049a mo112141d(String str) {
            this.f117657f = str;
            return this;
        }

        /* renamed from: e */
        public final C46049a mo112142e(String str) {
            this.f117660i = str;
            return this;
        }

        /* renamed from: a */
        public final C46049a mo112135a(String str) {
            this.f117654c = str;
            return this;
        }

        /* renamed from: b */
        public final C46049a mo112138b(TreeMap<String, String> treeMap) {
            this.f117659h = treeMap;
            return this;
        }

        /* renamed from: a */
        public final C46049a mo112136a(TreeMap<String, String> treeMap) {
            this.f117658g = treeMap;
            return this;
        }

        public C46049a(String str, String str2) {
            this.f117652a = str;
            this.f117653b = str2;
        }
    }

    private C46047a() {
        this.f117646p = "AWS4-HMAC-SHA256";
        this.f117647q = "aws4_request";
        this.f117648r = "x-amz-date";
    }

    static {
        try {
            f117632b = Mac.getInstance(f117634d);
            f117633c = MessageDigest.getInstance("SHA-256");
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    /* renamed from: c */
    private static String m144262c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    /* renamed from: d */
    private String m144264d() {
        if (this.f117642l != null && !this.f117642l.isEmpty()) {
            for (Entry entry : this.f117642l.entrySet()) {
                if (((String) entry.getKey()).toLowerCase().equals("x-amz-date")) {
                    return (String) entry.getValue();
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private String m144260b() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("");
        sb.append(this.f117639i);
        sb.append("\n");
        if (this.f117640j == null || this.f117640j.trim().isEmpty()) {
            str = "/";
        } else {
            str = this.f117640j;
        }
        this.f117640j = str;
        sb.append(this.f117640j);
        sb.append("\n");
        StringBuilder sb2 = new StringBuilder("");
        if (this.f117641k == null || this.f117641k.isEmpty()) {
            sb2.append("\n");
        } else {
            for (Entry entry : this.f117641k.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                sb2.append(str3);
                sb2.append("=");
                sb2.append(m144267f(str4));
                sb2.append("&");
            }
            sb2.deleteCharAt(sb2.lastIndexOf("&"));
            sb2.append("\n");
        }
        sb.append(sb2);
        StringBuilder sb3 = new StringBuilder("");
        if (this.f117642l == null || this.f117642l.isEmpty()) {
            sb.append("\n");
        } else {
            TreeMap treeMap = new TreeMap();
            for (Entry entry2 : this.f117642l.entrySet()) {
                treeMap.put(((String) entry2.getKey()).toLowerCase(), ((String) entry2.getValue()).trim());
            }
            for (Entry entry3 : treeMap.entrySet()) {
                String lowerCase = ((String) entry3.getKey()).toLowerCase();
                String trim = ((String) entry3.getValue()).trim();
                sb3.append(lowerCase);
                sb3.append(";");
                sb.append(lowerCase);
                sb.append(":");
                sb.append(trim);
                sb.append("\n");
            }
            sb.append("\n");
        }
        this.f117649s = sb3.substring(0, sb3.length() - 1);
        sb.append(this.f117649s);
        sb.append("\n");
        if (this.f117644n == null) {
            str2 = "";
        } else {
            str2 = this.f117644n;
        }
        this.f117644n = str2;
        sb.append(m144265d(this.f117644n));
        if (this.f117645o) {
            PrintStream printStream = System.out;
            StringBuilder sb4 = new StringBuilder("##Canonical Request:\n");
            sb4.append(sb.toString());
            printStream.println(sb4.toString());
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final Map<String, String> mo112133a() {
        String b = m144261b(m144256a(m144260b()));
        if (b != null) {
            HashMap hashMap = new HashMap(0);
            for (Entry entry : this.f117642l.entrySet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            hashMap.put("Authorization", m144263c(b));
            if (this.f117645o) {
                PrintStream printStream = System.out;
                StringBuilder sb = new StringBuilder("##Signature:\n");
                sb.append(b);
                printStream.println(sb.toString());
                System.out.println("##Header:");
                for (Entry entry2 : hashMap.entrySet()) {
                    PrintStream printStream2 = System.out;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append((String) entry2.getKey());
                    sb2.append(" = ");
                    sb2.append((String) entry2.getValue());
                    printStream2.println(sb2.toString());
                }
                System.out.println("================================");
            }
            return hashMap;
        }
        if (this.f117645o) {
            PrintStream printStream3 = System.out;
            StringBuilder sb3 = new StringBuilder("##Signature:\n");
            sb3.append(b);
            printStream3.println(sb3.toString());
        }
        return null;
    }

    /* renamed from: b */
    private String m144261b(String str) {
        try {
            return m144257a(m144259a(m144258a(this.f117636f, this.f117651u, this.f117637g, this.f117638h), str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    private static String m144266e(String str) {
        if (str == null || str.length() < 8) {
            return null;
        }
        return str.substring(0, 8);
    }

    /* renamed from: f */
    private static String m144267f(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8").replace("+", "%20").replace("*", "%2A").replace("%7E", "~");
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    private static String m144257a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr[i2] = f117631a[b >>> 4];
            cArr[i2 + 1] = f117631a[b & 15];
        }
        return new String(cArr).toLowerCase();
    }

    private C46047a(C46049a aVar) {
        this.f117646p = "AWS4-HMAC-SHA256";
        this.f117647q = "aws4_request";
        this.f117648r = "x-amz-date";
        this.f117635e = aVar.f117652a;
        this.f117636f = aVar.f117653b;
        this.f117637g = aVar.f117654c;
        this.f117638h = aVar.f117655d;
        this.f117639i = aVar.f117656e;
        this.f117640j = aVar.f117657f;
        this.f117641k = aVar.f117658g;
        this.f117642l = aVar.f117659h;
        this.f117644n = aVar.f117660i;
        this.f117645o = aVar.f117661j;
        if (this.f117642l == null) {
            this.f117642l = new TreeMap<>();
        }
        this.f117650t = m144264d();
        if (this.f117650t == null) {
            this.f117650t = m144262c();
            this.f117642l.put("x-amz-date", this.f117650t);
        } else {
            this.f117643m = true;
        }
        this.f117651u = m144266e(this.f117650t);
    }

    /* renamed from: a */
    private String m144256a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("AWS4-HMAC-SHA256\n");
        sb.append(this.f117650t);
        sb.append("\n");
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(sb2);
        sb3.append(this.f117651u);
        sb3.append("/");
        sb3.append(this.f117637g);
        sb3.append("/");
        sb3.append(this.f117638h);
        sb3.append("/aws4_request");
        sb3.append("\n");
        String sb4 = sb3.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb4);
        sb5.append(m144265d(str));
        String sb6 = sb5.toString();
        if (this.f117645o) {
            PrintStream printStream = System.out;
            StringBuilder sb7 = new StringBuilder("##String to sign:\n");
            sb7.append(sb6);
            printStream.println(sb7.toString());
        }
        return sb6;
    }

    /* renamed from: c */
    private String m144263c(String str) {
        StringBuilder sb = new StringBuilder("AWS4-HMAC-SHA256 Credential=");
        sb.append(this.f117635e);
        sb.append("/");
        sb.append(this.f117651u);
        sb.append("/");
        sb.append(this.f117637g);
        sb.append("/");
        sb.append(this.f117638h);
        sb.append("/aws4_request");
        sb.append(",SignedHeaders=");
        sb.append(this.f117649s);
        sb.append(",Signature=");
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    private static String m144265d(String str) {
        try {
            f117633c.update(str.getBytes("UTF-8"));
            return C1642a.m8034a("%064x", new Object[]{new BigInteger(1, f117633c.digest())});
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m144259a(byte[] bArr, String str) throws Exception {
        f117632b.init(new SecretKeySpec(bArr, f117634d));
        return f117632b.doFinal(str.getBytes("UTF8"));
    }

    /* renamed from: a */
    private byte[] m144258a(String str, String str2, String str3, String str4) throws Exception {
        StringBuilder sb = new StringBuilder("AWS4");
        sb.append(str);
        return m144259a(m144259a(m144259a(m144259a(sb.toString().getBytes("UTF8"), str2), str3), str4), "aws4_request");
    }
}
