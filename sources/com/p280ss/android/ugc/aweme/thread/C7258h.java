package com.p280ss.android.ugc.aweme.thread;

import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.thread.h */
public class C7258h {

    /* renamed from: a */
    private static C7260i f20300a = C7260i.m22746a().mo18989a();

    /* renamed from: b */
    private static C7245c f20301b = new C7245c() {
        /* renamed from: a */
        public final void mo18962a(JSONObject jSONObject) {
        }

        /* renamed from: a */
        public final boolean mo18963a() {
            return false;
        }

        /* renamed from: b */
        public final void mo18964b(JSONObject jSONObject) {
        }

        /* renamed from: b */
        public final boolean mo18965b() {
            return false;
        }

        /* renamed from: c */
        public final void mo18966c(JSONObject jSONObject) {
        }

        /* renamed from: c */
        public final boolean mo18967c() {
            return false;
        }

        /* renamed from: d */
        public final void mo18968d(JSONObject jSONObject) {
        }

        /* renamed from: d */
        public final boolean mo18969d() {
            return false;
        }

        /* renamed from: e */
        public final void mo18970e(JSONObject jSONObject) {
        }

        /* renamed from: e */
        public final boolean mo18971e() {
            return false;
        }
    };

    /* renamed from: c */
    private static volatile ExecutorService f20302c;

    /* renamed from: d */
    private static volatile ExecutorService f20303d;

    /* renamed from: e */
    private static volatile ExecutorService f20304e;

    /* renamed from: f */
    private static volatile ScheduledExecutorService f20305f;

    /* renamed from: g */
    private static volatile ExecutorService f20306g;

    /* renamed from: a */
    public static C7260i m22723a() {
        return f20300a;
    }

    /* renamed from: b */
    public static C7245c m22729b() {
        return f20301b;
    }

    /* renamed from: h */
    public static void m22735h() {
        if (f20301b.mo18963a()) {
            f20301b.mo18962a(C7268n.m22763a().mo18998b());
        }
    }

    /* renamed from: c */
    public static ExecutorService m22730c() {
        if (f20302c == null) {
            synchronized (C7258h.class) {
                if (f20302c == null) {
                    f20302c = C7268n.m22763a().mo18997a(C7265m.m22758a(ThreadPoolType.IO).mo18996a(), true);
                }
            }
        }
        return f20302c;
    }

    /* renamed from: d */
    public static ExecutorService m22731d() {
        if (f20303d == null) {
            synchronized (C7258h.class) {
                if (f20303d == null) {
                    f20303d = C7268n.m22763a().mo18997a(C7265m.m22758a(ThreadPoolType.DEFAULT).mo18996a(), true);
                }
            }
        }
        return f20303d;
    }

    /* renamed from: e */
    public static ExecutorService m22732e() {
        if (f20304e == null) {
            synchronized (C7258h.class) {
                if (f20304e == null) {
                    f20304e = C7268n.m22763a().mo18997a(C7265m.m22758a(ThreadPoolType.BACKGROUND).mo18996a(), true);
                }
            }
        }
        return f20304e;
    }

    /* renamed from: f */
    public static ScheduledExecutorService m22733f() {
        if (f20305f == null) {
            synchronized (C7258h.class) {
                if (f20305f == null) {
                    f20305f = (ScheduledExecutorService) C7268n.m22763a().mo18997a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(1).mo18996a(), true);
                }
            }
        }
        return f20305f;
    }

    /* renamed from: g */
    public static ExecutorService m22734g() {
        if (f20306g == null) {
            synchronized (C7258h.class) {
                if (f20306g == null) {
                    f20306g = C7268n.m22763a().mo18997a(C7265m.m22758a(ThreadPoolType.SERIAL).mo18996a(), true);
                }
            }
        }
        return f20306g;
    }

    /* renamed from: a */
    public static void m22725a(C7245c cVar) {
        f20301b = cVar;
    }

    /* renamed from: a */
    public static void m22726a(C7260i iVar) {
        f20300a = iVar;
    }

    /* renamed from: a */
    public static ExecutorService m22724a(C7265m mVar) {
        if (mVar.f20320a != ThreadPoolType.IO && mVar.f20320a != ThreadPoolType.DEFAULT && mVar.f20320a != ThreadPoolType.BACKGROUND) {
            return C7268n.m22763a().mo18997a(mVar, false);
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: a */
    static boolean m22727a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String contains : f20300a.f20309c) {
            if (str.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m22728a(ExecutorService executorService) {
        if (executorService == m22730c() || executorService == m22731d() || executorService == m22732e() || executorService == m22733f() || executorService == m22734g()) {
            return true;
        }
        return false;
    }
}
