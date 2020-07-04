package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.concurrent.TimeUnit;

@C6505uv
public final class aid {

    /* renamed from: a */
    private final long f40271a = TimeUnit.MILLISECONDS.toNanos(((Long) bym.m50299d().mo41272a(C15585bw.f43727A)).longValue());

    /* renamed from: b */
    private long f40272b;

    /* renamed from: c */
    private boolean f40273c = true;

    aid() {
    }

    /* renamed from: a */
    public final void mo39441a() {
        this.f40273c = true;
    }

    /* renamed from: a */
    public final void mo39442a(SurfaceTexture surfaceTexture, ahr ahr) {
        if (ahr != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f40273c || Math.abs(timestamp - this.f40272b) >= this.f40271a) {
                this.f40273c = false;
                this.f40272b = timestamp;
                acl.f40003a.post(new aie(this, ahr));
            }
        }
    }
}
