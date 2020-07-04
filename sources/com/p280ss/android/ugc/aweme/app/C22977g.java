package com.p280ss.android.ugc.aweme.app;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.ugc.aweme.app.p1027b.C22889a;
import com.p280ss.android.ugc.aweme.app.p1027b.C22890b;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.SpringApiLimitConfig;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C47870u;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7495v;
import p346io.reactivex.C7498y;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.ss.android.ugc.aweme.app.g */
public final class C22977g {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f60741a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C22977g.class), "springApiLimitConfig", "getSpringApiLimitConfig()Lcom/ss/android/ugc/aweme/global/config/settings/pojo/SpringApiLimitConfig;"))};

    /* renamed from: b */
    public static final C22977g f60742b = new C22977g();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static long f60743c = 60000;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static boolean f60744d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static volatile boolean f60745e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static boolean f60746f;

    /* renamed from: g */
    private static boolean f60747g = true;

    /* renamed from: h */
    private static final C7541d f60748h = C7546e.m23569a(C22981c.f60751a);

    /* renamed from: com.ss.android.ugc.aweme.app.g$a */
    static final class C22978a<T> implements C7495v<T> {

        /* renamed from: a */
        public static final C22978a f60749a = new C22978a();

        C22978a() {
        }

        public final void subscribe(C47870u<Long> uVar) {
            C7573i.m23587b(uVar, "it");
            if (!C22977g.f60746f) {
                long d = C22977g.m75599d();
                if (d != 60000) {
                    uVar.mo19239a((Object) Long.valueOf(d));
                } else {
                    C7121a.m22244a(60000);
                }
            } else if (C22977g.f60743c != 60000) {
                uVar.mo19239a((Object) Long.valueOf(C22977g.f60743c));
            } else {
                C7121a.m22244a(60000);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.g$b */
    public static final class C22979b implements C7498y<Long> {

        /* renamed from: com.ss.android.ugc.aweme.app.g$b$a */
        static final class C22980a implements Runnable {

            /* renamed from: a */
            public static final C22980a f60750a = new C22980a();

            C22980a() {
            }

            public final void run() {
                C22977g.f60744d = true;
            }
        }

        C22979b() {
        }

        public final void onComplete() {
        }

        public final void onError(Throwable th) {
            C7573i.m23587b(th, "e");
        }

        public final void onSubscribe(C7321c cVar) {
            C7573i.m23587b(cVar, "d");
        }

        public final /* synthetic */ void onNext(Object obj) {
            m75607a(((Number) obj).longValue());
        }

        /* renamed from: a */
        private static void m75607a(long j) {
            C22977g.f60743c = j;
            C22977g.f60745e = true;
            C22977g.f60746f = true;
            C7121a.m22244a(C22977g.f60743c);
            new Handler(Looper.getMainLooper()).postDelayed(C22980a.f60750a, C22977g.f60743c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.g$c */
    static final class C22981c extends Lambda implements C7561a<SpringApiLimitConfig> {

        /* renamed from: a */
        public static final C22981c f60751a = new C22981c();

        C22981c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m75608a();
        }

        /* renamed from: a */
        private static SpringApiLimitConfig m75608a() {
            try {
                IESSettingsProxy a = C30199h.m98861a();
                C7573i.m23582a((Object) a, "SettingsReader.get()");
                return a.getSpringApiLimitConfig();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    private C22977g() {
    }

    /* renamed from: e */
    private static boolean m75600e() {
        return f60745e;
    }

    /* renamed from: g */
    private static SpringApiLimitConfig m75602g() {
        return (SpringApiLimitConfig) f60748h.getValue();
    }

    /* renamed from: b */
    public final boolean mo59967b() {
        return m75598c("");
    }

    /* renamed from: c */
    public final long mo59968c() {
        if (!f60746f) {
            f60743c = m75599d();
            f60746f = true;
        }
        return f60743c;
    }

    /* renamed from: f */
    private static void m75601f() {
        try {
            C7492s.m23282a((C7495v<T>) C22978a.f60749a).mo19304b(C47549a.m148327a()).mo19294a(C7333a.m23044b()).mo19189a((C7498y<? super T>) new C22979b<Object>());
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static long m75599d() {
        SpringApiLimitConfig g = m75602g();
        if (g != null && m75594a(g)) {
            try {
                double random = Math.random();
                long longValue = g.getLimitEndTime().longValue();
                Long limitStartTime = g.getLimitStartTime();
                C7573i.m23582a((Object) limitStartTime, "limitStartTime");
                double longValue2 = (double) (longValue - limitStartTime.longValue());
                Double.isNaN(longValue2);
                double d = random * longValue2;
                Long limitStartTime2 = g.getLimitStartTime();
                C7573i.m23582a((Object) limitStartTime2, "limitStartTime");
                double longValue3 = (double) limitStartTime2.longValue();
                Double.isNaN(longValue3);
                return (long) (d + longValue3);
            } catch (Exception unused) {
            }
        }
        return 60000;
    }

    /* renamed from: a */
    public final void mo59965a() {
        if (C6776h.m20947b(C6399b.m19921a())) {
            m75601f();
        }
    }

    /* renamed from: a */
    public static long m75589a(String str) {
        C7573i.m23587b(str, "apiName");
        long b = f60742b.mo59966b(str);
        if (b != 60000) {
            return b;
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public boolean m75598c(String str) {
        C7573i.m23587b(str, "apiName");
        if (m75600e() && !f60744d) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
            C22889a a = C22890b.m75355a(str);
            if (a != null && a.f60604a) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final long mo59966b(String str) {
        C7573i.m23587b(str, "apiName");
        long c = mo59968c();
        if (c == 60000) {
            return c;
        }
        C22889a a = C22890b.m75355a(str);
        if (a == null) {
            return c;
        }
        if (a.f60604a) {
            return 2147483647L;
        }
        return a.f60605b;
    }

    /* renamed from: a */
    private static boolean m75594a(SpringApiLimitConfig springApiLimitConfig) {
        if (springApiLimitConfig != null) {
            try {
                long longValue = springApiLimitConfig.getEndTime().longValue();
                Long startTime = springApiLimitConfig.getStartTime();
                C7573i.m23582a((Object) startTime, "it.startTime");
                long longValue2 = longValue - startTime.longValue();
                long currentTimeMillis = System.currentTimeMillis();
                if (longValue2 < 0) {
                    return false;
                }
                Long startTime2 = springApiLimitConfig.getStartTime();
                C7573i.m23582a((Object) startTime2, "it.startTime");
                if (currentTimeMillis - startTime2.longValue() >= 0) {
                    Long endTime = springApiLimitConfig.getEndTime();
                    C7573i.m23582a((Object) endTime, "it.endTime");
                    if (currentTimeMillis - endTime.longValue() <= 0) {
                        return true;
                    }
                }
                return false;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
