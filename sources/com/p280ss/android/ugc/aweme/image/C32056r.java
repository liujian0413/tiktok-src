package com.p280ss.android.ugc.aweme.image;

import android.net.Uri;
import android.os.Looper;
import android.util.Pair;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException;
import com.bytedance.frameworks.baselib.network.http.util.C10191k;
import com.bytedance.lighten.core.C12124e;
import com.bytedance.lighten.core.p612c.C12110h;
import com.bytedance.retrofit2.C12466b;
import com.bytedance.retrofit2.C12488k;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.ttnet.INetworkApi;
import com.bytedance.ttnet.p671c.C12955b;
import com.bytedance.ttnet.p671c.C12960e;
import com.bytedance.ttnet.utils.RetrofitUtils;
import com.facebook.net.C14125b;
import com.facebook.net.C14134d;
import com.facebook.net.C14139g;
import com.facebook.net.RetryInterceptManager;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.image.r */
public final class C32056r extends C32028a {

    /* renamed from: e */
    public volatile C12466b<TypedInput> f83842e;

    /* renamed from: f */
    public C12960e f83843f;

    /* renamed from: g */
    private final int f83844g = 206;

    /* renamed from: a */
    public final void mo29814a(C12124e eVar, C12110h hVar) {
        INetworkApi iNetworkApi;
        eVar.f32203a = System.currentTimeMillis();
        if (eVar.f32213k instanceof C14134d) {
            this.f83785c = (C14134d) eVar.f32213k;
        }
        Uri uri = eVar.f32210h;
        if (uri != null) {
            String a = this.f83786d.mo83016a(uri.toString());
            if (!C6319n.m19593a(a)) {
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Pair a2 = C10191k.m30270a(a, (Map<String, String>) linkedHashMap);
                    String str = (String) a2.first;
                    String str2 = (String) a2.second;
                    if (RetryInterceptManager.m41704a().mo33882b()) {
                        iNetworkApi = (INetworkApi) RetryInterceptManager.m41704a().mo33881a(str, INetworkApi.class);
                    } else {
                        iNetworkApi = (INetworkApi) RetrofitUtils.m37898a(str, INetworkApi.class);
                    }
                    INetworkApi iNetworkApi2 = iNetworkApi;
                    this.f83843f = new C14125b(eVar.f32214l);
                    LinkedList linkedList = null;
                    if (eVar.f32207e > 0) {
                        linkedList = new LinkedList();
                        StringBuilder sb = new StringBuilder("bytes=");
                        sb.append(eVar.f32207e);
                        sb.append("-");
                        linkedList.add(new C12461b("Range", sb.toString()));
                    }
                    LinkedList linkedList2 = linkedList;
                    if (iNetworkApi2 != null) {
                        this.f83842e = iNetworkApi2.downloadFile(false, -1, str2, linkedHashMap, linkedList2, this.f83843f);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo83022a(C12534t tVar, C12124e eVar, Throwable th, C12110h hVar, long j, long j2) {
        C12955b bVar;
        String uri;
        C12534t tVar2 = tVar;
        C12124e eVar2 = eVar;
        Throwable th2 = th;
        if (eVar2 != null) {
            try {
                String[] strArr = new String[1];
                if (!(tVar2 == null || tVar2 == null)) {
                    m104075a(strArr, tVar.mo30511b());
                }
                if (C6319n.m19593a(strArr[0])) {
                    strArr[0] = C32028a.m104004a(th);
                }
                long j3 = eVar2.f32203a;
                long j4 = j <= 0 ? j2 : j;
                String str = null;
                if (C6319n.m19593a((String) null)) {
                    if (tVar2 != null) {
                        uri = tVar2.f33301a.f33118a;
                    } else {
                        uri = eVar2.f32210h.toString();
                    }
                    str = uri;
                }
                if (th2 instanceof CronetIOException) {
                    C10104a requestInfo = ((CronetIOException) th2).getRequestInfo();
                    if (requestInfo instanceof C12955b) {
                        bVar = (C12955b) requestInfo;
                    } else {
                        bVar = new C12955b();
                        bVar.f27519v = 0;
                        bVar.f27521x = ((CronetIOException) th2).getRequestLog();
                    }
                } else {
                    bVar = new C12955b();
                }
                C12955b bVar2 = bVar;
                bVar2.f27498a = strArr[0];
                if (this.f83784b != null) {
                    this.f83784b.mo83008a(j4, j3, str, bVar2, th, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo83023a(C12534t tVar, C12124e eVar, Throwable th, C12955b bVar, int i, long j, long j2) {
        C12534t tVar2 = tVar;
        C12124e eVar2 = eVar;
        if (eVar2 != null) {
            try {
                long j3 = eVar2.f32203a;
                long j4 = j <= 0 ? j2 : j;
                String str = null;
                if (C6319n.m19593a((String) null)) {
                    if (tVar2 != null) {
                        str = tVar2.f33301a.f33118a;
                    } else {
                        str = eVar2.f32210h.toString();
                    }
                }
                C14139g gVar = new C14139g();
                gVar.f37365a = tVar2;
                gVar.f37367c = str;
                if (this.f83785c != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("requestId", eVar2.f32208f);
                    jSONObject.put("retryCount", i);
                    this.f83785c.mo33891a(j4, j3, gVar, bVar, th, jSONObject);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo83024b() {
        this.f83842e.cancel();
    }

    /* renamed from: a */
    public final void mo29813a() {
        if (this.f83842e != null) {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f83842e.cancel();
                return;
            }
            this.f83783a.execute(new C32058s(this));
        }
    }

    /* renamed from: a */
    public static int m104071a(C12955b bVar) {
        JSONObject jSONObject = bVar.f27522y;
        if (jSONObject != null) {
            Object remove = jSONObject.remove("retryCount");
            if (remove instanceof Integer) {
                return ((Integer) remove).intValue();
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static String m104072a(C12534t<TypedInput> tVar) {
        String str;
        Pattern compile = Pattern.compile("max-age=\\d+");
        String str2 = null;
        try {
            List b = tVar.mo30511b();
            if (b != null && b.size() > 0) {
                Iterator it = b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C12461b bVar = (C12461b) it.next();
                    if ("Cache-Control".equals(bVar.f33095a)) {
                        str = bVar.f33096b;
                        break;
                    }
                }
            }
            str = null;
            if (str == null) {
                return null;
            }
            try {
                Matcher matcher = compile.matcher(str);
                if (matcher.find()) {
                    str2 = matcher.group();
                }
            } catch (Exception unused) {
                str2 = str;
            }
            return str2;
        } catch (Exception unused2) {
        }
    }

    /* renamed from: b */
    public final void mo29815b(final C12124e eVar, final C12110h hVar) {
        if (this.f83842e != null && eVar != null) {
            this.f83842e.enqueue(new C12488k<TypedInput>() {

                /* renamed from: a */
                C12955b f83845a;

                /* renamed from: b */
                long f83846b = -1;

                /* renamed from: a */
                public final void mo26463a(C12466b<TypedInput> bVar, C12534t<TypedInput> tVar) {
                }

                /* renamed from: a */
                public final void mo26464a(C12466b<TypedInput> bVar, Throwable th) {
                    Exception exc;
                    this.f83846b = System.currentTimeMillis();
                    long j = eVar.f32206d - eVar.f32203a;
                    long j2 = 0;
                    if (j <= 0) {
                        j2 = System.currentTimeMillis() - eVar.f32203a;
                    }
                    C32056r.this.mo83022a(null, eVar, th, hVar, j, j2);
                    if (th instanceof Exception) {
                        exc = (Exception) th;
                    } else {
                        exc = new Exception(th.getMessage(), th.getCause());
                    }
                    m104083a(null, exc, this.f83845a, j, j2);
                    C32056r.this.mo83021a(hVar, th);
                }

                /* JADX WARNING: Removed duplicated region for block: B:50:0x00e2 A[Catch:{ all -> 0x0115 }] */
                /* renamed from: b */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void mo30461b(com.bytedance.retrofit2.C12466b<com.bytedance.retrofit2.mime.TypedInput> r23, com.bytedance.retrofit2.C12534t<com.bytedance.retrofit2.mime.TypedInput> r24) {
                    /*
                        r22 = this;
                        r9 = r22
                        r8 = r24
                        r1 = 0
                        r19 = 0
                        long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r9.f83846b = r2     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.core.e r0 = r3     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r0.f32205c = r2     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        if (r8 != 0) goto L_0x001c
                        com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r1)     // Catch:{ Throwable -> 0x001b }
                        return
                    L_0x001b:
                        return
                    L_0x001c:
                        T r0 = r8.f33302b     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.retrofit2.mime.TypedInput r0 = (com.bytedance.retrofit2.mime.TypedInput) r0     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        boolean r2 = r24.mo30512c()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        if (r2 != 0) goto L_0x006f
                        com.bytedance.lighten.core.e r0 = r3     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        long r2 = r0.f32206d     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.core.e r0 = r3     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        long r4 = r0.f32203a     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r0 = 0
                        long r15 = r2 - r4
                        int r0 = (r15 > r19 ? 1 : (r15 == r19 ? 0 : -1))
                        if (r0 > 0) goto L_0x0042
                        long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.core.e r0 = r3     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        long r4 = r0.f32203a     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r0 = 0
                        long r2 = r2 - r4
                        r17 = r2
                        goto L_0x0044
                    L_0x0042:
                        r17 = r19
                    L_0x0044:
                        java.io.IOException r0 = new java.io.IOException     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.String r3 = "Unexpected HTTP code "
                        r2.<init>(r3)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r2.append(r8)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r0.<init>(r2)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.ss.android.ugc.aweme.image.r r10 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.core.e r12 = r3     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.core.c.h r14 = r4     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r11 = r24
                        r13 = r0
                        r10.mo83022a(r11, r12, r13, r14, r15, r17)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.ss.android.ugc.aweme.image.r r2 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.lighten.core.c.h r3 = r4     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r2.mo83021a(r3, r0)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r1)     // Catch:{ Throwable -> 0x006e }
                        return
                    L_0x006e:
                        return
                    L_0x006f:
                        com.ss.android.ugc.aweme.image.r r2 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.ss.android.ugc.aweme.image.k r2 = r2.f83786d     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.io.InputStream r3 = r0.mo10444in()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        com.bytedance.retrofit2.a.d r4 = r8.f33301a     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.String r4 = r4.f33118a     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        long r5 = r0.length()     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        android.util.Pair r0 = r2.mo83015a(r3, r4, r5)     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.Object r2 = r0.first     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        r10 = r2
                        java.io.InputStream r10 = (java.io.InputStream) r10     // Catch:{ Exception -> 0x00d0, all -> 0x00ce }
                        java.lang.Object r0 = r0.second     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        long r0 = r0.longValue()     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        int r2 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
                        if (r2 < 0) goto L_0x00a7
                        com.bytedance.lighten.core.e r2 = r3     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        long r2 = r2.f32207e     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        int r4 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
                        if (r4 <= 0) goto L_0x00a5
                        int r2 = r24.mo30510a()     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        r3 = 206(0xce, float:2.89E-43)
                        if (r2 == r3) goto L_0x00a5
                        goto L_0x00a7
                    L_0x00a5:
                        r11 = r0
                        goto L_0x00a9
                    L_0x00a7:
                        r11 = r19
                    L_0x00a9:
                        com.bytedance.lighten.core.e r0 = r3     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        com.ss.android.ugc.aweme.image.t r13 = new com.ss.android.ugc.aweme.image.t     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        com.bytedance.lighten.core.e r3 = r3     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        r1 = r13
                        r2 = r22
                        r4 = r24
                        r5 = r11
                        r7 = r23
                        r1.<init>(r2, r3, r4, r5, r7)     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        r0.f32212j = r13     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        com.bytedance.lighten.core.c.h r0 = r4     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        int r1 = (int) r11     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        r0.mo29809a(r10, r1)     // Catch:{ Exception -> 0x00ca, all -> 0x00c7 }
                        com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r10)     // Catch:{ Throwable -> 0x00c6 }
                        return
                    L_0x00c6:
                        return
                    L_0x00c7:
                        r0 = move-exception
                        r1 = r10
                        goto L_0x0118
                    L_0x00ca:
                        r0 = move-exception
                        r21 = r10
                        goto L_0x00d3
                    L_0x00ce:
                        r0 = move-exception
                        goto L_0x0118
                    L_0x00d0:
                        r0 = move-exception
                        r21 = r1
                    L_0x00d3:
                        com.bytedance.lighten.core.e r1 = r3     // Catch:{ all -> 0x0115 }
                        long r1 = r1.f32206d     // Catch:{ all -> 0x0115 }
                        com.bytedance.lighten.core.e r3 = r3     // Catch:{ all -> 0x0115 }
                        long r3 = r3.f32203a     // Catch:{ all -> 0x0115 }
                        r5 = 0
                        long r5 = r1 - r3
                        int r1 = (r5 > r19 ? 1 : (r5 == r19 ? 0 : -1))
                        if (r1 > 0) goto L_0x00ee
                        long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0115 }
                        com.bytedance.lighten.core.e r3 = r3     // Catch:{ all -> 0x0115 }
                        long r3 = r3.f32203a     // Catch:{ all -> 0x0115 }
                        r7 = 0
                        long r1 = r1 - r3
                        r19 = r1
                    L_0x00ee:
                        com.ss.android.ugc.aweme.image.r r10 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ all -> 0x0115 }
                        com.bytedance.lighten.core.e r12 = r3     // Catch:{ all -> 0x0115 }
                        com.bytedance.lighten.core.c.h r14 = r4     // Catch:{ all -> 0x0115 }
                        r11 = r24
                        r13 = r0
                        r15 = r5
                        r17 = r19
                        r10.mo83022a(r11, r12, r13, r14, r15, r17)     // Catch:{ all -> 0x0115 }
                        com.bytedance.ttnet.c.b r4 = r9.f83845a     // Catch:{ all -> 0x0115 }
                        r1 = r22
                        r2 = r24
                        r3 = r0
                        r7 = r19
                        r1.m104083a(r2, r3, r4, r5, r7)     // Catch:{ all -> 0x0115 }
                        com.ss.android.ugc.aweme.image.r r1 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ all -> 0x0115 }
                        com.bytedance.lighten.core.c.h r2 = r4     // Catch:{ all -> 0x0115 }
                        r1.mo83021a(r2, r0)     // Catch:{ all -> 0x0115 }
                        com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r21)     // Catch:{ Throwable -> 0x0114 }
                        return
                    L_0x0114:
                        return
                    L_0x0115:
                        r0 = move-exception
                        r1 = r21
                    L_0x0118:
                        com.bytedance.frameworks.baselib.network.http.parser.C10174c.m30220a(r1)     // Catch:{ Throwable -> 0x011b }
                    L_0x011b:
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32056r.C320571.mo30461b(com.bytedance.retrofit2.b, com.bytedance.retrofit2.t):void");
                }

                /* access modifiers changed from: 0000 */
                /* JADX WARNING: Can't wrap try/catch for region: R(22:0|1|2|(1:6)|7|(2:9|(2:10|(3:12|(3:14|(1:19)(1:18)|(2:48|21)(1:50))(1:49)|46)(1:47)))(0)|22|(1:24)|25|26|27|(1:29)|30|(1:32)|33|34|(1:36)|37|(1:39)|40|(1:42)|43) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x009c */
                /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0 A[Catch:{ JSONException -> 0x0130 }] */
                /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd A[Catch:{ JSONException -> 0x0130 }] */
                /* JADX WARNING: Removed duplicated region for block: B:42:0x011a A[Catch:{ JSONException -> 0x0130 }] */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ void mo83025a(com.bytedance.lighten.core.C12124e r20, com.bytedance.retrofit2.C12534t r21, long r22, com.bytedance.retrofit2.C12466b r24) {
                    /*
                        r19 = this;
                        r0 = r19
                        r1 = r20
                        r2 = r21
                        r3 = r22
                        r5 = r24
                        long r6 = java.lang.System.currentTimeMillis()     // Catch:{ JSONException -> 0x0130 }
                        r1.f32206d = r6     // Catch:{ JSONException -> 0x0130 }
                        com.bytedance.retrofit2.a.d r6 = r2.f33301a     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r7 = "X-Cache"
                        java.util.List r6 = r6.mo30452b(r7)     // Catch:{ JSONException -> 0x0130 }
                        if (r6 == 0) goto L_0x0020
                        int r7 = r6.size()     // Catch:{ JSONException -> 0x0130 }
                        if (r7 > 0) goto L_0x0028
                    L_0x0020:
                        com.bytedance.retrofit2.a.d r6 = r2.f33301a     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r7 = "X-Cache-new"
                        java.util.List r6 = r6.mo30452b(r7)     // Catch:{ JSONException -> 0x0130 }
                    L_0x0028:
                        boolean r7 = com.bytedance.common.utility.collection.C6307b.m19566a(r6)     // Catch:{ JSONException -> 0x0130 }
                        if (r7 != 0) goto L_0x005c
                        java.util.Iterator r6 = r6.iterator()     // Catch:{ JSONException -> 0x0130 }
                    L_0x0032:
                        boolean r7 = r6.hasNext()     // Catch:{ JSONException -> 0x0130 }
                        if (r7 == 0) goto L_0x005c
                        java.lang.Object r7 = r6.next()     // Catch:{ JSONException -> 0x0130 }
                        com.bytedance.retrofit2.a.b r7 = (com.bytedance.retrofit2.p637a.C12461b) r7     // Catch:{ JSONException -> 0x0130 }
                        if (r7 == 0) goto L_0x0032
                        java.lang.String r7 = r7.f33096b     // Catch:{ JSONException -> 0x0130 }
                        boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0130 }
                        r9 = 1
                        if (r8 != 0) goto L_0x0057
                        java.lang.String r7 = r7.toLowerCase()     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r8 = "hit"
                        boolean r7 = r7.contains(r8)     // Catch:{ JSONException -> 0x0130 }
                        if (r7 == 0) goto L_0x0057
                        r7 = 1
                        goto L_0x0058
                    L_0x0057:
                        r7 = 0
                    L_0x0058:
                        if (r7 == 0) goto L_0x0032
                        r1.f32209g = r9     // Catch:{ JSONException -> 0x0130 }
                    L_0x005c:
                        org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0130 }
                        r6.<init>()     // Catch:{ JSONException -> 0x0130 }
                        org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0130 }
                        r8.<init>()     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r7 = com.p280ss.android.ugc.aweme.image.C32056r.m104072a(r21)     // Catch:{ JSONException -> 0x0130 }
                        boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ JSONException -> 0x0130 }
                        if (r9 != 0) goto L_0x007a
                        java.lang.String r9 = "cache_control"
                        r6.put(r9, r7)     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r9 = "cache_control"
                        r8.put(r9, r7)     // Catch:{ JSONException -> 0x0130 }
                    L_0x007a:
                        r1.f32215m = r3     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r7 = "image_size"
                        r6.put(r7, r3)     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r7 = "content_length"
                        r8.put(r7, r3)     // Catch:{ JSONException -> 0x0130 }
                        boolean r3 = r5 instanceof com.bytedance.retrofit2.C12489l     // Catch:{ Throwable -> 0x009c }
                        if (r3 == 0) goto L_0x0090
                        r3 = r5
                        com.bytedance.retrofit2.l r3 = (com.bytedance.retrofit2.C12489l) r3     // Catch:{ Throwable -> 0x009c }
                        r3.doCollect()     // Catch:{ Throwable -> 0x009c }
                    L_0x0090:
                        com.bytedance.retrofit2.a.d r3 = r2.f33301a     // Catch:{ Throwable -> 0x009c }
                        java.lang.Object r3 = r3.f33123f     // Catch:{ Throwable -> 0x009c }
                        boolean r4 = r3 instanceof com.bytedance.ttnet.p671c.C12955b     // Catch:{ Throwable -> 0x009c }
                        if (r4 == 0) goto L_0x009c
                        com.bytedance.ttnet.c.b r3 = (com.bytedance.ttnet.p671c.C12955b) r3     // Catch:{ Throwable -> 0x009c }
                        r0.f83845a = r3     // Catch:{ Throwable -> 0x009c }
                    L_0x009c:
                        com.bytedance.ttnet.c.b r3 = r0.f83845a     // Catch:{ JSONException -> 0x0130 }
                        if (r3 != 0) goto L_0x00a7
                        com.bytedance.ttnet.c.b r3 = new com.bytedance.ttnet.c.b     // Catch:{ JSONException -> 0x0130 }
                        r3.<init>()     // Catch:{ JSONException -> 0x0130 }
                        r0.f83845a = r3     // Catch:{ JSONException -> 0x0130 }
                    L_0x00a7:
                        com.bytedance.ttnet.c.b r3 = r0.f83845a     // Catch:{ JSONException -> 0x0130 }
                        long r3 = r3.f27502e     // Catch:{ JSONException -> 0x0130 }
                        r1.f32204b = r3     // Catch:{ JSONException -> 0x0130 }
                        com.bytedance.ttnet.c.b r3 = r0.f83845a     // Catch:{ JSONException -> 0x0130 }
                        long r4 = r0.f83846b     // Catch:{ JSONException -> 0x0130 }
                        r3.f27504g = r4     // Catch:{ JSONException -> 0x0130 }
                        com.bytedance.ttnet.c.b r3 = r0.f83845a     // Catch:{ JSONException -> 0x0130 }
                        long r4 = r1.f32206d     // Catch:{ JSONException -> 0x0130 }
                        r3.f27505h = r4     // Catch:{ JSONException -> 0x0130 }
                        com.bytedance.ttnet.c.b r3 = r0.f83845a     // Catch:{ JSONException -> 0x0130 }
                        java.util.List r4 = r21.mo30511b()     // Catch:{ JSONException -> 0x0130 }
                        com.ss.android.ugc.aweme.image.r r5 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ JSONException -> 0x0130 }
                        com.bytedance.ttnet.c.e r5 = r5.f83843f     // Catch:{ JSONException -> 0x0130 }
                        r7 = 0
                        com.p280ss.android.ugc.aweme.image.C32056r.m104073a(r3, r4, r5, r7)     // Catch:{ JSONException -> 0x0130 }
                        com.ss.android.ugc.aweme.image.r r3 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ JSONException -> 0x0130 }
                        com.ss.android.ugc.aweme.image.j r3 = r3.f83784b     // Catch:{ JSONException -> 0x0130 }
                        if (r3 == 0) goto L_0x00e9
                        com.ss.android.ugc.aweme.image.r r3 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ JSONException -> 0x0130 }
                        com.ss.android.ugc.aweme.image.j r10 = r3.f83784b     // Catch:{ JSONException -> 0x0130 }
                        long r3 = r1.f32206d     // Catch:{ JSONException -> 0x0130 }
                        long r11 = r1.f32203a     // Catch:{ JSONException -> 0x0130 }
                        r5 = 0
                        long r11 = r3 - r11
                        long r13 = r1.f32203a     // Catch:{ JSONException -> 0x0130 }
                        com.bytedance.retrofit2.a.d r3 = r2.f33301a     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r15 = r3.f33118a     // Catch:{ JSONException -> 0x0130 }
                        com.bytedance.ttnet.c.b r3 = r0.f83845a     // Catch:{ JSONException -> 0x0130 }
                        r17 = 0
                        r16 = r3
                        r18 = r6
                        r10.mo83009b(r11, r13, r15, r16, r17, r18)     // Catch:{ JSONException -> 0x0130 }
                    L_0x00e9:
                        java.lang.String r3 = "retryCount"
                        com.bytedance.ttnet.c.b r4 = r0.f83845a     // Catch:{ JSONException -> 0x0130 }
                        int r4 = com.p280ss.android.ugc.aweme.image.C32056r.m104071a(r4)     // Catch:{ JSONException -> 0x0130 }
                        r8.put(r3, r4)     // Catch:{ JSONException -> 0x0130 }
                        com.facebook.net.g r12 = new com.facebook.net.g     // Catch:{ JSONException -> 0x0130 }
                        r12.<init>()     // Catch:{ JSONException -> 0x0130 }
                        r12.f37365a = r2     // Catch:{ JSONException -> 0x0130 }
                        com.bytedance.retrofit2.a.d r3 = r2.f33301a     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r3 = r3.f33118a     // Catch:{ JSONException -> 0x0130 }
                        r12.f37367c = r3     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r3 = "http_status"
                        int r2 = r21.mo30510a()     // Catch:{ JSONException -> 0x0130 }
                        r8.put(r3, r2)     // Catch:{ JSONException -> 0x0130 }
                        java.lang.String r2 = "requestId"
                        java.lang.String r3 = r1.f32208f     // Catch:{ JSONException -> 0x0130 }
                        r8.put(r2, r3)     // Catch:{ JSONException -> 0x0130 }
                        com.p280ss.android.ugc.aweme.image.C32056r.m104074a(r8, r1)     // Catch:{ JSONException -> 0x0130 }
                        com.ss.android.ugc.aweme.image.r r2 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ JSONException -> 0x0130 }
                        com.facebook.net.d r2 = r2.f83785c     // Catch:{ JSONException -> 0x0130 }
                        if (r2 == 0) goto L_0x012f
                        com.ss.android.ugc.aweme.image.r r2 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ JSONException -> 0x0130 }
                        com.facebook.net.d r7 = r2.f83785c     // Catch:{ JSONException -> 0x0130 }
                        long r2 = r1.f32206d     // Catch:{ JSONException -> 0x0130 }
                        long r4 = r1.f32203a     // Catch:{ JSONException -> 0x0130 }
                        r6 = 0
                        long r2 = r2 - r4
                        long r10 = r1.f32203a     // Catch:{ JSONException -> 0x0130 }
                        com.bytedance.ttnet.c.b r13 = r0.f83845a     // Catch:{ JSONException -> 0x0130 }
                        r14 = 0
                        r1 = r8
                        r8 = r2
                        r15 = r1
                        r7.mo33892b(r8, r10, r12, r13, r14, r15)     // Catch:{ JSONException -> 0x0130 }
                    L_0x012f:
                        return
                    L_0x0130:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32056r.C320571.mo83025a(com.bytedance.lighten.core.e, com.bytedance.retrofit2.t, long, com.bytedance.retrofit2.b):void");
                }

                /* JADX WARNING: Can't wrap try/catch for region: R(8:(3:23|24|(2:26|(1:28)))|(1:34)(1:33)|(1:36)(1:37)|38|(4:40|(1:42)|43|(2:45|46))|47|48|49) */
                /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ba */
                /* renamed from: a */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                private void m104083a(com.bytedance.retrofit2.C12534t r12, java.lang.Exception r13, com.bytedance.ttnet.p671c.C12955b r14, long r15, long r17) {
                    /*
                        r11 = this;
                        r0 = r11
                        r2 = r12
                        r1 = r13
                        if (r1 != 0) goto L_0x0006
                        return
                    L_0x0006:
                        r3 = -1
                        boolean r4 = r1 instanceof com.facebook.net.RetryInterceptManager.RetryWrapException
                        if (r4 == 0) goto L_0x0014
                        com.facebook.net.RetryInterceptManager$RetryWrapException r1 = (com.facebook.net.RetryInterceptManager.RetryWrapException) r1
                        java.lang.Exception r3 = r1.f37321e
                        int r1 = r1.retryCount
                        r6 = r1
                        r4 = r3
                        goto L_0x0016
                    L_0x0014:
                        r4 = r1
                        r6 = -1
                    L_0x0016:
                        r1 = 1
                        boolean r3 = r4 instanceof com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException
                        r5 = 0
                        if (r3 == 0) goto L_0x002a
                        r3 = r4
                        com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException r3 = (com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException) r3
                        if (r3 == 0) goto L_0x002a
                        int r3 = r3.getStatusCode()
                        r7 = 304(0x130, float:4.26E-43)
                        if (r3 != r7) goto L_0x002a
                        r1 = 0
                    L_0x002a:
                        boolean r3 = r4 instanceof com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException
                        if (r3 == 0) goto L_0x004c
                        r3 = r4
                        com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException r3 = (com.bytedance.frameworks.baselib.network.http.cronet.impl.CronetIOException) r3
                        com.bytedance.frameworks.baselib.network.http.a r7 = r3.getRequestInfo()
                        boolean r8 = r7 instanceof com.bytedance.ttnet.p671c.C12955b
                        if (r8 == 0) goto L_0x003d
                        r3 = r7
                        com.bytedance.ttnet.c.b r3 = (com.bytedance.ttnet.p671c.C12955b) r3
                        goto L_0x004d
                    L_0x003d:
                        com.bytedance.ttnet.c.b r7 = new com.bytedance.ttnet.c.b
                        r7.<init>()
                        r7.f27519v = r5
                        java.lang.String r3 = r3.getRequestLog()
                        r7.f27521x = r3
                        r3 = r7
                        goto L_0x004d
                    L_0x004c:
                        r3 = r14
                    L_0x004d:
                        if (r1 == 0) goto L_0x00c6
                        if (r3 != 0) goto L_0x006a
                        com.ss.android.ugc.aweme.image.r r1 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r1 = r1.f83842e     // Catch:{ Throwable -> 0x00c6 }
                        boolean r1 = r1 instanceof com.bytedance.retrofit2.C12490m     // Catch:{ Throwable -> 0x00c6 }
                        if (r1 == 0) goto L_0x006a
                        com.ss.android.ugc.aweme.image.r r1 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r1 = r1.f83842e     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.m r1 = (com.bytedance.retrofit2.C12490m) r1     // Catch:{ Throwable -> 0x00c6 }
                        java.lang.Object r1 = r1.getRequestInfo()     // Catch:{ Throwable -> 0x00c6 }
                        boolean r5 = r1 instanceof com.bytedance.ttnet.p671c.C12955b     // Catch:{ Throwable -> 0x00c6 }
                        if (r5 == 0) goto L_0x006a
                        r3 = r1
                        com.bytedance.ttnet.c.b r3 = (com.bytedance.ttnet.p671c.C12955b) r3     // Catch:{ Throwable -> 0x00c6 }
                    L_0x006a:
                        if (r3 != 0) goto L_0x0087
                        com.ss.android.ugc.aweme.image.r r1 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r1 = r1.f83842e     // Catch:{ Throwable -> 0x00c6 }
                        boolean r1 = r1 instanceof com.bytedance.retrofit2.C12489l     // Catch:{ Throwable -> 0x00c6 }
                        if (r1 == 0) goto L_0x0087
                        if (r2 == 0) goto L_0x0087
                        com.ss.android.ugc.aweme.image.r r1 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r1 = r1.f83842e     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.l r1 = (com.bytedance.retrofit2.C12489l) r1     // Catch:{ Throwable -> 0x00c6 }
                        r1.doCollect()     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.retrofit2.a.d r1 = r2.f33301a     // Catch:{ Throwable -> 0x00c6 }
                        java.lang.Object r1 = r1.f33123f     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.ttnet.c.b r1 = (com.bytedance.ttnet.p671c.C12955b) r1     // Catch:{ Throwable -> 0x00c6 }
                        r5 = r1
                        goto L_0x0088
                    L_0x0087:
                        r5 = r3
                    L_0x0088:
                        if (r2 == 0) goto L_0x008f
                        java.util.List r1 = r12.mo30511b()     // Catch:{ Throwable -> 0x00c6 }
                        goto L_0x0090
                    L_0x008f:
                        r1 = 0
                    L_0x0090:
                        com.ss.android.ugc.aweme.image.r r3 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.ttnet.c.e r3 = r3.f83843f     // Catch:{ Throwable -> 0x00c6 }
                        com.p280ss.android.ugc.aweme.image.C32056r.m104073a(r5, r1, r3, r4)     // Catch:{ Throwable -> 0x00c6 }
                        if (r5 == 0) goto L_0x00ba
                        long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x00c6 }
                        r5.f27505h = r7     // Catch:{ Throwable -> 0x00c6 }
                        long r7 = r5.f27504g     // Catch:{ Throwable -> 0x00c6 }
                        r9 = 0
                        int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                        if (r1 > 0) goto L_0x00ab
                        long r7 = r0.f83846b     // Catch:{ Throwable -> 0x00c6 }
                        r5.f27504g = r7     // Catch:{ Throwable -> 0x00c6 }
                    L_0x00ab:
                        org.json.JSONObject r1 = r5.f27522y     // Catch:{ Throwable -> 0x00c6 }
                        if (r1 == 0) goto L_0x00ba
                        org.json.JSONObject r1 = r5.f27522y     // Catch:{ Throwable -> 0x00ba }
                        java.lang.String r3 = "ex"
                        java.lang.String r7 = r4.getMessage()     // Catch:{ Throwable -> 0x00ba }
                        r1.put(r3, r7)     // Catch:{ Throwable -> 0x00ba }
                    L_0x00ba:
                        com.ss.android.ugc.aweme.image.r r1 = com.p280ss.android.ugc.aweme.image.C32056r.this     // Catch:{ Throwable -> 0x00c6 }
                        com.bytedance.lighten.core.e r3 = r3     // Catch:{ Throwable -> 0x00c6 }
                        r2 = r12
                        r7 = r15
                        r9 = r17
                        r1.mo83023a(r2, r3, r4, r5, r6, r7, r9)     // Catch:{ Throwable -> 0x00c6 }
                        return
                    L_0x00c6:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32056r.C320571.m104083a(com.bytedance.retrofit2.t, java.lang.Exception, com.bytedance.ttnet.c.b, long, long):void");
                }
            });
        }
    }

    /* renamed from: a */
    private static void m104075a(String[] strArr, List<C12461b> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    for (C12461b bVar : list) {
                        if ("x-net-info.remoteaddr".equals(bVar.f33095a)) {
                            strArr[0] = bVar.f33096b;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028 A[Catch:{ JSONException -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0046 A[Catch:{ JSONException -> 0x005e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m104074a(org.json.JSONObject r10, com.bytedance.lighten.core.C12124e r11) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32056r.m104074a(org.json.JSONObject, com.bytedance.lighten.core.e):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if ("request canceled".equals(r4.getMessage()) == false) goto L_0x0010;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo83021a(com.bytedance.lighten.core.p612c.C12110h r3, java.lang.Throwable r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0025
            if (r4 == 0) goto L_0x0010
            java.lang.String r0 = "request canceled"
            java.lang.String r1 = r4.getMessage()     // Catch:{ Throwable -> 0x0024 }
            boolean r0 = r0.equals(r1)     // Catch:{ Throwable -> 0x0024 }
            if (r0 != 0) goto L_0x001c
        L_0x0010:
            com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.f83842e     // Catch:{ Throwable -> 0x0024 }
            if (r0 == 0) goto L_0x0020
            com.bytedance.retrofit2.b<com.bytedance.retrofit2.mime.TypedInput> r0 = r2.f83842e     // Catch:{ Throwable -> 0x0024 }
            boolean r0 = r0.isCanceled()     // Catch:{ Throwable -> 0x0024 }
            if (r0 == 0) goto L_0x0020
        L_0x001c:
            r3.mo29808a()     // Catch:{ Throwable -> 0x0024 }
            goto L_0x0024
        L_0x0020:
            r3.mo29810a(r4)     // Catch:{ Throwable -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            return
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.image.C32056r.mo83021a(com.bytedance.lighten.core.c.h, java.lang.Throwable):void");
    }

    /* renamed from: a */
    public static void m104073a(C10104a aVar, List<C12461b> list, C12960e eVar, Exception exc) {
        if (aVar != null) {
            try {
                if (C6319n.m19593a(aVar.f27498a)) {
                    String str = null;
                    if (list != null && list.size() > 0) {
                        for (C12461b bVar : list) {
                            if ("x-net-info.remoteaddr".equalsIgnoreCase(bVar.f33095a)) {
                                str = bVar.f33096b;
                            }
                        }
                    }
                    if (C6319n.m19593a(str) && eVar != null) {
                        str = eVar.f27552a;
                    }
                    if (C6319n.m19593a(str)) {
                        str = C32028a.m104004a(exc);
                    }
                    if (!C6319n.m19593a(str) && aVar != null) {
                        aVar.f27498a = str;
                        if (aVar.f27499b != null) {
                            aVar.f27499b.f27552a = str;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
