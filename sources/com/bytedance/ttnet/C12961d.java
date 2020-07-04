package com.bytedance.ttnet;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.p254b.C6304f;
import com.bytedance.common.utility.p254b.C9714c;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10144b;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10148f;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10151i;
import com.bytedance.frameworks.baselib.network.http.C10142f.C10153k;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10123a;
import com.bytedance.frameworks.baselib.network.http.cronet.impl.C10124b;
import com.bytedance.frameworks.baselib.network.http.impl.C10166f;
import com.bytedance.frameworks.baselib.network.http.util.C10186f;
import com.bytedance.retrofit2.C12519q;
import com.bytedance.ttnet.encrypt.C12980c;
import com.bytedance.ttnet.encrypt.TtTokenConfig;
import com.bytedance.ttnet.p670a.C12925a;
import com.bytedance.ttnet.p671c.C12955b;
import com.bytedance.ttnet.p672d.C12971c;
import com.bytedance.ttnet.utils.C12997b;
import com.bytedance.ttnet.utils.C13003f;
import com.bytedance.ttnet.utils.C13003f.C13004a;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ttnet.d */
public class C12961d {

    /* renamed from: a */
    private static C12953c f34310a = null;

    /* renamed from: b */
    private static volatile boolean f34311b = false;

    /* renamed from: c */
    private static boolean f34312c = true;

    /* renamed from: d */
    private static volatile int f34313d = 10;

    /* renamed from: e */
    private static volatile Semaphore f34314e = new Semaphore(0);

    /* renamed from: f */
    private static volatile boolean f34315f = false;

    /* renamed from: g */
    private static long f34316g = 0;

    /* renamed from: h */
    private static long f34317h = 1500;

    /* renamed from: a */
    public static void m37776a(Activity activity) {
        C12974e.m37816a(activity);
    }

    /* renamed from: a */
    public static void m37779a(Context context, boolean z) {
        C12974e.m37817a(context, z);
    }

    /* renamed from: c */
    public static void m37787c() {
        C10166f.m30193a();
    }

    /* renamed from: f */
    public static void m37790f() throws Exception {
        m37794j();
    }

    /* renamed from: g */
    public static boolean m37791g() {
        return f34312c;
    }

