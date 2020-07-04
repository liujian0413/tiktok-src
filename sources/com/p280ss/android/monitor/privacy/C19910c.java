package com.p280ss.android.monitor.privacy;

import com.p280ss.android.common.applog.AppLog;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.monitor.privacy.c */
final /* synthetic */ class C19910c implements Callable {

    /* renamed from: a */
    static final Callable f53964a = new C19910c();

    private C19910c() {
    }

    public final Object call() {
        return AppLog.getServerDeviceId();
    }
}
