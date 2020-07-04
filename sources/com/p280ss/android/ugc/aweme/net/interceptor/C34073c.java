package com.p280ss.android.ugc.aweme.net.interceptor;

import okhttp3.Interceptor;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.c */
public final class C34073c implements Interceptor {
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.Response intercept(okhttp3.Interceptor.Chain r17) throws java.io.IOException {
        /*
            r16 = this;
            okhttp3.Request r0 = r17.request()
            okhttp3.HttpUrl r1 = r0.url
            java.lang.String r1 = r1.toString()
            long r10 = java.lang.System.currentTimeMillis()
            r12 = 0
            r14 = 0
            r2 = r17
            okhttp3.Response r15 = r2.proceed(r0)     // Catch:{ Exception -> 0x004d }
            if (r15 == 0) goto L_0x003f
            int r0 = r15.code     // Catch:{ Exception -> 0x003b }
            r2 = 200(0xc8, float:2.8E-43)
            if (r0 != r2) goto L_0x003f
            java.lang.String r0 = "X-TT-LOGID"
            java.lang.String r9 = r15.header(r0)     // Catch:{ Exception -> 0x003b }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0038 }
            r0 = 0
            long r12 = r2 - r10
            com.p280ss.android.common.util.NetworkUtils.handleApiOk(r1, r12, r14)     // Catch:{ Exception -> 0x0038 }
            r8 = 0
            r2 = r12
            r4 = r10
            r6 = r1
            r7 = r9
            com.p280ss.android.common.util.NetworkUtils.monitorApiSample(r2, r4, r6, r7, r8)     // Catch:{ Exception -> 0x0038 }
            goto L_0x004c
        L_0x0038:
            r0 = move-exception
            r2 = r12
            goto L_0x0051
        L_0x003b:
            r0 = move-exception
            r2 = r12
            r9 = r14
            goto L_0x0051
        L_0x003f:
            com.p280ss.android.common.util.NetworkUtils.handleApiError(r1, r14, r12, r14)     // Catch:{ Exception -> 0x003b }
            r2 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r4 = r10
            r6 = r1
            com.p280ss.android.common.util.NetworkUtils.monitorApiError(r2, r4, r6, r7, r8, r9)     // Catch:{ Exception -> 0x003b }
        L_0x004c:
            return r15
        L_0x004d:
            r0 = move-exception
            r2 = r12
            r9 = r14
            r15 = r9
        L_0x0051:
            boolean r4 = r0 instanceof com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException
            if (r4 != 0) goto L_0x006b
            if (r15 == 0) goto L_0x005f
            java.lang.String r4 = "X-TT-LOGID"
            java.lang.String r4 = r15.header(r4)
            r7 = r4
            goto L_0x0060
        L_0x005f:
            r7 = r9
        L_0x0060:
            com.p280ss.android.common.util.NetworkUtils.handleApiError(r1, r14, r2, r14)
            r8 = 0
            r9 = 0
            r4 = r10
            r6 = r1
            com.p280ss.android.common.util.NetworkUtils.monitorApiError(r2, r4, r6, r7, r8, r9)
            throw r0
        L_0x006b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.net.interceptor.C34073c.intercept(okhttp3.Interceptor$Chain):okhttp3.Response");
    }
}
