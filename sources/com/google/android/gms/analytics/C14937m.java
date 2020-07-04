package com.google.android.gms.analytics;

import java.util.Iterator;

/* renamed from: com.google.android.gms.analytics.m */
final class C14937m implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C14930i f38625a;

    /* renamed from: b */
    private final /* synthetic */ C14933l f38626b;

    C14937m(C14933l lVar, C14930i iVar) {
        this.f38626b = lVar;
        this.f38625a = iVar;
    }

    public final void run() {
        this.f38625a.f38602a.mo37983a(this.f38625a);
        Iterator it = this.f38626b.f38619d.iterator();
        while (it.hasNext()) {
            it.next();
        }
        C14933l.m43381b(this.f38625a);
    }
}
