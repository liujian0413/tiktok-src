package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.C15037d;
import com.google.android.gms.common.api.C15041e;
import com.google.android.gms.common.api.C15043f;
import com.google.android.gms.common.api.C15044g;
import com.google.android.gms.common.api.C15045h;
import com.google.android.gms.common.api.C15046i;
import com.google.android.gms.common.api.C15160j;
import com.google.android.gms.common.api.C15161k;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C15267r;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.common.api.internal.bt */
public final class C15097bt<R extends C15044g> extends C15161k<R> implements C15045h<R> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C15160j<? super R, ? extends C15044g> f39039a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C15097bt<? extends C15044g> f39040b;

    /* renamed from: c */
    private volatile C15046i<? super R> f39041c;

    /* renamed from: d */
    private C15041e<R> f39042d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final Object f39043e;

    /* renamed from: f */
    private Status f39044f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final WeakReference<C15037d> f39045g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C15099bv f39046h;

    /* renamed from: i */
    private boolean f39047i;

    /* renamed from: a */
    public final void mo29952a(R r) {
        synchronized (this.f39043e) {
            if (!r.mo38101a().mo38201c()) {
                m43799a(r.mo38101a());
                m43805b((C15044g) r);
            } else if (this.f39039a != null) {
                C15091bn.m43781a().submit(new C15098bu(this, r));
            } else if (m43807c()) {
                C15046i<? super R> iVar = this.f39041c;
            }
        }
    }

    /* renamed from: a */
    public final void mo38355a(C15041e<?> eVar) {
        synchronized (this.f39043e) {
            this.f39042d = eVar;
            m43803b();
        }
    }

    /* renamed from: b */
    private final void m43803b() {
        if (this.f39039a != null || this.f39041c != null) {
            C15037d dVar = (C15037d) this.f39045g.get();
            if (!(this.f39047i || this.f39039a == null || dVar == null)) {
                dVar.mo38236a(this);
                this.f39047i = true;
            }
            if (this.f39044f != null) {
                m43804b(this.f39044f);
                return;
            }
            if (this.f39042d != null) {
                this.f39042d.mo38262a((C15045h<? super R>) this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m43799a(Status status) {
        synchronized (this.f39043e) {
            this.f39044f = status;
            m43804b(this.f39044f);
        }
    }

    /* renamed from: b */
    private final void m43804b(Status status) {
        synchronized (this.f39043e) {
            if (this.f39039a != null) {
                Status a = C15160j.m44138a(status);
                C15267r.m44385a(a, (Object) "onFailure must not return null");
                this.f39040b.m43799a(a);
            } else if (m43807c()) {
                C15046i<? super R> iVar = this.f39041c;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo38354a() {
        this.f39041c = null;
    }

    /* renamed from: c */
    private final boolean m43807c() {
        return (this.f39041c == null || ((C15037d) this.f39045g.get()) == null) ? false : true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m43805b(C15044g gVar) {
        if (gVar instanceof C15043f) {
            try {
                ((C15043f) gVar).mo38266b();
            } catch (RuntimeException unused) {
            }
        }
    }
}
