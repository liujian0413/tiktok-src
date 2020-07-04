package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ro */
public final class C16010ro {

    /* renamed from: a */
    private final boolean f44937a;

    /* renamed from: b */
    private final boolean f44938b;

    /* renamed from: c */
    private final boolean f44939c;

    /* renamed from: d */
    private final boolean f44940d;

    /* renamed from: e */
    private final boolean f44941e;

    private C16010ro(C16012rq rqVar) {
        this.f44937a = rqVar.f44942a;
        this.f44938b = rqVar.f44943b;
        this.f44939c = rqVar.f44944c;
        this.f44940d = rqVar.f44945d;
        this.f44941e = rqVar.f44946e;
    }

    /* renamed from: a */
    public final JSONObject mo41942a() {
        try {
            return new JSONObject().put("sms", this.f44937a).put("tel", this.f44938b).put("calendar", this.f44939c).put("storePicture", this.f44940d).put("inlineVideo", this.f44941e);
        } catch (JSONException e) {
            acd.m45778b("Error occured while obtaining the MRAID capabilities.", e);
            return null;
        }
    }
}
