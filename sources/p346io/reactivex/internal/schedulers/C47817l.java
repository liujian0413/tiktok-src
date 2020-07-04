package p346io.reactivex.internal.schedulers;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: io.reactivex.internal.schedulers.l */
final class C47817l {
    /* renamed from: a */
    static ScheduledExecutorService m148681a(int i, ThreadFactory threadFactory) {
        return (ScheduledExecutorService) C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(1).mo18995a(threadFactory).mo18996a());
    }
}
