package com.bytedance.android.live.broadcast.effect.sticker;

import android.os.SystemClock;
import com.bytedance.android.live.core.p148d.C3168a;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.e */
public class C2662e extends C3168a {

    /* renamed from: a */
    private long f8481a;

    /* renamed from: b */
    private long f8482b;

    /* renamed from: a */
    public void mo9326a() {
    }

    /* renamed from: a */
    public void mo9327a(int i, String str) {
    }

    /* renamed from: b */
    public void mo9328b() {
    }

    /* renamed from: b */
    public void mo9329b(int i, String str) {
    }

    /* renamed from: c */
    public final void mo9330c() {
        this.f8481a = SystemClock.uptimeMillis();
    }

    /* renamed from: e */
    public final void mo9332e() {
        this.f8482b = SystemClock.uptimeMillis();
    }

    /* renamed from: d */
    public final long mo9331d() {
        long j;
        if (this.f8481a > 0) {
            j = SystemClock.uptimeMillis() - this.f8481a;
        } else {
            j = 0;
        }
        this.f8481a = 0;
        return j;
    }

    /* renamed from: f */
    public final long mo9333f() {
        long j;
        if (this.f8482b > 0) {
            j = SystemClock.uptimeMillis() - this.f8482b;
        } else {
            j = 0;
        }
        this.f8482b = 0;
        return j;
    }
}
