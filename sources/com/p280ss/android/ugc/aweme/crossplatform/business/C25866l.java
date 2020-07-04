package com.p280ss.android.ugc.aweme.crossplatform.business;

import android.util.Base64;
import com.google.gson.C6711m;
import java.nio.charset.Charset;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C48038d;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.l */
public final class C25866l {

    /* renamed from: a */
    public static final C25866l f68402a = new C25866l();

    /* renamed from: b */
    private static volatile AtomicInteger f68403b = new AtomicInteger(0);

    private C25866l() {
    }

    /* renamed from: a */
    public static AtomicInteger m85101a() {
        return f68403b;
    }

    /* renamed from: b */
    private static String m85104b() {
        CharSequence subSequence = "PodsmmNttCSojTyx".subSequence(0, 4);
        StringBuilder sb = new StringBuilder();
        String substring = "PodsmmNttCSojTyx".substring(4);
        C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
        sb.append(substring);
        sb.append(subSequence);
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo67238a(C6711m mVar) {
        C7573i.m23587b(mVar, "dataObj");
        try {
            byte[] a = m85102a(mVar.toString(), "UTF-8");
            if (a == null) {
                return null;
            }
            String b = m85104b();
            Charset charset = C48038d.f122880a;
            if (b != null) {
                byte[] bytes = b.getBytes(charset);
                C7573i.m23582a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                byte[] a2 = m85103a(bytes, a);
                if (a2 == null) {
                    return null;
                }
                return Base64.encodeToString(a2, 0);
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static byte[] m85103a(byte[] bArr, byte[] bArr2) throws Exception {
        C7573i.m23587b(bArr, "key");
        C7573i.m23587b(bArr2, "clear");
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        Cipher instance = Cipher.getInstance("AES/ECB/PKCS7Padding");
        instance.init(1, secretKeySpec);
        return instance.doFinal(bArr2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0051  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m85102a(java.lang.String r4, java.lang.String r5) {
        /*
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L_0x000e
            int r0 = r0.length()
            if (r0 != 0) goto L_0x000c
            goto L_0x000e
        L_0x000c:
            r0 = 0
            goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            r1 = 0
            if (r0 == 0) goto L_0x0013
            return r1
        L_0x0013:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x004f, all -> 0x0047 }
            r3 = r0
            java.io.OutputStream r3 = (java.io.OutputStream) r3     // Catch:{ IOException -> 0x004f, all -> 0x0047 }
            r2.<init>(r3)     // Catch:{ IOException -> 0x004f, all -> 0x0047 }
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            java.lang.String r1 = "Charset.forName(charsetName)"
            kotlin.jvm.internal.C7573i.m23582a(r5, r1)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            if (r4 == 0) goto L_0x003b
            byte[] r4 = r4.getBytes(r5)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            java.lang.String r5 = "(this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r2.write(r4)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            r2.close()
            goto L_0x0054
        L_0x003b:
            kotlin.TypeCastException r4 = new kotlin.TypeCastException     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            java.lang.String r5 = "null cannot be cast to non-null type java.lang.String"
            r4.<init>(r5)     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
            throw r4     // Catch:{ IOException -> 0x0045, all -> 0x0043 }
        L_0x0043:
            r4 = move-exception
            goto L_0x0049
        L_0x0045:
            r1 = r2
            goto L_0x004f
        L_0x0047:
            r4 = move-exception
            r2 = r1
        L_0x0049:
            if (r2 == 0) goto L_0x004e
            r2.close()
        L_0x004e:
            throw r4
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()
        L_0x0054:
            byte[] r4 = r0.toByteArray()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.business.C25866l.m85102a(java.lang.String, java.lang.String):byte[]");
    }
}
