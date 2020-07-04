package com.p280ss.android.ugc.aweme.app;

import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

/* renamed from: com.ss.android.ugc.aweme.app.ab */
public final class C6864ab extends AbortPolicy {
    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        try {
            super.rejectedExecution(runnable, threadPoolExecutor);
        } catch (RejectedExecutionException e) {
            BlockingQueue queue = threadPoolExecutor.getQueue();
            StringBuilder sb = new StringBuilder();
            sb.append(e.getMessage());
            sb.append(" Pending tasks: ");
            sb.append(queue);
            C6921a.m21555a(sb.toString());
        }
    }
}
