package com.bytedance.jedi.arch.internal;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.p347b.C47563d;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.jedi.arch.internal.e */
public final class C11635e extends C7499z {

    /* renamed from: b */
    private final Handler f31288b;

    /* renamed from: c */
    private final boolean f31289c = false;

    /* renamed from: com.bytedance.jedi.arch.internal.e$a */
    static final class C11636a extends C7502c {

        /* renamed from: a */
        private volatile boolean f31290a;

        /* renamed from: b */
        private final Handler f31291b;

        /* renamed from: c */
        private final boolean f31292c;

        public final boolean isDisposed() {
            return this.f31290a;
        }

        public final void dispose() {
            this.f31290a = true;
            this.f31291b.removeCallbacksAndMessages(this);
        }

        public C11636a(Handler handler, boolean z) {
            C7573i.m23587b(handler, "handler");
            this.f31291b = handler;
            this.f31292c = z;
        }

        /* renamed from: a */
        public final C7321c mo19344a(Runnable runnable, long j, TimeUnit timeUnit) {
            C7573i.m23587b(runnable, "rawRunnable");
            C7573i.m23587b(timeUnit, "unit");
            if (this.f31290a) {
                C7321c b = C47563d.m148351b();
                C7573i.m23582a((Object) b, "Disposables.disposed()");
                return b;
            }
            Runnable a = C7332a.m23025a(runnable);
            C7573i.m23582a((Object) a, "RxJavaPlugins.onSchedule(rawRunnable)");
            boolean b2 = C11638f.m34105b();
            C11637b bVar = new C11637b(this.f31291b, a, b2);
            if (b2) {
                bVar.run();
                return bVar;
            }
            Runnable runnable2 = bVar;
            Message obtain = Message.obtain(this.f31291b, runnable2);
            obtain.obj = this;
            if (this.f31292c) {
                C7573i.m23582a((Object) obtain, "message");
                obtain.setAsynchronous(true);
            }
            this.f31291b.sendMessageDelayed(obtain, timeUnit.toMillis(j));
            if (!this.f31290a) {
                return bVar;
            }
            this.f31291b.removeCallbacks(runnable2);
            C7321c b3 = C47563d.m148351b();
            C7573i.m23582a((Object) b3, "Disposables.disposed()");
            return b3;
        }
    }

    /* renamed from: com.bytedance.jedi.arch.internal.e$b */
    static final class C11637b implements C7321c, Runnable {

        /* renamed from: a */
        private volatile boolean f31293a;

        /* renamed from: b */
        private final Handler f31294b;

        /* renamed from: c */
        private final Runnable f31295c;

        /* renamed from: d */
        private final boolean f31296d;

        public final boolean isDisposed() {
            return this.f31293a;
        }

        public final void dispose() {
            if (!this.f31296d) {
                this.f31294b.removeCallbacks(this);
            }
            this.f31293a = true;
        }

        public final void run() {
            try {
                this.f31295c.run();
            } catch (Throwable th) {
                C7332a.m23029a(th);
            }
        }

        public C11637b(Handler handler, Runnable runnable, boolean z) {
            C7573i.m23587b(handler, "handler");
            C7573i.m23587b(runnable, "delegate");
            this.f31294b = handler;
            this.f31295c = runnable;
            this.f31296d = z;
        }
    }

    /* renamed from: a */
    public final C7502c mo19338a() {
        return new C11636a(this.f31288b, this.f31289c);
    }

    public C11635e(Handler handler, boolean z) {
        C7573i.m23587b(handler, "handler");
        this.f31288b = handler;
    }

    /* renamed from: a */
    public final C7321c mo19337a(Runnable runnable, long j, TimeUnit timeUnit) {
        C7573i.m23587b(runnable, "rawRunnable");
        C7573i.m23587b(timeUnit, "unit");
        Runnable a = C7332a.m23025a(runnable);
        C7573i.m23582a((Object) a, "RxJavaPlugins.onSchedule(rawRunnable)");
        boolean b = C11638f.m34105b();
        C11637b bVar = new C11637b(this.f31288b, a, b);
        if (b) {
            bVar.run();
            return bVar;
        }
        this.f31288b.postDelayed(bVar, timeUnit.toMillis(j));
        return bVar;
    }
}
