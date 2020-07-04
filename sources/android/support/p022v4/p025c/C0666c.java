package android.support.p022v4.p025c;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import java.util.concurrent.Callable;

/* renamed from: android.support.v4.c.c */
public final class C0666c {

    /* renamed from: a */
    private final Object f2566a = new Object();

    /* renamed from: b */
    private HandlerThread f2567b;

    /* renamed from: c */
    private Handler f2568c;

    /* renamed from: d */
    private int f2569d;

    /* renamed from: e */
    private Callback f2570e = new Callback() {
        public final boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    C0666c.this.mo2768a();
                    return true;
                case 1:
                    C0666c.this.mo2769a((Runnable) message.obj);
                    return true;
                default:
                    return true;
            }
        }
    };

    /* renamed from: f */
    private final int f2571f;

    /* renamed from: g */
    private final int f2572g;

    /* renamed from: h */
    private final String f2573h;

    /* renamed from: android.support.v4.c.c$a */
    public interface C0671a<T> {
        /* renamed from: a */
        void mo2765a(T t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2768a() {
        synchronized (this.f2566a) {
            if (!this.f2568c.hasMessages(1)) {
                this.f2567b.quit();
                this.f2567b = null;
                this.f2568c = null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo2769a(Runnable runnable) {
        runnable.run();
        synchronized (this.f2566a) {
            this.f2568c.removeMessages(0);
            this.f2568c.sendMessageDelayed(this.f2568c.obtainMessage(0), (long) this.f2571f);
        }
    }

    /* renamed from: b */
    private void m2853b(Runnable runnable) {
        synchronized (this.f2566a) {
            if (this.f2567b == null) {
                this.f2567b = new HandlerThread(this.f2573h, this.f2572g);
                this.f2567b.start();
                this.f2568c = new Handler(this.f2567b.getLooper(), this.f2570e);
                this.f2569d++;
            }
            this.f2568c.removeMessages(0);
            this.f2568c.sendMessage(this.f2568c.obtainMessage(1, runnable));
        }
    }

    /* renamed from: a */
    public final <T> void mo2770a(final Callable<T> callable, final C0671a<T> aVar) {
        final Handler handler = new Handler();
        m2853b(new Runnable() {
            public final void run() {
                final Object obj;
                try {
                    obj = callable.call();
                } catch (Exception unused) {
                    obj = null;
                }
                handler.post(new Runnable() {
                    public final void run() {
                        aVar.mo2765a(obj);
                    }
                });
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|(4:26|15|16|17)(1:18)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0040 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0046 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> T mo2767a(java.util.concurrent.Callable<T> r13, int r14) throws java.lang.InterruptedException {
        /*
            r12 = this;
            java.util.concurrent.locks.ReentrantLock r7 = new java.util.concurrent.locks.ReentrantLock
            r7.<init>()
            java.util.concurrent.locks.Condition r8 = r7.newCondition()
            java.util.concurrent.atomic.AtomicReference r9 = new java.util.concurrent.atomic.AtomicReference
            r9.<init>()
            java.util.concurrent.atomic.AtomicBoolean r10 = new java.util.concurrent.atomic.AtomicBoolean
            r0 = 1
            r10.<init>(r0)
            android.support.v4.c.c$3 r11 = new android.support.v4.c.c$3
            r0 = r11
            r1 = r12
            r2 = r9
            r3 = r13
            r4 = r7
            r5 = r10
            r6 = r8
            r0.<init>(r2, r3, r4, r5, r6)
            r12.m2853b(r11)
            r7.lock()
            boolean r13 = r10.get()     // Catch:{ all -> 0x005d }
            if (r13 != 0) goto L_0x0034
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005d }
            r7.unlock()
            return r13
        L_0x0034:
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x005d }
            long r0 = (long) r14     // Catch:{ all -> 0x005d }
            long r13 = r13.toNanos(r0)     // Catch:{ all -> 0x005d }
        L_0x003b:
            long r0 = r8.awaitNanos(r13)     // Catch:{ InterruptedException -> 0x0040 }
            r13 = r0
        L_0x0040:
            boolean r0 = r10.get()     // Catch:{ all -> 0x005d }
            if (r0 != 0) goto L_0x004e
            java.lang.Object r13 = r9.get()     // Catch:{ all -> 0x005d }
            r7.unlock()
            return r13
        L_0x004e:
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0055
            goto L_0x003b
        L_0x0055:
            java.lang.InterruptedException r13 = new java.lang.InterruptedException     // Catch:{ all -> 0x005d }
            java.lang.String r14 = "timeout"
            r13.<init>(r14)     // Catch:{ all -> 0x005d }
            throw r13     // Catch:{ all -> 0x005d }
        L_0x005d:
            r13 = move-exception
            r7.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p022v4.p025c.C0666c.mo2767a(java.util.concurrent.Callable, int):java.lang.Object");
    }

    public C0666c(String str, int i, int i2) {
        this.f2573h = str;
        this.f2572g = 10;
        this.f2571f = VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
        this.f2569d = 0;
    }
}
