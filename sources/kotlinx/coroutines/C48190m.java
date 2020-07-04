package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.C47919b;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.m */
public final class C48190m extends C48217t {

    /* renamed from: b */
    private static final AtomicIntegerFieldUpdater f123051b = AtomicIntegerFieldUpdater.newUpdater(C48190m.class, "resumed");

    /* renamed from: c */
    private static final AtomicIntegerFieldUpdater f123052c = AtomicIntegerFieldUpdater.newUpdater(C48190m.class, "handled");
    private volatile int handled;
    private volatile int resumed;

    /* renamed from: a */
    public final boolean mo120410a() {
        return f123051b.compareAndSet(this, 0, 1);
    }

    /* renamed from: b */
    public final boolean mo120411b() {
        return f123052c.compareAndSet(this, 0, 1);
    }

    public C48190m(C47919b<?> bVar, Throwable th, boolean z) {
        C7573i.m23587b(bVar, "continuation");
        if (th == null) {
            StringBuilder sb = new StringBuilder("Continuation ");
            sb.append(bVar);
            sb.append(" was cancelled normally");
            th = new CancellationException(sb.toString());
        }
        super(th);
        this.resumed = 0;
        this.handled = z ? 1 : 0;
    }
}
