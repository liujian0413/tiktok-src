package com.p280ss.android.ugc.aweme.shortvideo.util;

import android.os.HandlerThread;
import android.os.Looper;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.util.f */
public final class C41552f {

    /* renamed from: a */
    public static final C41552f f108022a = new C41552f();

    /* renamed from: b */
    private static HandlerThread f108023b;

    private C41552f() {
    }

    /* renamed from: a */
    public static final Looper m132326a() {
        Looper looper = f108023b.getLooper();
        C7573i.m23582a((Object) looper, "thread.looper");
        return looper;
    }

    static {
        HandlerThread handlerThread = new HandlerThread("AVUtilThread");
        f108023b = handlerThread;
        handlerThread.start();
    }
}
