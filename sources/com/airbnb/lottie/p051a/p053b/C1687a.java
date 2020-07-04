package com.airbnb.lottie.p051a.p053b;

import com.airbnb.lottie.p057e.C1753a;
import com.airbnb.lottie.p057e.C1755c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.a.b.a */
public abstract class C1687a<K, A> {

    /* renamed from: a */
    final List<C1688a> f6232a = new ArrayList();

    /* renamed from: b */
    public float f6233b = 0.0f;

    /* renamed from: c */
    protected C1755c<A> f6234c;

    /* renamed from: d */
    private boolean f6235d = false;

    /* renamed from: e */
    private final List<? extends C1753a<K>> f6236e;

    /* renamed from: f */
    private C1753a<K> f6237f;

    /* renamed from: com.airbnb.lottie.a.b.a$a */
    public interface C1688a {
        /* renamed from: a */
        void mo7131a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract A mo7143a(C1753a<K> aVar, float f);

    /* renamed from: a */
    public final void mo7144a() {
        this.f6235d = true;
    }

    /* renamed from: e */
    public A mo7151e() {
        return mo7143a(m8193f(), m8194g());
    }

    /* renamed from: g */
    private float m8194g() {
        C1753a f = m8193f();
        if (f.mo7203c()) {
            return 0.0f;
        }
        return f.f6313d.getInterpolation(mo7149c());
    }

    /* renamed from: h */
    private float m8195h() {
        if (this.f6236e.isEmpty()) {
            return 0.0f;
        }
        return ((C1753a) this.f6236e.get(0)).mo7200a();
    }

    /* renamed from: b */
    public void mo7148b() {
        for (int i = 0; i < this.f6232a.size(); i++) {
            ((C1688a) this.f6232a.get(i)).mo7131a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public float mo7150d() {
        if (this.f6236e.isEmpty()) {
            return 1.0f;
        }
        return ((C1753a) this.f6236e.get(this.f6236e.size() - 1)).mo7202b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final float mo7149c() {
        if (this.f6235d) {
            return 0.0f;
        }
        C1753a f = m8193f();
        if (f.mo7203c()) {
            return 0.0f;
        }
        return (this.f6233b - f.mo7200a()) / (f.mo7202b() - f.mo7200a());
    }

    /* renamed from: f */
    private C1753a<K> m8193f() {
        if (this.f6237f != null && this.f6237f.mo7201a(this.f6233b)) {
            return this.f6237f;
        }
        C1753a<K> aVar = (C1753a) this.f6236e.get(this.f6236e.size() - 1);
        if (this.f6233b < aVar.mo7200a()) {
            for (int size = this.f6236e.size() - 1; size >= 0; size--) {
                aVar = (C1753a) this.f6236e.get(size);
                if (aVar.mo7201a(this.f6233b)) {
                    break;
                }
            }
        }
        this.f6237f = aVar;
        return aVar;
    }

    /* renamed from: a */
    public final void mo7146a(C1688a aVar) {
        this.f6232a.add(aVar);
    }

    C1687a(List<? extends C1753a<K>> list) {
        this.f6236e = list;
    }

    /* renamed from: a */
    public final void mo7147a(C1755c<A> cVar) {
        if (this.f6234c != null) {
            this.f6234c.f6327a = null;
        }
        this.f6234c = cVar;
        if (cVar != null) {
            cVar.f6327a = this;
        }
    }

    /* renamed from: a */
    public void mo7145a(float f) {
        if (f < m8195h()) {
            f = m8195h();
        } else if (f > mo7150d()) {
            f = mo7150d();
        }
        if (f != this.f6233b) {
            this.f6233b = f;
            mo7148b();
        }
    }
}
