package com.snapchat.kit.sdk.core.metrics.business;

import android.content.SharedPreferences;

/* renamed from: com.snapchat.kit.sdk.core.metrics.business.h */
public final class C18676h {

    /* renamed from: a */
    public long f50461a;

    /* renamed from: b */
    private final SharedPreferences f50462b;

    /* renamed from: a */
    public final void mo48923a() {
        this.f50461a = this.f50462b.getLong("sequence_id_max", 0);
    }

    /* renamed from: b */
    public final long mo48924b() {
        long j = this.f50461a + 1;
        this.f50461a = j;
        this.f50462b.edit().putLong("sequence_id_max", this.f50461a).apply();
        return j;
    }

    public C18676h(SharedPreferences sharedPreferences) {
        this.f50462b = sharedPreferences;
    }
}
