package com.p280ss.android.ugc.aweme.port.internal;

import com.p280ss.android.ugc.aweme.property.C36964i;
import com.p280ss.android.ugc.aweme.services.video.IVideoConfigService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.port.internal.i */
public final class C35619i implements IVideoConfigService {

    /* renamed from: a */
    private static int f93308a = 576;

    /* renamed from: b */
    private static int f93309b = 1024;

    /* renamed from: c */
    private static final AtomicBoolean f93310c = new AtomicBoolean(false);

    public final int getVideoHeight() {
        m115060a();
        return f93309b;
    }

    public final int getVideoWidth() {
        m115060a();
        return f93308a;
    }

    public final void invalidate() {
        f93310c.set(false);
    }

    /* renamed from: a */
    private void m115060a() {
        if (!f93310c.get()) {
            synchronized (f93310c) {
                if (f93310c.compareAndSet(false, true)) {
                    m115061b();
                }
            }
        }
    }

    /* renamed from: b */
    private static void m115061b() {
        int[] j = C36964i.m118934j();
        if (j != null && j.length == 2 && j[0] > 0 && j[1] > 0) {
            f93308a = j[0];
            f93309b = j[1];
        }
    }
}
