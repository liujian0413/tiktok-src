package com.facebook.network.connectionclass;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.network.connectionclass.c */
public final class C14146c {

    /* renamed from: a */
    public final C14143b f37381a;

    /* renamed from: b */
    public long f37382b;

    /* renamed from: c */
    private AtomicInteger f37383c;

    /* renamed from: d */
    private Handler f37384d;

    /* renamed from: e */
    private HandlerThread f37385e;

    /* renamed from: com.facebook.network.connectionclass.c$a */
    static class C14148a {

        /* renamed from: a */
        public static final C14146c f37386a = new C14146c(C14143b.m41756a());
    }

    /* renamed from: com.facebook.network.connectionclass.c$b */
    class C14149b extends Handler {
        /* renamed from: a */
        private void m41764a() {
            long a = C14152f.m41769a().mo33910a(Process.myUid());
            synchronized (this) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (a != -1) {
                    C14146c.this.f37381a.mo33900a(a, elapsedRealtime - C14146c.this.f37382b);
                }
                C14146c.this.f37382b = elapsedRealtime;
            }
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    m41764a();
                    sendEmptyMessageDelayed(1, 1000);
                    return;
                case 2:
                    m41764a();
                    removeMessages(1);
                    return;
                default:
                    StringBuilder sb = new StringBuilder("Unknown what=");
                    sb.append(message.what);
                    throw new IllegalArgumentException(sb.toString());
            }
        }

        public C14149b(Looper looper) {
            super(looper);
        }
    }

    /* renamed from: a */
    public static C14146c m41761a() {
        return C14148a.f37386a;
    }

    /* renamed from: c */
    public final void mo33904c() {
        if (this.f37383c.decrementAndGet() == 0) {
            this.f37384d.sendEmptyMessage(2);
        }
    }

    /* renamed from: b */
    public final void mo33903b() {
        if (this.f37383c.getAndIncrement() == 0) {
            this.f37384d.sendEmptyMessage(1);
            this.f37382b = SystemClock.elapsedRealtime();
        }
    }

    private C14146c(C14143b bVar) {
        this.f37381a = bVar;
        this.f37383c = new AtomicInteger();
        this.f37385e = new HandlerThread("ParseThread");
        this.f37385e.start();
        this.f37384d = new C14149b(this.f37385e.getLooper());
    }
}
