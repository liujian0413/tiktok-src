package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class ack implements ThreadFactory {

    /* renamed from: a */
    private final AtomicInteger f40001a = new AtomicInteger(1);

    /* renamed from: b */
    private final /* synthetic */ String f40002b;

    ack(String str) {
        this.f40002b = str;
    }

    public final Thread newThread(Runnable runnable) {
        String str = this.f40002b;
        int andIncrement = this.f40001a.getAndIncrement();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("AdWorker(");
        sb.append(str);
        sb.append(") #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
