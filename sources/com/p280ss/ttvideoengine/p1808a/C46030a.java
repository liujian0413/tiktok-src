package com.p280ss.ttvideoengine.p1808a;

import android.text.TextUtils;
import com.C1642a;
import com.onething.xyvod.XYVodSDK;
import com.p280ss.ttvideoengine.C46113i;
import com.p280ss.ttvideoengine.p1816i.C46123h;

/* renamed from: com.ss.ttvideoengine.a.a */
public final class C46030a {

    /* renamed from: a */
    private static String f117587a = "VideoLoadWrapper";

    /* renamed from: b */
    private volatile boolean f117588b;

    /* renamed from: c */
    private volatile boolean f117589c;

    /* renamed from: d */
    private volatile C46113i f117590d;

    /* renamed from: com.ss.ttvideoengine.a.a$a */
    static class C46032a {

        /* renamed from: a */
        public static final C46030a f117591a = new C46030a();
    }

    private C46030a() {
    }

    /* renamed from: a */
    public static C46030a m144223a() {
        return C46032a.f117591a;
    }

    /* renamed from: c */
    public final synchronized String mo112118c() {
        if (!this.f117588b) {
            C46123h.m144545a(f117587a, C1642a.m8034a("library not loaded,info is empty", new Object[0]));
            return "";
        }
        return XYVodSDK.m61048a();
    }

    /* renamed from: d */
    private synchronized boolean m144224d() {
        if (this.f117590d == null) {
            return true;
        }
        if (this.f117590d != null && !this.f117589c) {
            this.f117589c = this.f117590d.mo112285a("xyvodsdk");
        }
        return this.f117589c;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:29|30|31|32|33) */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(f117587a, com.C1642a.m8034a("init suc", new java.lang.Object[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        return -2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo112115b() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.m144224d()     // Catch:{ all -> 0x006a }
            r1 = 0
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = f117587a     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "library load fail, not allow init"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x006a }
            java.lang.String r1 = com.C1642a.m8034a(r2, r1)     // Catch:{ all -> 0x006a }
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r0, r1)     // Catch:{ all -> 0x006a }
            r0 = -3
            monitor-exit(r4)
            return r0
        L_0x0018:
            boolean r0 = r4.f117588b     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = f117587a     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "has been init"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x006a }
            java.lang.String r2 = com.C1642a.m8034a(r2, r3)     // Catch:{ all -> 0x006a }
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r0, r2)     // Catch:{ all -> 0x006a }
            monitor-exit(r4)
            return r1
        L_0x002b:
            com.ss.ttvideoengine.i r0 = r4.f117590d     // Catch:{ Throwable -> 0x005a }
            r2 = 1
            if (r0 == 0) goto L_0x0032
            r0 = 1
            goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            int r0 = com.onething.xyvod.XYVodSDK.m61047a(r0)     // Catch:{ Throwable -> 0x005a }
            if (r0 != 0) goto L_0x004a
            r4.f117588b = r2     // Catch:{ Throwable -> 0x005a }
            java.lang.String r0 = f117587a     // Catch:{ Throwable -> 0x005a }
            java.lang.String r2 = "init suc"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x005a }
            java.lang.String r2 = com.C1642a.m8034a(r2, r3)     // Catch:{ Throwable -> 0x005a }
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r0, r2)     // Catch:{ Throwable -> 0x005a }
            monitor-exit(r4)
            return r1
        L_0x004a:
            java.lang.String r0 = f117587a     // Catch:{ Throwable -> 0x005a }
            java.lang.String r2 = "init fail"
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x005a }
            java.lang.String r2 = com.C1642a.m8034a(r2, r3)     // Catch:{ Throwable -> 0x005a }
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r0, r2)     // Catch:{ Throwable -> 0x005a }
            r0 = -1
            monitor-exit(r4)
            return r0
        L_0x005a:
            java.lang.String r0 = f117587a     // Catch:{ all -> 0x006a }
            java.lang.String r2 = "init suc"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x006a }
            java.lang.String r1 = com.C1642a.m8034a(r2, r1)     // Catch:{ all -> 0x006a }
            com.p280ss.ttvideoengine.p1816i.C46123h.m144545a(r0, r1)     // Catch:{ all -> 0x006a }
            r0 = -2
            monitor-exit(r4)
            return r0
        L_0x006a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttvideoengine.p1808a.C46030a.mo112115b():int");
    }

    /* renamed from: b */
    public final synchronized void mo112116b(String str) {
        if (!this.f117588b) {
            C46123h.m144545a(f117587a, C1642a.m8034a("library not loaded,not permit forbid p2p", new Object[0]));
        } else {
            XYVodSDK.m61046a(str, 4, 1);
        }
    }

    /* renamed from: a */
    public final synchronized String mo112111a(String str) {
        if (this.f117588b) {
            if (!TextUtils.isEmpty(str)) {
                return XYVodSDK.m61049a(str);
            }
        }
        C46123h.m144545a(f117587a, C1642a.m8034a("library not loaded,info is empty", new Object[0]));
        return "";
    }

    /* renamed from: b */
    public final synchronized void mo112117b(String str, int i) {
        if (!this.f117588b) {
            C46123h.m144545a(f117587a, C1642a.m8034a("library not loaded,not permit video stall", new Object[0]));
        } else {
            XYVodSDK.m61053b(str, i);
        }
    }

    /* renamed from: a */
    public final synchronized String mo112112a(String str, int i) {
        if (!this.f117588b && mo112115b() != 0) {
            return null;
        }
        if (this.f117588b) {
            if (!TextUtils.isEmpty(str)) {
                return XYVodSDK.m61050a(str, 1);
            }
        }
        C46123h.m144545a(f117587a, C1642a.m8034a("get rewrite url fail, library not load or url is null", new Object[0]));
        return null;
    }

    /* renamed from: a */
    public final synchronized void mo112114a(String str, long j) {
        if (!this.f117588b) {
            C46123h.m144545a(f117587a, C1642a.m8034a("library not loaded,not permit set play pos", new Object[0]));
        } else {
            XYVodSDK.m61051a(str, j);
        }
    }

    /* renamed from: a */
    public final synchronized void mo112113a(String str, int i, long j) {
        if (!this.f117588b) {
            C46123h.m144545a(f117587a, C1642a.m8034a("library not loaded,not permit set play info", new Object[0]));
        } else {
            XYVodSDK.m61046a(str, i, j);
        }
    }
}
