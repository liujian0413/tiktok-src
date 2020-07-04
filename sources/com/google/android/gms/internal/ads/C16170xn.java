package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.ads.internal.C14793ay;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xn */
public final class C16170xn extends C16172xp {

    /* renamed from: a */
    private final Object f45402a = new Object();

    /* renamed from: b */
    private final Context f45403b;

    /* renamed from: c */
    private SharedPreferences f45404c;

    /* renamed from: d */
    private final C15892ne<JSONObject, JSONObject> f45405d;

    public C16170xn(Context context, C15892ne<JSONObject, JSONObject> neVar) {
        this.f45403b = context.getApplicationContext();
        this.f45405d = neVar;
    }

    /* renamed from: a */
    public final agj<Void> mo42066a() {
        synchronized (this.f45402a) {
            if (this.f45404c == null) {
                this.f45404c = C7285c.m22838a(this.f45403b, "google_ads_flags_meta", 0);
            }
        }
        if (C14793ay.m42901g().mo38684a() - this.f45404c.getLong("js_last_update", 0) < ((Long) bym.m50299d().mo41272a(C15585bw.f43815bI)).longValue()) {
            return afy.m45817a(null);
        }
        return afy.m45820a(this.f45405d.mo41767b(m52384a(this.f45403b)), (C15477afu<A, B>) new C16171xo<A,B>(this), ago.f40190b);
    }

    /* renamed from: a */
    private static JSONObject m52384a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("js", zzbgz.m52673a().f45677a);
            jSONObject.put("mf", bym.m50299d().mo41272a(C15585bw.f43816bJ));
            jSONObject.put("cl", "235029740");
            jSONObject.put("rapid_rc", "dev");
            jSONObject.put("rapid_rollup", "HEAD");
            jSONObject.put("admob_module_version", 11140);
            jSONObject.put("dynamite_local_version", ModuleDescriptor.MODULE_VERSION);
            jSONObject.put("dynamite_version", DynamiteModule.m44690b(context, ModuleDescriptor.MODULE_ID));
            jSONObject.put("container_version", 12451009);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Void mo42067a(JSONObject jSONObject) {
        C15585bw.m50189a(this.f45403b, 1, jSONObject);
        this.f45404c.edit().putLong("js_last_update", C14793ay.m42901g().mo38684a()).apply();
        return null;
    }
}
