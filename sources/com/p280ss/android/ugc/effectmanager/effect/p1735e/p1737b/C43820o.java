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
import com.p280ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse;
import com.p280ss.android.ugc.effectmanager.effect.p1735e.p1736a.C43793j;
import com.p280ss.android.ugc.effectmanager.p1723a.C43680a;
import java.io.File;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.o */
public final class C43820o extends C43727d {

    /* renamed from: a */
    private C43680a f113438a;

    /* renamed from: b */
    private C43834g f113439b = this.f113438a.f113068a;

    /* renamed from: g */
    private int f113440g = this.f113439b.f113529t;

    /* renamed from: h */
    private C43719a f113441h = this.f113439b.f113528s;

    /* renamed from: i */
    private C43721c f113442i = this.f113439b.f113532w;

    /* renamed from: j */
    private C43722d f113443j = this.f113439b.f113534y;

    /* renamed from: k */
    private String f113444k;

    /* renamed from: l */
    private String f113445l;

    /* renamed from: m */
    private String f113446m;

    /* renamed from: n */
    private String f113447n;

    /* renamed from: o */
    private boolean f113448o;

    /* renamed from: p */
    private String f113449p;

    /* renamed from: q */
    private int f113450q;

    /* renamed from: r */
    private int f113451r;

    /* renamed from: s */
    private long f113452s;

