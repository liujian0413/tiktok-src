package com.p280ss.android.ugc.asve.p756d;

import android.os.Handler;
import android.os.Looper;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.asve.d.i */
public final class C15455i {

    /* renamed from: a */
    private static final Handler f39758a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static final void m45262a(C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "action");
        Thread currentThread = Thread.currentThread();
        Looper mainLooper = Looper.getMainLooper();
        C7573i.m23582a((Object) mainLooper, "Looper.getMainLooper()");
        if (C7573i.m23585a((Object) currentThread, (Object) mainLooper.getThread())) {
            aVar.invoke();
        } else {
            f39758a.post(new C15456j(aVar));
        }
    }
}
