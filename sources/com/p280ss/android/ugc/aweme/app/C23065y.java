package com.p280ss.android.ugc.aweme.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.p280ss.android.p293di.push.C6804a;
import com.p280ss.android.p854d.C19292b;
import com.p280ss.android.ugc.aweme.app.p305g.C22988e;
import com.p280ss.android.ugc.aweme.commercialize.C24558c;
import com.p280ss.android.ugc.aweme.commercialize.log.C24958f;
import com.p280ss.android.ugc.aweme.commercialize.p1114a.C24504a.C24505a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25268bg;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.commercialize.utils.p1136b.C25258a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.C6909j;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.y */
public final class C23065y {

    /* renamed from: a */
    private Context f60884a;

    /* renamed from: b */
    private Intent f60885b;

    /* renamed from: b */
    public final void mo60103b(Uri uri) {
        if (uri.toString().startsWith(C24505a.f64678a)) {
            C1592h.m7853a((Callable<TResult>) new C23066z<TResult>(this, uri));
        }
        C25258a.m83020a(uri);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ Object mo60104c(Uri uri) throws Exception {
        Aweme aweme = C24558c.m80613a().f64800a;
        C24558c.m80613a().f64800a = null;
        if (aweme == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("tag");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = "draw_ad";
        }
        if (!TextUtils.equals(queryParameter, "comment_ad")) {
            C24958f.m81905a().mo65273b(aweme).mo65266a(queryParameter).mo65276b("open_url_appback").mo65270a(this.f60884a);
        } else if (C25352e.m83232o(aweme)) {
            C24958f.m81905a().mo65272b(C25268bg.m83039a(aweme)).mo65266a(queryParameter).mo65276b("open_url_appback").mo65270a(this.f60884a);
        }
        return null;
    }

    /* renamed from: a */
    public static void m75809a(Uri uri) {
        String queryParameter = uri.getQueryParameter("appParam");
        if (queryParameter != null) {
            JSONObject jSONObject = null;
            try {
                jSONObject = new JSONObject(queryParameter);
            } catch (JSONException unused) {
            }
            if (jSONObject != null) {
                String optString = jSONObject.optString("__type__");
                String optString2 = jSONObject.optString("position");
                String optString3 = jSONObject.optString("iid");
                String optString4 = jSONObject.optString("wxshare_count");
                String optString5 = jSONObject.optString("parent_group_id");
                String optString6 = jSONObject.optString("webid");
                C6909j jVar = new C6909j();
                jVar.mo16966a("__type__", optString);
                jVar.mo16966a("position", optString2);
                jVar.mo16966a("iid", optString3);
                if (!C6319n.m19593a(optString4)) {
                    jVar.mo16966a("wxshare_count", optString4);
                }
                jVar.mo16966a("parent_group_id", optString5);
                if (!C6319n.m19593a(optString6)) {
                    jVar.mo16966a("webid", optString6);
                }
                C6907h.onEvent(new MobClick().setEventName(C22912d.f60642b).setLabelName("scheme").setJsonObject(jVar.mo16967a()));
            }
        }
    }

    public C23065y(Context context, Intent intent) {
        this.f60884a = context;
        this.f60885b = intent;
    }

    /* renamed from: a */
    public final void mo60102a(boolean z, Uri uri) {
        C6804a.m21138a().notifyOnDeeplink(z, this.f60884a, this.f60885b, uri);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053 A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056 A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061 A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064 A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076 A[Catch:{ Exception -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00c1 A[Catch:{ Exception -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c4 A[Catch:{ Exception -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00cc A[Catch:{ Exception -> 0x00dd }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60101a(android.net.Uri r7, boolean r8) {
        /*
            r6 = this;
            java.lang.String r0 = "label"
            java.lang.String r0 = r7.getQueryParameter(r0)
            java.lang.String r1 = "push_id"
            java.lang.String r1 = r7.getQueryParameter(r1)
            java.lang.String r2 = "gd_label"
            java.lang.String r2 = r7.getQueryParameter(r2)
            if (r0 != 0) goto L_0x0016
            if (r8 == 0) goto L_0x00dd
        L_0x0016:
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = r7.getLastPathSegment()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L_0x0028
            java.lang.String r7 = "0"
            goto L_0x002c
        L_0x0028:
            java.lang.String r7 = r7.getLastPathSegment()
        L_0x002c:
            java.lang.String r4 = "network_type"
            android.content.Context r5 = r6.f60884a     // Catch:{ JSONException -> 0x003f }
            com.ss.android.common.util.NetworkUtils$NetworkType r5 = com.p280ss.android.common.util.NetworkUtils.getNetworkType(r5)     // Catch:{ JSONException -> 0x003f }
            java.lang.String r5 = com.p280ss.android.common.util.NetworkUtils.getNetworkAccessType(r5)     // Catch:{ JSONException -> 0x003f }
            java.lang.String r5 = r5.toUpperCase()     // Catch:{ JSONException -> 0x003f }
            r3.put(r4, r5)     // Catch:{ JSONException -> 0x003f }
        L_0x003f:
            com.ss.android.ugc.aweme.common.MobClick r4 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r5 = "push"
            com.ss.android.ugc.aweme.common.MobClick r4 = r4.setEventName(r5)     // Catch:{ Exception -> 0x00a3 }
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = ""
        L_0x004d:
            com.ss.android.ugc.aweme.common.MobClick r0 = r4.setLabelName(r0)     // Catch:{ Exception -> 0x00a3 }
            if (r1 != 0) goto L_0x0056
            java.lang.String r4 = ""
            goto L_0x0057
        L_0x0056:
            r4 = r1
        L_0x0057:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r4)     // Catch:{ Exception -> 0x00a3 }
            boolean r4 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00a3 }
            if (r4 == 0) goto L_0x0064
            java.lang.String r4 = "0"
            goto L_0x0065
        L_0x0064:
            r4 = r7
        L_0x0065:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setExtValueString(r4)     // Catch:{ Exception -> 0x00a3 }
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setJsonObject(r3)     // Catch:{ Exception -> 0x00a3 }
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r0)     // Catch:{ Exception -> 0x00a3 }
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()     // Catch:{ Exception -> 0x00a3 }
            if (r0 != 0) goto L_0x00a3
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x00a3 }
            java.lang.String r4 = "launch_app"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r4)     // Catch:{ Exception -> 0x00a3 }
            if (r2 != 0) goto L_0x0084
            java.lang.String r2 = ""
        L_0x0084:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r2)     // Catch:{ Exception -> 0x00a3 }
            if (r1 != 0) goto L_0x008d
            java.lang.String r2 = ""
            goto L_0x008e
        L_0x008d:
            r2 = r1
        L_0x008e:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setValue(r2)     // Catch:{ Exception -> 0x00a3 }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x00a3 }
            if (r2 == 0) goto L_0x009b
            java.lang.String r2 = "0"
            goto L_0x009c
        L_0x009b:
            r2 = r7
        L_0x009c:
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setExtValueString(r2)     // Catch:{ Exception -> 0x00a3 }
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r0)     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            boolean r0 = com.bytedance.ies.ugc.appcontext.C6399b.m19944t()
            if (r0 == 0) goto L_0x00dd
            if (r8 == 0) goto L_0x00dd
            android.content.Intent r8 = r6.f60885b     // Catch:{ Exception -> 0x00dd }
            java.lang.String r0 = "msg_from"
            r2 = -1
            int r8 = com.p280ss.android.newmedia.message.C19950a.m65793a(r8, r0, r2)     // Catch:{ Exception -> 0x00dd }
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p280ss.android.ugc.aweme.common.MobClick.obtain()     // Catch:{ Exception -> 0x00dd }
            java.lang.String r2 = "detail"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r2)     // Catch:{ Exception -> 0x00dd }
            r2 = 1
            if (r8 != r2) goto L_0x00c4
            java.lang.String r8 = "click_news_notify"
            goto L_0x00c6
        L_0x00c4:
            java.lang.String r8 = "click_news_alert"
        L_0x00c6:
            com.ss.android.ugc.aweme.common.MobClick r8 = r0.setLabelName(r8)     // Catch:{ Exception -> 0x00dd }
            if (r1 != 0) goto L_0x00ce
            java.lang.String r1 = ""
        L_0x00ce:
            com.ss.android.ugc.aweme.common.MobClick r8 = r8.setValue(r1)     // Catch:{ Exception -> 0x00dd }
            com.ss.android.ugc.aweme.common.MobClick r7 = r8.setExtValueString(r7)     // Catch:{ Exception -> 0x00dd }
            com.ss.android.ugc.aweme.common.MobClick r7 = r7.setJsonObject(r3)     // Catch:{ Exception -> 0x00dd }
            com.p280ss.android.ugc.aweme.common.C6907h.onEvent(r7)     // Catch:{ Exception -> 0x00dd }
        L_0x00dd:
            com.ss.android.ugc.aweme.ab.a r7 = com.p280ss.android.ugc.aweme.p304ab.C6857a.m21312e()
            long r7 = r7.f19502b
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r7
            java.lang.String r7 = "aweme_app_performance"
            java.lang.String r8 = "main_page_time"
            float r0 = (float) r0
            com.p280ss.android.ugc.aweme.app.C6877n.m21446a(r7, r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.app.C23065y.mo60101a(android.net.Uri, boolean):void");
    }

    /* renamed from: a */
    public final void mo60100a(Uri uri, C22988e eVar, boolean z) {
        C19292b.m63215a(this.f60884a).mo51191a(m75810b(uri, eVar, z));
    }

    /* renamed from: b */
    private static Uri m75810b(Uri uri, C22988e eVar, boolean z) {
        Builder appendQueryParameter = uri.buildUpon().appendQueryParameter("launch_method", eVar.f60756a).appendQueryParameter("page_source", eVar.f60757b).appendQueryParameter("enter_to", eVar.f60758c).appendQueryParameter("platform", eVar.f60759d);
        if (!TextUtils.isEmpty(eVar.f60758c)) {
            appendQueryParameter.appendQueryParameter("needlaunchlog", "true");
        }
        return appendQueryParameter.build();
    }
}
