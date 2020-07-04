package com.google.firebase.analytics.connector;

import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.analytics.connector.c */
final /* synthetic */ class C18268c implements Executor {

    /* renamed from: a */
    static final Executor f49652a = new C18268c();

    private C18268c() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
