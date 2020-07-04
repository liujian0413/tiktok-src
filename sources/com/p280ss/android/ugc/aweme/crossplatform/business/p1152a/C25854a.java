package com.p280ss.android.ugc.aweme.crossplatform.business.p1152a;

import android.text.TextUtils;
import android.webkit.WebView;
import com.p280ss.android.ugc.aweme.commercialize.feed.preload.C24736b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.crossplatform.params.C25884b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.business.a.a */
public final class C25854a {

    /* renamed from: a */
    private long f68376a;

    /* renamed from: b */
    private int f68377b;

    /* renamed from: c */
    private long f68378c;

    /* renamed from: d */
    private boolean f68379d;

    /* renamed from: e */
    private boolean f68380e;

    /* renamed from: f */
    private boolean f68381f;

    /* renamed from: g */
    private String f68382g;

    /* renamed from: h */
    private String f68383h;

    /* renamed from: i */
    private boolean f68384i;

    /* renamed from: a */
    public final void mo67223a() {
        this.f68384i = false;
        this.f68380e = false;
        this.f68381f = false;
        this.f68383h = null;
        this.f68378c = 0;
        this.f68376a = 0;
    }

    /* renamed from: a */
    public final void mo67227a(WebView webView, String str, C25884b bVar) {
        if (webView != null && !TextUtils.isEmpty(str) && bVar != null) {
            if (this.f68382g == null) {
                this.f68382g = str;
            }
            if (this.f68376a == 0) {
                this.f68376a = System.currentTimeMillis();
            }
            String str2 = bVar.f68465t;
            if (bVar.f68466u == 7) {
                this.f68377b = 5;
                return;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f68377b = C24736b.f65176b.mo64733b(str2);
            }
        }
    }

