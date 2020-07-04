package com.p280ss.android.ugc.aweme.util;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.ss.android.ugc.aweme.util.g */
public final class C42878g implements C6310a {

    /* renamed from: a */
    public long f111376a;

    /* renamed from: b */
    private final long f111377b = 7000;

    /* renamed from: c */
    private final long f111378c = 7000;

    /* renamed from: d */
    private long f111379d;

    /* renamed from: e */
    private boolean f111380e;

    /* renamed from: f */
    private boolean f111381f;

    /* renamed from: g */
    private boolean f111382g;

    /* renamed from: h */
    private boolean f111383h;

    /* renamed from: i */
    private Handler f111384i = new C6309f(this);

    /* renamed from: j */
    private C42879a f111385j;

    /* renamed from: com.ss.android.ugc.aweme.util.g$a */
    public interface C42879a {
        /* renamed from: a */
        void mo89893a();
    }

    /* renamed from: e */
    public final synchronized boolean mo104587e() {
        return this.f111380e;
    }

    /* renamed from: f */
    public final synchronized boolean mo104588f() {
        return this.f111381f;
    }

    /* renamed from: g */
    public final synchronized boolean mo104589g() {
        return this.f111383h;
    }

    /* renamed from: a */
    public final synchronized void mo104583a() {
        this.f111380e = true;
        this.f111382g = false;
        this.f111383h = false;
        this.f111384i.removeMessages(1);
    }

    /* renamed from: c */
    public final synchronized void mo104585c() {
        if (this.f111382g) {
            this.f111383h = true;
            this.f111384i.removeMessages(1);
            this.f111376a = this.f111379d - SystemClock.elapsedRealtime();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        return r7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p280ss.android.ugc.aweme.util.C42878g mo104584b() {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r7.f111383h = r0     // Catch:{ all -> 0x0039 }
            r7.f111380e = r0     // Catch:{ all -> 0x0039 }
            r7.f111381f = r0     // Catch:{ all -> 0x0039 }
            r1 = 1
            r7.f111382g = r1     // Catch:{ all -> 0x0039 }
            long r2 = r7.f111377b     // Catch:{ all -> 0x0039 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0022
            r7.f111381f = r1     // Catch:{ all -> 0x0039 }
            r7.f111382g = r0     // Catch:{ all -> 0x0039 }
            com.ss.android.ugc.aweme.util.g$a r0 = r7.f111385j     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0020
            com.ss.android.ugc.aweme.util.g$a r0 = r7.f111385j     // Catch:{ all -> 0x0039 }
            r0.mo89893a()     // Catch:{ all -> 0x0039 }
        L_0x0020:
            monitor-exit(r7)
            return r7
        L_0x0022:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0039 }
            long r4 = r7.f111377b     // Catch:{ all -> 0x0039 }
            r0 = 0
            long r2 = r2 + r4
            r7.f111379d = r2     // Catch:{ all -> 0x0039 }
            android.os.Handler r0 = r7.f111384i     // Catch:{ all -> 0x0039 }
            android.os.Handler r2 = r7.f111384i     // Catch:{ all -> 0x0039 }
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ all -> 0x0039 }
            r0.sendMessage(r1)     // Catch:{ all -> 0x0039 }
            monitor-exit(r7)
            return r7
        L_0x0039:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.util.C42878g.mo104584b():com.ss.android.ugc.aweme.util.g");
    }

    /* renamed from: d */
    public final synchronized void mo104586d() {
        if (this.f111383h) {
            this.f111383h = false;
            this.f111379d = SystemClock.elapsedRealtime() + this.f111376a;
            this.f111384i.sendMessageDelayed(this.f111384i.obtainMessage(1), this.f111378c - ((this.f111377b - this.f111376a) % this.f111378c));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r10 = r9.f111380e     // Catch:{ all -> 0x005b }
            if (r10 != 0) goto L_0x0059
            boolean r10 = r9.f111383h     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x000a
            goto L_0x0059
        L_0x000a:
            long r0 = r9.f111379d     // Catch:{ all -> 0x005b }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005b }
            r10 = 0
            long r0 = r0 - r2
            r10 = 1
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0028
            r9.f111381f = r10     // Catch:{ all -> 0x005b }
            r10 = 0
            r9.f111382g = r10     // Catch:{ all -> 0x005b }
            com.ss.android.ugc.aweme.util.g$a r10 = r9.f111385j     // Catch:{ all -> 0x005b }
            if (r10 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.util.g$a r10 = r9.f111385j     // Catch:{ all -> 0x005b }
            r10.mo89893a()     // Catch:{ all -> 0x005b }
            goto L_0x0057
        L_0x0028:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005b }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005b }
            r8 = 0
            long r6 = r6 - r4
            long r4 = r9.f111378c     // Catch:{ all -> 0x005b }
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 >= 0) goto L_0x003f
            long r0 = r0 - r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x004c
            r0 = r2
            goto L_0x004c
        L_0x003f:
            long r0 = r9.f111378c     // Catch:{ all -> 0x005b }
            r4 = 0
            long r0 = r0 - r6
        L_0x0043:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x004c
            long r4 = r9.f111378c     // Catch:{ all -> 0x005b }
            r6 = 0
            long r0 = r0 + r4
            goto L_0x0043
        L_0x004c:
            android.os.Handler r2 = r9.f111384i     // Catch:{ all -> 0x005b }
            android.os.Handler r3 = r9.f111384i     // Catch:{ all -> 0x005b }
            android.os.Message r10 = r3.obtainMessage(r10)     // Catch:{ all -> 0x005b }
            r2.sendMessageDelayed(r10, r0)     // Catch:{ all -> 0x005b }
        L_0x0057:
            monitor-exit(r9)     // Catch:{ all -> 0x005b }
            return
        L_0x0059:
            monitor-exit(r9)     // Catch:{ all -> 0x005b }
            return
        L_0x005b:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x005b }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.util.C42878g.handleMsg(android.os.Message):void");
    }

    public C42878g(long j, long j2, C42879a aVar) {
        this.f111385j = aVar;
    }
}
