package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.os.Handler;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.common.utility.collection.C6309f.C6310a;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.f */
public final class C21866f implements C6310a {

    /* renamed from: a */
    private final long f58564a;

    /* renamed from: b */
    private final long f58565b;

    /* renamed from: c */
    private long f58566c;

    /* renamed from: d */
    private long f58567d;

    /* renamed from: e */
    private boolean f58568e;

    /* renamed from: f */
    private boolean f58569f;

    /* renamed from: g */
    private boolean f58570g;

    /* renamed from: h */
    private Handler f58571h = new C6309f(this);

    /* renamed from: i */
    private C21867a f58572i;

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.f$a */
    public interface C21867a {
        /* renamed from: a */
        void mo57827a();

        /* renamed from: a */
        void mo58177a(long j);

        /* renamed from: b */
        void mo57828b();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.ui.f$b */
    public static class C21868b implements C21867a {
        /* renamed from: a */
        public void mo57827a() {
        }

        /* renamed from: a */
        public void mo58177a(long j) {
        }

        /* renamed from: b */
        public void mo57828b() {
        }
    }

    /* renamed from: c */
    public final synchronized long mo58293c() {
        return this.f58566c;
    }

    /* renamed from: d */
    public final synchronized boolean mo58294d() {
        return this.f58569f;
    }

    /* renamed from: e */
    public final synchronized boolean mo58295e() {
        return this.f58570g;
    }

    /* renamed from: a */
    public final synchronized void mo58290a() {
        this.f58568e = true;
        this.f58570g = false;
        this.f58571h.removeMessages(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        return r7;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f mo58292b() {
        /*
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r7.f58568e = r0     // Catch:{ all -> 0x0044 }
            r7.f58569f = r0     // Catch:{ all -> 0x0044 }
            r1 = 1
            r7.f58570g = r1     // Catch:{ all -> 0x0044 }
            long r2 = r7.f58564a     // Catch:{ all -> 0x0044 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0020
            r7.f58569f = r1     // Catch:{ all -> 0x0044 }
            r7.f58570g = r0     // Catch:{ all -> 0x0044 }
            com.ss.android.ugc.aweme.account.login.ui.f$a r0 = r7.f58572i     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x001e
            com.ss.android.ugc.aweme.account.login.ui.f$a r0 = r7.f58572i     // Catch:{ all -> 0x0044 }
            r0.mo57828b()     // Catch:{ all -> 0x0044 }
        L_0x001e:
            monitor-exit(r7)
            return r7
        L_0x0020:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0044 }
            long r4 = r7.f58564a     // Catch:{ all -> 0x0044 }
            r0 = 0
            long r2 = r2 + r4
            r7.f58567d = r2     // Catch:{ all -> 0x0044 }
            long r2 = r7.f58564a     // Catch:{ all -> 0x0044 }
            r7.f58566c = r2     // Catch:{ all -> 0x0044 }
            com.ss.android.ugc.aweme.account.login.ui.f$a r0 = r7.f58572i     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.account.login.ui.f$a r0 = r7.f58572i     // Catch:{ all -> 0x0044 }
            r0.mo57827a()     // Catch:{ all -> 0x0044 }
        L_0x0037:
            android.os.Handler r0 = r7.f58571h     // Catch:{ all -> 0x0044 }
            android.os.Handler r2 = r7.f58571h     // Catch:{ all -> 0x0044 }
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ all -> 0x0044 }
            r0.sendMessage(r1)     // Catch:{ all -> 0x0044 }
            monitor-exit(r7)
            return r7
        L_0x0044:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f.mo58292b():com.ss.android.ugc.aweme.account.login.ui.f");
    }

    /* renamed from: a */
    public final void mo58291a(C21867a aVar) {
        this.f58572i = aVar;
        if (this.f58569f && this.f58572i != null) {
            this.f58572i.mo57828b();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0069, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleMsg(android.os.Message r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            boolean r10 = r9.f58568e     // Catch:{ all -> 0x006a }
            if (r10 == 0) goto L_0x0007
            monitor-exit(r9)     // Catch:{ all -> 0x006a }
            return
        L_0x0007:
            long r0 = r9.f58567d     // Catch:{ all -> 0x006a }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006a }
            r10 = 0
            long r0 = r0 - r2
            r9.f58566c = r0     // Catch:{ all -> 0x006a }
            long r0 = r9.f58566c     // Catch:{ all -> 0x006a }
            r10 = 1
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0029
            r9.f58569f = r10     // Catch:{ all -> 0x006a }
            r10 = 0
            r9.f58570g = r10     // Catch:{ all -> 0x006a }
            com.ss.android.ugc.aweme.account.login.ui.f$a r10 = r9.f58572i     // Catch:{ all -> 0x006a }
            if (r10 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.account.login.ui.f$a r10 = r9.f58572i     // Catch:{ all -> 0x006a }
            r10.mo57828b()     // Catch:{ all -> 0x006a }
            goto L_0x0068
        L_0x0029:
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006a }
            com.ss.android.ugc.aweme.account.login.ui.f$a r4 = r9.f58572i     // Catch:{ all -> 0x006a }
            if (r4 == 0) goto L_0x0038
            com.ss.android.ugc.aweme.account.login.ui.f$a r4 = r9.f58572i     // Catch:{ all -> 0x006a }
            long r5 = r9.f58566c     // Catch:{ all -> 0x006a }
            r4.mo58177a(r5)     // Catch:{ all -> 0x006a }
        L_0x0038:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006a }
            r6 = 0
            long r4 = r4 - r0
            long r0 = r9.f58566c     // Catch:{ all -> 0x006a }
            long r6 = r9.f58565b     // Catch:{ all -> 0x006a }
            int r8 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0050
            long r0 = r9.f58566c     // Catch:{ all -> 0x006a }
            r6 = 0
            long r0 = r0 - r4
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x005d
            r0 = r2
            goto L_0x005d
        L_0x0050:
            long r0 = r9.f58565b     // Catch:{ all -> 0x006a }
            r6 = 0
            long r0 = r0 - r4
        L_0x0054:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x005d
            long r4 = r9.f58565b     // Catch:{ all -> 0x006a }
            r6 = 0
            long r0 = r0 + r4
            goto L_0x0054
        L_0x005d:
            android.os.Handler r2 = r9.f58571h     // Catch:{ all -> 0x006a }
            android.os.Handler r3 = r9.f58571h     // Catch:{ all -> 0x006a }
            android.os.Message r10 = r3.obtainMessage(r10)     // Catch:{ all -> 0x006a }
            r2.sendMessageDelayed(r10, r0)     // Catch:{ all -> 0x006a }
        L_0x0068:
            monitor-exit(r9)     // Catch:{ all -> 0x006a }
            return
        L_0x006a:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x006a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f.handleMsg(android.os.Message):void");
    }

    public C21866f(long j, long j2, C21867a aVar) {
        this.f58564a = j;
        this.f58565b = j2;
        this.f58572i = aVar;
    }
}
