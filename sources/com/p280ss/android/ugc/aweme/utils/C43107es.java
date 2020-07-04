package com.p280ss.android.ugc.aweme.utils;

import android.os.Handler;
import android.os.Looper;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.utils.es */
public final class C43107es {

    /* renamed from: a */
    private static final Handler f111725a = new Handler(Looper.getMainLooper());

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m136728a(long j, C7561a<C7581n> aVar) {
        C7573i.m23587b(aVar, "action");
        if (j <= 0) {
            Thread currentThread = Thread.currentThread();
            Looper mainLooper = Looper.getMainLooper();
            C7573i.m23582a((Object) mainLooper, "Looper.getMainLooper()");
            if (C7573i.m23585a((Object) currentThread, (Object) mainLooper.getThread())) {
                aVar.invoke();
            } else {
                f111725a.post(new C43108et(aVar));
            }
        } else {
            f111725a.postDelayed(new C43108et(aVar), j);
        }
    }
}
