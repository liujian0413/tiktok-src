package com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b;

import android.os.Handler;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.p280ss.android.ugc.effectmanager.C43834g;
import com.p280ss.android.ugc.effectmanager.common.C43702a;
import com.p280ss.android.ugc.effectmanager.common.C43707b;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43719a;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43721c;
import com.p280ss.android.ugc.effectmanager.common.p1728c.C43722d;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43726c;
import com.p280ss.android.ugc.effectmanager.common.p1729d.C43727d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43730b;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43732d;
import com.p280ss.android.ugc.effectmanager.common.p1730e.C43735g;
import com.p280ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43790g;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.i */
public final class C43814i extends C43727d {

    /* renamed from: a */
    private C43680a f113391a;

    /* renamed from: b */
    private C43834g f113392b = this.f113391a.f113068a;

    /* renamed from: g */
    private C43719a f113393g = this.f113392b.f113528s;

    /* renamed from: h */
    private C43721c f113394h = this.f113392b.f113532w;

    /* renamed from: i */
    private C43722d f113395i = this.f113392b.f113534y;

    /* renamed from: j */
    private String f113396j;

    /* renamed from: k */
    private int f113397k = this.f113392b.f113529t;

    /* renamed from: l */
    private String f113398l;

    /* renamed from: m */
    private int f113399m;

    /* renamed from: n */
    private int f113400n;

    /* renamed from: o */
    private int f113401o;

    /* renamed from: p */
    private String f113402p;

    /* renamed from: q */
    private String f113403q;

    /* renamed from: r */
    private String f113404r;

    /* renamed from: s */
    private String f113405s;

    /* renamed from: t */
    private long f113406t;

