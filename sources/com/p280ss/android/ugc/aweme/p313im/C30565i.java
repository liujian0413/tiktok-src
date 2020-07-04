package com.p280ss.android.ugc.aweme.p313im;

import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.ss.android.ugc.aweme.im.i */
public final class C30565i {

    /* renamed from: a */
    private static ReentrantLock f80273a = new ReentrantLock();

    /* renamed from: a */
    public static void m99837a() {
        f80273a.lock();
    }

    /* renamed from: b */
    public static void m99838b() {
        f80273a.unlock();
    }
}
