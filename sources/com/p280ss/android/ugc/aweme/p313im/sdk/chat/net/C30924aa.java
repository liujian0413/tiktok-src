package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net;

import java.util.Map;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.aa */
public final class C30924aa extends Thread {

    /* renamed from: a */
    private final Queue<C30925ab> f80998a;

    /* renamed from: b */
    private final Map<String, C30925ab> f80999b;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:5|6|7|8|9|19) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0011 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r3 = this;
        L_0x0000:
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.net.ab> r0 = r3.f80998a
            monitor-enter(r0)
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.net.ab> r1 = r3.f80998a     // Catch:{ all -> 0x002d }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0013
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.net.ab> r1 = r3.f80998a     // Catch:{ InterruptedException -> 0x0011 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0011 }
            goto L_0x0013
        L_0x0011:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            goto L_0x0000
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.net.ab> r0 = r3.f80998a
            java.lang.Object r0 = r0.poll()
            com.ss.android.ugc.aweme.im.sdk.chat.net.ab r0 = (com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30925ab) r0
            if (r0 == 0) goto L_0x0000
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.sdk.chat.net.ab> r1 = r3.f80999b
            java.lang.String r2 = r0.f81000f
            r1.put(r2, r0)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.sdk.chat.net.ab> r1 = r3.f80999b
            r0.f81001g = r1
            r0.run()
            goto L_0x0000
        L_0x002d:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.C30924aa.run():void");
    }

    public C30924aa(String str, Queue<C30925ab> queue, Map<String, C30925ab> map) {
        super(str);
        setDaemon(true);
        this.f80998a = queue;
        this.f80999b = map;
    }
}
