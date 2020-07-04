package com.bytedance.crash;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.crash.nativecrash.NativeImpl;
import com.bytedance.crash.p490a.C9848a;
import com.bytedance.crash.p490a.C9852c;
import com.bytedance.crash.p490a.C9853d;
import com.bytedance.crash.p491b.C9863f;
import com.bytedance.crash.p493d.C9876a;
import com.bytedance.crash.p498g.C9901a;
import com.bytedance.crash.p498g.C9903c;
import com.bytedance.crash.p498g.C9905d;
import com.bytedance.crash.p500i.C9916b;
import com.bytedance.crash.p501j.C9938b;
import com.bytedance.crash.p501j.C9954g;
import com.bytedance.crash.p501j.p502a.C9930f;
import com.bytedance.crash.upload.C10018c;
import com.bytedance.crash.upload.C10024e;
import com.bytedance.news.common.service.manager.C6446c;
import com.bytedance.services.apm.api.IFdCheck;
import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.crash.i */
public final class C9912i {

    /* renamed from: a */
    public static volatile boolean f27031a;

    /* renamed from: b */
    private static boolean f27032b;

    /* renamed from: c */
    private static boolean f27033c;

    /* renamed from: d */
    private static boolean f27034d;

    /* renamed from: e */
    private static boolean f27035e;

    /* renamed from: f */
    private static boolean f27036f;

    /* renamed from: g */
    private static boolean f27037g;

    /* renamed from: f */
    public static boolean m29324f() {
        return f27037g;
    }

    /* renamed from: a */
    public static boolean m29316a() {
        return f27032b;
    }

    /* renamed from: a */
    public static void m29315a(boolean z) {
        Context g = C9918j.m29342g();
        C9930f.m29397a();
        NativeImpl.m29679a();
        int b = NativeImpl.m29686b();
        NativeImpl.m29690c();
        if (f27036f) {
            C9875d.m29130a().mo24452a("NativeLibraryLoad faild");
        } else if (b < 0) {
            C9875d.m29130a().mo24452a("createCallbackThread faild");
        }
        C9876a.m29132a().mo24440a(g);
        C10024e.m29786a(g);
        if (z) {
            C9863f.m29108a(g).mo24434a();
            f27034d = z;
        }
        C10018c.m29775a().mo24640c();
        C9905d.m29293a(60000);
        NativeImpl.m29696f();
        try {
            C6446c.m20129a(IFdCheck.class, new Npth$2());
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m29314a(Map<? extends String, ? extends String> map) {
        if (map != null && !map.isEmpty()) {
            C9918j.m29337b().mo24424a(map);
        }
    }

    /* renamed from: b */
    public static C9938b m29317b() {
        return C9918j.m29344i();
    }

    /* renamed from: e */
    public static boolean m29323e() {
        return C9901a.m29279b();
    }

    /* renamed from: c */
    public static boolean m29321c() {
        if (C9901a.m29279b() || NativeImpl.m29693d()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m29322d() {
        if (C9901a.m29280c() || NativeImpl.m29693d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m29304a(long j) {
        NativeImpl.m29681a(j);
    }

    /* renamed from: b */
    public static void m29318b(long j) {
        NativeImpl.m29689b(j);
    }

    /* renamed from: b */
    private static void m29320b(final boolean z) {
        C9954g.m29460b().mo24597a((Runnable) new Runnable() {
            public final void run() {
                if (!C9912i.f27031a) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C9912i.f27031a = true;
                            NativeImpl.m29698h();
                        }
                    });
                }
                C9912i.m29315a(z);
            }
        }, 0);
    }

    /* renamed from: a */
    public static void m29311a(C9847a aVar, CrashType crashType) {
        C9918j.m29337b().mo24422a(aVar, crashType);
    }

    /* renamed from: a */
    public static void m29312a(C9900g gVar, CrashType crashType) {
        C9918j.m29337b().mo24423a(gVar, crashType);
    }

    /* renamed from: b */
    public static void m29319b(C9847a aVar, CrashType crashType) {
        if (aVar != null) {
            C9918j.m29337b().mo24422a(aVar, crashType);
        }
    }

    /* renamed from: a */
    public static synchronized void m29306a(Context context, C9895f fVar) {
        synchronized (C9912i.class) {
            C9918j.m29336a(true);
            m29309a(context, fVar, true, false, true, true);
        }
    }

    /* renamed from: a */
    public static void m29313a(String str, C9852c cVar, C9853d dVar) {
        if (!TextUtils.isEmpty(str) && new File(str).exists()) {
            C9848a.m29064a().mo24415a(str, cVar, dVar);
        }
    }

    /* renamed from: a */
    public static synchronized void m29307a(Context context, C9895f fVar, int i, String str) {
        synchronized (C9912i.class) {
            C9918j.m29336a(true);
            C9918j.m29334a(2033, str);
            m29309a(context, fVar, true, true, true, true);
        }
    }

    /* renamed from: a */
    public static synchronized void m29308a(Context context, C9895f fVar, boolean z, boolean z2, boolean z3) {
        synchronized (C9912i.class) {
            m29309a(context, fVar, true, true, true, z3);
        }
    }

    /* renamed from: a */
    private static synchronized void m29309a(Context context, C9895f fVar, boolean z, boolean z2, boolean z3, boolean z4) {
        synchronized (C9912i.class) {
            m29310a(context, fVar, z, z2, z3, z4, 0);
        }
    }

    /* renamed from: a */
    private static synchronized void m29310a(Context context, C9895f fVar, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        String str;
        Application application;
        Context context2 = context;
        synchronized (C9912i.class) {
            if (C9918j.m29343h() != null) {
                application = C9918j.m29343h();
            } else if (context2 instanceof Application) {
                application = (Application) context2;
                if (application.getBaseContext() == null) {
                    throw new IllegalArgumentException("初始化时传入的Application还未attach, 请在init时传入attachBaseContext的参数, 并在init之前手动调用Npth.setApplication(Application).");
                }
            } else {
                try {
                    application = (Application) context.getApplicationContext();
                    if (application == null) {
                        throw new IllegalArgumentException(str);
                    } else if (application.getBaseContext() != null) {
                        context2 = application.getBaseContext();
                    }
                } finally {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("初始化时传入了baseContext, 导致无法获取Application实例, 请在init之前手动调用Npth.setApplication(Application).");
                }
            }
            m29305a(application, context2, fVar, z, z2, z3, z4, 0);
        }
    }

    /* renamed from: a */
    private static synchronized void m29305a(Application application, Context context, C9895f fVar, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        synchronized (C9912i.class) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (!f27032b) {
                if (context == null || application == null) {
                    throw new IllegalArgumentException("context or Application must be not null.");
                } else if (fVar != null) {
                    C9918j.m29335a(application, context, fVar);
                    if (z || z2) {
                        C9901a a = C9901a.m29272a();
                        if (z2) {
                            a.f27005a = new C9916b(context);
                        }
                        if (z) {
                            a.f27006b = new C9903c(context);
                        }
                        f27033c = true;
                    }
                    if (z3) {
                        boolean a2 = NativeImpl.m29684a(context);
                        f27035e = a2;
                        if (!a2) {
                            f27036f = true;
                        }
                    }
                    f27032b = true;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        f27031a = true;
                        NativeImpl.m29698h();
                    }
                    m29320b(z4);
                    StringBuilder sb = new StringBuilder("Npth.init takes ");
                    sb.append(SystemClock.uptimeMillis() - uptimeMillis);
                    sb.append(" ms.");
                } else {
                    throw new IllegalArgumentException("params must be not null.");
                }
            }
        }
    }
}
