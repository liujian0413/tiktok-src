package p346io.reactivex.internal.schedulers;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: io.reactivex.internal.schedulers.RxThreadFactory */
public final class RxThreadFactory extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final String prefix;
    final int priority;

    /* renamed from: io.reactivex.internal.schedulers.RxThreadFactory$a */
    static final class C47792a extends Thread implements C47813j {
        C47792a(Runnable runnable, String str) {
            super(runnable, str);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RxThreadFactory[");
        sb.append(this.prefix);
        sb.append("]");
        return sb.toString();
    }

    public RxThreadFactory(String str) {
        this(str, 5, false);
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread;
        StringBuilder sb = new StringBuilder(this.prefix);
        sb.append('-');
        sb.append(incrementAndGet());
        String sb2 = sb.toString();
        if (this.nonBlocking) {
            thread = new C47792a(runnable, sb2);
        } else {
            thread = new Thread(runnable, sb2);
        }
        thread.setPriority(this.priority);
        thread.setDaemon(true);
        return thread;
    }

    public RxThreadFactory(String str, int i) {
        this(str, i, false);
    }

    public RxThreadFactory(String str, int i, boolean z) {
        this.prefix = str;
        this.priority = i;
        this.nonBlocking = z;
    }
}
