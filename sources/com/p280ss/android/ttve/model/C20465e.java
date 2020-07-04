package com.p280ss.android.ttve.model;

import java.util.Map;

/* renamed from: com.ss.android.ttve.model.e */
public final class C20465e {

    /* renamed from: a */
    public String f55290a;

    /* renamed from: b */
    public float f55291b;

    /* renamed from: c */
    public float f55292c;

    /* renamed from: d */
    public Map<Integer, Float> f55293d;

    public C20465e() {
        this("", 0.0f, 0.0f);
    }

    /* renamed from: a */
    public final void mo55135a(Map<Integer, Float> map) {
        if (this.f55293d == null) {
            this.f55293d = map;
        } else {
            this.f55293d.putAll(map);
        }
    }

    private C20465e(String str, float f, float f2) {
        this.f55290a = str;
        this.f55291b = 0.0f;
        this.f55292c = 0.0f;
    }
}
