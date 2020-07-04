package com.p280ss.android.ugc.aweme.port.internal;

import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.port.internal.e */
public final class C35613e implements IVideoConfigService {

    /* renamed from: a */
    private static int f93298a = 576;

    /* renamed from: b */
    private static int f93299b = 1024;

    /* renamed from: c */
    private static final AtomicBoolean f93300c = new AtomicBoolean(false);

    public final int getVideoHeight() {
        m115055a();
        return f93299b;
    }

    public final int getVideoWidth() {
        m115055a();
        return f93298a;
    }

    public final void invalidate() {
        f93300c.set(false);
    }

    /* renamed from: a */
    private void m115055a() {
        if (!f93300c.get()) {
            synchronized (f93300c) {
                if (f93300c.compareAndSet(false, true)) {
                    m115056b();
                }
            }
        }
    }

    /* renamed from: b */
    private static void m115056b() {
        int[] k = C36964i.m118935k();
        if (k != null && k.length == 2 && k[0] > 0 && k[1] > 0) {
            f93298a = k[0];
            f93299b = k[1];
        }
    }
}
