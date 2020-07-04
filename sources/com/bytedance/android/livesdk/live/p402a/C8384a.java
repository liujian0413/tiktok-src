package com.bytedance.android.livesdk.live.p402a;

import android.os.SystemClock;

/* renamed from: com.bytedance.android.livesdk.live.a.a */
public final class C8384a {

    /* renamed from: a */
    public final String f22984a;

    /* renamed from: b */
    private final long f22985b = SystemClock.elapsedRealtime();

    /* renamed from: a */
    public final long mo21546a() {
        return SystemClock.elapsedRealtime() - this.f22985b;
    }

    public C8384a(String str) {
        this.f22984a = str;
    }
}
