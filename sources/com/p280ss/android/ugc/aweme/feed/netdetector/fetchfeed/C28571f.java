package com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed;

import android.os.Handler;
import android.os.Message;
import com.p280ss.android.ugc.aweme.feed.netdetector.C28548b;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f */
public final class C28571f {

    /* renamed from: a */
    public static C28573a f75232a;

    /* renamed from: b */
    private static AtomicBoolean f75233b = new AtomicBoolean(false);

    /* renamed from: c */
    private static AtomicBoolean f75234c = new AtomicBoolean(true);

    /* renamed from: d */
    private static AtomicBoolean f75235d = new AtomicBoolean(false);

    /* renamed from: e */
    private static AtomicBoolean f75236e = new AtomicBoolean(true);

    /* renamed from: f */
    private static AtomicBoolean f75237f = new AtomicBoolean(false);

    /* renamed from: g */
    private static Object f75238g = new Object();

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$a */
    static class C28573a extends Handler {

        /* renamed from: a */
        public Handler f75239a;

        private C28573a(Handler handler) {
            this.f75239a = handler;
        }

        public final void handleMessage(Message message) {
            super.handleMessage(message);
            C28571f.f75232a = null;
            this.f75239a.handleMessage(message);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$b */
    static class C28574b extends RuntimeException {
        C28574b(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static Boolean m93807a() {
        if (!C28548b.m93758a()) {
            return Boolean.valueOf(true);
        }
        return Boolean.valueOf(f75233b.get());
    }

    /* renamed from: b */
    public static Boolean m93810b() {
        if (!C28548b.m93758a()) {
            return Boolean.valueOf(false);
        }
        if (f75235d.get()) {
            return Boolean.valueOf(f75234c.get());
        }
        if (f75237f.get()) {
            return Boolean.valueOf(f75236e.get());
        }
        return Boolean.valueOf(false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|(2:14|15)|16|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0036 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m93812c() {
        /*
            boolean r0 = com.p280ss.android.ugc.aweme.feed.netdetector.C28548b.m93760b()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$a r0 = f75232a
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$a r0 = f75232a
            android.os.Handler r0 = r0.f75239a
            if (r0 != 0) goto L_0x0012
            goto L_0x003b
        L_0x0012:
            java.lang.Object r0 = f75238g
            monitor-enter(r0)
            android.os.Message r1 = android.os.Message.obtain()     // Catch:{ all -> 0x0038 }
            r2 = 0
            r1.what = r2     // Catch:{ all -> 0x0038 }
            com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$b r2 = new com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$b     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = "Detector can't find net"
            r2.<init>(r3)     // Catch:{ all -> 0x0038 }
            r1.obj = r2     // Catch:{ all -> 0x0038 }
            com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$a r2 = f75232a     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$a r2 = f75232a     // Catch:{ all -> 0x0038 }
            android.os.Handler r2 = r2.f75239a     // Catch:{ all -> 0x0038 }
            if (r2 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.feed.netdetector.fetchfeed.f$a r2 = f75232a     // Catch:{ Exception -> 0x0036 }
            android.os.Handler r2 = r2.f75239a     // Catch:{ Exception -> 0x0036 }
            r2.sendMessage(r1)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            return
        L_0x0038:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r1
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.netdetector.fetchfeed.C28571f.m93812c():void");
    }

    /* renamed from: a */
    public static void m93809a(Boolean bool) {
        f75233b.set(bool.booleanValue());
    }

    /* renamed from: d */
    public static void m93814d(Boolean bool) {
        f75235d.set(bool.booleanValue());
    }

    /* renamed from: e */
    public static void m93815e(Boolean bool) {
        f75237f.set(bool.booleanValue());
    }

    /* renamed from: b */
    public static void m93811b(Boolean bool) {
        if (C28548b.m93758a()) {
            f75234c.set(bool.booleanValue());
        }
    }

    /* renamed from: c */
    public static void m93813c(Boolean bool) {
        if (C28548b.m93758a()) {
            f75236e.set(bool.booleanValue());
        }
    }

    /* renamed from: a */
    public static void m93808a(Handler handler) {
        if (C28548b.m93760b()) {
            synchronized (f75238g) {
                f75232a = new C28573a(handler);
            }
        }
    }
}
