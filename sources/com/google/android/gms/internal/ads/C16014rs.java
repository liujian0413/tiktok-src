package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.rs */
public class C16014rs {

    /* renamed from: a */
    private final ami f44960a;

    /* renamed from: b */
    private final String f44961b;

    public C16014rs(ami ami) {
        this(ami, "");
    }

    public C16014rs(ami ami, String str) {
        this.f44960a = ami;
        this.f44961b = str;
    }

    /* renamed from: a */
    public final void mo41951a(String str) {
        try {
            JSONObject put = new JSONObject().put("message", str).put("action", this.f44961b);
            if (this.f44960a != null) {
                this.f44960a.mo39810a("onError", put);
            }
        } catch (JSONException e) {
            acd.m45778b("Error occurred while dispatching error event.", e);
        }
    }

    /* renamed from: b */
    public final void mo41953b(String str) {
        try {
            this.f44960a.mo39810a("onReadyEventReceived", new JSONObject().put("js", str));
        } catch (JSONException e) {
            acd.m45778b("Error occured while dispatching ready Event.", e);
        }
    }

    /* renamed from: a */
    public final void mo41949a(int i, int i2, int i3, int i4) {
        try {
            this.f44960a.mo39810a("onSizeChanged", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            acd.m45778b("Error occured while dispatching size change.", e);
        }
    }

    /* renamed from: b */
    public final void mo41952b(int i, int i2, int i3, int i4) {
        try {
            this.f44960a.mo39810a("onDefaultPositionReceived", new JSONObject().put("x", i).put("y", i2).put("width", i3).put("height", i4));
        } catch (JSONException e) {
            acd.m45778b("Error occured while dispatching default position.", e);
        }
    }

    /* renamed from: c */
    public final void mo41954c(String str) {
        try {
            this.f44960a.mo39810a("onStateChanged", new JSONObject().put("state", str));
        } catch (JSONException e) {
            acd.m45778b("Error occured while dispatching state change.", e);
        }
    }

    /* renamed from: a */
    public final void mo41950a(int i, int i2, int i3, int i4, float f, int i5) {
        try {
            this.f44960a.mo39810a("onScreenInfoChanged", new JSONObject().put("width", i).put("height", i2).put("maxSizeWidth", i3).put("maxSizeHeight", i4).put("density", (double) f).put("rotation", i5));
        } catch (JSONException e) {
            acd.m45778b("Error occured while obtaining screen information.", e);
        }
    }
}
