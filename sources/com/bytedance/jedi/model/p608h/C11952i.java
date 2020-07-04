package com.bytedance.jedi.model.p608h;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.C7499z;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.jedi.model.h.i */
public final class C11952i {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f31851a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11952i.class), "CPU_COUNT", "getCPU_COUNT()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11952i.class), "CORE_POOL_SIZE", "getCORE_POOL_SIZE()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11952i.class), "MAXIMUM_POOL_SIZE", "getMAXIMUM_POOL_SIZE()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C11952i.class), "defaultScheduler", "getDefaultScheduler()Lio/reactivex/Scheduler;"))};

    /* renamed from: b */
    public static final C11952i f31852b = new C11952i();

    /* renamed from: c */
    private static final C7541d f31853c = C7546e.m23569a(C11954b.f31858a);

    /* renamed from: d */
    private static final C7541d f31854d = C7546e.m23569a(C11953a.f31857a);

    /* renamed from: e */
    private static final C7541d f31855e = C7546e.m23569a(C11955c.f31859a);

    /* renamed from: f */
    private static final C7541d f31856f = C7546e.m23569a(C11956d.f31860a);

    /* renamed from: com.bytedance.jedi.model.h.i$a */
    static final class C11953a extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C11953a f31857a = new C11953a();

        C11953a() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m35032a());
        }

        /* renamed from: a */
        private static int m35032a() {
            return Math.max(2, Math.min(C11952i.f31852b.mo29563a() - 1, 4));
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.i$b */
    static final class C11954b extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C11954b f31858a = new C11954b();

        C11954b() {
            super(0);
        }

        /* renamed from: a */
        private static int m35033a() {
            return Runtime.getRuntime().availableProcessors();
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m35033a());
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.i$c */
    static final class C11955c extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        public static final C11955c f31859a = new C11955c();

        C11955c() {
            super(0);
        }

        /* renamed from: a */
        private static int m35034a() {
            return (C11952i.f31852b.mo29563a() * 2) + 1;
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m35034a());
        }
    }

    /* renamed from: com.bytedance.jedi.model.h.i$d */
    static final class C11956d extends Lambda implements C7561a<C7499z> {

        /* renamed from: a */
        public static final C11956d f31860a = new C11956d();

        C11956d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m35035a();
        }

        /* renamed from: a */
        private static C7499z m35035a() {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(C11952i.f31852b.mo29564b(), C11952i.f31852b.mo29565c(), 0, TimeUnit.SECONDS, new LinkedBlockingQueue());
            return C7333a.m23043a(threadPoolExecutor);
        }
    }

    private C11952i() {
    }

    /* renamed from: e */
    private final C7499z m35027e() {
        return (C7499z) f31856f.getValue();
    }

    /* renamed from: a */
    public final int mo29563a() {
        return ((Number) f31853c.getValue()).intValue();
    }

    /* renamed from: b */
    public final int mo29564b() {
        return ((Number) f31854d.getValue()).intValue();
    }

    /* renamed from: c */
    public final int mo29565c() {
        return ((Number) f31855e.getValue()).intValue();
    }

    /* renamed from: d */
    public final C7499z mo29566d() {
        C7561a a = C11951h.m35026a();
        if (a != null) {
            C7499z zVar = (C7499z) a.invoke();
            if (zVar != null) {
                return zVar;
            }
        }
        C7499z e = m35027e();
        C7573i.m23582a((Object) e, "defaultScheduler");
        return e;
    }
}
