package com.p280ss.android.ugc.aweme.commercialize.splash;

import android.content.Context;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25352e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.C6914a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.commercialize.splash.o */
public final class C25083o implements C25066k {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f66205a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C25083o.class), "appStartTime", "getAppStartTime()J"))};

    /* renamed from: b */
    public static final C25083o f66206b = new C25083o();

    /* renamed from: c */
    private static final C7541d f66207c = C7546e.m23569a(C25084a.f66216a);

    /* renamed from: d */
    private static long f66208d;

    /* renamed from: e */
    private static long f66209e;

    /* renamed from: f */
    private static boolean f66210f;

    /* renamed from: g */
    private static boolean f66211g = true;

    /* renamed from: h */
    private static int f66212h;

    /* renamed from: i */
    private static long f66213i;

    /* renamed from: j */
    private static int f66214j;

    /* renamed from: k */
    private static long f66215k;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.splash.o$a */
    static final class C25084a extends Lambda implements C7561a<Long> {

        /* renamed from: a */
        public static final C25084a f66216a = new C25084a();

        C25084a() {
            super(0);
        }

        /* renamed from: a */
        private static long m82620a() {
            return C6914a.f19587b;
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(m82620a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.splash.o$b */
    static final class C25085b<V> implements Callable<C7581n> {

        /* renamed from: a */
        final /* synthetic */ Context f66217a;

        /* renamed from: b */
        final /* synthetic */ Aweme f66218b;

        /* renamed from: c */
        final /* synthetic */ long f66219c;

        /* renamed from: d */
        final /* synthetic */ long f66220d;

        C25085b(Context context, Aweme aweme, long j, long j2) {
            this.f66217a = context;
            this.f66218b = aweme;
            this.f66219c = j;
            this.f66220d = j2;
        }

        public final /* synthetic */ Object call() {
            m82621a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m82621a() {
            C24976t.m82148b(this.f66217a, this.f66218b, this.f66219c);
            if (C25083o.m82614e()) {
                C24976t.m82047a(this.f66217a, this.f66218b, this.f66220d);
            }
        }
    }

    private C25083o() {
    }

    /* renamed from: b */
    public static long m82609b() {
        return f66208d;
    }

    /* renamed from: c */
    public static long m82612c() {
        return f66209e;
    }

    /* renamed from: d */
    public static boolean m82613d() {
        return f66210f;
    }

    /* renamed from: e */
    public static boolean m82614e() {
        return f66211g;
    }

    /* renamed from: a */
    public final long mo65592a() {
        return ((Number) f66207c.getValue()).longValue();
    }

    /* renamed from: a */
    public final void mo65570a(boolean z) {
        f66211g = false;
    }

    /* renamed from: a */
    public static void m82608a(long j) {
        f66208d = 0;
    }

    /* renamed from: b */
    public static void m82610b(long j) {
        f66209e = j;
    }

    /* renamed from: b */
    public static void m82611b(boolean z) {
        f66210f = true;
    }

    /* renamed from: c */
    public final void mo65572c(Context context, Aweme aweme) {
        long currentTimeMillis = System.currentTimeMillis();
        f66208d = currentTimeMillis;
        C25085b bVar = new C25085b(context, aweme, currentTimeMillis - f66209e, f66208d - mo65592a());
        C1592h.m7855a((Callable<TResult>) bVar, (Executor) C6907h.m21516a());
    }

    /* renamed from: a */
    public final void mo65569a(Context context, Aweme aweme) {
        if (!m82614e()) {
            if (!C25352e.m83221d(aweme)) {
                int i = f66212h;
                if (1 <= i && 9 >= i) {
                    f66212h++;
                    return;
                }
                f66212h = 0;
                f66213i = 0;
            } else if (C25352e.m83231n(aweme)) {
                f66212h = 1;
                f66213i = System.currentTimeMillis();
            } else {
                int i2 = f66212h;
                if (1 <= i2 && 9 >= i2) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("adsgap", String.valueOf(f66212h - 1));
                    hashMap.put("gaptime", String.valueOf(System.currentTimeMillis() - f66213i));
                    C24976t.m82206e(context, aweme, (Map<String, String>) hashMap);
                }
                f66212h = 0;
            }
        }
    }

    /* renamed from: b */
    public final void mo65571b(Context context, Aweme aweme) {
        if (!C25352e.m83221d(aweme) || C25352e.m83231n(aweme)) {
            if (C25352e.m83231n(aweme)) {
                int i = f66214j;
                if (1 <= i && 9 >= i) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("adsgap", String.valueOf(f66214j - 1));
                    hashMap.put("gaptime", String.valueOf(System.currentTimeMillis() - f66215k));
                    C24976t.m82215f(context, aweme, (Map<String, String>) hashMap);
                    f66214j = 0;
                    return;
                }
            } else {
                int i2 = f66214j;
                if (1 <= i2 && 9 >= i2) {
                    f66214j++;
                    return;
                } else {
                    f66214j = 0;
                    f66215k = 0;
                }
            }
            return;
        }
        f66214j = 1;
        f66215k = System.currentTimeMillis();
    }
}
