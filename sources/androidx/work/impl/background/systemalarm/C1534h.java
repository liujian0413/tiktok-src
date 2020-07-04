package androidx.work.impl.background.systemalarm;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: androidx.work.impl.background.systemalarm.h */
final class C1534h {
    /* renamed from: a */
    static ScheduledExecutorService m7557a() {
        return (ScheduledExecutorService) C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(1).mo18996a());
    }
}
