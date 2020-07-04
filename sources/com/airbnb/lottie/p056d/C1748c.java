package com.airbnb.lottie.p056d;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.C1642a;
import com.airbnb.lottie.C1757f;

/* renamed from: com.airbnb.lottie.d.c */
public final class C1748c extends C1746a implements FrameCallback {

    /* renamed from: a */
    public float f6293a = 1.0f;

    /* renamed from: b */
    public float f6294b;

    /* renamed from: c */
    protected boolean f6295c;

    /* renamed from: d */
    private boolean f6296d;

    /* renamed from: e */
    private long f6297e;

    /* renamed from: f */
    private int f6298f;

    /* renamed from: g */
    private float f6299g = -2.14748365E9f;

    /* renamed from: h */
    private float f6300h = 2.14748365E9f;

    /* renamed from: i */
    private C1757f f6301i;

    /* renamed from: h */
    public final void mo7193h() {
        m8339p();
    }

    public final boolean isRunning() {
        return this.f6295c;
    }

    /* renamed from: m */
    private void m8336m() {
        this.f6293a = -this.f6293a;
    }

    /* renamed from: p */
    private void m8339p() {
        m8334c(true);
    }

    public final void cancel() {
        mo7168b();
        m8339p();
    }

    /* renamed from: n */
    private boolean m8337n() {
        if (this.f6293a < 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo7187e() {
        this.f6301i = null;
        this.f6299g = -2.14748365E9f;
        this.f6300h = 2.14748365E9f;
    }

    /* renamed from: g */
    public final void mo7189g() {
        m8339p();
        mo7169b(m8337n());
    }

    public final Object getAnimatedValue() {
        return Float.valueOf(mo7185d());
    }

    public final long getDuration() {
        if (this.f6301i == null) {
            return 0;
        }
        return (long) this.f6301i.mo7208a();
    }

    /* renamed from: l */
    private float m8335l() {
        if (this.f6301i == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / this.f6301i.f6340i) / Math.abs(this.f6293a);
    }

    /* renamed from: o */
    private void m8338o() {
        if (isRunning()) {
            m8334c(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    /* renamed from: d */
    public final float mo7185d() {
        if (this.f6301i == null) {
            return 0.0f;
        }
        return (this.f6294b - this.f6301i.f6338g) / (this.f6301i.f6339h - this.f6301i.f6338g);
    }

    /* renamed from: j */
    public final float mo7196j() {
        if (this.f6301i == null) {
            return 0.0f;
        }
        if (this.f6299g == -2.14748365E9f) {
            return this.f6301i.f6338g;
        }
        return this.f6299g;
    }

    /* renamed from: k */
    public final float mo7197k() {
        if (this.f6301i == null) {
            return 0.0f;
        }
        if (this.f6300h == 2.14748365E9f) {
            return this.f6301i.f6339h;
        }
        return this.f6300h;
    }

    /* renamed from: q */
    private void m8340q() {
        if (this.f6301i != null) {
            if (this.f6294b < this.f6299g || this.f6294b > this.f6300h) {
                throw new IllegalStateException(C1642a.m8034a("Frame must be [%f,%f]. It is %f", new Object[]{Float.valueOf(this.f6299g), Float.valueOf(this.f6300h), Float.valueOf(this.f6294b)}));
            }
        }
    }

    /* renamed from: f */
    public final void mo7188f() {
        float f;
        this.f6295c = true;
        mo7165a(m8337n());
        if (m8337n()) {
            f = mo7197k();
        } else {
            f = mo7196j();
        }
        mo7179a((int) f);
        this.f6297e = System.nanoTime();
        this.f6298f = 0;
        m8338o();
    }

    public final float getAnimatedFraction() {
        if (this.f6301i == null) {
            return 0.0f;
        }
        if (m8337n()) {
            return (mo7197k() - this.f6294b) / (mo7197k() - mo7196j());
        }
        return (this.f6294b - mo7196j()) / (mo7197k() - mo7196j());
    }

    /* renamed from: i */
    public final void mo7194i() {
        this.f6295c = true;
        m8338o();
        this.f6297e = System.nanoTime();
        if (!m8337n() || this.f6294b != mo7196j()) {
            if (!m8337n() && this.f6294b == mo7197k()) {
                this.f6294b = mo7196j();
            }
            return;
        }
        this.f6294b = mo7197k();
    }

    /* renamed from: b */
    public final void mo7182b(int i) {
        mo7180a(i, (int) this.f6300h);
    }

    /* renamed from: c */
    public final void mo7183c(int i) {
        mo7180a((int) this.f6299g, i);
    }

    /* renamed from: c */
    private void m8334c(boolean z) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z) {
            this.f6295c = false;
        }
    }

    /* renamed from: a */
    public final void mo7179a(int i) {
        float f = (float) i;
        if (this.f6294b != f) {
            this.f6294b = C1750e.m8364b(f, mo7196j(), mo7197k());
            this.f6297e = System.nanoTime();
            mo7170c();
        }
    }

    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i != 2 && this.f6296d) {
            this.f6296d = false;
            m8336m();
        }
    }

    /* renamed from: a */
    public final void mo7181a(C1757f fVar) {
        boolean z;
        if (this.f6301i == null) {
            z = true;
        } else {
            z = false;
        }
        this.f6301i = fVar;
        if (z) {
            mo7180a((int) Math.max(this.f6299g, fVar.f6338g), (int) Math.min(this.f6300h, fVar.f6339h));
        } else {
            mo7180a((int) fVar.f6338g, (int) fVar.f6339h);
        }
        mo7179a((int) this.f6294b);
        this.f6297e = System.nanoTime();
    }

    public final void doFrame(long j) {
        float f;
        m8338o();
        if (this.f6301i != null && isRunning()) {
            long nanoTime = System.nanoTime();
            float l = ((float) (nanoTime - this.f6297e)) / m8335l();
            float f2 = this.f6294b;
            if (m8337n()) {
                l = -l;
            }
            this.f6294b = f2 + l;
            boolean z = !C1750e.m8366c(this.f6294b, mo7196j(), mo7197k());
            this.f6294b = C1750e.m8364b(this.f6294b, mo7196j(), mo7197k());
            this.f6297e = nanoTime;
            mo7170c();
            if (z) {
                if (getRepeatCount() == -1 || this.f6298f < getRepeatCount()) {
                    mo7164a();
                    this.f6298f++;
                    if (getRepeatMode() == 2) {
                        this.f6296d = !this.f6296d;
                        m8336m();
                    } else {
                        if (m8337n()) {
                            f = mo7197k();
                        } else {
                            f = mo7196j();
                        }
                        this.f6294b = f;
                    }
                    this.f6297e = nanoTime;
                } else {
                    this.f6294b = mo7197k();
                    m8339p();
                    mo7169b(m8337n());
                }
            }
            m8340q();
        }
    }

    /* renamed from: a */
    public final void mo7180a(int i, int i2) {
        float f;
        float f2;
        if (this.f6301i == null) {
            f = -3.4028235E38f;
        } else {
            f = this.f6301i.f6338g;
        }
        if (this.f6301i == null) {
            f2 = Float.MAX_VALUE;
        } else {
            f2 = this.f6301i.f6339h;
        }
        float f3 = (float) i;
        this.f6299g = C1750e.m8364b(f3, f, f2);
        float f4 = (float) i2;
        this.f6300h = C1750e.m8364b(f4, f, f2);
        mo7179a((int) C1750e.m8364b(this.f6294b, f3, f4));
    }
}