    /* renamed from: a */
    private void m85081a(String str, long j, JSONObject jSONObject, JSONObject jSONObject2) {
        if (j > 0) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("tag", "draw_ad");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject2.put("present_url", this.f68383h);
                jSONObject2.put("next_url", str);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException unused) {
            }
            C6907h.onEvent(MobClick.obtain().setLabelName("jump_page").setEventName("ad_wap_stat").setValue(String.valueOf(j)).setJsonObject(jSONObject));
        }
    }

    /* renamed from: a */
    public final void mo67224a(long j, long j2, JSONObject jSONObject, JSONObject jSONObject2) {
        if (j2 > 0 && this.f68382g != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            try {
                jSONObject.put("is_ad_event", "1");
                jSONObject.put("tag", "draw_ad");
                if (jSONObject2 == null) {
                    jSONObject2 = new JSONObject();
                }
                jSONObject2.put("present_url", this.f68382g);
                jSONObject.put("ad_extra_data", jSONObject2.toString());
            } catch (JSONException unused) {
            }
            C6907h.onEvent(MobClick.obtain().setLabelName("stay_page").setEventName("ad_wap_stat").setValue(String.valueOf(j2)).setExtValueLong(j).setJsonObject(jSONObject));
        }
    }

    /* renamed from: c */
    public final void mo67229c(WebView webView, String str, long j, JSONObject jSONObject, JSONObject jSONObject2) {
        this.f68381f = true;
        mo67225a(webView.getContext(), str, j, jSONObject, jSONObject2);
    }

    /* renamed from: a */
    public final void mo67226a(WebView webView, String str, long j, JSONObject jSONObject, JSONObject jSONObject2) {
        if (webView != null && !TextUtils.isEmpty(str) && !this.f68379d && !this.f68380e) {
            this.f68378c = System.currentTimeMillis();
            this.f68380e = true;
            mo67225a(webView.getContext(), str, j, jSONObject, jSONObject2);
        }
    }

    /* renamed from: b */
    public final void mo67228b(WebView webView, String str, long j, JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        if (webView != null && !TextUtils.isEmpty(str)) {
            if (this.f68383h == null) {
                this.f68383h = this.f68382g;
            }
            if (TextUtils.isEmpty(webView.getOriginalUrl()) || TextUtils.equals(webView.getOriginalUrl(), str) || this.f68380e) {
                z = false;
            } else {
                z = true;
            }
            this.f68379d = z;
            m85081a(str, j, jSONObject, jSONObject2);
            this.f68383h = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (r4 < 1) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0079 A[Catch:{ Exception -> 0x00df }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a A[Catch:{ Exception -> 0x00df }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo67225a(android.content.Context r9, java.lang.String r10, long r11, org.json.JSONObject r13, org.json.JSONObject r14) {
        /*
            r8 = this;
            if (r9 == 0) goto L_0x00e0
            long r0 = r8.f68376a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x000c
            goto L_0x00e0
        L_0x000c:
            int r0 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0011
            return
        L_0x0011:
            boolean r0 = r8.f68379d
            if (r0 != 0) goto L_0x0024
            boolean r0 = r8.f68380e
            if (r0 == 0) goto L_0x0024
            boolean r0 = r8.f68381f
            if (r0 == 0) goto L_0x001e
            goto L_0x0024
        L_0x001e:
            java.lang.String r0 = "load_finish"
            com.p280ss.android.ugc.aweme.commercialize.feed.C24708ac.m81055b()
            goto L_0x0026
        L_0x0024:
            java.lang.String r0 = "load"
        L_0x0026:
            com.bytedance.common.utility.NetworkUtils$NetworkType r9 = com.bytedance.common.utility.NetworkUtils.m19550d(r9)     // Catch:{ Exception -> 0x00df }
            com.bytedance.common.utility.NetworkUtils$NetworkType r1 = com.bytedance.common.utility.NetworkUtils.NetworkType.NONE     // Catch:{ Exception -> 0x00df }
            if (r9 != r1) goto L_0x002f
            return
        L_0x002f:
            if (r13 != 0) goto L_0x0036
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ Exception -> 0x00df }
            r13.<init>()     // Catch:{ Exception -> 0x00df }
        L_0x0036:
            java.lang.String r1 = "ac"
            java.lang.String r4 = com.bytedance.common.utility.NetworkUtils.m19547b(r9)     // Catch:{ Exception -> 0x00df }
            r13.put(r1, r4)     // Catch:{ Exception -> 0x00df }
            boolean r1 = r8.f68381f     // Catch:{ Exception -> 0x00df }
            if (r1 == 0) goto L_0x0046
            java.lang.String r9 = "load_fail"
            goto L_0x0087
        L_0x0046:
            long r4 = r8.f68378c     // Catch:{ Exception -> 0x00df }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x004d
            goto L_0x004f
        L_0x004d:
            java.lang.String r0 = "load"
        L_0x004f:
            long r4 = r8.f68378c     // Catch:{ Exception -> 0x00df }
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x005c
            long r4 = r8.f68378c     // Catch:{ Exception -> 0x00df }
            long r6 = r8.f68376a     // Catch:{ Exception -> 0x00df }
            r1 = 0
            long r4 = r4 - r6
            goto L_0x0064
        L_0x005c:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00df }
            long r6 = r8.f68376a     // Catch:{ Exception -> 0x00df }
            r1 = 0
            long r4 = r4 - r6
        L_0x0064:
            com.bytedance.common.utility.NetworkUtils$NetworkType r1 = com.bytedance.common.utility.NetworkUtils.NetworkType.WIFI     // Catch:{ Exception -> 0x00df }
            r6 = 1
            if (r9 != r1) goto L_0x0070
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0075
        L_0x006e:
            r4 = r2
            goto L_0x0075
        L_0x0070:
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0075
            goto L_0x006e
        L_0x0075:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 > 0) goto L_0x007a
            return
        L_0x007a:
            r1 = 90000(0x15f90, double:4.4466E-319)
            long r1 = java.lang.Math.min(r4, r1)     // Catch:{ Exception -> 0x00df }
            java.lang.String r9 = "duration"
            r13.put(r9, r1)     // Catch:{ Exception -> 0x00df }
            r9 = r0
        L_0x0087:
            if (r10 == 0) goto L_0x008a
            goto L_0x008c
        L_0x008a:
            java.lang.String r10 = r8.f68382g     // Catch:{ Exception -> 0x00df }
        L_0x008c:
            if (r10 != 0) goto L_0x008f
            return
        L_0x008f:
            java.lang.String r0 = "is_ad_event"
            java.lang.String r1 = "1"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x00df }
            java.lang.String r0 = "tag"
            java.lang.String r1 = "draw_ad"
            r13.put(r0, r1)     // Catch:{ Exception -> 0x00df }
            if (r14 != 0) goto L_0x00a4
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Exception -> 0x00df }
            r14.<init>()     // Catch:{ Exception -> 0x00df }
        L_0x00a4:
            java.lang.String r0 = "next_url"
            r14.put(r0, r10)     // Catch:{ Exception -> 0x00df }
            java.lang.String r10 = "preload_status"
            int r0 = r8.f68377b     // Catch:{ Exception -> 0x00df }
            r14.put(r10, r0)     // Catch:{ Exception -> 0x00df }
            java.lang.String r10 = "ad_extra_data"
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x00df }
            r13.put(r10, r14)     // Catch:{ Exception -> 0x00df }
            boolean r10 = r8.f68384i     // Catch:{ Exception -> 0x00df }
            if (r10 == 0) goto L_0x00be
            return
        L_0x00be:
            r10 = 1
            r8.f68384i = r10     // Catch:{ Exception -> 0x00df }
            com.ss.android.ugc.aweme.common.MobClick r10 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x00df }
            com.ss.android.ugc.aweme.common.MobClick r9 = r10.setLabelName(r9)     // Catch:{ Exception -> 0x00df }
            java.lang.String r10 = "ad_wap_stat"
            com.ss.android.ugc.aweme.common.MobClick r9 = r9.setEventName(r10)     // Catch:{ Exception -> 0x00df }
            java.lang.String r10 = java.lang.String.valueOf(r11)     // Catch:{ Exception -> 0x00df }
            com.ss.android.ugc.aweme.common.MobClick r9 = r9.setValue(r10)     // Catch:{ Exception -> 0x00df }
            com.ss.android.ugc.aweme.common.MobClick r9 = r9.setJsonObject(r13)     // Catch:{ Exception -> 0x00df }
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r9)     // Catch:{ Exception -> 0x00df }
            return
        L_0x00df:
            return
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.crossplatform.business.p1152a.C25854a.mo67225a(android.content.Context, java.lang.String, long, org.json.JSONObject, org.json.JSONObject):void");
    }
}
