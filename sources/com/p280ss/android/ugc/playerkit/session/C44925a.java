package com.p280ss.android.ugc.playerkit.session;

import android.text.TextUtils;
import android.util.LruCache;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.playerkit.session.a */
public final class C44925a {

    /* renamed from: a */
    private static final C44925a f115566a = new C44925a();

    /* renamed from: b */
    private volatile Session f115567b;

    /* renamed from: c */
    private final Queue<Session> f115568c = new LinkedList();

    /* renamed from: d */
    private LruCache<String, String> f115569d = new LruCache<>(100);

    /* renamed from: a */
    public static C44925a m141730a() {
        return f115566a;
    }

    /* renamed from: b */
    public final synchronized Session mo107407b() {
        if (this.f115567b != null) {
            return this.f115567b;
        }
        return Session.DEFAULT;
    }

    private C44925a() {
    }

    /* renamed from: a */
    private Session m141729a(Session session) {
        if (this.f115568c.size() + 1 > 5) {
            this.f115568c.poll();
        }
        this.f115568c.offer(session);
        return session;
    }

    /* renamed from: d */
    public final synchronized Session mo107410d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Session instance = Session.instance();
        instance.key = str;
        instance.uri = str;
        return m141729a(instance);
    }

    /* renamed from: e */
    public final String mo107411e(String str) {
        if (!TextUtils.isEmpty(str)) {
            return (String) this.f115569d.get(str);
        }
        return "";
    }

    /* renamed from: a */
    public final synchronized Session mo107404a(String str) {
        this.f115567b = mo107408b(str);
        if (this.f115567b == null) {
            this.f115567b = mo107410d(str);
        }
        return this.f115567b;
    }

    /* renamed from: b */
    public final synchronized Session mo107408b(String str) {
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) this.f115568c.toArray(new Session[0]);
            for (int length = sessionArr.length - 1; length >= 0; length--) {
                if (str.equals(sessionArr[length].key)) {
                    return sessionArr[length];
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public final synchronized Session mo107409c(String str) {
        if (!TextUtils.isEmpty(str)) {
            Session[] sessionArr = (Session[]) this.f115568c.toArray(new Session[0]);
            for (int length = sessionArr.length - 1; length >= 0; length--) {
                if (str.equals(sessionArr[length].sourceId)) {
                    return sessionArr[length];
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        return r5;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.p280ss.android.ugc.playerkit.session.Session> mo107405a(int r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0056 }
            r0 = 3
            r5.<init>(r0)     // Catch:{ all -> 0x0056 }
            boolean r1 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0056 }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r4)
            return r5
        L_0x000f:
            java.util.Queue<com.ss.android.ugc.playerkit.session.Session> r1 = r4.f115568c     // Catch:{ all -> 0x0056 }
            r2 = 0
            com.ss.android.ugc.playerkit.session.Session[] r2 = new com.p280ss.android.ugc.playerkit.session.Session[r2]     // Catch:{ all -> 0x0056 }
            java.lang.Object[] r1 = r1.toArray(r2)     // Catch:{ all -> 0x0056 }
            com.ss.android.ugc.playerkit.session.Session[] r1 = (com.p280ss.android.ugc.playerkit.session.Session[]) r1     // Catch:{ all -> 0x0056 }
            int r2 = r1.length     // Catch:{ all -> 0x0056 }
            int r2 = r2 + -1
        L_0x001d:
            if (r2 < 0) goto L_0x002d
            r3 = r1[r2]     // Catch:{ all -> 0x0056 }
            java.lang.String r3 = r3.key     // Catch:{ all -> 0x0056 }
            boolean r3 = r6.equals(r3)     // Catch:{ all -> 0x0056 }
            if (r3 == 0) goto L_0x002a
            goto L_0x002e
        L_0x002a:
            int r2 = r2 + -1
            goto L_0x001d
        L_0x002d:
            r2 = -1
        L_0x002e:
            if (r2 <= 0) goto L_0x0041
            r6 = 2
        L_0x0031:
            if (r6 < 0) goto L_0x0054
            int r0 = r2 - r6
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x003e
            r0 = r1[r0]     // Catch:{ all -> 0x0056 }
            r5.add(r0)     // Catch:{ all -> 0x0056 }
        L_0x003e:
            int r6 = r6 + -1
            goto L_0x0031
        L_0x0041:
            int r6 = r1.length     // Catch:{ all -> 0x0056 }
            int r6 = r6 + -1
        L_0x0044:
            if (r6 < 0) goto L_0x0054
            int r2 = r5.size()     // Catch:{ all -> 0x0056 }
            if (r2 >= r0) goto L_0x0054
            r2 = r1[r6]     // Catch:{ all -> 0x0056 }
            r5.add(r2)     // Catch:{ all -> 0x0056 }
            int r6 = r6 + -1
            goto L_0x0044
        L_0x0054:
            monitor-exit(r4)
            return r5
        L_0x0056:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.playerkit.session.C44925a.mo107405a(int, java.lang.String):java.util.List");
    }

    /* renamed from: a */
    public final void mo107406a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.f115569d.put(str, str2);
        }
    }
}
