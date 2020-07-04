package com.p280ss.android.ugc.aweme.crossplatform.view;

import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.view.a */
public final class C26022a<T> implements C26024b<T> {

    /* renamed from: a */
    public final C7562b<T, C7581n> f68794a;

    /* renamed from: b */
    private T f68795b;

    /* renamed from: c */
    private int f68796c;

    public C26022a(T t) {
        this(t, null, 2, null);
    }

    /* renamed from: a */
    public final int mo67541a() {
        return this.f68796c;
    }

    /* renamed from: b */
    public final T mo67542b() {
        if (this.f68796c > 0) {
            return this.f68795b;
        }
        return null;
    }

    /* renamed from: c */
    public final synchronized C26024b<T> mo67543c() {
        this.f68796c++;
        return this;
    }

    /* renamed from: e */
    private synchronized void m85481e() {
        this.f68796c = 0;
        T t = this.f68795b;
        if (t != null) {
            this.f68794a.invoke(t);
        }
        this.f68795b = null;
    }

    /* renamed from: d */
    public final synchronized void mo67544d() {
        this.f68796c--;
        if (this.f68796c <= 0) {
            m85481e();
        }
    }

    public C26022a(T t, C7562b<? super T, C7581n> bVar) {
        C7573i.m23587b(bVar, "recycle");
        this.f68794a = bVar;
        this.f68795b = t;
        this.f68796c = 1;
    }

    private /* synthetic */ C26022a(Object obj, C7562b bVar, int i, C7571f fVar) {
        this(obj, C260231.f68797a);
    }
}
