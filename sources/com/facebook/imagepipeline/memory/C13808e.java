package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C13307g;
import com.facebook.common.p686c.C13286a;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.facebook.imagepipeline.memory.e */
class C13808e<V> {

    /* renamed from: a */
    public final int f36650a;

    /* renamed from: b */
    public final int f36651b;

    /* renamed from: c */
    final Queue f36652c;

    /* renamed from: d */
    public int f36653d;

    /* renamed from: e */
    private final boolean f36654e;

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo33436b() {
        return this.f36652c.size();
    }

    /* renamed from: d */
    public V mo33439d() {
        return this.f36652c.poll();
    }

    /* renamed from: e */
    public final void mo33440e() {
        this.f36653d++;
    }

    /* renamed from: a */
    public final boolean mo33435a() {
        if (this.f36653d + mo33436b() > this.f36651b) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final V mo33438c() {
        V d = mo33439d();
        if (d != null) {
            this.f36653d++;
        }
        return d;
    }

    /* renamed from: f */
    public final void mo33441f() {
        boolean z;
        if (this.f36653d > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38947b(z);
        this.f36653d--;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo33437b(V v) {
        this.f36652c.add(v);
    }

    /* renamed from: a */
    public final void mo33434a(V v) {
        C13307g.m38940a(v);
        boolean z = false;
        if (this.f36654e) {
            if (this.f36653d > 0) {
                z = true;
            }
            C13307g.m38947b(z);
            this.f36653d--;
            mo33437b(v);
        } else if (this.f36653d > 0) {
            this.f36653d--;
            mo33437b(v);
        } else {
            C13286a.m38862c("BUCKET", "Tried to release value %s from an empty bucket!", v);
        }
    }

    public C13808e(int i, int i2, int i3, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        C13307g.m38947b(z2);
        if (i2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        C13307g.m38947b(z3);
        if (i3 >= 0) {
            z4 = true;
        }
        C13307g.m38947b(z4);
        this.f36650a = i;
        this.f36651b = i2;
        this.f36652c = new LinkedList();
        this.f36653d = i3;
        this.f36654e = z;
    }
}
