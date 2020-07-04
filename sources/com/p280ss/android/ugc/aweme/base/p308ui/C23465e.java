package com.p280ss.android.ugc.aweme.base.p308ui;

import android.os.Bundle;

/* renamed from: com.ss.android.ugc.aweme.base.ui.e */
public final class C23465e {

    /* renamed from: a */
    public Class<? extends CommonPageFragment> f61925a;

    /* renamed from: b */
    public String f61926b;

    /* renamed from: c */
    public Bundle f61927c;

    /* renamed from: d */
    public float f61928d;

    /* renamed from: e */
    public int f61929e;

    public final int hashCode() {
        return (this.f61926b.hashCode() * 31) + this.f61929e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C23465e) {
            C23465e eVar = (C23465e) obj;
            if (this.f61926b.equals(eVar.f61926b) && this.f61929e == eVar.f61929e) {
                return true;
            }
        }
        return false;
    }

    public C23465e(Class<? extends CommonPageFragment> cls, String str, int i, float f, Bundle bundle) {
        this.f61925a = cls;
        this.f61926b = str;
        this.f61927c = bundle;
        this.f61929e = i;
        this.f61928d = f;
    }
}
