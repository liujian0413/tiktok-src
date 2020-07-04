package com.google.firebase.iid;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.firebase.iid.an */
final /* synthetic */ class C18316an implements ThreadFactory {

    /* renamed from: a */
    static final ThreadFactory f49786a = new C18316an();

    private C18316an() {
    }

    public final Thread newThread(Runnable runnable) {
        return C18315am.m60390a(runnable);
    }
}
