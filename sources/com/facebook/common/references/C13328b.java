package com.facebook.common.references;

import java.lang.ref.SoftReference;

/* renamed from: com.facebook.common.references.b */
public final class C13328b<T> {

    /* renamed from: a */
    SoftReference<T> f35236a;

    /* renamed from: b */
    SoftReference<T> f35237b;

    /* renamed from: c */
    SoftReference<T> f35238c;

    /* renamed from: a */
    public final T mo32617a() {
        if (this.f35236a == null) {
            return null;
        }
        return this.f35236a.get();
    }

    /* renamed from: b */
    public final void mo32619b() {
        if (this.f35236a != null) {
            this.f35236a.clear();
            this.f35236a = null;
        }
        if (this.f35237b != null) {
            this.f35237b.clear();
            this.f35237b = null;
        }
        if (this.f35238c != null) {
            this.f35238c.clear();
            this.f35238c = null;
        }
    }

    /* renamed from: a */
    public final void mo32618a(T t) {
        this.f35236a = new SoftReference<>(t);
        this.f35237b = new SoftReference<>(t);
        this.f35238c = new SoftReference<>(t);
    }
}
