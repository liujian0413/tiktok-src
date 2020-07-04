package android.support.p029v7.view;

import android.support.p022v4.view.C0998y;
import android.support.p022v4.view.C1002z;
import android.support.p022v4.view.ViewPropertyAnimatorListenerAdapter;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: android.support.v7.view.f */
public final class C1160f {

    /* renamed from: a */
    final ArrayList<C0998y> f4199a = new ArrayList<>();

    /* renamed from: b */
    C1002z f4200b;

    /* renamed from: c */
    private long f4201c = -1;

    /* renamed from: d */
    private Interpolator f4202d;

    /* renamed from: e */
    private boolean f4203e;

    /* renamed from: f */
    private final ViewPropertyAnimatorListenerAdapter f4204f = new ViewPropertyAnimatorListenerAdapter() {

        /* renamed from: b */
        private boolean f4206b;

        /* renamed from: c */
        private int f4207c;

        /* renamed from: a */
        private void m5164a() {
            this.f4207c = 0;
            this.f4206b = false;
            C1160f.this.mo4599b();
        }

        /* renamed from: a */
        public final void mo3626a(View view) {
            if (!this.f4206b) {
                this.f4206b = true;
                if (C1160f.this.f4200b != null) {
                    C1160f.this.f4200b.mo3626a(null);
                }
            }
        }

        /* renamed from: b */
        public final void mo3627b(View view) {
            int i = this.f4207c + 1;
            this.f4207c = i;
            if (i == C1160f.this.f4199a.size()) {
                if (C1160f.this.f4200b != null) {
                    C1160f.this.f4200b.mo3627b(null);
                }
                m5164a();
            }
        }
    };

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo4599b() {
        this.f4203e = false;
    }

    /* renamed from: c */
    public final void mo4600c() {
        if (this.f4203e) {
            Iterator it = this.f4199a.iterator();
            while (it.hasNext()) {
                ((C0998y) it.next()).mo3804b();
            }
            this.f4203e = false;
        }
    }

    /* renamed from: a */
    public final void mo4598a() {
        if (!this.f4203e) {
            Iterator it = this.f4199a.iterator();
            while (it.hasNext()) {
                C0998y yVar = (C0998y) it.next();
                if (this.f4201c >= 0) {
                    yVar.mo3798a(this.f4201c);
                }
                if (this.f4202d != null) {
                    yVar.mo3801a(this.f4202d);
                }
                if (this.f4200b != null) {
                    yVar.mo3800a((C1002z) this.f4204f);
                }
                yVar.mo3806c();
            }
            this.f4203e = true;
        }
    }

    /* renamed from: a */
    public final C1160f mo4596a(C1002z zVar) {
        if (!this.f4203e) {
            this.f4200b = zVar;
        }
        return this;
    }

    /* renamed from: a */
    public final C1160f mo4593a(long j) {
        if (!this.f4203e) {
            this.f4201c = 250;
        }
        return this;
    }

    /* renamed from: a */
    public final C1160f mo4594a(C0998y yVar) {
        if (!this.f4203e) {
            this.f4199a.add(yVar);
        }
        return this;
    }

    /* renamed from: a */
    public final C1160f mo4597a(Interpolator interpolator) {
        if (!this.f4203e) {
            this.f4202d = interpolator;
        }
        return this;
    }

    /* renamed from: a */
    public final C1160f mo4595a(C0998y yVar, C0998y yVar2) {
        this.f4199a.add(yVar);
        yVar2.mo3803b(yVar.mo3796a());
        this.f4199a.add(yVar2);
        return this;
    }
}
