package p346io.reactivex.p1865a.p1867b;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7499z;
import p346io.reactivex.C7499z.C7502c;
import p346io.reactivex.p347b.C47563d;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.a.b.b */
final class C47552b extends C7499z {

    /* renamed from: b */
    private final Handler f122004b;

    /* renamed from: c */
    private final boolean f122005c;

    /* renamed from: io.reactivex.a.b.b$a */
    static final class C47553a extends C7502c {

        /* renamed from: a */
        private final Handler f122006a;

        /* renamed from: b */
        private final boolean f122007b;

        /* renamed from: c */
        private volatile boolean f122008c;

        public final boolean isDisposed() {
            return this.f122008c;
        }

        public final void dispose() {
            this.f122008c = true;
            this.f122006a.removeCallbacksAndMessages(this);
        }

        C47553a(Handler handler, boolean z) {
            this.f122006a = handler;
            this.f122007b = z;
        }

        /* renamed from: a */
        public final C7321c mo19344a(Runnable runnable, long j, TimeUnit timeUnit) {
            if (runnable == null) {
                throw new NullPointerException("run == null");
            } else if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            } else if (this.f122008c) {
                return C47563d.m148351b();
            } else {
                C47554b bVar = new C47554b(this.f122006a, C7332a.m23025a(runnable));
                Message obtain = Message.obtain(this.f122006a, bVar);
                obtain.obj = this;
                if (this.f122007b) {
                    obtain.setAsynchronous(true);
                }
                this.f122006a.sendMessageDelayed(obtain, timeUnit.toMillis(j));
                if (!this.f122008c) {
                    return bVar;
                }
                this.f122006a.removeCallbacks(bVar);
                return C47563d.m148351b();
            }
        }
    }

    /* renamed from: io.reactivex.a.b.b$b */
    static final class C47554b implements C7321c, Runnable {

        /* renamed from: a */
        private final Handler f122009a;

        /* renamed from: b */
        private final Runnable f122010b;

        /* renamed from: c */
        private volatile boolean f122011c;

        public final boolean isDisposed() {
            return this.f122011c;
        }

        public final void dispose() {
            this.f122009a.removeCallbacks(this);
            this.f122011c = true;
        }

        public final void run() {
            try {
                this.f122010b.run();
            } catch (Throwable th) {
                C7332a.m23029a(th);
            }
        }

        C47554b(Handler handler, Runnable runnable) {
            this.f122009a = handler;
            this.f122010b = runnable;
        }
    }

    /* renamed from: a */
    public final C7502c mo19338a() {
        return new C47553a(this.f122004b, this.f122005c);
    }

    C47552b(Handler handler, boolean z) {
        this.f122004b = handler;
        this.f122005c = z;
    }

    /* renamed from: a */
    public final C7321c mo19337a(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            throw new NullPointerException("run == null");
        } else if (timeUnit != null) {
            C47554b bVar = new C47554b(this.f122004b, C7332a.m23025a(runnable));
            this.f122004b.postDelayed(bVar, timeUnit.toMillis(j));
            return bVar;
        } else {
            throw new NullPointerException("unit == null");
        }
    }
}
