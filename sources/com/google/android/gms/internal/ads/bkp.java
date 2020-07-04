package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

final class bkp implements ThreadFactory {

    /* renamed from: a */
    private final /* synthetic */ String f42389a;

    bkp(String str) {
        this.f42389a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f42389a);
    }
}
