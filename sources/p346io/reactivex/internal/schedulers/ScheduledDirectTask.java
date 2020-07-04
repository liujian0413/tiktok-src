package p346io.reactivex.internal.schedulers;

import java.util.concurrent.Callable;

/* renamed from: io.reactivex.internal.schedulers.ScheduledDirectTask */
public final class ScheduledDirectTask extends C47793a implements Callable<Void> {
    private static final long serialVersionUID = 1811839108042568751L;

    public final /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public final Void call() throws Exception {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            return null;
        } finally {
            lazySet(FINISHED);
            this.runner = null;
        }
    }

    public ScheduledDirectTask(Runnable runnable) {
        super(runnable);
    }
}
