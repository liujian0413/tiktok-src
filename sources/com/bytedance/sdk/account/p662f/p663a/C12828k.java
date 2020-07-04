package com.bytedance.sdk.account.p662f.p663a;

import android.text.TextUtils;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.account.f.a.k */
public abstract class C12828k {

    /* renamed from: h */
    public int f33960h;

    /* renamed from: i */
    public String f33961i;

    /* renamed from: j */
    public String f33962j;

    /* renamed from: k */
    public String f33963k;

    /* renamed from: l */
    public JSONObject f33964l;

    /* renamed from: m */
    public String f33965m;

    /* renamed from: n */
    public long f33966n;

    /* renamed from: o */
    public long f33967o;

    /* renamed from: p */
    public String f33968p;

    /* renamed from: q */
    public String f33969q;

    /* renamed from: r */
    public int f33970r;

    /* renamed from: c */
    public final boolean mo31361c() {
        if (this.f33960h <= 1100 || this.f33960h >= 1199) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo31362d() {
        if ((this.f33960h == 1101 || this.f33960h == 1102 || this.f33960h == 1103) && !TextUtils.isEmpty(this.f33962j)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo31363e() {
        if (this.f33960h == 1104 || this.f33960h == 1105) {
            return true;
        }
        return false;
    }

    public C12828k(int i) {
        this.f33970r = i;
    }
}
