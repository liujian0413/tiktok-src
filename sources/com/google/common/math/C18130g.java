package com.google.common.math;

import com.google.common.primitives.C18141b;
import java.util.Iterator;

/* renamed from: com.google.common.math.g */
public final class C18130g {

    /* renamed from: a */
    public long f49487a;

    /* renamed from: b */
    public double f49488b;

    /* renamed from: c */
    private double f49489c;

    /* renamed from: d */
    private double f49490d = Double.NaN;

    /* renamed from: e */
    private double f49491e = Double.NaN;

    /* renamed from: a */
    public final Stats mo46766a() {
        Stats stats = new Stats(this.f49487a, this.f49489c, this.f49488b, this.f49490d, this.f49491e);
        return stats;
    }

    /* renamed from: a */
    public final void mo46769a(double... dArr) {
        for (double a : dArr) {
            m59903a(a);
        }
    }

    /* renamed from: a */
    private void m59903a(double d) {
        if (this.f49487a == 0) {
            this.f49487a = 1;
            this.f49489c = d;
            this.f49490d = d;
            this.f49491e = d;
            if (!C18141b.m59961b(d)) {
                this.f49488b = Double.NaN;
            }
        } else {
            this.f49487a++;
            if (!C18141b.m59961b(d) || !C18141b.m59961b(this.f49489c)) {
                this.f49489c = m59902a(this.f49489c, d);
                this.f49488b = Double.NaN;
            } else {
                double d2 = d - this.f49489c;
                double d3 = this.f49489c;
                double d4 = (double) this.f49487a;
                Double.isNaN(d4);
                this.f49489c = d3 + (d2 / d4);
                this.f49488b += d2 * (d - this.f49489c);
            }
            this.f49490d = Math.min(this.f49490d, d);
            this.f49491e = Math.max(this.f49491e, d);
        }
    }

    /* renamed from: a */
    public final void mo46767a(Iterable<? extends Number> iterable) {
        for (Number doubleValue : iterable) {
            m59903a(doubleValue.doubleValue());
        }
    }

    /* renamed from: a */
    public final void mo46768a(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            m59903a(((Number) it.next()).doubleValue());
        }
    }

    /* renamed from: a */
    public final void mo46770a(int... iArr) {
        for (int i : iArr) {
            m59903a((double) i);
        }
    }

    /* renamed from: a */
    public final void mo46771a(long... jArr) {
        for (long j : jArr) {
            m59903a((double) j);
        }
    }

    /* renamed from: a */
    static double m59902a(double d, double d2) {
        if (C18141b.m59961b(d)) {
            return d2;
        }
        if (C18141b.m59961b(d2) || d == d2) {
            return d;
        }
        return Double.NaN;
    }
}
