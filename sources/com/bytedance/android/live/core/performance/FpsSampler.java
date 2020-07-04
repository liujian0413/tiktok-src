package com.bytedance.android.live.core.performance;

import android.os.Build.VERSION;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import java.util.HashMap;

public class FpsSampler extends BaseSampler<Double> implements FrameCallback {

    /* renamed from: f */
    public int f9895f = -1;

    /* renamed from: g */
    private Choreographer f9896g;

    /* renamed from: h */
    private long f9897h = -1;

    /* renamed from: i */
    private long f9898i = -1;

    /* renamed from: j */
    private boolean f9899j;

    public void run() {
    }

    /* renamed from: c */
    public static boolean m12192c() {
        if (VERSION.SDK_INT >= 16) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m12193d() {
        this.f9897h = -1;
        this.f9898i = -1;
        this.f9895f = 0;
    }

    /* renamed from: b */
    public final void mo10130b() {
        this.f9899j = false;
        this.f9896g.postFrameCallback(this);
    }

    /* renamed from: e */
    private double m12194e() {
        if (this.f9898i == this.f9897h) {
            return 0.0d;
        }
        double d = (double) this.f9895f;
        Double.isNaN(d);
        double d2 = d * 1.0E9d;
        double d3 = (double) (this.f9898i - this.f9897h);
        Double.isNaN(d3);
        return d2 / d3;
    }

    /* renamed from: a */
    public final void mo10120a(HashMap<String, String> hashMap) {
        double e = m12194e();
        if (e != 0.0d) {
            mo10119a(Double.valueOf(e));
        }
        super.mo10120a(hashMap);
        this.f9899j = true;
        this.f9896g.removeFrameCallback(this);
        m12193d();
    }

    public void doFrame(long j) {
        if (!this.f9899j) {
            if (this.f9897h == -1) {
                this.f9897h = j;
            } else {
                this.f9895f++;
            }
            this.f9898i = j;
            this.f9896g.postFrameCallback(this);
        }
    }

    public FpsSampler(Choreographer choreographer, int i, int i2) {
        super(i, 3000);
        this.f9896g = choreographer;
    }
}
