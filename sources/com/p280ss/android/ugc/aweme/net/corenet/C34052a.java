package com.p280ss.android.ugc.aweme.net.corenet;

import com.bytedance.ies.net.cronet.C10930c;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.iesdownload.p1745b.C44846a;
import com.p280ss.android.ugc.iesdownload.p1745b.C44847b;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.net.corenet.a */
public final class C34052a extends C10930c implements C44847b {

    /* renamed from: a */
    public static HashMap<String, C12466b<TypedInput>> f88815a = new HashMap<>();

    /* renamed from: b */
    public static HashMap<String, String> f88816b = new HashMap<>();

    /* renamed from: a */
    public static boolean m109655a(int i) {
        switch (i) {
            case C34943c.f91128x /*?: ONE_ARG  (wrap: void
  ?: SGET   com.ss.android.ugc.aweme.player.a.c.x int)*/:
            case 301:
            case 302:
            case 303:
            case 307:
            case 308:
                return true;
            default:
                return false;
        }
    }

    /* renamed from: a */
    public final void mo86738a(final String str, final HashMap<String, String> hashMap, final C44846a aVar) {
        C6726a.m20842a(new Runnable() {
            public final void run() {
                C34052a.this.mo86739b(str, hashMap, aVar);
            }
        });
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008f, code lost:
        if (r0 != false) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0091, code lost:
        com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a().mo24738d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0098, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a4, code lost:
        if (0 == 0) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        return;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86739b(final java.lang.String r10, final java.util.HashMap<java.lang.String, java.lang.String> r11, final com.p280ss.android.ugc.iesdownload.p1745b.C44846a r12) {
        /*
            r9 = this;
            boolean r0 = com.bytedance.common.utility.C6319n.m19593a(r10)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 0
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r5.<init>()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            android.util.Pair r1 = com.bytedance.frameworks.baselib.network.http.util.C10191k.m30270a(r10, r5)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.Object r2 = r1.first     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.Object r1 = r1.second     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r4 = r1
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            com.bytedance.ies.net.cronet.IIESNetworkApi r1 = r9.mo26345a(r2)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            if (r1 == 0) goto L_0x008f
            com.bytedance.frameworks.baselib.network.http.f$e r2 = com.bytedance.frameworks.baselib.network.http.C10142f.m30121d()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            if (r2 == 0) goto L_0x0034
            boolean r2 = r2.mo24810b(r10)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            if (r2 == 0) goto L_0x0034
            com.bytedance.frameworks.baselib.network.connectionclass.b r2 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r2.mo24737c()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r0 = 1
        L_0x0034:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r6.<init>()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            if (r11 == 0) goto L_0x006a
            int r2 = r11.size()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            if (r2 <= 0) goto L_0x006a
            java.util.Set r2 = r11.entrySet()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
        L_0x0049:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            if (r3 == 0) goto L_0x006a
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            com.bytedance.retrofit2.a.b r7 = new com.bytedance.retrofit2.a.b     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.Object r8 = r3.getKey()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r7.<init>(r8, r3)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r6.add(r7)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            goto L_0x0049
        L_0x006a:
            r2 = 1
            r3 = 104857600(0x6400000, float:3.6111186E-35)
            r7 = 0
            com.bytedance.retrofit2.b r1 = r1.downloadFile(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.util.HashMap<java.lang.String, java.lang.String> r2 = f88816b     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.Object r2 = r2.get(r10)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            if (r2 == 0) goto L_0x0082
            java.util.HashMap<java.lang.String, com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput>> r3 = f88815a     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r3.put(r2, r1)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            goto L_0x0087
        L_0x0082:
            java.util.HashMap<java.lang.String, com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput>> r2 = f88815a     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r2.put(r10, r1)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
        L_0x0087:
            com.ss.android.ugc.aweme.net.corenet.a$2 r2 = new com.ss.android.ugc.aweme.net.corenet.a$2     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r2.<init>(r10, r11, r12)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
            r1.enqueue(r2)     // Catch:{ Exception -> 0x00a4, all -> 0x0099 }
        L_0x008f:
            if (r0 == 0) goto L_0x00a7
        L_0x0091:
            com.bytedance.frameworks.baselib.network.connectionclass.b r10 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()
            r10.mo24738d()
            return
        L_0x0099:
            r10 = move-exception
            if (r0 == 0) goto L_0x00a3
            com.bytedance.frameworks.baselib.network.connectionclass.b r11 = com.bytedance.frameworks.baselib.network.connectionclass.C10084b.m29954a()
            r11.mo24738d()
        L_0x00a3:
            throw r10
        L_0x00a4:
            if (r0 == 0) goto L_0x00a7
            goto L_0x0091
        L_0x00a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.net.corenet.C34052a.mo86739b(java.lang.String, java.util.HashMap, com.ss.android.ugc.iesdownload.b.a):void");
    }
}
