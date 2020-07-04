package com.bytedance.android.livesdk.app.dataholder;

import android.text.TextUtils;
import android.util.Base64;

/* renamed from: com.bytedance.android.livesdk.app.dataholder.d */
public final class C3912d extends C3909a<Boolean> {

    /* renamed from: k */
    private static C3912d f11707k;

    /* renamed from: c */
    public boolean f11708c;

    /* renamed from: d */
    public int f11709d;

    /* renamed from: e */
    public String f11710e;

    /* renamed from: f */
    public byte[] f11711f;

    /* renamed from: g */
    public String f11712g;

    /* renamed from: h */
    public int f11713h;

    /* renamed from: i */
    public int f11714i;

    /* renamed from: j */
    public C3914f f11715j;

    /* renamed from: a */
    public static C3912d m13795a() {
        if (f11707k == null) {
            f11707k = new C3912d();
        }
        return f11707k;
    }

    private C3912d() {
        this.f11699b = Boolean.valueOf(false);
        this.f11715j = new C3914f();
    }

    /* renamed from: b */
    public final void mo11456b() {
        this.f11699b = Boolean.valueOf(false);
        this.f11708c = false;
        this.f11712g = null;
        this.f11711f = null;
        this.f11710e = null;
        this.f11713h = 0;
        this.f11714i = 0;
    }

    /* renamed from: a */
    public final void mo11452a(Boolean bool) {
        super.mo11452a(bool);
        if (bool != null && bool.booleanValue()) {
            this.f11708c = true;
        }
    }

    /* renamed from: a */
    public final void mo11455a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f11711f = Base64.decode(str, 0);
            } catch (Exception unused) {
            }
        }
    }
}
