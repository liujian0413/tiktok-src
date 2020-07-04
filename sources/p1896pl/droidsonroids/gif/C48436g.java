package p1896pl.droidsonroids.gif;

import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: pl.droidsonroids.gif.g */
abstract class C48436g implements Runnable {

    /* renamed from: c */
    final C48425a f123545c;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo123254a();

    public final void run() {
        try {
            if (!this.f123545c.mo123217b()) {
                mo123254a();
            }
        } catch (Throwable th) {
            UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }

    C48436g(C48425a aVar) {
        this.f123545c = aVar;
    }
}
