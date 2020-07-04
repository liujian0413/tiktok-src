package com.bytedance.common.wschannel.server;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.p280ss.android.message.C19846k;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.common.wschannel.server.b */
public final class C9832b {

    /* renamed from: a */
    private final C9835b f26812a;

    /* renamed from: com.bytedance.common.wschannel.server.b$a */
    class C9834a implements C9835b {

        /* renamed from: b */
        private final Context f26814b;

        /* renamed from: a */
        public final void mo24391a() {
        }

        /* renamed from: a */
        public final void mo24392a(Intent intent) {
            try {
                this.f26814b.startService(intent);
            } catch (Throwable unused) {
            }
        }

        C9834a(Context context) {
            this.f26814b = context;
        }
    }

    /* renamed from: com.bytedance.common.wschannel.server.b$b */
    public interface C9835b {
        /* renamed from: a */
        void mo24391a();

        /* renamed from: a */
        void mo24392a(Intent intent);
    }

    /* renamed from: com.bytedance.common.wschannel.server.b$c */
    class C9836c implements C9835b {

        /* renamed from: a */
        public final Context f26815a;

        /* renamed from: b */
        public Messenger f26816b;

        /* renamed from: c */
        public LinkedBlockingDeque<Intent> f26817c = new LinkedBlockingDeque<>();

        /* renamed from: d */
        public ServiceConnection f26818d;

        /* renamed from: e */
        public boolean f26819e = false;

        /* renamed from: f */
        public final Object f26820f = new Object();

        /* renamed from: g */
        public Intent f26821g;

        /* renamed from: h */
        public final AtomicInteger f26822h = new AtomicInteger(0);

        /* renamed from: j */
        private Runnable f26824j = new Runnable() {
            public final void run() {
                synchronized (C9836c.this.f26820f) {
                    if (C9836c.this.f26819e) {
                        C9836c.this.f26819e = false;
                    }
                    if (C9836c.this.f26821g != null) {
                        C9836c.this.f26817c.addFirst(C9836c.this.f26821g);
                        C9836c.this.f26821g = null;
                    }
                }
            }
        };

