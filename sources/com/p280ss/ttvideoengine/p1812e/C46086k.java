package com.p280ss.ttvideoengine.p1812e;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.ttvideoengine.e.k */
public final class C46086k {

    /* renamed from: a */
    public int f117914a;

    /* renamed from: b */
    public String f117915b;

    /* renamed from: c */
    public String f117916c;

    /* renamed from: d */
    public int f117917d;

    /* renamed from: e */
    public int f117918e;

    /* renamed from: f */
    public int f117919f;

    /* renamed from: g */
    public int f117920g;

    /* renamed from: h */
    public double f117921h;

    /* renamed from: i */
    public double f117922i;

    /* renamed from: j */
    public String f117923j;

    /* renamed from: k */
    public int f117924k = 1;

    /* renamed from: l */
    private int f117925l;

    /* renamed from: m */
    private String f117926m;

    /* renamed from: n */
    private String f117927n;

    /* renamed from: o */
    private int f117928o;

    /* renamed from: p */
    private int f117929p;

    /* renamed from: q */
    private int f117930q;

    /* renamed from: r */
    private int f117931r;

    /* renamed from: s */
    private double f117932s;

    /* renamed from: t */
    private double f117933t;

    /* renamed from: u */
    private String f117934u;

    /* renamed from: a */
    public final void mo112258a(JSONObject jSONObject) {
        if (jSONObject != null) {
            if (jSONObject.has("img_url")) {
                this.f117924k = 1;
            } else if (jSONObject.has("ImgUrl")) {
                this.f117924k = 2;
            }
            if (this.f117924k == 1) {
                try {
                    this.f117914a = jSONObject.getInt("img_num");
                    this.f117915b = jSONObject.getString("uri");
                    this.f117916c = jSONObject.getString("img_url");
                    this.f117917d = jSONObject.getInt("img_x_size");
                    this.f117918e = jSONObject.getInt("img_y_size");
                    this.f117919f = jSONObject.getInt("img_x_len");
                    this.f117920g = jSONObject.getInt("img_y_len");
                    this.f117921h = jSONObject.getDouble("duration");
                    this.f117922i = jSONObject.getDouble("interval");
                    this.f117923j = jSONObject.getString("fext");
                } catch (JSONException unused) {
                }
                return;
            }
            try {
                this.f117925l = jSONObject.getInt("ImgNum");
                this.f117926m = jSONObject.getString("Uri");
                this.f117927n = jSONObject.getString("ImgUrl");
                this.f117928o = jSONObject.getInt("ImgXSize");
                this.f117929p = jSONObject.getInt("ImgYSize");
                this.f117930q = jSONObject.getInt("ImgXLen");
                this.f117931r = jSONObject.getInt("ImgYLen");
                this.f117932s = jSONObject.getDouble("Duration");
                this.f117933t = jSONObject.getDouble("Interval");
                this.f117934u = jSONObject.getString("Fext");
            } catch (JSONException unused2) {
            }
        }
    }
}
