package com.bytedance.android.live.core.performance;

public class CpuSampler extends BaseSampler<Double> {
    public void run() {
        mo10119a(Double.valueOf(C3221a.m12210a()));
        if (this.f9891c != null) {
            this.f9891c.postDelayed(this, (long) this.f9889a);
        }
    }

    public CpuSampler(int i, int i2) {
        super(i, 3000);
    }
}
