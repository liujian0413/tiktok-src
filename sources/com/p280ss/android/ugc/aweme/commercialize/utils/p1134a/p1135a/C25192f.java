package com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a;

import android.content.Intent;
import com.p280ss.android.newmedia.C19929d;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.a.a.f */
public class C25192f extends C25183a {
    /* renamed from: e */
    private final String m82868e() {
        return mo65816d().f66431b.f66463a;
    }

    /* renamed from: a */
    public final boolean mo65817a() {
        boolean z;
        if (m82868e().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        return C19929d.m65759a(m82868e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0213, code lost:
        if (r1 == null) goto L_0x0215;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo65818b() {
        /*
            r10 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r10.mo65815c()
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity> r2 = com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity.class
            r0.<init>(r1, r2)
            java.lang.String r1 = r10.m82868e()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f66431b
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f66466d
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x005f
            java.lang.String r1 = r10.m82868e()
            android.net.Uri r1 = android.net.Uri.parse(r1)
            android.net.Uri$Builder r1 = r1.buildUpon()
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f66431b
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f66466d
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x003f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x005b
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r1.appendQueryParameter(r5, r4)
            goto L_0x003f
        L_0x005b:
            android.net.Uri r1 = r1.build()
        L_0x005f:
            r0.setData(r1)
            java.lang.String r2 = "launch_mode"
            java.lang.String r1 = r1.getQueryParameter(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "standard"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 != 0) goto L_0x0079
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)
        L_0x0079:
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r1 = r1.f66431b
            java.lang.String r1 = r1.f66464b
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            r2 = 0
            if (r1 <= 0) goto L_0x008c
            r1 = 1
            goto L_0x008d
        L_0x008c:
            r1 = 0
        L_0x008d:
            if (r1 == 0) goto L_0x009d
            java.lang.String r1 = "title"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r4 = r4.f66431b
            java.lang.String r4 = r4.f66464b
            r0.putExtra(r1, r4)
            goto L_0x00a9
        L_0x009d:
            java.lang.String r1 = "title"
            java.lang.String r4 = " "
            r0.putExtra(r1, r4)
            java.lang.String r1 = "use_webview_title"
            r0.putExtra(r1, r3)
        L_0x00a9:
            java.lang.String r1 = "show_report"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r4 = r4.f66431b
            boolean r4 = r4.f66468f
            r0.putExtra(r1, r4)
            java.lang.String r1 = "bundle_app_ad_from"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r4 = r4.f66431b
            int r4 = r4.f66475m
            r0.putExtra(r1, r4)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r1 = r1.f66430a
            long r4 = r1.f66438b
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0116
            java.lang.String r1 = "ad_id"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r4 = r4.f66430a
            long r4 = r4.f66438b
            r0.putExtra(r1, r4)
            java.lang.String r1 = "aweme_creative_id"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r4 = r4.f66430a
            long r4 = r4.f66438b
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r0.putExtra(r1, r4)
            java.lang.String r1 = "ad_type"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r4 = r4.f66430a
            java.lang.String r4 = r4.f66441e
            m82867a(r0, r1, r4)
            java.lang.String r1 = "ad_system_origin"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r4 = r4.f66430a
            int r4 = r4.f66442f
            r0.putExtra(r1, r4)
            java.lang.String r1 = "bundle_download_app_log_extra"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r4 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r4 = r4.f66430a
            java.lang.String r4 = r4.f66439c
            m82867a(r0, r1, r4)
        L_0x0116:
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p280ss.android.ugc.aweme.app.SharePrefCache.inst()
            java.lang.String r4 = "SharePrefCache.inst()"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            com.ss.android.ugc.aweme.app.bl r1 = r1.getJsActlogUrl()
            java.lang.String r4 = "SharePrefCache.inst().jsActlogUrl"
            kotlin.jvm.internal.C7573i.m23582a(r1, r4)
            java.lang.Object r1 = r1.mo59877d()
            java.lang.String r1 = (java.lang.String) r1
            r4 = 0
            if (r1 == 0) goto L_0x0148
            r5 = r1
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x013c
            r5 = 1
            goto L_0x013d
        L_0x013c:
            r5 = 0
        L_0x013d:
            if (r5 == 0) goto L_0x0140
            goto L_0x0141
        L_0x0140:
            r1 = r4
        L_0x0141:
            if (r1 == 0) goto L_0x0148
            java.lang.String r5 = "ad_js_url"
            r0.putExtra(r5, r1)
        L_0x0148:
            java.lang.String r1 = "bundle_disable_download_dialog"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            boolean r5 = r5.f66446d
            r0.putExtra(r1, r5)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r1 = r1.f66435f
            java.lang.String r1 = r1.f66443a
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0167
            r1 = 1
            goto L_0x0168
        L_0x0167:
            r1 = 0
        L_0x0168:
            if (r1 == 0) goto L_0x01f9
            java.lang.String r1 = "bundle_download_url"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            java.lang.String r5 = r5.f66443a
            r0.putExtra(r1, r5)
            java.lang.String r1 = "aweme_package_name"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            java.lang.String r5 = r5.f66444b
            m82867a(r0, r1, r5)
            java.lang.String r1 = "bundle_is_from_app_ad"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            boolean r5 = r5.f66447e
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_ad_quick_app_url"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            java.lang.String r5 = r5.f66445c
            m82867a(r0, r1, r5)
            java.lang.String r1 = "bundle_download_app_name"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            java.lang.String r5 = r5.f66448f
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_download_mode"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            int r5 = r5.f66449g
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_link_mode"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            int r5 = r5.f66450h
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_support_multiple_download"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            boolean r5 = r5.f66451i
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_web_url"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            java.lang.String r5 = r5.f66452j
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_web_title"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            java.lang.String r5 = r5.f66453k
            r0.putExtra(r1, r5)
            java.lang.String r1 = "bundle_open_url"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$c r5 = r5.f66435f
            java.lang.String r5 = r5.f66454l
            r0.putExtra(r1, r5)
        L_0x01f9:
            android.content.Context r1 = r10.mo65815c()
            com.ss.android.ugc.aweme.commercialize.utils.a.a r5 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r5 = r5.f66430a
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.f66437a
            java.lang.String r8 = ""
            org.json.JSONObject r1 = com.p280ss.android.ugc.aweme.commercialize.log.C24976t.m82274s(r1, r5, r8)
            java.lang.String r5 = "aweme_json_extra"
            if (r1 == 0) goto L_0x0215
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x0217
        L_0x0215:
            java.lang.String r1 = ""
        L_0x0217:
            r0.putExtra(r5, r1)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r1 = r1.f66430a
            long r8 = r1.f66440d
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r5 = r1
            java.lang.Number r5 = (java.lang.Number) r5
            long r8 = r5.longValue()
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0232
            r2 = 1
        L_0x0232:
            if (r2 == 0) goto L_0x0235
            goto L_0x0236
        L_0x0235:
            r1 = r4
        L_0x0236:
            if (r1 == 0) goto L_0x0243
            java.lang.Number r1 = (java.lang.Number) r1
            long r1 = r1.longValue()
            java.lang.String r3 = "group_id"
            r0.putExtra(r3, r1)
        L_0x0243:
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r1 = r1.f66431b
            java.lang.Integer r1 = r1.f66469g
            if (r1 == 0) goto L_0x0258
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "bundle_webview_background"
            r0.putExtra(r2, r1)
        L_0x0258:
            java.lang.String r1 = "aweme_id"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r2 = r2.f66430a
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f66437a
            if (r2 == 0) goto L_0x0269
            java.lang.String r2 = r2.getAid()
            goto L_0x026a
        L_0x0269:
            r2 = r4
        L_0x026a:
            r0.putExtra(r1, r2)
            java.lang.String r1 = "owner_id"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r2 = r2.f66430a
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.f66437a
            if (r2 == 0) goto L_0x027d
            java.lang.String r4 = r2.getAuthorUid()
        L_0x027d:
            r0.putExtra(r1, r4)
            java.lang.String r1 = "bundle_forbidden_jump"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f66431b
            boolean r2 = r2.f66470h
            r0.putExtra(r1, r2)
            java.lang.String r1 = "use_ordinary_web"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f66431b
            boolean r2 = r2.f66467e
            r0.putExtra(r1, r2)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r1 = r1.f66431b
            com.ss.android.ugc.aweme.commercialize.feed.preload.PreloadData r1 = r1.f66471i
            if (r1 == 0) goto L_0x02ad
            java.lang.String r2 = "preload_site_id"
            java.lang.String r1 = r1.getSiteId()
            r0.putExtra(r2, r1)
        L_0x02ad:
            java.lang.String r1 = "preload_web_status"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f66431b
            int r2 = r2.f66472j
            r0.putExtra(r1, r2)
            java.lang.String r1 = "preload_is_web_url"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f66431b
            int r2 = r2.f66473k
            r0.putExtra(r1, r2)
            java.lang.String r1 = "web_type"
            com.ss.android.ugc.aweme.commercialize.utils.a.a r2 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$g r2 = r2.f66431b
            int r2 = r2.f66474l
            r0.putExtra(r1, r2)
            com.ss.android.ugc.aweme.commercialize.utils.a.a r1 = r10.mo65816d()
            com.ss.android.ugc.aweme.commercialize.utils.a.a$b r1 = r1.f66430a
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.f66437a
            com.p280ss.android.ugc.aweme.commercialize.utils.C25252aw.m83005a(r1)
            android.content.Context r1 = r10.mo65815c()
            boolean r0 = m82844a(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.utils.p1134a.p1135a.C25192f.mo65818b():boolean");
    }

    /* renamed from: a */
    private static void m82867a(Intent intent, String str, String str2) {
        boolean z;
        if (str2 != null) {
            if (str2.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                intent.putExtra(str, str2);
            }
        }
    }
}
