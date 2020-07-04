package com.bytedance.frameworks.core.thread;

import com.bytedance.frameworks.core.thread.TTPriority.Priority;
import com.bytedance.frameworks.core.thread.TTPriority.ThreadType;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* renamed from: com.bytedance.frameworks.core.thread.b */
public class C10202b<V> extends FutureTask<V> implements TTPriority, Comparable<C10202b<V>> {

    /* renamed from: a */
    private Priority f27749a;

    /* renamed from: b */
    public ThreadType f27750b;

    /* renamed from: a */
    public final Priority mo24906a() {
        return this.f27749a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(C10202b bVar) {
        if (mo24906a().getValue() < bVar.mo24906a().getValue()) {
            return 1;
        }
        if (mo24906a().getValue() > bVar.mo24906a().getValue()) {
            return -1;
        }
        return 0;
    }

    public C10202b(Callable<V> callable, Priority priority, ThreadType threadType) {
        super(callable);
        if (priority == null) {
            priority = Priority.NORMAL;
        }
        this.f27749a = priority;
        this.f27750b = threadType;
    }
}