    /* renamed from: b */
    private C43707b m138762b() {
        HashMap a = m138568a(this.f113439b);
        if (!TextUtils.isEmpty(this.f113444k)) {
            a.put("panel", this.f113444k);
        }
        if (this.f113448o) {
            a.put("has_category_effects", "true");
            a.put("category", this.f113449p);
            a.put("cursor", String.valueOf(this.f113451r));
            a.put("count", String.valueOf(this.f113450q));
        }
        String str = this.f113439b.f113507A;
        if (str != null) {
            a.put("test_status", str);
        }
        this.f113446m = this.f113438a.f113069b.f113609h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113446m);
        sb.append(this.f113439b.f113510a);
        sb.append("/panel/info");
        String a2 = C43735g.m138609a(a, sb.toString());
        this.f113445l = a2;
        try {
            this.f113447n = InetAddress.getByName(new URL(a2).getHost()).getHostAddress();
        } catch (MalformedURLException | UnknownHostException unused) {
        }
        return new C43707b("GET", a2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0118, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x011a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011b, code lost:
        r16 = r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0118 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:12:0x002d] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0129 A[Catch:{ all -> 0x011f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo105685a() {
        /*
            r19 = this;
            r1 = r19
            long r2 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.effectmanager.common.b r4 = r19.m138762b()
        L_0x000a:
            int r0 = r1.f113440g
            int r5 = r0 + -1
            r1.f113440g = r5
            if (r0 == 0) goto L_0x0145
            r5 = 0
            boolean r0 = r1.f113228e     // Catch:{ Exception -> 0x0122 }
            if (r0 == 0) goto L_0x0025
            com.ss.android.ugc.effectmanager.common.d.c r0 = new com.ss.android.ugc.effectmanager.common.d.c     // Catch:{ Exception -> 0x0122 }
            r6 = 10001(0x2711, float:1.4014E-41)
            r0.<init>(r6)     // Catch:{ Exception -> 0x0122 }
            r1.m138760a(r0)     // Catch:{ Exception -> 0x0122 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r5)
            return
        L_0x0025:
            com.ss.android.ugc.effectmanager.g r0 = r1.f113439b     // Catch:{ Exception -> 0x0122 }
            com.ss.android.ugc.effectmanager.network.a r0 = r0.f113533x     // Catch:{ Exception -> 0x0122 }
            java.io.InputStream r6 = r0.mo106116a(r4)     // Catch:{ Exception -> 0x0122 }
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.g r0 = r1.f113439b     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.network.a r0 = r0.f113533x     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.common.c.c r9 = r1.f113442i     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.lang.Class<com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse> r10 = com.p280ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse.class
            com.ss.android.ugc.effectmanager.common.model.BaseNetResponse r0 = r0.mo106115a(r4, r6, r9, r10)     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse r0 = (com.p280ss.android.ugc.effectmanager.effect.model.net.PanelInfoResponse) r0     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            boolean r11 = r0.checkValue()     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            if (r11 != 0) goto L_0x005f
            int r0 = r1.f113440g     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            if (r0 != 0) goto L_0x005b
            com.ss.android.ugc.effectmanager.common.d.c r0 = new com.ss.android.ugc.effectmanager.common.d.c     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            r5 = 10002(0x2712, float:1.4016E-41)
            r0.<init>(r5)     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            r1.m138760a(r0)     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r6)
            return
        L_0x005b:
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r6)
            goto L_0x000a
        L_0x005f:
            com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel r11 = r0.data     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel r12 = r11.category_effects     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            if (r12 == 0) goto L_0x008c
            com.ss.android.ugc.effectmanager.g r13 = r1.f113439b     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.io.File r13 = r13.f113519j     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r14 = r12.effects     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c.m138584a(r13, r14)     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.g r13 = r1.f113439b     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.io.File r13 = r13.f113519j     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r14 = r12.collection     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c.m138584a(r13, r14)     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.g r13 = r1.f113439b     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.io.File r13 = r13.f113519j     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.lang.String r13 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.util.List<com.ss.android.ugc.effectmanager.effect.model.Effect> r12 = r12.bind_effects     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43731c.m138584a(r13, r12)     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
        L_0x008c:
            r1.m138761a(r0)     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.common.c.d r0 = r1.f113443j     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            if (r0 == 0) goto L_0x0105
            com.ss.android.ugc.effectmanager.common.c.d r0 = r1.f113443j     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.lang.String r14 = "panel_info_success_rate"
            com.ss.android.ugc.effectmanager.common.e.d r5 = com.p280ss.android.ugc.effectmanager.common.p1730e.C43732d.m138588a()     // Catch:{ Exception -> 0x011a, all -> 0x0118 }
            java.lang.String r15 = "app_id"
            r16 = r4
            com.ss.android.ugc.effectmanager.g r4 = r1.f113439b     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            java.lang.String r4 = r4.f113521l     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r5.mo105776a(r15, r4)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            java.lang.String r5 = "access_key"
            com.ss.android.ugc.effectmanager.g r15 = r1.f113439b     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            java.lang.String r15 = r15.f113511b     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105776a(r5, r15)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            java.lang.String r5 = "panel"
            java.lang.String r15 = r1.f113444k     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105776a(r5, r15)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            java.lang.String r5 = "duration"
            r15 = 0
            long r17 = r12 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105775a(r5, r15)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            java.lang.String r5 = "network_time"
            r15 = 0
            long r17 = r7 - r2
            java.lang.Long r15 = java.lang.Long.valueOf(r17)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105775a(r5, r15)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            java.lang.String r5 = "json_time"
            r15 = 0
            long r7 = r9 - r7
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105775a(r5, r7)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            java.lang.String r5 = "io_time"
            r7 = 0
            long r12 = r12 - r9
            java.lang.Long r7 = java.lang.Long.valueOf(r12)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105775a(r5, r7)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            java.lang.String r5 = "size"
            long r7 = r1.f113452s     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            com.ss.android.ugc.effectmanager.common.e.d r4 = r4.mo105775a(r5, r7)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            org.json.JSONObject r4 = r4.mo105777b()     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            r5 = 0
            r0.mo55503a(r14, r5, r4)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            goto L_0x0107
        L_0x0105:
            r16 = r4
        L_0x0107:
            r0 = 22
            com.ss.android.ugc.effectmanager.effect.e.a.j r4 = new com.ss.android.ugc.effectmanager.effect.e.a.j     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            r5 = 0
            r4.<init>(r11, r5)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            r1.mo105769a(r0, r4)     // Catch:{ Exception -> 0x0116, all -> 0x0118 }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r6)
            return
        L_0x0116:
            r0 = move-exception
            goto L_0x011d
        L_0x0118:
            r0 = move-exception
            goto L_0x0141
        L_0x011a:
            r0 = move-exception
            r16 = r4
        L_0x011d:
            r5 = r6
            goto L_0x0125
        L_0x011f:
            r0 = move-exception
            r6 = r5
            goto L_0x0141
        L_0x0122:
            r0 = move-exception
            r16 = r4
        L_0x0125:
            int r4 = r1.f113440g     // Catch:{ all -> 0x011f }
            if (r4 == 0) goto L_0x0135
            boolean r4 = r0 instanceof com.p280ss.android.ugc.effectmanager.common.exception.StatusCodeException     // Catch:{ all -> 0x011f }
            if (r4 == 0) goto L_0x012e
            goto L_0x0135
        L_0x012e:
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r5)
            r4 = r16
            goto L_0x000a
        L_0x0135:
            com.ss.android.ugc.effectmanager.common.d.c r2 = new com.ss.android.ugc.effectmanager.common.d.c     // Catch:{ all -> 0x011f }
            r2.<init>(r0)     // Catch:{ all -> 0x011f }
            r1.m138760a(r2)     // Catch:{ all -> 0x011f }
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r5)
            return
        L_0x0141:
            com.p280ss.android.ugc.effectmanager.common.p1730e.C43729a.m138574a(r6)
            throw r0
        L_0x0145:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.effectmanager.effect.p1735e.p1737b.C43820o.mo105685a():void");
    }

    /* renamed from: a */
    private void m138760a(C43726c cVar) {
        cVar.mo105767a(this.f113445l, this.f113446m, this.f113447n);
        mo105769a(22, new C43793j(null, cVar));
        if (this.f113443j != null) {
            this.f113443j.mo55503a("panel_info_success_rate", 1, C43732d.m138588a().mo105776a("app_id", this.f113439b.f113521l).mo105776a("access_key", this.f113439b.f113511b).mo105776a("panel", this.f113444k).mo105774a("error_code", Integer.valueOf(cVar.f113220a)).mo105776a("error_msg", cVar.f113221b).mo105777b());
        }
    }

    /* renamed from: a */
    private void m138761a(PanelInfoResponse panelInfoResponse) {
        String b = C43730b.m138578b(this.f113439b.f113515f, this.f113444k);
        this.f113441h.mo105732a(b, this.f113442i.mo70690a(panelInfoResponse));
        StringBuilder sb = new StringBuilder();
        sb.append(this.f113439b.f113519j);
        sb.append(File.separator);
        sb.append(b);
        this.f113452s = new File(sb.toString()).length() / ((long) C43702a.f113154a);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C38347c.f99551f, panelInfoResponse.data.version);
            this.f113441h.mo105732a(C43730b.m138575a(this.f113444k), jSONObject.toString());
        } catch (JSONException unused) {
        }
    }

    public C43820o(C43680a aVar, String str, String str2, boolean z, String str3, int i, int i2, Handler handler) {
        super(handler, str2, "NETWORK");
        this.f113444k = str;
        this.f113448o = z;
        this.f113449p = str3;
        this.f113450q = i;
        this.f113451r = i2;
        this.f113438a = aVar;
    }
}
