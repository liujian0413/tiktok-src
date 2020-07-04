package com.swmansion.gesturehandler;

import android.view.MotionEvent;
import com.swmansion.gesturehandler.C46360l.C46361a;

/* renamed from: com.swmansion.gesturehandler.m */
public class C46362m extends C46347b<C46362m> {

    /* renamed from: a */
    public double f119378a;

    /* renamed from: b */
    public double f119379b;

    /* renamed from: p */
    private C46360l f119380p;

    /* renamed from: q */
    private C46361a f119381q = new C46361a() {
        /* renamed from: b */
        public final void mo115255b(C46360l lVar) {
            C46362m.this.mo115215h();
        }

        /* renamed from: a */
        public final boolean mo115254a(C46360l lVar) {
            double d = C46362m.this.f119378a;
            C46362m.this.f119378a += lVar.f119369a;
            long a = lVar.mo115252a();
            if (a > 0) {
                C46362m mVar = C46362m.this;
                double d2 = C46362m.this.f119378a - d;
                double d3 = (double) a;
                Double.isNaN(d3);
                mVar.f119379b = d2 / d3;
            }
            if (Math.abs(C46362m.this.f119378a) >= 0.08726646259971647d && C46362m.this.f119286e == 2) {
                C46362m.this.mo115213f();
            }
            return true;
        }
    };

    public C46362m() {
        mo115195a(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo115190b() {
        this.f119380p = null;
        this.f119379b = 0.0d;
        this.f119378a = 0.0d;
    }

    /* renamed from: l */
    public final float mo115245l() {
        if (this.f119380p == null) {
            return Float.NaN;
        }
        return this.f119380p.f119370b;
    }

    /* renamed from: m */
    public final float mo115256m() {
        if (this.f119380p == null) {
            return Float.NaN;
        }
        return this.f119380p.f119371c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo115189a(MotionEvent motionEvent) {
        int i = this.f119286e;
        if (i == 0) {
            this.f119379b = 0.0d;
            this.f119378a = 0.0d;
            this.f119380p = new C46360l(this.f119381q);
            mo115214g();
        }
        if (this.f119380p != null) {
            this.f119380p.mo115253a(motionEvent);
        }
        if (motionEvent.getActionMasked() == 1) {
            if (i == 4) {
                mo115215h();
                return;
            }
            mo115211e();
        }
    }
}
