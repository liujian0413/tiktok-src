package com.p280ss.android.ugc.aweme.feed.netdetector.base;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.base.BlockHookThrowableWrap */
public final class BlockHookThrowableWrap extends RuntimeException {
    private final Throwable realThrowable;

    public final Throwable getRealThrowable() {
        return this.realThrowable;
    }

    public BlockHookThrowableWrap(Throwable th) {
        C7573i.m23587b(th, "realThrowable");
        this.realThrowable = th;
    }
}
