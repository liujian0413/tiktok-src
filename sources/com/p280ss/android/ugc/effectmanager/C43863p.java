package com.p280ss.android.ugc.effectmanager;

import android.os.SystemClock;

/* renamed from: com.ss.android.ugc.effectmanager.p */
final class C43863p {

    /* renamed from: a */
    private long f113636a;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final long mo106119b() {
        return SystemClock.uptimeMillis() - this.f113636a;
    }

    /* renamed from: a */
    static C43863p m138928a() {
        return new C43863p(SystemClock.uptimeMillis());
    }

    private C43863p(long j) {
        this.f113636a = j;
    }
}