    /* renamed from: a */
    public static boolean m37782a(String[] strArr, int i, int i2) {
        if (strArr == null || strArr.length <= 0) {
            return false;
        }
        try {
            C10124b.m30047a(m37772a().mo31461a());
            C10124b.m30063a(strArr, 10, 1);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static void m37788d() {
        C10124b.m30054a("org.chromium.CronetClient");
    }

    /* renamed from: a */
    public static C12953c m37772a() {
        if (f34310a != null) {
            return f34310a;
        }
        throw new IllegalArgumentException("sITTNetDepend is null");
    }

    /* renamed from: b */
    public static void m37783b() {
        if (f34310a != null && !f34315f) {
            f34315f = true;
        }
    }

    /* renamed from: e */
    public static C10123a m37789e() throws Exception {
        C10124b.m30047a(m37772a().mo31461a());
        return C10124b.m30046a();
    }

    /* renamed from: h */
    private static void m37792h() {
        try {
            f34314e.release(99999999);
        } catch (Exception unused) {
        }
    }

    /* renamed from: i */
    private static void m37793i() {
        try {
            C9714c.m28652b().schedule(new Runnable() {
                public final void run() {
                    try {
                        System.currentTimeMillis();
                        C10142f.m30118b(true);
                        if (C6312h.m19578b()) {
                            System.currentTimeMillis();
                        }
                    } catch (Throwable unused) {
                    }
                }
            }, f34317h, TimeUnit.MILLISECONDS);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: j */
    private static C10124b m37794j() throws Exception {
        if (!C12947b.m37743a()) {
            return null;
        }
        C10124b a = C10124b.m30047a(m37772a().mo31461a());
        a.mo24789a(false, false, false, C12925a.m37625a(m37772a().mo31461a()).mo24792b());
        return a;
    }

    /* renamed from: a */
    public static void m37774a(int i) {
        f34313d = i;
    }

    /* renamed from: a */
    public static void m37775a(long j) {
        f34317h = 0;
    }

    /* renamed from: a */
    public static List<InetAddress> m37773a(String str) throws Exception {
        C10124b.m30047a(m37772a().mo31461a());
        return C10124b.m30065b(str);
    }

    /* renamed from: b */
    private static void m37784b(int i) {
        if (i == 1) {
            C10124b.m30054a("org.chromium.CronetClient1");
            return;
        }
        if (i == 2) {
            C10124b.m30054a("org.chromium.CronetClient");
        }
    }

    /* renamed from: b */
    public static void m37785b(Activity activity) {
        if (activity != null) {
            C12925a.m37625a((Context) activity).mo31419l();
            C12925a.m37625a((Context) activity);
            C12925a.m37635b((Context) activity);
            if (f34311b) {
                TtTokenConfig.m37818a().mo31493a(activity);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        f34313d = 0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0022 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m37777a(final android.content.Context r6) {
        /*
            java.net.CookieHandler r0 = java.net.CookieHandler.getDefault()     // Catch:{ Throwable -> 0x0060 }
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0 instanceof com.bytedance.frameworks.baselib.network.http.impl.C10169h     // Catch:{ Throwable -> 0x0060 }
            if (r0 == 0) goto L_0x000e
            m37793i()     // Catch:{ Throwable -> 0x0060 }
            return
        L_0x000e:
            long r0 = f34316g     // Catch:{ Throwable -> 0x0060 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x001a
            m37793i()     // Catch:{ Throwable -> 0x0060 }
            return
        L_0x001a:
            r0 = 0
            r1 = 0
            android.webkit.CookieManager r2 = android.webkit.CookieManager.getInstance()     // Catch:{ Throwable -> 0x0022 }
            r0 = r2
            goto L_0x0024
        L_0x0022:
            f34313d = r1     // Catch:{ Throwable -> 0x0060 }
        L_0x0024:
            com.bytedance.frameworks.baselib.network.http.impl.h r2 = new com.bytedance.frameworks.baselib.network.http.impl.h     // Catch:{ Throwable -> 0x0060 }
            int r3 = f34313d     // Catch:{ Throwable -> 0x0060 }
            com.bytedance.ttnet.d$4 r4 = new com.bytedance.ttnet.d$4     // Catch:{ Throwable -> 0x0060 }
            r4.<init>(r6)     // Catch:{ Throwable -> 0x0060 }
            r2.<init>(r6, r3, r0, r4)     // Catch:{ Throwable -> 0x0060 }
            java.net.CookieHandler.setDefault(r2)     // Catch:{ Throwable -> 0x0060 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0060 }
            long r4 = f34316g     // Catch:{ Throwable -> 0x0060 }
            r6 = 0
            long r2 = r2 - r4
            long r4 = f34317h     // Catch:{ Throwable -> 0x0060 }
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x0046
            r6 = 1
            com.bytedance.frameworks.baselib.network.http.C10142f.m30118b(r6)     // Catch:{ Throwable -> 0x0060 }
            goto L_0x0060
        L_0x0046:
            com.bytedance.frameworks.baselib.network.http.C10142f.m30118b(r1)     // Catch:{ Throwable -> 0x0060 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0060 }
            java.util.concurrent.ScheduledExecutorService r6 = com.bytedance.common.utility.p254b.C9714c.m28652b()     // Catch:{ Throwable -> 0x0060 }
            com.bytedance.ttnet.d$5 r4 = new com.bytedance.ttnet.d$5     // Catch:{ Throwable -> 0x0060 }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x0060 }
            long r0 = f34317h     // Catch:{ Throwable -> 0x0060 }
            r5 = 0
            long r0 = r0 - r2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Throwable -> 0x0060 }
            r6.schedule(r4, r0, r2)     // Catch:{ Throwable -> 0x0060 }
            return
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.C12961d.m37777a(android.content.Context):void");
    }

    /* renamed from: a */
    public static void m37780a(C12953c cVar) {
        f34310a = cVar;
    }

    /* renamed from: a */
    public static void m37781a(boolean z) throws Exception {
        f34312c = z;
        if (m37794j() != null) {
            C10124b.m30061a(z);
        }
    }

    /* renamed from: b */
    public static void m37786b(final Context context, final boolean z) {
        try {
            f34316g = System.currentTimeMillis();
            if (z) {
                CookieSyncManager.createInstance(context);
                CookieManager.getInstance().setAcceptCookie(true);
                m37777a(context);
                return;
            }
            m37793i();
        } catch (Throwable th) {
            if (C10186f.m30256b(context) && Thread.currentThread() != Looper.getMainLooper().getThread()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C12961d.m37779a(context, z);
                    }
                });
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error", th.getMessage());
                } catch (JSONException unused) {
                }
                if (f34310a != null) {
                    f34310a.mo31467a("async_init_cookie_manager_fail", jSONObject);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m37778a(final Context context, Application application, C10144b<C12955b> bVar, C10153k<C12955b> kVar, C10148f fVar, boolean z, boolean... zArr) {
        if (context != null) {
            C12519q.m36382a(C6312h.m19575a());
            C10142f.m30104a((C10144b) bVar);
            C12955b.m37765b();
            boolean z2 = zArr[0];
            if (C10186f.m30256b(context)) {
                new C6304f("NetWork-AsyncInit", true) {
                    public final void run() {
                        C12961d.m37779a(context, true);
                        try {
                            C12997b.m37922a(context).mo31535a();
                        } catch (Throwable unused) {
                        }
                    }
                }.start();
            }
            C12971c.m37800a().mo31490a(context, C10186f.m30256b(context));
            if (C10186f.m30255a(context) || (!C10186f.m30256b(context) && z2)) {
                m37779a(context, true);
                C12925a.m37625a(context).mo31419l();
                C12925a.m37625a(context).mo31417j();
                if (f34311b) {
                    C10142f.m30110a((C10151i) C12980c.m37837c());
                }
                m37784b(C12925a.m37625a(context).mo31420m());
            }
            m37792h();
            if (C10186f.m30256b(context)) {
                C10142f.m30107a((C10148f) null);
                m37784b(C12925a.m37625a(context).mo31420m());
                if (f34311b) {
                    C10142f.m30110a((C10151i) C12980c.m37837c());
                }
                C10142f.m30112a((C10153k) kVar);
                if (C13003f.m37946a() == null) {
                    C13003f.m37948a((C13004a) new C13004a() {
                        /* renamed from: a */
                        public final void mo26438a(String str, String str2, int i, boolean z, JSONObject jSONObject) {
                            try {
                                JSONObject jSONObject2 = new JSONObject();
                                jSONObject2.put("url", str2);
                                jSONObject2.put("value", i);
                                jSONObject2.put("ext_value", z ? 1 : 0);
                                jSONObject2.put("extraObject", jSONObject);
                                C12961d.m37772a().mo31465a(context, "set_cookie", str, jSONObject2);
                            } catch (Throwable unused) {
                            }
                        }
                    });
                }
                if (application != null) {
                    application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityDestroyed(Activity activity) {
                        }

                        public final void onActivityPaused(Activity activity) {
                        }

                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        public final void onActivityStarted(Activity activity) {
                        }

                        public final void onActivityStopped(Activity activity) {
                        }

                        public final void onActivityResumed(Activity activity) {
                            C12961d.m37776a(activity);
                        }
                    });
                }
                if (!C12947b.m37743a()) {
                    m37783b();
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("tryInitTTNet context is null");
    }
}
