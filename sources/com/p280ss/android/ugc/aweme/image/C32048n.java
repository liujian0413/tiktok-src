package com.p280ss.android.ugc.aweme.image;

import android.net.Uri;
import android.os.Looper;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.lighten.core.C12124e;
import com.bytedance.lighten.core.p612c.C12110h;
import com.facebook.net.C14123a;
import com.facebook.net.C14134d;
import java.io.IOException;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Request.Builder;

/* renamed from: com.ss.android.ugc.aweme.image.n */
public final class C32048n extends C32028a {

    /* renamed from: e */
    public volatile Call f83828e;

    /* renamed from: f */
    public volatile Request f83829f;

    /* renamed from: a */
    public final void mo29813a() {
        if (this.f83828e != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f83828e.cancel();
                return;
            }
            this.f83783a.execute(new Runnable() {
                public final void run() {
                    C32048n.this.f83828e.cancel();
                }
            });
        }
    }

    /* renamed from: a */
    private void m104062a(Request request) {
        this.f83828e = C14123a.m41710a().newCall(request);
    }

    /* renamed from: b */
    public final void mo29815b(final C12124e eVar, final C12110h hVar) {
        if (this.f83828e != null && eVar != null) {
            final Request request = this.f83828e.request();
            this.f83828e.enqueue(new Callback() {
                public final void onFailure(Call call, IOException iOException) {
                    C32048n.this.mo83017a(null, eVar, call, iOException, hVar);
                }

                /* JADX WARNING: Removed duplicated region for block: B:24:0x009b A[SYNTHETIC, Splitter:B:24:0x009b] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onResponse(okhttp3.Call r14, okhttp3.Response r15) throws java.io.IOException {
                    /*
                        r13 = this;
                        com.bytedance.lighten.core.e r0 = r4
                        long r1 = java.lang.System.currentTimeMillis()
                        r0.f32204b = r1
                        com.bytedance.lighten.core.e r0 = r4
                        long r1 = java.lang.System.currentTimeMillis()
                        r0.f32205c = r1
                        okhttp3.ResponseBody r0 = r15.body
                        boolean r1 = r15.isSuccessful()     // Catch:{ Exception -> 0x00ab }
                        if (r1 != 0) goto L_0x0046
                        com.ss.android.ugc.aweme.image.n r2 = com.p280ss.android.ugc.aweme.image.C32048n.this     // Catch:{ Exception -> 0x00ab }
                        com.bytedance.lighten.core.e r4 = r4     // Catch:{ Exception -> 0x00ab }
                        java.io.IOException r6 = new java.io.IOException     // Catch:{ Exception -> 0x00ab }
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ab }
                        java.lang.String r3 = "Unexpected HTTP code "
                        r1.<init>(r3)     // Catch:{ Exception -> 0x00ab }
                        r1.append(r15)     // Catch:{ Exception -> 0x00ab }
                        java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ab }
                        r6.<init>(r1)     // Catch:{ Exception -> 0x00ab }
                        com.bytedance.lighten.core.c.h r7 = r5     // Catch:{ Exception -> 0x00ab }
                        r3 = r15
                        r5 = r14
                        r2.mo83017a(r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x00ab }
                        if (r0 == 0) goto L_0x0045
                        r0.close()     // Catch:{ Exception -> 0x003c }
                        goto L_0x0045
                    L_0x003c:
                        r14 = move-exception
                        java.lang.String r15 = "OkHttpNetworkFetchProducer"
                        java.lang.String r0 = "Exception when closing response body"
                        com.facebook.common.p686c.C13286a.m38854b(r15, r0, r14)
                        return
                    L_0x0045:
                        return
                    L_0x0046:
                        com.ss.android.ugc.aweme.image.n r1 = com.p280ss.android.ugc.aweme.image.C32048n.this     // Catch:{ Exception -> 0x00ab }
                        com.ss.android.ugc.aweme.image.k r1 = r1.f83786d     // Catch:{ Exception -> 0x00ab }
                        java.io.InputStream r2 = r0.byteStream()     // Catch:{ Exception -> 0x00ab }
                        okhttp3.Request r3 = r15.request     // Catch:{ Exception -> 0x00ab }
                        okhttp3.HttpUrl r3 = r3.url     // Catch:{ Exception -> 0x00ab }
                        java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00ab }
                        long r4 = r0.contentLength()     // Catch:{ Exception -> 0x00ab }
                        android.util.Pair r1 = r1.mo83015a(r2, r3, r4)     // Catch:{ Exception -> 0x00ab }
                        java.lang.Object r2 = r1.second     // Catch:{ Exception -> 0x00ab }
                        java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ Exception -> 0x00ab }
                        long r2 = r2.longValue()     // Catch:{ Exception -> 0x00ab }
                        r4 = 0
                        int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                        if (r6 < 0) goto L_0x007d
                        com.bytedance.lighten.core.e r6 = r4     // Catch:{ Exception -> 0x00ab }
                        long r6 = r6.f32207e     // Catch:{ Exception -> 0x00ab }
                        int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                        if (r8 <= 0) goto L_0x007b
                        int r6 = r15.code     // Catch:{ Exception -> 0x00ab }
                        r7 = 206(0xce, float:2.89E-43)
                        if (r6 == r7) goto L_0x007b
                        goto L_0x007d
                    L_0x007b:
                        r9 = r2
                        goto L_0x007e
                    L_0x007d:
                        r9 = r4
                    L_0x007e:
                        com.bytedance.lighten.core.e r11 = r4     // Catch:{ Exception -> 0x00ab }
                        com.ss.android.ugc.aweme.image.o r12 = new com.ss.android.ugc.aweme.image.o     // Catch:{ Exception -> 0x00ab }
                        com.bytedance.lighten.core.e r4 = r4     // Catch:{ Exception -> 0x00ab }
                        okhttp3.Request r8 = r0     // Catch:{ Exception -> 0x00ab }
                        r2 = r12
                        r3 = r13
                        r5 = r15
                        r6 = r9
                        r2.<init>(r3, r4, r5, r6, r8)     // Catch:{ Exception -> 0x00ab }
                        r11.f32212j = r12     // Catch:{ Exception -> 0x00ab }
                        com.bytedance.lighten.core.c.h r2 = r5     // Catch:{ Exception -> 0x00ab }
                        java.lang.Object r1 = r1.first     // Catch:{ Exception -> 0x00ab }
                        java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ Exception -> 0x00ab }
                        int r3 = (int) r9     // Catch:{ Exception -> 0x00ab }
                        r2.mo29809a(r1, r3)     // Catch:{ Exception -> 0x00ab }
                        if (r0 == 0) goto L_0x00a8
                        r0.close()     // Catch:{ Exception -> 0x009f }
                        goto L_0x00a8
                    L_0x009f:
                        r14 = move-exception
                        java.lang.String r15 = "OkHttpNetworkFetchProducer"
                        java.lang.String r0 = "Exception when closing response body"
                        com.facebook.common.p686c.C13286a.m38854b(r15, r0, r14)
                        return
                    L_0x00a8:
                        return
                    L_0x00a9:
                        r14 = move-exception
                        goto L_0x00be
                    L_0x00ab:
                        r1 = move-exception
                        r6 = r1
                        com.ss.android.ugc.aweme.image.n r2 = com.p280ss.android.ugc.aweme.image.C32048n.this     // Catch:{ all -> 0x00a9 }
                        com.bytedance.lighten.core.e r4 = r4     // Catch:{ all -> 0x00a9 }
                        com.bytedance.lighten.core.c.h r7 = r5     // Catch:{ all -> 0x00a9 }
                        r3 = r15
                        r5 = r14
                        r2.mo83017a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a9 }
                        if (r0 == 0) goto L_0x00bd
                        r0.close()     // Catch:{ Exception -> 0x009f }
                    L_0x00bd:
                        return
                    L_0x00be:
                        if (r0 == 0) goto L_0x00cc
                        r0.close()     // Catch:{ Exception -> 0x00c4 }
                        goto L_0x00cc
                    L_0x00c4:
                        r15 = move-exception
                        java.lang.String r0 = "OkHttpNetworkFetchProducer"
                        java.lang.String r1 = "Exception when closing response body"
                        com.facebook.common.p686c.C13286a.m38854b(r0, r1, r15)
                    L_0x00cc:
                        throw r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32048n.C320491.onResponse(okhttp3.Call, okhttp3.Response):void");
                }

                /* access modifiers changed from: 0000 */
                /* JADX WARNING: Removed duplicated region for block: B:10:0x0039 A[Catch:{ JSONException -> 0x009a }] */
                /* JADX WARNING: Removed duplicated region for block: B:13:0x007d A[Catch:{ JSONException -> 0x009a }] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void mo83018a(com.bytedance.lighten.core.C12124e r25, okhttp3.Response r26, long r27, okhttp3.Request r29) {
                    /*
                        r24 = this;
                        r0 = r24
                        r1 = r25
                        r2 = r26
                        r3 = r27
                        long r5 = java.lang.System.currentTimeMillis()
                        r1.f32206d = r5
                        if (r2 == 0) goto L_0x0017
                        java.lang.String r5 = "x-snssdk.remoteaddr"
                        java.lang.String r5 = r2.header(r5)     // Catch:{ Exception -> 0x0017 }
                        goto L_0x0018
                    L_0x0017:
                        r5 = 0
                    L_0x0018:
                        org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
                        r14.<init>()     // Catch:{ JSONException -> 0x009a }
                        org.json.JSONObject r15 = new org.json.JSONObject     // Catch:{ JSONException -> 0x009a }
                        r15.<init>()     // Catch:{ JSONException -> 0x009a }
                        java.lang.String r6 = "image_size"
                        r14.put(r6, r3)     // Catch:{ JSONException -> 0x009a }
                        java.lang.String r6 = "image_size"
                        r15.put(r6, r3)     // Catch:{ JSONException -> 0x009a }
                        com.bytedance.ttnet.c.b r3 = new com.bytedance.ttnet.c.b     // Catch:{ JSONException -> 0x009a }
                        r3.<init>()     // Catch:{ JSONException -> 0x009a }
                        r3.f27498a = r5     // Catch:{ JSONException -> 0x009a }
                        com.ss.android.ugc.aweme.image.n r4 = com.p280ss.android.ugc.aweme.image.C32048n.this     // Catch:{ JSONException -> 0x009a }
                        com.ss.android.ugc.aweme.image.j r4 = r4.f83784b     // Catch:{ JSONException -> 0x009a }
                        if (r4 == 0) goto L_0x0055
                        com.ss.android.ugc.aweme.image.n r4 = com.p280ss.android.ugc.aweme.image.C32048n.this     // Catch:{ JSONException -> 0x009a }
                        com.ss.android.ugc.aweme.image.j r6 = r4.f83784b     // Catch:{ JSONException -> 0x009a }
                        long r4 = r1.f32206d     // Catch:{ JSONException -> 0x009a }
                        long r7 = r1.f32203a     // Catch:{ JSONException -> 0x009a }
                        r9 = 0
                        long r7 = r4 - r7
                        long r9 = r1.f32203a     // Catch:{ JSONException -> 0x009a }
                        com.ss.android.ugc.aweme.image.n r4 = com.p280ss.android.ugc.aweme.image.C32048n.this     // Catch:{ JSONException -> 0x009a }
                        okhttp3.Request r4 = r4.f83829f     // Catch:{ JSONException -> 0x009a }
                        okhttp3.HttpUrl r4 = r4.url     // Catch:{ JSONException -> 0x009a }
                        java.lang.String r11 = r4.toString()     // Catch:{ JSONException -> 0x009a }
                        r13 = 0
                        r12 = r3
                        r6.mo83009b(r7, r9, r11, r12, r13, r14)     // Catch:{ JSONException -> 0x009a }
                    L_0x0055:
                        com.facebook.net.g r4 = new com.facebook.net.g     // Catch:{ JSONException -> 0x009a }
                        r4.<init>()     // Catch:{ JSONException -> 0x009a }
                        r4.f37366b = r2     // Catch:{ JSONException -> 0x009a }
                        r5 = r29
                        okhttp3.HttpUrl r5 = r5.url     // Catch:{ JSONException -> 0x009a }
                        java.lang.String r5 = r5.toString()     // Catch:{ JSONException -> 0x009a }
                        r4.f37367c = r5     // Catch:{ JSONException -> 0x009a }
                        java.lang.String r5 = "http_status"
                        int r2 = r2.code     // Catch:{ JSONException -> 0x009a }
                        r15.put(r5, r2)     // Catch:{ JSONException -> 0x009a }
                        java.lang.String r2 = "requestId"
                        java.lang.String r5 = r1.f32208f     // Catch:{ JSONException -> 0x009a }
                        r15.put(r2, r5)     // Catch:{ JSONException -> 0x009a }
                        com.p280ss.android.ugc.aweme.image.C32048n.m104063a(r15, r1)     // Catch:{ JSONException -> 0x009a }
                        com.ss.android.ugc.aweme.image.n r2 = com.p280ss.android.ugc.aweme.image.C32048n.this     // Catch:{ JSONException -> 0x009a }
                        com.facebook.net.d r2 = r2.f83785c     // Catch:{ JSONException -> 0x009a }
                        if (r2 == 0) goto L_0x0099
                        com.ss.android.ugc.aweme.image.n r2 = com.p280ss.android.ugc.aweme.image.C32048n.this     // Catch:{ JSONException -> 0x009a }
                        com.facebook.net.d r2 = r2.f83785c     // Catch:{ JSONException -> 0x009a }
                        long r5 = r1.f32206d     // Catch:{ JSONException -> 0x009a }
                        long r7 = r1.f32203a     // Catch:{ JSONException -> 0x009a }
                        r9 = 0
                        long r16 = r5 - r7
                        long r5 = r1.f32203a     // Catch:{ JSONException -> 0x009a }
                        r22 = 0
                        r1 = r15
                        r15 = r2
                        r18 = r5
                        r20 = r4
                        r21 = r3
                        r23 = r1
                        r15.mo33892b(r16, r18, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x009a }
                    L_0x0099:
                        return
                    L_0x009a:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32048n.C320491.mo83018a(com.bytedance.lighten.core.e, okhttp3.Response, long, okhttp3.Request):void");
                }
            });
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[Catch:{ JSONException -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[Catch:{ JSONException -> 0x005e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m104063a(org.json.JSONObject r10, com.bytedance.lighten.core.C12124e r11) {
        /*
            long r0 = r11.f32204b     // Catch:{ JSONException -> 0x005e }
            r2 = -1
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x001d
            long r0 = r11.f32203a     // Catch:{ JSONException -> 0x005e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0011
            goto L_0x001d
        L_0x0011:
            java.lang.String r0 = "queue_time"
            long r6 = r11.f32204b     // Catch:{ JSONException -> 0x005e }
            long r8 = r11.f32203a     // Catch:{ JSONException -> 0x005e }
            r1 = 0
            long r6 = r6 - r8
            r10.put(r0, r6)     // Catch:{ JSONException -> 0x005e }
            goto L_0x0022
        L_0x001d:
            java.lang.String r0 = "queue_time"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x005e }
        L_0x0022:
            long r0 = r11.f32206d     // Catch:{ JSONException -> 0x005e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x003b
            long r0 = r11.f32204b     // Catch:{ JSONException -> 0x005e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            java.lang.String r0 = "fetch_time"
            long r6 = r11.f32206d     // Catch:{ JSONException -> 0x005e }
            long r8 = r11.f32204b     // Catch:{ JSONException -> 0x005e }
            r1 = 0
            long r6 = r6 - r8
            r10.put(r0, r6)     // Catch:{ JSONException -> 0x005e }
            goto L_0x0040
        L_0x003b:
            java.lang.String r0 = "fetch_time"
            r10.put(r0, r2)     // Catch:{ JSONException -> 0x005e }
        L_0x0040:
            long r0 = r11.f32206d     // Catch:{ JSONException -> 0x005e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0059
            long r0 = r11.f32203a     // Catch:{ JSONException -> 0x005e }
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x004d
            goto L_0x0059
        L_0x004d:
            java.lang.String r0 = "total_time"
            long r1 = r11.f32206d     // Catch:{ JSONException -> 0x005e }
            long r3 = r11.f32203a     // Catch:{ JSONException -> 0x005e }
            r11 = 0
            long r1 = r1 - r3
            r10.put(r0, r1)     // Catch:{ JSONException -> 0x005e }
            return
        L_0x0059:
            java.lang.String r11 = "total_time"
            r10.put(r11, r2)     // Catch:{ JSONException -> 0x005e }
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32048n.m104063a(org.json.JSONObject, com.bytedance.lighten.core.e):void");
    }

    /* renamed from: a */
    public final void mo29814a(C12124e eVar, C12110h hVar) {
        eVar.f32203a = System.currentTimeMillis();
        this.f83785c = (C14134d) eVar.f32213k;
        Uri uri = eVar.f32210h;
        Builder builder = new Builder();
        if (eVar.f32207e > 0) {
            StringBuilder sb = new StringBuilder("bytes=");
            sb.append(eVar.f32207e);
            sb.append("-");
            builder.header("Range", sb.toString());
        }
        String a = C10142f.m30095a(this.f83786d.mo83016a(uri.toString()));
        if (C6319n.m19593a(a)) {
            a = uri.toString();
        }
        this.f83829f = builder.cacheControl(new CacheControl.Builder().noStore().build()).url(a).get().build();
        m104062a(this.f83829f);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:2|(17:4|5|6|7|8|9|12|13|(1:15)|16|(1:18)|19|(1:21)|22|(1:24)(1:25)|26|(1:28))|10|12|13|(0)|16|(0)|19|(0)|22|(0)(0)|26|(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00b8, code lost:
        if ("Socket closed".equals(r24.getMessage()) == false) goto L_0x00ba;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0020 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A[Catch:{ Throwable -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0038 A[Catch:{ Throwable -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0048 A[Catch:{ Throwable -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005a A[Catch:{ Throwable -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e A[Catch:{ Throwable -> 0x009c }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007e A[Catch:{ Throwable -> 0x009c }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83017a(okhttp3.Response r21, com.bytedance.lighten.core.C12124e r22, okhttp3.Call r23, java.lang.Exception r24, com.bytedance.lighten.core.p612c.C12110h r25) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r12 = r24
            r13 = r25
            if (r2 == 0) goto L_0x009c
            r3 = 0
            if (r1 == 0) goto L_0x001f
            java.lang.String r4 = "x-snssdk.remoteaddr"
            java.lang.String r4 = r1.header(r4)     // Catch:{ Exception -> 0x001f }
            okhttp3.Request r5 = r1.request     // Catch:{ Exception -> 0x0020 }
            okhttp3.HttpUrl r5 = r5.url     // Catch:{ Exception -> 0x0020 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0020 }
            r3 = r5
            goto L_0x0020
        L_0x001f:
            r4 = r3
        L_0x0020:
            boolean r5 = com.bytedance.common.utility.C6319n.m19593a(r4)     // Catch:{ Throwable -> 0x009c }
            if (r5 == 0) goto L_0x002a
            java.lang.String r4 = com.p280ss.android.ugc.aweme.image.C32028a.m104004a(r24)     // Catch:{ Throwable -> 0x009c }
        L_0x002a:
            long r14 = r2.f32203a     // Catch:{ Throwable -> 0x009c }
            long r5 = r2.f32206d     // Catch:{ Throwable -> 0x009c }
            long r7 = r2.f32203a     // Catch:{ Throwable -> 0x009c }
            r9 = 0
            long r5 = r5 - r7
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0040
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x009c }
            long r7 = r2.f32203a     // Catch:{ Throwable -> 0x009c }
            r9 = 0
            long r5 = r5 - r7
        L_0x0040:
            r16 = r5
            boolean r5 = com.bytedance.common.utility.C6319n.m19593a(r3)     // Catch:{ Throwable -> 0x009c }
            if (r5 == 0) goto L_0x004e
            android.net.Uri r3 = r2.f32210h     // Catch:{ Throwable -> 0x009c }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x009c }
        L_0x004e:
            r11 = r3
            com.bytedance.ttnet.c.b r10 = new com.bytedance.ttnet.c.b     // Catch:{ Throwable -> 0x009c }
            r10.<init>()     // Catch:{ Throwable -> 0x009c }
            r10.f27498a = r4     // Catch:{ Throwable -> 0x009c }
            com.ss.android.ugc.aweme.image.j r3 = r0.f83784b     // Catch:{ Throwable -> 0x009c }
            if (r3 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.image.j r3 = r0.f83784b     // Catch:{ Throwable -> 0x009c }
            r18 = 0
            r4 = r16
            r6 = r14
            r8 = r11
            r9 = r10
            r19 = r10
            r10 = r24
            r12 = r11
            r11 = r18
            r3.mo83008a(r4, r6, r8, r9, r10, r11)     // Catch:{ Throwable -> 0x009c }
            goto L_0x0071
        L_0x006e:
            r19 = r10
            r12 = r11
        L_0x0071:
            com.facebook.net.g r6 = new com.facebook.net.g     // Catch:{ Throwable -> 0x009c }
            r6.<init>()     // Catch:{ Throwable -> 0x009c }
            r6.f37366b = r1     // Catch:{ Throwable -> 0x009c }
            r6.f37367c = r12     // Catch:{ Throwable -> 0x009c }
            com.facebook.net.d r1 = r0.f83785c     // Catch:{ Throwable -> 0x009c }
            if (r1 == 0) goto L_0x009c
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ Throwable -> 0x009c }
            r9.<init>()     // Catch:{ Throwable -> 0x009c }
            java.lang.String r1 = "requestId"
            java.lang.String r2 = r2.f32208f     // Catch:{ Throwable -> 0x009c }
            r9.put(r1, r2)     // Catch:{ Throwable -> 0x009c }
            java.lang.String r1 = "retryCount"
            r2 = 0
            r9.put(r1, r2)     // Catch:{ Throwable -> 0x009c }
            com.facebook.net.d r1 = r0.f83785c     // Catch:{ Throwable -> 0x009c }
            r2 = r16
            r4 = r14
            r7 = r19
            r8 = r24
            r1.mo33891a(r2, r4, r6, r7, r8, r9)     // Catch:{ Throwable -> 0x009c }
        L_0x009c:
            if (r13 == 0) goto L_0x00cb
            r1 = r24
            if (r1 == 0) goto L_0x00ba
            java.lang.String r2 = "Canceled"
            java.lang.String r3 = r24.getMessage()     // Catch:{ Throwable -> 0x00ca }
            boolean r2 = r2.equals(r3)     // Catch:{ Throwable -> 0x00ca }
            if (r2 != 0) goto L_0x00c2
            java.lang.String r2 = "Socket closed"
            java.lang.String r3 = r24.getMessage()     // Catch:{ Throwable -> 0x00ca }
            boolean r2 = r2.equals(r3)     // Catch:{ Throwable -> 0x00ca }
            if (r2 != 0) goto L_0x00c2
        L_0x00ba:
            if (r23 == 0) goto L_0x00c6
            boolean r2 = r23.isCanceled()     // Catch:{ Throwable -> 0x00ca }
            if (r2 == 0) goto L_0x00c6
        L_0x00c2:
            r25.mo29808a()     // Catch:{ Throwable -> 0x00ca }
            goto L_0x00ca
        L_0x00c6:
            r13.mo29810a(r1)     // Catch:{ Throwable -> 0x00ca }
            goto L_0x00cb
        L_0x00ca:
            return
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32048n.mo83017a(okhttp3.Response, com.bytedance.lighten.core.e, okhttp3.Call, java.lang.Exception, com.bytedance.lighten.core.c.h):void");
    }
}
