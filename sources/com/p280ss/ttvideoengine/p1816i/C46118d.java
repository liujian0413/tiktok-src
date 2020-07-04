package com.p280ss.ttvideoengine.p1816i;

import android.os.SystemClock;

/* renamed from: com.ss.ttvideoengine.i.d */
public final class C46118d {

    /* renamed from: a */
    private int f118008a = 1;

    /* renamed from: b */
    private int f118009b = 2;

    /* renamed from: c */
    private int f118010c = this.f118009b;

    /* renamed from: d */
    private int f118011d;

    /* renamed from: e */
    private long f118012e;

    /* renamed from: d */
    public final void mo112294d() {
        this.f118011d = 0;
        if (this.f118010c == this.f118008a) {
            this.f118012e = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: e */
    public final void mo112295e() {
        this.f118010c = this.f118009b;
        this.f118011d = 0;
        this.f118012e = 0;
    }

    /* renamed from: a */
    public final void mo112291a() {
        if (this.f118010c == this.f118009b) {
            this.f118010c = this.f118008a;
            this.f118012e = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: b */
    public final void mo112292b() {
        if (this.f118010c == this.f118008a) {
            this.f118010c = this.f118009b;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - this.f118012e);
            if (elapsedRealtime >= 0) {
                this.f118011d += elapsedRealtime;
            }
        }
    }

    /* renamed from: c */
    public final int mo112293c() {
        if (this.f118010c == this.f118008a) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.f118012e);
            if (i >= 0) {
                this.f118011d += i;
            }
            this.f118012e = elapsedRealtime;
        }
        return this.f118011d;
    }
}
