package com.p280ss.android.medialib.camera;

import android.graphics.SurfaceTexture;
import android.graphics.SurfaceTexture.OnFrameAvailableListener;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.p280ss.android.medialib.common.C19702a;
import com.p280ss.android.vesdk.p1775c.C45277a;

/* renamed from: com.ss.android.medialib.camera.k */
public final class C19700k {

    /* renamed from: a */
    public int f53429a;

    /* renamed from: b */
    public SurfaceTexture f53430b;

    /* renamed from: c */
    public OnFrameAvailableListener f53431c;

    /* renamed from: d */
    public float[] f53432d = new float[16];

    /* renamed from: c */
    public final void mo52401c() {
        this.f53430b.updateTexImage();
    }

    /* renamed from: a */
    public final void mo52399a() {
        this.f53429a = C19702a.m64955a();
        this.f53430b = new C45277a(this.f53429a);
        this.f53430b.setOnFrameAvailableListener(new OnFrameAvailableListener() {
            public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
                if (C19700k.this.f53431c != null) {
                    C19700k.this.f53431c.onFrameAvailable(surfaceTexture);
                }
            }
        });
    }

    /* renamed from: b */
    public final void mo52400b() {
        if (this.f53430b != null) {
            this.f53430b.release();
            this.f53430b = null;
        }
        if (this.f53429a != 0) {
            C19702a.m64956a(this.f53429a);
            this.f53429a = 0;
        }
    }

    /* renamed from: d */
    public final double mo52402d() {
        long j;
        if (this.f53430b == null) {
            return -1.0d;
        }
        long nanoTime = System.nanoTime();
        long abs = Math.abs(nanoTime - this.f53430b.getTimestamp());
        if (VERSION.SDK_INT >= 17) {
            j = Math.abs(SystemClock.elapsedRealtimeNanos() - this.f53430b.getTimestamp());
        } else {
            j = Long.MAX_VALUE;
        }
        double min = (double) (nanoTime - Math.min(Math.min(abs, j), Math.abs((SystemClock.uptimeMillis() * 1000000) - this.f53430b.getTimestamp())));
        Double.isNaN(min);
        return min / 1000000.0d;
    }
}
