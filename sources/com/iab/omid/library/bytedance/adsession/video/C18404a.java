package com.iab.omid.library.bytedance.adsession.video;

import com.iab.omid.library.bytedance.p791d.C18426d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.iab.omid.library.bytedance.adsession.video.a */
public final class C18404a {

    /* renamed from: a */
    private final boolean f49932a = false;

    /* renamed from: b */
    private final Float f49933b = null;

    /* renamed from: c */
    private final boolean f49934c;

    /* renamed from: d */
    private final Position f49935d;

    private C18404a(boolean z, Float f, boolean z2, Position position) {
        this.f49934c = z2;
        this.f49935d = position;
    }

    /* renamed from: a */
    public static C18404a m60576a(boolean z, Position position) {
        C18426d.m60669a((Object) position, "Position is null");
        return new C18404a(false, null, true, position);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final JSONObject mo47820a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f49932a);
            if (this.f49932a) {
                jSONObject.put("skipOffset", this.f49933b);
            }
            jSONObject.put("autoPlay", this.f49934c);
            jSONObject.put("position", this.f49935d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
