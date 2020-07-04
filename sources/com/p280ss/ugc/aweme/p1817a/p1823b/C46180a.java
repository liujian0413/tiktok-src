package com.p280ss.ugc.aweme.p1817a.p1823b;

import android.app.Application;
import com.p280ss.ugc.aweme.p1817a.p1818a.p1819a.p1820a.C46177a;
import com.p280ss.ugc.aweme.p1817a.p1818a.p1819a.p1821b.C46178a;
import com.p280ss.ugc.aweme.p1817a.p1818a.p1819a.p1822c.C46179a;
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

/* renamed from: com.ss.ugc.aweme.a.b.a */
public final class C46180a {

    /* renamed from: a */
    public static final C7541d f118728a = C7546e.m23568a(LazyThreadSafetyMode.SYNCHRONIZED, C46182b.f118731a);

    /* renamed from: b */
    public static final C46181a f118729b = new C46181a(null);

    /* renamed from: com.ss.ugc.aweme.a.b.a$a */
    public static final class C46181a {

        /* renamed from: a */
        static final /* synthetic */ C7595j[] f118730a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C46181a.class), "INSTANCE", "getINSTANCE()Lcom/ss/ugc/aweme/performance/monitor/JankKiller;"))};

        private C46181a() {
        }

        /* renamed from: a */
        public static C46180a m145046a() {
            return (C46180a) C46180a.f118728a.getValue();
        }

        public /* synthetic */ C46181a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.ugc.aweme.a.b.a$b */
    static final class C46182b extends Lambda implements C7561a<C46180a> {

        /* renamed from: a */
        public static final C46182b f118731a = new C46182b();

        C46182b() {
            super(0);
        }

        /* renamed from: a */
        private static C46180a m145047a() {
            return new C46180a();
        }

        public final /* synthetic */ Object invoke() {
            return m145047a();
        }
    }

    /* renamed from: a */
    public static void m145042a(Application application) {
        C7573i.m23587b(application, "application");
    }

    /* renamed from: a */
    public final C46180a mo112477a(C46177a aVar) {
        C7573i.m23587b(aVar, "config");
        return this;
    }

    /* renamed from: a */
    public final C46180a mo112478a(C46178a<?> aVar) {
        C7573i.m23587b(aVar, "printer");
        return this;
    }

    /* renamed from: a */
    public final C46180a mo112479a(C46179a aVar) {
        C7573i.m23587b(aVar, "theadPool");
        return this;
    }
}
