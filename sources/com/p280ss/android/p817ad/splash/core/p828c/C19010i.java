package com.p280ss.android.p817ad.splash.core.p828c;

import android.text.TextUtils;

/* renamed from: com.ss.android.ad.splash.core.c.i */
public class C19010i {

    /* renamed from: D */
    public String f51341D;

    public C19010i() {
    }

    /* renamed from: B */
    public String mo50470B() {
        return this.f51341D;
    }

    public int hashCode() {
        if (TextUtils.isEmpty(mo50470B())) {
            return super.hashCode();
        }
        return mo50470B().hashCode();
    }

    public C19010i(String str) {
        this.f51341D = str;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C19010i) && !TextUtils.isEmpty(mo50470B())) {
            C19010i iVar = (C19010i) obj;
            if (!TextUtils.isEmpty(iVar.mo50470B())) {
                return TextUtils.equals(mo50470B(), iVar.mo50470B());
            }
        }
        return false;
    }
}
