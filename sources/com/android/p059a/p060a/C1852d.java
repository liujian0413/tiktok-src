package com.android.p059a.p060a;

import android.os.Bundle;

/* renamed from: com.android.a.a.d */
public final class C1852d {

    /* renamed from: a */
    private final Bundle f6657a;

    /* renamed from: a */
    public final String mo7362a() {
        return this.f6657a.getString("install_referrer");
    }

    /* renamed from: b */
    public final long mo7363b() {
        return this.f6657a.getLong("referrer_click_timestamp_seconds");
    }

    /* renamed from: c */
    public final long mo7364c() {
        return this.f6657a.getLong("install_begin_timestamp_seconds");
    }

    public C1852d(Bundle bundle) {
        this.f6657a = bundle;
    }
}
