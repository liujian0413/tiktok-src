package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C15585bw;
import com.google.android.gms.internal.ads.C15892ne;
import com.google.android.gms.internal.ads.C15896ni;
import com.google.android.gms.internal.ads.C15897nj;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.abn;
import com.google.android.gms.internal.ads.acd;
import com.google.android.gms.internal.ads.afw;
import com.google.android.gms.internal.ads.afy;
import com.google.android.gms.internal.ads.agj;
import com.google.android.gms.internal.ads.ago;
import com.google.android.gms.internal.ads.bym;
import com.google.android.gms.internal.ads.zzbgz;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.f */
public final class C14824f {

    /* renamed from: a */
    private Context f38345a;

    /* renamed from: b */
    private long f38346b;

    /* renamed from: a */
    public final void mo37770a(Context context, zzbgz zzbgz, String str, Runnable runnable) {
        mo37771a(context, zzbgz, true, null, str, null, runnable);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo37771a(Context context, zzbgz zzbgz, boolean z, abn abn, String str, String str2, Runnable runnable) {
        if (C14793ay.m42901g().mo38685b() - this.f38346b < DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
            acd.m45783e("Not retrying to fetch app settings");
            return;
        }
        this.f38346b = C14793ay.m42901g().mo38685b();
        boolean z2 = true;
        if (abn != null) {
            if (!(C14793ay.m42901g().mo38684a() - abn.f39913a > ((Long) bym.m50299d().mo41272a(C15585bw.f43832bZ)).longValue()) && abn.f39917e) {
                z2 = false;
            }
        }
        if (z2) {
            if (context == null) {
                acd.m45783e("Context not provided to fetch application settings");
            } else if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                this.f38345a = applicationContext;
                C15896ni<JSONObject> niVar = C15897nj.f44689a;
                C15892ne a = C14793ay.m42907m().mo41769b(this.f38345a, zzbgz).mo41772a("google.afma.config.fetchAppSettings", niVar, niVar);
                try {
                    JSONObject jSONObject = new JSONObject();
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("app_id", str);
                    } else if (!TextUtils.isEmpty(str2)) {
                        jSONObject.put("ad_unit_id", str2);
                    }
                    jSONObject.put("is_init", z);
                    jSONObject.put("pn", context.getPackageName());
                    agj b = a.mo41767b(jSONObject);
                    agj a2 = afy.m45819a(b, C14825g.f38347a, ago.f40190b);
                    if (runnable != null) {
                        b.mo39308a(runnable, ago.f40190b);
                    }
                    afw.m45813a(a2, "ConfigLoader.maybeFetchNewAppSettings");
                } catch (Exception e) {
                    acd.m45778b("Error requesting application settings", e);
                }
            } else {
                acd.m45783e("App settings could not be fetched. Required parameters missing");
            }
        }
    }
}
