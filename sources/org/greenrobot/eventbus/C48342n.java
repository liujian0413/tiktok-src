package org.greenrobot.eventbus;

import java.lang.reflect.Method;

/* renamed from: org.greenrobot.eventbus.n */
public final class C48342n {

    /* renamed from: a */
    final Method f123423a;

    /* renamed from: b */
    final ThreadMode f123424b;

    /* renamed from: c */
    final Class<?> f123425c;

    /* renamed from: d */
    final int f123426d;

    /* renamed from: e */
    final boolean f123427e;

    /* renamed from: f */
    String f123428f;

    public final int hashCode() {
        return this.f123423a.hashCode();
    }

    /* renamed from: a */
    private synchronized void m149926a() {
        if (this.f123428f == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f123423a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f123423a.getName());
            sb.append('(');
            sb.append(this.f123425c.getName());
            this.f123428f = sb.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C48342n)) {
            return false;
        }
        m149926a();
        C48342n nVar = (C48342n) obj;
        nVar.m149926a();
        return this.f123428f.equals(nVar.f123428f);
    }

    public C48342n(Method method, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f123423a = method;
        this.f123424b = threadMode;
        this.f123425c = cls;
        this.f123426d = i;
        this.f123427e = z;
    }
}
