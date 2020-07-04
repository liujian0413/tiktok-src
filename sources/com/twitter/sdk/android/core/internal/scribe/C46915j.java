package com.twitter.sdk.android.core.internal.scribe;

/* renamed from: com.twitter.sdk.android.core.internal.scribe.j */
final /* synthetic */ class C46915j implements Runnable {

    /* renamed from: a */
    private final C46914i f120305a;

    /* renamed from: b */
    private final Object f120306b;

    /* renamed from: c */
    private final boolean f120307c;

    C46915j(C46914i iVar, Object obj, boolean z) {
        this.f120305a = iVar;
        this.f120306b = obj;
        this.f120307c = z;
    }

    public final void run() {
        this.f120305a.mo118053b(this.f120306b, this.f120307c);
    }
}
