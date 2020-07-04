package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14793ay;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xs */
public final class C16175xs implements C16159xc {

    /* renamed from: a */
    private C15892ne<JSONObject, JSONObject> f45407a;

    /* renamed from: b */
    private C15892ne<JSONObject, JSONObject> f45408b;

    public C16175xs(Context context) {
        C15896ni<JSONObject> niVar = C15897nj.f44689a;
        this.f45407a = C14793ay.m42907m().mo41768a(context, zzbgz.m52673a()).mo41772a("google.afma.request.getAdDictionary", niVar, niVar);
        C15896ni<JSONObject> niVar2 = C15897nj.f44689a;
        this.f45408b = C14793ay.m42907m().mo41768a(context, zzbgz.m52673a()).mo41772a("google.afma.sdkConstants.getSdkConstants", niVar2, niVar2);
    }

    /* renamed from: a */
    public final C15892ne<JSONObject, JSONObject> mo42058a() {
        return this.f45407a;
    }

    /* renamed from: b */
    public final C15892ne<JSONObject, JSONObject> mo42059b() {
        return this.f45408b;
    }
}
