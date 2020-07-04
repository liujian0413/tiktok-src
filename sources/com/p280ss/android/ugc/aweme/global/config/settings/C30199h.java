package com.p280ss.android.ugc.aweme.global.config.settings;

import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.h */
public final class C30199h {

    /* renamed from: a */
    private static final C30199h f79463a = new C30199h();

    /* renamed from: b */
    private static final Object f79464b = new Object();

    /* renamed from: c */
    private static C30200a f79465c;

    /* renamed from: d */
    private static IESSettingsProxy f79466d;

    /* renamed from: e */
    private static Method f79467e;

    /* renamed from: f */
    private C30200a f79468f;

    /* renamed from: g */
    private boolean f79469g;

    /* renamed from: com.ss.android.ugc.aweme.global.config.settings.h$a */
    public interface C30200a {
        IESSettingsProxy get();
    }

    private C30199h() {
    }

    /* renamed from: a */
    public static IESSettingsProxy m98861a() {
        return C30201i.m98866a();
    }

    /* renamed from: c */
    private static C30199h m98865c() {
        return f79463a;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0052 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy m98864b() {
        /*
            com.ss.android.ugc.aweme.global.config.settings.h r0 = m98865c()
            com.ss.android.ugc.aweme.global.config.settings.h$a r0 = r0.f79468f
            if (r0 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.global.config.settings.h r0 = m98865c()
            com.ss.android.ugc.aweme.global.config.settings.h$a r0 = r0.f79468f
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r0.get()
            if (r0 == 0) goto L_0x001f
            com.ss.android.ugc.aweme.global.config.settings.h r0 = m98865c()
            com.ss.android.ugc.aweme.global.config.settings.h$a r0 = r0.f79468f
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r0 = r0.get()
            return r0
        L_0x001f:
            java.lang.Object r0 = f79464b
            monitor-enter(r0)
        L_0x0022:
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m98865c()     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.h$a r1 = r1.f79468f     // Catch:{ all -> 0x0120 }
            if (r1 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m98865c()     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.h$a r1 = r1.f79468f     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = r1.get()     // Catch:{ all -> 0x0120 }
            if (r1 != 0) goto L_0x0037
            goto L_0x0043
        L_0x0037:
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m98865c()     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.h$a r1 = r1.f79468f     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = r1.get()     // Catch:{ all -> 0x0120 }
            monitor-exit(r0)     // Catch:{ all -> 0x0120 }
            return r1
        L_0x0043:
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m98865c()     // Catch:{ all -> 0x0120 }
            boolean r1 = r1.f79469g     // Catch:{ all -> 0x0120 }
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = f79464b     // Catch:{ InterruptedException -> 0x0052 }
            r2 = 2000(0x7d0, double:9.88E-321)
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0052 }
        L_0x0052:
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m98865c()     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.h$a r1 = r1.f79468f     // Catch:{ all -> 0x0120 }
            if (r1 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.global.config.settings.h r1 = m98865c()     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.h$a r1 = r1.f79468f     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = r1.get()     // Catch:{ all -> 0x0120 }
            if (r1 == 0) goto L_0x0067
            goto L_0x0022
        L_0x0067:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = "must call init() before get()!"
            r1.<init>(r2)     // Catch:{ all -> 0x0120 }
            throw r1     // Catch:{ all -> 0x0120 }
        L_0x006f:
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0120 }
            r3 = 0
            java.lang.Object r4 = f79464b     // Catch:{ InterruptedException -> 0x0091 }
            r4.wait()     // Catch:{ InterruptedException -> 0x0091 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0091 }
            java.lang.String r5 = "Wait "
            r4.<init>(r5)     // Catch:{ InterruptedException -> 0x0091 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ InterruptedException -> 0x0091 }
            r7 = 0
            long r5 = r5 - r1
            r4.append(r5)     // Catch:{ InterruptedException -> 0x0091 }
            java.lang.String r4 = r4.toString()     // Catch:{ InterruptedException -> 0x0091 }
            m98863a(r3, r4)     // Catch:{ InterruptedException -> 0x0091 }
            goto L_0x0022
        L_0x0091:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            java.lang.String r6 = "InterruptedException "
            r5.<init>(r6)     // Catch:{ all -> 0x0120 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0120 }
            r8 = 0
            long r6 = r6 - r1
            r5.append(r6)     // Catch:{ all -> 0x0120 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0120 }
            m98863a(r4, r5)     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.h$a r4 = f79465c     // Catch:{ Throwable -> 0x00e6 }
            if (r4 != 0) goto L_0x00ca
            java.lang.String r4 = "com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Throwable -> 0x00e6 }
            java.lang.String r5 = "inst"
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch:{ Throwable -> 0x00e6 }
            java.lang.reflect.Method r4 = r4.getMethod(r5, r7)     // Catch:{ Throwable -> 0x00e6 }
            r5 = 1
            r4.setAccessible(r5)     // Catch:{ Throwable -> 0x00e6 }
            java.lang.Object[] r5 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x00e6 }
            java.lang.Object r4 = r4.invoke(r3, r5)     // Catch:{ Throwable -> 0x00e6 }
            com.ss.android.ugc.aweme.global.config.settings.h$a r4 = (com.p280ss.android.ugc.aweme.global.config.settings.C30199h.C30200a) r4     // Catch:{ Throwable -> 0x00e6 }
            f79465c = r4     // Catch:{ Throwable -> 0x00e6 }
        L_0x00ca:
            com.ss.android.ugc.aweme.global.config.settings.h$a r4 = f79465c     // Catch:{ Throwable -> 0x00e6 }
            if (r4 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.global.config.settings.h$a r4 = f79465c     // Catch:{ Throwable -> 0x00e6 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r4 = r4.get()     // Catch:{ Throwable -> 0x00e6 }
            if (r4 == 0) goto L_0x00de
            com.ss.android.ugc.aweme.global.config.settings.h$a r4 = f79465c     // Catch:{ Throwable -> 0x00e6 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r4 = r4.get()     // Catch:{ Throwable -> 0x00e6 }
            monitor-exit(r0)     // Catch:{ all -> 0x0120 }
            return r4
        L_0x00de:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x00e6 }
            java.lang.String r5 = "sIesSettingsProxyWrapReflect or sIesSettingsProxyWrapReflect.get() can not be null"
            r4.<init>(r5)     // Catch:{ Throwable -> 0x00e6 }
            throw r4     // Catch:{ Throwable -> 0x00e6 }
        L_0x00e6:
            r4 = move-exception
            r4.getMessage()     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            java.lang.String r6 = "Throwable "
            r5.<init>(r6)     // Catch:{ all -> 0x0120 }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0120 }
            r8 = 0
            long r6 = r6 - r1
            r5.append(r6)     // Catch:{ all -> 0x0120 }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x0120 }
            m98863a(r4, r1)     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = f79466d     // Catch:{ all -> 0x0120 }
            if (r1 != 0) goto L_0x011c
            com.squareup.wire.DefaultValueBuilder r1 = new com.squareup.wire.DefaultValueBuilder     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings$Builder r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings$Builder     // Catch:{ all -> 0x0120 }
            r2.<init>()     // Catch:{ all -> 0x0120 }
            r1.<init>(r2)     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r2 = new com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy     // Catch:{ all -> 0x0120 }
            com.squareup.wire.Message r1 = r1.build()     // Catch:{ all -> 0x0120 }
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettings r1 = (com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings) r1     // Catch:{ all -> 0x0120 }
            r2.<init>(r1, r3)     // Catch:{ all -> 0x0120 }
            f79466d = r2     // Catch:{ all -> 0x0120 }
        L_0x011c:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = f79466d     // Catch:{ all -> 0x0120 }
            monitor-exit(r0)     // Catch:{ all -> 0x0120 }
            return r1
        L_0x0120:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0120 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.global.config.settings.C30199h.m98864b():com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy");
    }

    /* renamed from: a */
    public static void m98862a(C30200a aVar, boolean z) {
        synchronized (f79464b) {
            C30199h c = m98865c();
            c.f79469g = z;
            if (aVar == null) {
                throw new IllegalStateException("iesSettingsProxyWrap is null!");
            } else if (c.f79468f == null) {
                c.f79468f = aVar;
                f79464b.notifyAll();
            } else if (m98865c().f79469g) {
                throw new IllegalStateException("duplicate init be found in {@link SettingsReader}");
            }
        }
    }

    /* renamed from: a */
    private static void m98863a(Throwable th, String str) {
        String str2;
        int i;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("classDesc", "SettingsReader");
            jSONObject.put("errorField", "SettingsReader");
            String str3 = "errorDesc";
            if (th == null || th.getMessage() == null) {
                str2 = "";
            } else {
                str2 = th.getMessage();
            }
            jSONObject.put(str3, str2);
            jSONObject.put("jsonDesc", str);
            String str4 = "status";
            if (th != null) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put(str4, i);
            if (f79467e == null) {
                Method method = Class.forName("com.ss.android.ugc.aweme.global.config.settings.SettingsReaderUtil").getMethod("monitorError", new Class[]{JSONObject.class});
                f79467e = method;
                method.setAccessible(true);
            }
            f79467e.invoke(null, new Object[]{jSONObject});
        } catch (Throwable th2) {
            th2.getMessage();
        }
    }
}
