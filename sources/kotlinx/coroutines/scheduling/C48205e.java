package kotlinx.coroutines.scheduling;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.C48092ba;

/* renamed from: kotlinx.coroutines.scheduling.e */
final class C48205e extends C48092ba implements Executor, C48209i {

    /* renamed from: e */
    private static final AtomicIntegerFieldUpdater f123093e = AtomicIntegerFieldUpdater.newUpdater(C48205e.class, "inFlightTasks");

    /* renamed from: b */
    public final C48203c f123094b;

    /* renamed from: c */
    public final int f123095c;

    /* renamed from: d */
    private final ConcurrentLinkedQueue<Runnable> f123096d = new ConcurrentLinkedQueue<>();

    /* renamed from: f */
    private final TaskMode f123097f;
    private volatile int inFlightTasks = 0;

    /* renamed from: b */
    public final TaskMode mo120438b() {
        return this.f123097f;
    }

    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[dispatcher = ");
        sb.append(this.f123094b);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo120437a() {
        Runnable runnable = (Runnable) this.f123096d.poll();
        if (runnable != null) {
            this.f123094b.mo120435a(runnable, this, true);
            return;
        }
        f123093e.decrementAndGet(this);
        Runnable runnable2 = (Runnable) this.f123096d.poll();
        if (runnable2 != null) {
            m149580a(runnable2, true);
        }
    }

    public final void execute(Runnable runnable) {
        C7573i.m23587b(runnable, "command");
        m149580a(runnable, false);
    }

    /* renamed from: a */
    public final void mo83489a(C47924e eVar, Runnable runnable) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(runnable, "block");
        m149580a(runnable, false);
    }

    /* renamed from: a */
    private final void m149580a(Runnable runnable, boolean z) {
        while (f123093e.incrementAndGet(this) > this.f123095c) {
            this.f123096d.add(runnable);
            if (f123093e.decrementAndGet(this) < this.f123095c) {
                runnable = (Runnable) this.f123096d.poll();
                if (runnable == null) {
                    return;
                }
            } else {
                return;
            }
        }
        this.f123094b.mo120435a(runnable, this, z);
    }

    public C48205e(C48203c cVar, int i, TaskMode taskMode) {
        C7573i.m23587b(cVar, "dispatcher");
        C7573i.m23587b(taskMode, "taskMode");
        this.f123094b = cVar;
        this.f123095c = i;
        this.f123097f = taskMode;
    }
}
