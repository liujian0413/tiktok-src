package bolts;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: bolts.c */
final class C1587c {
    /* renamed from: a */
    static ScheduledExecutorService m7834a() {
        return (ScheduledExecutorService) C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(1).mo18996a());
    }

    /* renamed from: b */
    static ExecutorService m7835b() {
        return C7258h.m22731d();
    }

    /* renamed from: c */
    static ScheduledExecutorService m7836c() {
        return C7258h.m22733f();
    }
}
