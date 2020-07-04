package com.p280ss.android.ugc.effectmanager;

import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.model.ModelInfo;
import com.p280ss.android.ugc.effectmanager.network.C43859a;
import java.io.InputStream;

/* renamed from: com.ss.android.ugc.effectmanager.n */
public final class C43858n {

    /* renamed from: a */
    private C43831f f113628a;

    /* renamed from: b */
    private C43859a f113629b;

    public C43858n(C43831f fVar, C43859a aVar) {
        this.f113628a = fVar;
        this.f113629b = aVar;
    }

    /* renamed from: b */
    private InputStream m138919b(ModelInfo modelInfo, FetchModelType fetchModelType) {
        String str = (String) modelInfo.getFile_url().getUrl(fetchModelType).get(0);
        try {
            return this.f113629b.mo106116a(new C43707b("GET", str));
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("download model: with type ");
            sb.append(fetchModelType);
            sb.append(", with url ");
            sb.append(str);
            sb.append(" failed ");
            sb.append(e.getMessage());
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|(2:36|37)|38|39) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:38:0x00a4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo106113a(com.p280ss.android.ugc.effectmanager.model.ModelInfo r10, com.p280ss.android.ugc.effectmanager.FetchModelType r11) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.ss.android.ugc.effectmanager.model.ExtendedUrlModel r0 = r10.getFile_url()     // Catch:{ all -> 0x00a5 }
            java.util.List r1 = r0.getUrlList()     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0015
            java.util.List r1 = r0.getUrlList()     // Catch:{ all -> 0x00a5 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0017
        L_0x0015:
            com.ss.android.ugc.effectmanager.FetchModelType r11 = com.p280ss.android.ugc.effectmanager.FetchModelType.ZIP     // Catch:{ all -> 0x00a5 }
        L_0x0017:
            java.util.List r1 = r0.getZipUrlList()     // Catch:{ all -> 0x00a5 }
            if (r1 == 0) goto L_0x0027
            java.util.List r0 = r0.getZipUrlList()     // Catch:{ all -> 0x00a5 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00a5 }
            if (r0 == 0) goto L_0x0029
        L_0x0027:
            com.ss.android.ugc.effectmanager.FetchModelType r11 = com.p280ss.android.ugc.effectmanager.FetchModelType.ORIGIN     // Catch:{ all -> 0x00a5 }
        L_0x0029:
            java.lang.String r6 = com.p280ss.android.ugc.effectmanager.common.C43723d.m138563a(r10)     // Catch:{ all -> 0x00a5 }
            java.io.InputStream r7 = r9.m138919b(r10, r11)     // Catch:{ all -> 0x00a5 }
            com.ss.android.ugc.effectmanager.f r0 = r9.f113628a     // Catch:{ all -> 0x00a5 }
            java.lang.String r1 = r10.getName()     // Catch:{ all -> 0x00a5 }
            java.util.ArrayList r8 = r0.mo105970b(r1)     // Catch:{ all -> 0x00a5 }
            com.ss.android.ugc.effectmanager.f r0 = r9.f113628a     // Catch:{ NoSuchAlgorithmException -> 0x0099, RuntimeException -> 0x0070 }
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r1)     // Catch:{ NoSuchAlgorithmException -> 0x0099, RuntimeException -> 0x0070 }
            com.ss.android.ugc.effectmanager.model.ExtendedUrlModel r10 = r10.getFile_url()     // Catch:{ NoSuchAlgorithmException -> 0x0099, RuntimeException -> 0x0070 }
            java.lang.String r5 = r10.getUri()     // Catch:{ NoSuchAlgorithmException -> 0x0099, RuntimeException -> 0x0070 }
            r1 = r11
            r2 = r6
            r3 = r7
            long r0 = r0.mo105968a(r1, r2, r3, r4, r5)     // Catch:{ NoSuchAlgorithmException -> 0x0099, RuntimeException -> 0x0070 }
            r10 = 0
            int r2 = r8.size()     // Catch:{ NoSuchAlgorithmException -> 0x0099, RuntimeException -> 0x0070 }
        L_0x0057:
            if (r10 >= r2) goto L_0x0067
            java.lang.Object r3 = r8.get(r10)     // Catch:{ NoSuchAlgorithmException -> 0x0099, RuntimeException -> 0x0070 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ NoSuchAlgorithmException -> 0x0099, RuntimeException -> 0x0070 }
            com.ss.android.ugc.effectmanager.f r4 = r9.f113628a     // Catch:{ Exception -> 0x0064 }
            r4.mo105971c(r3)     // Catch:{ Exception -> 0x0064 }
        L_0x0064:
            int r10 = r10 + 1
            goto L_0x0057
        L_0x0067:
            if (r7 == 0) goto L_0x006c
            r7.close()     // Catch:{ IOException -> 0x006c }
        L_0x006c:
            monitor-exit(r9)
            return r0
        L_0x006e:
            r10 = move-exception
            goto L_0x009f
        L_0x0070:
            r10 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x006e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006e }
            java.lang.String r2 = "convertStreamToFile: with type: "
            r1.<init>(r2)     // Catch:{ all -> 0x006e }
            r1.append(r11)     // Catch:{ all -> 0x006e }
            java.lang.String r11 = ",with name: "
            r1.append(r11)     // Catch:{ all -> 0x006e }
            r1.append(r6)     // Catch:{ all -> 0x006e }
            java.lang.String r11 = " failed. "
            r1.append(r11)     // Catch:{ all -> 0x006e }
            java.lang.String r11 = r10.getMessage()     // Catch:{ all -> 0x006e }
            r1.append(r11)     // Catch:{ all -> 0x006e }
            java.lang.String r11 = r1.toString()     // Catch:{ all -> 0x006e }
            r0.<init>(r11, r10)     // Catch:{ all -> 0x006e }
            throw r0     // Catch:{ all -> 0x006e }
        L_0x0099:
            java.lang.AssertionError r10 = new java.lang.AssertionError     // Catch:{ all -> 0x006e }
            r10.<init>()     // Catch:{ all -> 0x006e }
            throw r10     // Catch:{ all -> 0x006e }
        L_0x009f:
            if (r7 == 0) goto L_0x00a4
            r7.close()     // Catch:{ IOException -> 0x00a4 }
        L_0x00a4:
            throw r10     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.C43858n.mo106113a(com.ss.android.ugc.effectmanager.model.ModelInfo, com.ss.android.ugc.effectmanager.FetchModelType):long");
    }
}
