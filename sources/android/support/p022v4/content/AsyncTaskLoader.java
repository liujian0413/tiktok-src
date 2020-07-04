package android.support.p022v4.content;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p022v4.p027os.OperationCanceledException;
import android.support.p022v4.util.C0906m;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: android.support.v4.content.AsyncTaskLoader */
public abstract class AsyncTaskLoader<D> extends C0685d<D> {

    /* renamed from: a */
    volatile C0672a f2587a;

    /* renamed from: b */
    volatile C0672a f2588b;

    /* renamed from: c */
    long f2589c;

    /* renamed from: d */
    long f2590d;

    /* renamed from: e */
    Handler f2591e;

    /* renamed from: f */
    private final Executor f2592f;

    /* renamed from: android.support.v4.content.AsyncTaskLoader$a */
    final class C0672a extends ModernAsyncTask<Void, Void, D> implements Runnable {

        /* renamed from: a */
        boolean f2593a;

        /* renamed from: g */
        private final CountDownLatch f2595g = new CountDownLatch(1);

        public final void run() {
            this.f2593a = false;
            AsyncTaskLoader.this.mo2781c();
        }

        C0672a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public D mo2786a(Void... voidArr) {
            try {
                return AsyncTaskLoader.this.mo2783e();
            } catch (OperationCanceledException e) {
                if (mo2812a()) {
                    return null;
                }
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo2788b(D d) {
            try {
                AsyncTaskLoader.this.mo2776a(this, d);
            } finally {
                this.f2595g.countDown();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo2787a(D d) {
            try {
                AsyncTaskLoader.this.mo2779b(this, d);
            } finally {
                this.f2595g.countDown();
            }
        }
    }

    /* renamed from: a */
    public void mo2777a(D d) {
    }

    /* renamed from: d */
    public abstract D mo2782d();

    /* renamed from: f */
    public void mo2784f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final D mo2783e() {
        return mo2782d();
    }

    /* renamed from: g */
    public final boolean mo2785g() {
        if (this.f2588b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2775a() {
        super.mo2775a();
        mo2824m();
        this.f2587a = new C0672a<>();
        mo2781c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo2780b() {
        if (this.f2587a == null) {
            return false;
        }
        if (!this.f2630q) {
            this.f2633t = true;
        }
        if (this.f2588b != null) {
            if (this.f2587a.f2593a) {
                this.f2587a.f2593a = false;
                this.f2591e.removeCallbacks(this.f2587a);
            }
            this.f2587a = null;
            return false;
        } else if (this.f2587a.f2593a) {
            this.f2587a.f2593a = false;
            this.f2591e.removeCallbacks(this.f2587a);
            this.f2587a = null;
            return false;
        } else {
            boolean a = this.f2587a.mo2813a(false);
            if (a) {
                this.f2588b = this.f2587a;
                mo2784f();
            }
            this.f2587a = null;
            return a;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo2781c() {
        if (this.f2588b == null && this.f2587a != null) {
            if (this.f2587a.f2593a) {
                this.f2587a.f2593a = false;
                this.f2591e.removeCallbacks(this.f2587a);
            }
            if (this.f2589c <= 0 || SystemClock.uptimeMillis() >= this.f2590d + this.f2589c) {
                this.f2587a.mo2811a(this.f2592f, null);
            } else {
                this.f2587a.f2593a = true;
                this.f2591e.postAtTime(this.f2587a, this.f2590d + this.f2589c);
            }
        }
    }

    public AsyncTaskLoader(Context context) {
        this(context, ModernAsyncTask.f2608c);
    }

    private AsyncTaskLoader(Context context, Executor executor) {
        super(context);
        this.f2590d = -10000;
        this.f2592f = executor;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo2779b(C0672a aVar, D d) {
        if (this.f2587a != aVar) {
            mo2776a(aVar, d);
        } else if (this.f2631r) {
            mo2777a(d);
        } else {
            mo2830s();
            this.f2590d = SystemClock.uptimeMillis();
            this.f2587a = null;
            mo2790b(d);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2776a(C0672a aVar, D d) {
        mo2777a(d);
        if (this.f2588b == aVar) {
            mo2831t();
            this.f2590d = SystemClock.uptimeMillis();
            this.f2588b = null;
            mo2781c();
        }
    }

    /* renamed from: a */
    public void mo2778a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo2778a(str, fileDescriptor, printWriter, strArr);
        if (this.f2587a != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f2587a);
            printWriter.print(" waiting=");
            printWriter.println(this.f2587a.f2593a);
        }
        if (this.f2588b != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f2588b);
            printWriter.print(" waiting=");
            printWriter.println(this.f2588b.f2593a);
        }
        if (this.f2589c != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0906m.m3874a(this.f2589c, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0906m.m3873a(this.f2590d, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