    /* renamed from: b */
    private C43707b m138748b() {
        HashMap a = m138568a(this.f113392b);
        if (!TextUtils.isEmpty(this.f113396j)) {
            a.put("panel", this.f113396j);
        }
        a.put("category", this.f113398l);
        a.put("cursor", String.valueOf(this.f113400n));
        a.put("count", String.valueOf(this.f113399m));
        a.put("sorting_position", String.valueOf(this.f113401o));
        a.put(C38347c.f99551f, String.valueOf(this.f113402p));
        String str = this.f113392b.f113507A;
        if (!TextUtils.isEmpty(str)) {
            a.put("test_status", str);
        }
        this.f113404r = this.f113391a.f113069b.f113609h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113404r);
        sb.append(this.f113392b.f113510a);
        sb.append("/category/effects");
        String a2 = C43735g.m138609a(a, sb.toString());
        this.f113403q = a2;
        try {
            this.f113405s = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C43707b("GET", a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0122, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0124, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0125, code lost:
        r16 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0122 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0133 A[Catch:{ all -> 0x0129 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105685a() {
        /*
            r19 = this;
            r1 = r19
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.effectmanager.common.b r4 = r19.m138748b()
        L_0x000a:
            int r0 = r1.f113397k
            int r5 = r0 + -1
            r1.f113397k = r5
            if (r0 == 0) goto L_0x014f
            r5 = 0
            boolean r0 = r1.f113228e     // Catch:{ Exception -> 0x012c }
            if (r0 == 0) goto L_0x0025
            com.ss.android.ugc.effectmanager.common.d.c r0 = new com.ss.android.ugc.effectmanager.common.d.c     // Catch:{ Exception -> 0x012c }
            r6 = 10001(0x2711, float:1.4014E-41)
            r0.<init>(r6)     // Catch:{ Exception -> 0x012c }
            r1.m138746a(r0)     // Catch:{ Exception -> 0x012c }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r5)
            return
        L_0x0025:
            com.ss.android.ugc.effectmanager.g r0 = r1.f113392b     // Catch:{ Exception -> 0x012c }
            com.ss.android.ugc.effectmanager.network.a r0 = r0.f113533x     // Catch:{ Exception -> 0x012c }
            java.io.InputStream r6 = r0.mo106116a(r4)     // Catch:{ Exception -> 0x012c }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.g r0 = r1.f113392b     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.network.a r0 = r0.f113533x     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.c.c r9 = r1.f113394h     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse> r10 = com.p280ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = r0.mo106115a(r4, r6, r9, r10)     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse r0 = (com.p280ss.android.ugc.effectmanager.effect.model.net.CategoryEffectListResponse) r0     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            boolean r11 = r0.checkValue()     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            if (r11 != 0) goto L_0x005f
            int r0 = r1.f113397k     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            if (r0 != 0) goto L_0x005b
            com.ss.android.ugc.effectmanager.common.d.c r0 = new com.ss.android.ugc.effectmanager.common.d.c     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            r5 = 10002(0x2712, float:1.4016E-41)
            r0.<init>(r5)     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            r1.m138746a(r0)     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r6)
            return
        L_0x005b:
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r6)
            goto L_0x000a
        L_0x005f:
            com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel r11 = r0.data     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.g r12 = r1.f113392b     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.io.File r12 = r12.f113519j     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r13 = r11.category_effects     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r13 = r13.effects     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c.m138584a(r12, r13)     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.g r12 = r1.f113392b     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.io.File r12 = r12.f113519j     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r13 = r11.category_effects     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r13 = r13.collection     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c.m138584a(r12, r13)     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.g r12 = r1.f113392b     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.io.File r12 = r12.f113519j     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.lang.String r12 = r12.getAbsolutePath()     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r13 = r11.category_effects     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r13 = r13.bind_effects     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c.m138584a(r12, r13)     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            r1.m138747a(r0)     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.c.d r0 = r1.f113395i     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            if (r0 == 0) goto L_0x010f
            com.ss.android.ugc.effectmanager.common.c.d r0 = r1.f113395i     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.lang.String r14 = "category_list_success_rate"
            com.ss.android.ugc.effectmanager.common.e.d r5 = com.p280ss.android.ugc.effectmanager.common.p1730e.C43732d.m138588a()     // Catch:{ Exception -> 0x0124, all -> 0x0122 }
            java.lang.String r15 = "app_id"
            r16 = r4
            com.ss.android.ugc.effectmanager.g r4 = r1.f113392b     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r4 = r4.f113521l     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r5.mo105776a(r15, r4)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r5 = "access_key"
            com.ss.android.ugc.effectmanager.g r15 = r1.f113392b     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r15 = r15.f113511b     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105776a(r5, r15)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r5 = "panel"
            java.lang.String r15 = r1.f113396j     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105776a(r5, r15)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r5 = "category"
            java.lang.String r15 = r1.f113398l     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105776a(r5, r15)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r5 = "duration"
            r15 = 0
            long r17 = r12 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105775a(r5, r15)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r5 = "network_time"
            r15 = 0
            long r17 = r7 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105775a(r5, r15)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r5 = "json_time"
            r15 = 0
            long r7 = r9 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105775a(r5, r7)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r5 = "io_time"
            r7 = 0
            long r12 = r12 - r9
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105775a(r5, r7)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.String r5 = "size"
            long r7 = r1.f113406t     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105775a(r5, r7)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            org.json.JSONObject r4 = r4.mo105777b()     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            r5 = 0
            r0.mo55503a(r14, r5, r4)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            goto L_0x0111
        L_0x010f:
            r16 = r4
        L_0x0111:
            r0 = 21
            com.ss.android.ugc.effectmanager.effect.e.a.g r4 = new com.ss.android.ugc.effectmanager.effect.e.a.g     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            r5 = 0
            r4.<init>(r11, r5)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            r1.mo105769a(r0, r4)     // Catch:{ Exception -> 0x0120, all -> 0x0122 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r6)
            return
        L_0x0120:
            r0 = move-exception
            goto L_0x0127
        L_0x0122:
            r0 = move-exception
            goto L_0x014b
        L_0x0124:
            r0 = move-exception
            r16 = r4
        L_0x0127:
            r5 = r6
            goto L_0x012f
        L_0x0129:
            r0 = move-exception
            r6 = r5
            goto L_0x014b
        L_0x012c:
            r0 = move-exception
            r16 = r4
        L_0x012f:
            int r4 = r1.f113397k     // Catch:{ all -> 0x0129 }
            if (r4 == 0) goto L_0x013f
            boolean r4 = r0 instanceof com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException     // Catch:{ all -> 0x0129 }
            if (r4 == 0) goto L_0x0138
            goto L_0x013f
        L_0x0138:
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r5)
            r4 = r16
            goto L_0x000a
        L_0x013f:
            com.ss.android.ugc.effectmanager.common.d.c r2 = new com.ss.android.ugc.effectmanager.common.d.c     // Catch:{ all -> 0x0129 }
            r2.<init>(r0)     // Catch:{ all -> 0x0129 }
            r1.m138746a(r2)     // Catch:{ all -> 0x0129 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r5)
            return
        L_0x014b:
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r6)
            throw r0
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43814i.mo105685a():void");
    }

    /* renamed from: a */
    private void m138746a(C43726c cVar) {
        cVar.mo105767a(this.f113403q, this.f113404r, this.f113405s);
        mo105769a(21, new C43790g(null, cVar));
        if (this.f113395i != null) {
            this.f113395i.mo55503a("category_list_success_rate", 1, C43732d.m138588a().mo105776a("app_id", this.f113392b.f113521l).mo105776a("access_key", this.f113392b.f113511b).mo105776a("panel", this.f113396j).mo105776a("category", this.f113398l).mo105774a("error_code", Integer.valueOf(cVar.f113220a)).mo105776a("error_msg", cVar.f113221b).mo105777b());
        }
    }

    /* renamed from: a */
    private void m138747a(CategoryEffectListResponse categoryEffectListResponse) {
        String a = C43730b.m138577a(this.f113396j, this.f113398l, this.f113399m, this.f113400n, this.f113401o);
        this.f113393g.mo105732a(a, this.f113394h.mo70690a(categoryEffectListResponse));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113392b.f113519j);
        sb.append(File.separator);
        sb.append(a);
        this.f113406t = new File(sb.toString()).length() / ((long) C43702a.f113154a);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C38347c.f99551f, categoryEffectListResponse.data.category_effects.version);
            jSONObject.put("cursor", categoryEffectListResponse.data.category_effects.cursor);
            jSONObject.put("sorting_position", categoryEffectListResponse.data.category_effects.sorting_position);
            this.f113393g.mo105732a(C43730b.m138580c(this.f113396j, this.f113398l), jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    public C43814i(C43680a aVar, String str, String str2, String str3, int i, int i2, int i3, String str4, Handler handler) {
        super(handler, str2, "NETWORK");
        this.f113396j = str;
        this.f113398l = str3;
        this.f113399m = i;
        this.f113400n = i2;
        this.f113401o = i3;
        this.f113402p = str4;
        this.f113391a = aVar;
    }
}