        /* renamed from: k */
        private Runnable f26825k = new Runnable() {
            /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void run() {
                /*
                    r3 = this;
                    com.bytedance.common.wschannel.server.b$c r0 = com.bytedance.common.wschannel.server.C9832b.C9836c.this
                    java.lang.Object r0 = r0.f26820f
                    monitor-enter(r0)
                    com.bytedance.common.wschannel.server.b$c r1 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ Throwable -> 0x0019 }
                    android.content.ServiceConnection r1 = r1.f26818d     // Catch:{ Throwable -> 0x0019 }
                    if (r1 == 0) goto L_0x0019
                    com.bytedance.common.wschannel.server.b$c r1 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ Throwable -> 0x0019 }
                    android.content.Context r1 = r1.f26815a     // Catch:{ Throwable -> 0x0019 }
                    com.bytedance.common.wschannel.server.b$c r2 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ Throwable -> 0x0019 }
                    android.content.ServiceConnection r2 = r2.f26818d     // Catch:{ Throwable -> 0x0019 }
                    r1.unbindService(r2)     // Catch:{ Throwable -> 0x0019 }
                    goto L_0x0019
                L_0x0017:
                    r1 = move-exception
                    goto L_0x0024
                L_0x0019:
                    com.bytedance.common.wschannel.server.b$c r1 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ all -> 0x0017 }
                    r2 = 0
                    r1.f26818d = r2     // Catch:{ all -> 0x0017 }
                    com.bytedance.common.wschannel.server.b$c r1 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ all -> 0x0017 }
                    r1.f26816b = r2     // Catch:{ all -> 0x0017 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                    return
                L_0x0024:
                    monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C9832b.C9836c.C98382.run():void");
            }
        };

        /* renamed from: com.bytedance.common.wschannel.server.b$c$a */
        class C9839a implements ServiceConnection {
            private C9839a() {
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0017 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onServiceDisconnected(android.content.ComponentName r3) {
                /*
                    r2 = this;
                    com.bytedance.common.wschannel.server.b$c r0 = com.bytedance.common.wschannel.server.C9832b.C9836c.this
                    java.lang.Object r0 = r0.f26820f
                    monitor-enter(r0)
                    if (r3 != 0) goto L_0x000b
                    monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                    return
                L_0x0009:
                    r3 = move-exception
                    goto L_0x0028
                L_0x000b:
                    com.bytedance.common.wschannel.server.b$c r3 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ Throwable -> 0x0017 }
                    r1 = 0
                    r3.f26816b = r1     // Catch:{ Throwable -> 0x0017 }
                    com.bytedance.common.wschannel.server.b$c r3 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ Throwable -> 0x0017 }
                    android.content.Context r3 = r3.f26815a     // Catch:{ Throwable -> 0x0017 }
                    r3.unbindService(r2)     // Catch:{ Throwable -> 0x0017 }
                L_0x0017:
                    com.bytedance.common.wschannel.server.b$c r3 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ all -> 0x0009 }
                    r1 = 0
                    r3.f26819e = r1     // Catch:{ all -> 0x0009 }
                    com.bytedance.common.wschannel.server.b$c r3 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ all -> 0x0009 }
                    r3.mo24395d()     // Catch:{ all -> 0x0009 }
                    com.bytedance.common.wschannel.server.b$c r3 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ all -> 0x0009 }
                    r3.mo24394c()     // Catch:{ all -> 0x0009 }
                    monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                    return
                L_0x0028:
                    monitor-exit(r0)     // Catch:{ all -> 0x0009 }
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C9832b.C9836c.C9839a.onServiceDisconnected(android.content.ComponentName):void");
            }

            /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
                return;
             */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001d */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onServiceConnected(android.content.ComponentName r3, android.os.IBinder r4) {
                /*
                    r2 = this;
                    com.bytedance.common.wschannel.server.b$c r0 = com.bytedance.common.wschannel.server.C9832b.C9836c.this
                    java.lang.Object r0 = r0.f26820f
                    monitor-enter(r0)
                    com.bytedance.common.wschannel.server.b$c r1 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ all -> 0x002b }
                    r1.mo24394c()     // Catch:{ all -> 0x002b }
                    if (r3 == 0) goto L_0x0029
                    if (r4 != 0) goto L_0x000f
                    goto L_0x0029
                L_0x000f:
                    com.bytedance.common.wschannel.server.b$c r3 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ Throwable -> 0x001d }
                    android.os.Messenger r1 = new android.os.Messenger     // Catch:{ Throwable -> 0x001d }
                    r1.<init>(r4)     // Catch:{ Throwable -> 0x001d }
                    r3.f26816b = r1     // Catch:{ Throwable -> 0x001d }
                    com.bytedance.common.wschannel.server.b$c r3 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ Throwable -> 0x001d }
                    r3.mo24393b()     // Catch:{ Throwable -> 0x001d }
                L_0x001d:
                    com.bytedance.common.wschannel.server.b$c r3 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ all -> 0x002b }
                    r4 = 0
                    r3.f26819e = r4     // Catch:{ all -> 0x002b }
                    com.bytedance.common.wschannel.server.b$c r3 = com.bytedance.common.wschannel.server.C9832b.C9836c.this     // Catch:{ all -> 0x002b }
                    r4 = 0
                    r3.f26821g = r4     // Catch:{ all -> 0x002b }
                    monitor-exit(r0)     // Catch:{ all -> 0x002b }
                    return
                L_0x0029:
                    monitor-exit(r0)     // Catch:{ all -> 0x002b }
                    return
                L_0x002b:
                    r3 = move-exception
                    monitor-exit(r0)     // Catch:{ all -> 0x002b }
                    throw r3
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C9832b.C9836c.C9839a.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
            }
        }

        /* renamed from: c */
        public final void mo24394c() {
            C19846k.m65542a().f53814b.removeCallbacks(this.f26824j);
        }

        /* renamed from: d */
        public final void mo24395d() {
            try {
                C19846k.m65542a().f53814b.removeCallbacks(this.f26825k);
            } catch (Exception unused) {
            }
        }

        /* renamed from: e */
        private synchronized void m29040e() {
            mo24395d();
            C19846k.m65542a().f53814b.postDelayed(this.f26825k, TimeUnit.SECONDS.toMillis(10));
        }

        /* renamed from: a */
        public final void mo24391a() {
            if (this.f26817c.size() > 0 && this.f26816b == null) {
                synchronized (this.f26820f) {
                    if (this.f26817c.size() > 0 && this.f26816b == null) {
                        m29038c((Intent) this.f26817c.poll());
                    }
                }
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:3|(2:17|5)(4:6|7|19|16)|0|1) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r2.f26816b = null;
            r2.f26817c.offerFirst(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:0:0x0000 */
        /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:16:0x0000, LOOP_START, SYNTHETIC, Splitter:B:0:0x0000] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo24393b() {
            /*
                r2 = this;
            L_0x0000:
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r2.f26817c     // Catch:{ Throwable -> 0x0023 }
                java.lang.Object r0 = r0.peek()     // Catch:{ Throwable -> 0x0023 }
                if (r0 == 0) goto L_0x001f
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r0 = r2.f26817c     // Catch:{ Throwable -> 0x0023 }
                java.lang.Object r0 = r0.poll()     // Catch:{ Throwable -> 0x0023 }
                android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ Throwable -> 0x0023 }
                if (r0 != 0) goto L_0x0013
                return
            L_0x0013:
                r2.m29037b(r0)     // Catch:{ DeadObjectException -> 0x0017, Throwable -> 0x0000 }
                goto L_0x0000
            L_0x0017:
                r1 = 0
                r2.f26816b = r1     // Catch:{ Throwable -> 0x0023 }
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r1 = r2.f26817c     // Catch:{ Throwable -> 0x0023 }
                r1.offerFirst(r0)     // Catch:{ Throwable -> 0x0023 }
            L_0x001f:
                r2.m29040e()     // Catch:{ Throwable -> 0x0023 }
                return
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C9832b.C9836c.mo24393b():void");
        }

        /* renamed from: b */
        private void m29037b(Intent intent) throws RemoteException {
            if (intent != null) {
                Messenger messenger = this.f26816b;
                Message message = new Message();
                message.what = 10123;
                message.getData().putParcelable("DATA_INTENT", intent);
                if (messenger != null) {
                    messenger.send(message);
                }
            }
        }

        /* renamed from: d */
        private void m29039d(Intent intent) {
            mo24394c();
            this.f26821g = intent;
            C19846k.m65542a().f53814b.postDelayed(this.f26824j, TimeUnit.SECONDS.toMillis(7));
        }

        /* renamed from: c */
        private void m29038c(Intent intent) {
            if (intent != null) {
                try {
                    this.f26818d = new C9839a();
                    this.f26815a.bindService(intent, this.f26818d, 1);
                    m29039d(intent);
                    this.f26819e = true;
                } catch (Throwable unused) {
                    mo24394c();
                    this.f26817c.addFirst(intent);
                    this.f26821g = null;
                    this.f26819e = false;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo24392a(android.content.Intent r4) {
            /*
                r3 = this;
                if (r4 != 0) goto L_0x0003
                return
            L_0x0003:
                boolean r0 = com.bytedance.common.utility.C6312h.m19578b()
                if (r0 == 0) goto L_0x0015
                java.lang.String r0 = "msg_count"
                java.util.concurrent.atomic.AtomicInteger r1 = r3.f26822h
                r2 = 1
                int r1 = r1.addAndGet(r2)
                r4.putExtra(r0, r1)
            L_0x0015:
                java.lang.Object r0 = r3.f26820f
                monitor-enter(r0)
                r3.mo24395d()     // Catch:{ all -> 0x0038 }
                android.os.Messenger r1 = r3.f26816b     // Catch:{ all -> 0x0038 }
                if (r1 != 0) goto L_0x002e
                boolean r1 = r3.f26819e     // Catch:{ all -> 0x0038 }
                if (r1 == 0) goto L_0x002a
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r1 = r3.f26817c     // Catch:{ all -> 0x0038 }
                r1.offer(r4)     // Catch:{ all -> 0x0038 }
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                return
            L_0x002a:
                r3.m29038c(r4)     // Catch:{ all -> 0x0038 }
                goto L_0x0036
            L_0x002e:
                java.util.concurrent.LinkedBlockingDeque<android.content.Intent> r1 = r3.f26817c     // Catch:{ all -> 0x0038 }
                r1.offer(r4)     // Catch:{ all -> 0x0038 }
                r3.mo24393b()     // Catch:{ all -> 0x0038 }
            L_0x0036:
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                return
            L_0x0038:
                r4 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0038 }
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.wschannel.server.C9832b.C9836c.mo24392a(android.content.Intent):void");
        }

        C9836c(Context context) {
            this.f26815a = context;
        }
    }

    /* renamed from: a */
    public final void mo24389a() {
        this.f26812a.mo24391a();
    }

    /* renamed from: a */
    public final void mo24390a(Intent intent) {
        this.f26812a.mo24392a(intent);
    }

    C9832b(Context context) {
        if (VERSION.SDK_INT < 26 || context.getApplicationInfo().targetSdkVersion < 26) {
            this.f26812a = new C9834a(context);
        } else {
            this.f26812a = new C9836c(context);
        }
    }
}
