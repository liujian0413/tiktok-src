package shark.internal;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import shark.C48714c;
import shark.C48854r;
import shark.LeakReference;

/* renamed from: shark.internal.k */
public abstract class C48797k {

    /* renamed from: shark.internal.k$a */
    public static abstract class C48798a extends C48797k {

        /* renamed from: shark.internal.k$a$a */
        public static final class C48799a extends C48798a implements C48801b {

            /* renamed from: a */
            private final long f124049a;

            /* renamed from: b */
            private final C48797k f124050b;

            /* renamed from: c */
            private final LeakReference f124051c;

            /* renamed from: d */
            private final C48854r f124052d;

            /* renamed from: a */
            public final long mo123560a() {
                return this.f124049a;
            }

            /* renamed from: b */
            public final C48797k mo123561b() {
                return this.f124050b;
            }

            /* renamed from: c */
            public final LeakReference mo123562c() {
                return this.f124051c;
            }

            /* renamed from: d */
            public final C48854r mo123563d() {
                return this.f124052d;
            }

            public C48799a(long j, C48797k kVar, LeakReference leakReference, C48854r rVar) {
                C7573i.m23587b(kVar, "parent");
                C7573i.m23587b(leakReference, "referenceFromParent");
                C7573i.m23587b(rVar, "matcher");
                super(null);
                this.f124049a = j;
                this.f124050b = kVar;
                this.f124051c = leakReference;
                this.f124052d = rVar;
            }
        }

        /* renamed from: shark.internal.k$a$b */
        public static final class C48800b extends C48798a {

            /* renamed from: a */
            private final long f124053a;

            /* renamed from: b */
            private final C48797k f124054b;

            /* renamed from: c */
            private final LeakReference f124055c;

            /* renamed from: a */
            public final long mo123560a() {
                return this.f124053a;
            }

            /* renamed from: b */
            public final C48797k mo123561b() {
                return this.f124054b;
            }

            /* renamed from: c */
            public final LeakReference mo123562c() {
                return this.f124055c;
            }

            public C48800b(long j, C48797k kVar, LeakReference leakReference) {
                C7573i.m23587b(kVar, "parent");
                C7573i.m23587b(leakReference, "referenceFromParent");
                super(null);
                this.f124053a = j;
                this.f124054b = kVar;
                this.f124055c = leakReference;
            }
        }

        /* renamed from: b */
        public abstract C48797k mo123561b();

        /* renamed from: c */
        public abstract LeakReference mo123562c();

        private C48798a() {
            super(null);
        }

        public /* synthetic */ C48798a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: shark.internal.k$b */
    public interface C48801b {
        /* renamed from: d */
        C48854r mo123563d();
    }

    /* renamed from: shark.internal.k$c */
    public static abstract class C48802c extends C48797k {

        /* renamed from: shark.internal.k$c$a */
        public static final class C48803a extends C48802c implements C48801b {

            /* renamed from: a */
            private final long f124056a;

            /* renamed from: b */
            private final C48714c f124057b;

            /* renamed from: c */
            private final C48854r f124058c;

            /* renamed from: a */
            public final long mo123560a() {
                return this.f124056a;
            }

            /* renamed from: b */
            public final C48714c mo123564b() {
                return this.f124057b;
            }

            /* renamed from: d */
            public final C48854r mo123563d() {
                return this.f124058c;
            }

            public C48803a(long j, C48714c cVar, C48854r rVar) {
                C7573i.m23587b(cVar, "gcRoot");
                C7573i.m23587b(rVar, "matcher");
                super(null);
                this.f124056a = j;
                this.f124057b = cVar;
                this.f124058c = rVar;
            }
        }

        /* renamed from: shark.internal.k$c$b */
        public static final class C48804b extends C48802c {

            /* renamed from: a */
            private final long f124059a;

            /* renamed from: b */
            private final C48714c f124060b;

            /* renamed from: a */
            public final long mo123560a() {
                return this.f124059a;
            }

            /* renamed from: b */
            public final C48714c mo123564b() {
                return this.f124060b;
            }

            public C48804b(long j, C48714c cVar) {
                C7573i.m23587b(cVar, "gcRoot");
                super(null);
                this.f124059a = j;
                this.f124060b = cVar;
            }
        }

        /* renamed from: b */
        public abstract C48714c mo123564b();

        private C48802c() {
            super(null);
        }

        public /* synthetic */ C48802c(C7571f fVar) {
            this();
        }
    }

    private C48797k() {
    }

    /* renamed from: a */
    public abstract long mo123560a();

    public /* synthetic */ C48797k(C7571f fVar) {
        this();
    }
}
