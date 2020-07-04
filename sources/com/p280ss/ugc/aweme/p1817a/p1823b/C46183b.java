package com.p280ss.ugc.aweme.p1817a.p1823b;

import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.ugc.aweme.a.b.b */
public final class C46183b {

    /* renamed from: a */
    public static final C7541d f118732a = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C46185b.f118735a);

    /* renamed from: b */
    public static final C46184a f118733b = new C46184a(null);

    /* renamed from: com.ss.ugc.aweme.a.b.b$a */
    public static final class C46184a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f118734a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C46184a.class), "INSTANCE", "getINSTANCE()Lcom/ss/ugc/aweme/performance/monitor/JankMonitor;"))};

        private C46184a() {
        }

        /* renamed from: a */
        public static C46183b m145050a() {
            return (C46183b) C46183b.f118732a.getValue();
        }

        public /* synthetic */ C46184a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.aweme.a.b.b$b */
    static final class C46185b extends Lambda implements C7561a<C46183b> {

        /* renamed from: a */
        public static final C46185b f118735a = new C46185b();

        C46185b() {
            super(0);
        }

        /* renamed from: a */
        private static C46183b m145051a() {
            return new C46183b(null);
        }

        public final /* synthetic */ Object invoke() {
            return m145051a();
        }
    }

    private C46183b() {
    }

    /* renamed from: a */
    public static void m145048a(String str) {
        C7573i.m23587b(str, "startPoint");
    }

    /* renamed from: b */
    public static void m145049b(String str) {
        C7573i.m23587b(str, "endPoint");
    }

    public /* synthetic */ C46183b(C7571f fVar) {
        this();
    }
}
