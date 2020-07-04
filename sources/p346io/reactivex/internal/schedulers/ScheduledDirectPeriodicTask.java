package p346io.reactivex.internal.schedulers;

import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.internal.schedulers.ScheduledDirectPeriodicTask */
public final class ScheduledDirectPeriodicTask extends C47793a implements Runnable {
    private static final long serialVersionUID = 1811839108042568751L;

    public final /* bridge */ /* synthetic */ Runnable getWrappedRunnable() {
        return super.getWrappedRunnable();
    }

    public final void run() {
        this.runner = Thread.currentThread();
        try {
            this.runnable.run();
            this.runner = null;
        } catch (Throwable th) {
            this.runner = null;
            lazySet(FINISHED);
            C7332a.m23029a(th);
        }
    }

    public ScheduledDirectPeriodicTask(Runnable runnable) {
        super(runnable);
    }
}
