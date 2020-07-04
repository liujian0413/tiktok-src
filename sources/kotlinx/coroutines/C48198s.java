package kotlinx.coroutines;

import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: kotlinx.coroutines.s */
final class C48198s {
    /* renamed from: a */
    static ExecutorService m149539a(int i, ThreadFactory threadFactory) {
        return C7258h.m22724a(C7265m.m22758a(ThreadPoolType.FIXED).mo18993a(i).mo18995a(threadFactory).mo18996a());
    }
}
