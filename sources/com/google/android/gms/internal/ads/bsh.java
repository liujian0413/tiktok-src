package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;

final class bsh implements ThreadFactory {

    /* renamed from: a */
    private final /* synthetic */ String f43408a;

    bsh(String str) {
        this.f43408a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f43408a);
    }
}
