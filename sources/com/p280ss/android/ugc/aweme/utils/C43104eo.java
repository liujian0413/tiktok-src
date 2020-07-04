package com.p280ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import com.google.common.base.C17463v;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.utils.eo */
public final class C43104eo extends C17463v {

    /* renamed from: a */
    public static C43104eo f111724a = new C43104eo();

    private C43104eo() {
    }

    /* renamed from: a */
    public final long mo44952a() {
        return TimeUnit.MILLISECONDS.toNanos(SystemClock.uptimeMillis());
    }
}
