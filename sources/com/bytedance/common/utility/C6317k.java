package com.bytedance.common.utility;

import android.util.Pair;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.common.utility.k */
public abstract class C6317k {

    /* renamed from: a */
    private static C6317k f18551a = new C9728d();

    /* renamed from: com.bytedance.common.utility.k$a */
    public static class C6318a {

        /* renamed from: a */
        public boolean f18552a;
    }

    /* renamed from: a */
    public static C6317k m19580a() {
        return f18551a;
    }

    /* renamed from: a */
    public abstract String mo15152a(String str, List<Pair<String, String>> list, Map<String, String> map, C6318a aVar) throws CommonHttpException;

    /* renamed from: a */
    public abstract String mo15153a(String str, Map<String, String> map, C6318a aVar) throws Exception;

    /* renamed from: a */
    public abstract String mo15154a(String str, byte[] bArr, Map<String, String> map, C6318a aVar) throws CommonHttpException;

    /* renamed from: a */
    public static void m19581a(C6317k kVar) {
        if (kVar != null && kVar != f18551a) {
            f18551a = kVar;
        }
    }

    /* renamed from: a */
    public final String mo15150a(String str) throws Exception {
        C6318a aVar = new C6318a();
        aVar.f18552a = true;
        return mo15153a(str, null, aVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m19582a(byte[] r3) throws java.lang.Exception {
        /*
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ all -> 0x001b }
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r2)     // Catch:{ all -> 0x001b }
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x001b }
            r2.<init>(r1)     // Catch:{ all -> 0x001b }
            r2.write(r3)     // Catch:{ all -> 0x0018 }
            r2.close()     // Catch:{ all -> 0x0018 }
            byte[] r3 = r1.toByteArray()     // Catch:{ all -> 0x001b }
            return r3
        L_0x0018:
            r3 = move-exception
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r3 = move-exception
        L_0x001c:
            if (r0 == 0) goto L_0x0021
            r0.close()
        L_0x0021:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.C6317k.m19582a(byte[]):byte[]");
    }

    /* renamed from: a */
    public final String mo15151a(String str, List<Pair<String, String>> list) throws CommonHttpException {
        C6318a aVar = new C6318a();
        aVar.f18552a = true;
        return mo15152a(str, list, null, aVar);
    }

    /* renamed from: a */
    public final String mo15155a(String str, byte[] bArr, boolean z, String str2, boolean z2) throws CommonHttpException {
        HashMap hashMap = new HashMap();
        if (z) {
            try {
                bArr = m19582a(bArr);
                hashMap.put("Content-Encoding", "gzip");
            } catch (Exception e) {
                throw new CommonHttpException(0, e.getMessage());
            }
        }
        if (!C6319n.m19593a(str2)) {
            hashMap.put("Content-Type", str2);
        }
        C6318a aVar = new C6318a();
        aVar.f18552a = z2;
        return mo15154a(str, bArr, (Map<String, String>) hashMap, aVar);
    }
}
