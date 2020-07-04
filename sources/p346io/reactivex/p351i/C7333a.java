package p346io.reactivex.p351i;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.schedulers.C47794b;
import p346io.reactivex.internal.schedulers.C47799d;
import p346io.reactivex.internal.schedulers.C47806f;
import p346io.reactivex.internal.schedulers.C47811h;
import p346io.reactivex.internal.schedulers.C47818m;
import p346io.reactivex.internal.schedulers.C47821o;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.i.a */
public final class C7333a {

    /* renamed from: a */
    static final C7499z f20418a = C7332a.m23040d((Callable<C7499z>) new C7341h<C7499z>());

    /* renamed from: b */
    static final C7499z f20419b = C7332a.m23022a((Callable<C7499z>) new C7335b<C7499z>());

    /* renamed from: c */
    static final C7499z f20420c = C7332a.m23033b((Callable<C7499z>) new C7336c<C7499z>());

    /* renamed from: d */
    static final C7499z f20421d = C47821o.m148689c();

    /* renamed from: e */
    static final C7499z f20422e = C7332a.m23036c((Callable<C7499z>) new C7339f<C7499z>());

    /* renamed from: io.reactivex.i.a$a */
    static final class C7334a {

        /* renamed from: a */
        static final C7499z f20423a = new C47794b();
    }

    /* renamed from: io.reactivex.i.a$b */
    static final class C7335b implements Callable<C7499z> {
        C7335b() {
        }

        /* renamed from: a */
        private static C7499z m23048a() throws Exception {
            return C7334a.f20423a;
        }

        public final /* synthetic */ Object call() throws Exception {
            return m23048a();
        }
    }

    /* renamed from: io.reactivex.i.a$c */
    static final class C7336c implements Callable<C7499z> {
        C7336c() {
        }

        /* renamed from: a */
        private static C7499z m23049a() throws Exception {
            return C7337d.f20424a;
        }

        public final /* synthetic */ Object call() throws Exception {
            return m23049a();
        }
    }

    /* renamed from: io.reactivex.i.a$d */
    static final class C7337d {

        /* renamed from: a */
        static final C7499z f20424a = new C47806f();
    }

    /* renamed from: io.reactivex.i.a$e */
    static final class C7338e {

        /* renamed from: a */
        static final C7499z f20425a = new C47811h();
    }

    /* renamed from: io.reactivex.i.a$f */
    static final class C7339f implements Callable<C7499z> {
        C7339f() {
        }

        /* renamed from: a */
        private static C7499z m23050a() throws Exception {
            return C7338e.f20425a;
        }

        public final /* synthetic */ Object call() throws Exception {
            return m23050a();
        }
    }

    /* renamed from: io.reactivex.i.a$g */
    static final class C7340g {

        /* renamed from: a */
        static final C7499z f20426a = new C47818m();
    }

    /* renamed from: io.reactivex.i.a$h */
    static final class C7341h implements Callable<C7499z> {
        C7341h() {
        }

        /* renamed from: a */
        private static C7499z m23051a() throws Exception {
            return C7340g.f20426a;
        }

        public final /* synthetic */ Object call() throws Exception {
            return m23051a();
        }
    }

    /* renamed from: c */
    public static C7499z m23045c() {
        return f20421d;
    }

    /* renamed from: a */
    public static C7499z m23042a() {
        return C7332a.m23021a(f20419b);
    }

    /* renamed from: b */
    public static C7499z m23044b() {
        return C7332a.m23032b(f20420c);
    }

    /* renamed from: d */
    public static C7499z m23046d() {
        return C7332a.m23035c(f20422e);
    }

    /* renamed from: e */
    public static C7499z m23047e() {
        return C7332a.m23039d(f20418a);
    }

    /* renamed from: a */
    public static C7499z m23043a(Executor executor) {
        return new C47799d(executor);
    }
}
