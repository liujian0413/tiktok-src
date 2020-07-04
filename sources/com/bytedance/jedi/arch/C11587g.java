package com.bytedance.jedi.arch;

import com.bytedance.jedi.arch.internal.C11625b;
import com.bytedance.jedi.arch.internal.C11630d;
import com.bytedance.jedi.arch.internal.C11630d.C11631a;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7499z;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.jedi.arch.g */
public final class C11587g {

    /* renamed from: a */
    public static final C11587g f31256a = new C11587g();

    /* renamed from: b */
    private static C7563m<? super JediViewModel<C11670t>, ? super C11670t, ? extends C11671u<C11670t>> f31257b = C11590c.f31263a;

    /* renamed from: c */
    private static final C7561a<Executor> f31258c = C11589b.f31262a;

    /* renamed from: d */
    private static C7561a<? extends C7499z> f31259d = C11591d.f31264a;

    /* renamed from: e */
    private static C7561a<? extends Executor> f31260e = C11588a.f31261a;

    /* renamed from: com.bytedance.jedi.arch.g$a */
    static final class C11588a extends Lambda implements C7561a<ThreadPoolExecutor> {

        /* renamed from: a */
        public static final C11588a f31261a = new C11588a();

        C11588a() {
            super(0);
        }

        /* renamed from: a */
        private static ThreadPoolExecutor m34064a() {
            return C11631a.m34097c();
        }

        public final /* synthetic */ Object invoke() {
            return m34064a();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.g$b */
    static final class C11589b extends Lambda implements C7561a<C11630d> {

        /* renamed from: a */
        public static final C11589b f31262a = new C11589b();

        C11589b() {
            super(0);
        }

        /* renamed from: a */
        private static C11630d m34065a() {
            return new C11630d();
        }

        public final /* synthetic */ Object invoke() {
            return m34065a();
        }
    }

    /* renamed from: com.bytedance.jedi.arch.g$c */
    static final class C11590c extends Lambda implements C7563m<JediViewModel<C11670t>, C11670t, C11625b<C11670t>> {

        /* renamed from: a */
        public static final C11590c f31263a = new C11590c();

        C11590c() {
            super(2);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m34066a((JediViewModel) obj, (C11670t) obj2);
        }

        /* renamed from: a */
        private static C11625b<C11670t> m34066a(JediViewModel<C11670t> jediViewModel, C11670t tVar) {
            C7573i.m23587b(jediViewModel, "<anonymous parameter 0>");
            C7573i.m23587b(tVar, "state");
            return new C11625b<>(tVar, (C7499z) C11587g.m34061b().invoke());
        }
    }

    /* renamed from: com.bytedance.jedi.arch.g$d */
    static final class C11591d extends Lambda implements C7561a<C7499z> {

        /* renamed from: a */
        public static final C11591d f31264a = new C11591d();

        C11591d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m34067a();
        }

        /* renamed from: a */
        private static C7499z m34067a() {
            C7499z a = C7333a.m23043a((Executor) C11587g.m34062c().invoke());
            C7573i.m23582a((Object) a, "Schedulers.from(storeExecutorFactory())");
            return a;
        }
    }

    private C11587g() {
    }

    /* renamed from: a */
    public static C7563m<JediViewModel<C11670t>, C11670t, C11671u<C11670t>> m34060a() {
        return f31257b;
    }

    /* renamed from: b */
    public static C7561a<C7499z> m34061b() {
        return f31259d;
    }

    /* renamed from: c */
    public static C7561a<Executor> m34062c() {
        return f31258c;
    }

    /* renamed from: d */
    public static C7561a<Executor> m34063d() {
        return f31260e;
    }
}
