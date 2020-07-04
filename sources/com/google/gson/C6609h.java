package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.gson.h */
public final class C6609h extends C6709k implements Iterable<C6709k> {

    /* renamed from: a */
    private final List<C6709k> f18948a = new ArrayList();

    /* renamed from: a */
    public final int mo15994a() {
        return this.f18948a.size();
    }

    public final int hashCode() {
        return this.f18948a.hashCode();
    }

    public final Iterator<C6709k> iterator() {
        return this.f18948a.iterator();
    }

    /* renamed from: b */
    public final Number mo15997b() {
        if (this.f18948a.size() == 1) {
            return ((C6709k) this.f18948a.get(0)).mo15997b();
        }
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final String mo15998c() {
        if (this.f18948a.size() == 1) {
            return ((C6709k) this.f18948a.get(0)).mo15998c();
        }
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final double mo15999d() {
        if (this.f18948a.size() == 1) {
            return ((C6709k) this.f18948a.get(0)).mo15999d();
        }
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final float mo16000e() {
        if (this.f18948a.size() == 1) {
            return ((C6709k) this.f18948a.get(0)).mo16000e();
        }
        throw new IllegalStateException();
    }

    /* renamed from: f */
    public final long mo16002f() {
        if (this.f18948a.size() == 1) {
            return ((C6709k) this.f18948a.get(0)).mo16002f();
        }
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public final int mo16003g() {
        if (this.f18948a.size() == 1) {
            return ((C6709k) this.f18948a.get(0)).mo16003g();
        }
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final boolean mo16004h() {
        if (this.f18948a.size() == 1) {
            return ((C6709k) this.f18948a.get(0)).mo16004h();
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final C6709k mo15995a(int i) {
        return (C6709k) this.f18948a.get(i);
    }

    /* renamed from: a */
    public final void mo15996a(C6709k kVar) {
        if (kVar == null) {
            kVar = C6710l.f19164a;
        }
        this.f18948a.add(kVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this || ((obj instanceof C6609h) && ((C6609h) obj).f18948a.equals(this.f18948a))) {
            return true;
        }
        return false;
    }
}
