package com.twitter.sdk.android.core.internal.p1846b;

/* renamed from: com.twitter.sdk.android.core.internal.b.d */
public final class C46863d<T> {

    /* renamed from: a */
    private final C46861b f120170a;

    /* renamed from: b */
    private final C46864e<T> f120171b;

    /* renamed from: c */
    private final String f120172c;

    /* renamed from: b */
    public final void mo117965b() {
        this.f120170a.mo117962b().remove(this.f120172c).commit();
    }

    /* renamed from: a */
    public final T mo117963a() {
        return this.f120171b.mo117909a(this.f120170a.mo117960a().getString(this.f120172c, null));
    }

    /* renamed from: a */
    public final void mo117964a(T t) {
        this.f120170a.mo117961a(this.f120170a.mo117962b().putString(this.f120172c, this.f120171b.mo117910a(t)));
    }

    public C46863d(C46861b bVar, C46864e<T> eVar, String str) {
        this.f120170a = bVar;
        this.f120171b = eVar;
        this.f120172c = str;
    }
}
