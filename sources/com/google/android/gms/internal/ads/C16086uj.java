package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.uj */
final class C16086uj implements C15742hq<ami> {

    /* renamed from: a */
    private final /* synthetic */ ami f45111a;

    /* renamed from: b */
    private final /* synthetic */ agu f45112b;

    /* renamed from: c */
    private final /* synthetic */ C16080ud f45113c;

    C16086uj(C16080ud udVar, ami ami, agu agu) {
        this.f45113c = udVar;
        this.f45111a = ami;
        this.f45112b = agu;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        boolean z;
        JSONObject jSONObject;
        try {
            String str = (String) map.get("success");
            String str2 = (String) map.get("failure");
            if (!TextUtils.isEmpty(str2)) {
                jSONObject = new JSONObject(str2);
                z = false;
            } else {
                jSONObject = new JSONObject(str);
                z = true;
            }
            if (this.f45113c.f45101g.equals(jSONObject.optString("ads_id", ""))) {
                this.f45111a.mo39725b("/nativeAdPreProcess", this);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("success", z);
                jSONObject2.put("json", jSONObject);
                this.f45112b.mo39333b(jSONObject2);
            }
        } catch (Throwable th) {
            acd.m45778b("Error while preprocessing json.", th);
            this.f45112b.mo39332a(th);
        }
    }
}
