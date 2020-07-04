package shark;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import shark.C48747i.C48749b;

/* renamed from: shark.a */
public final class C48710a {

    /* renamed from: c */
    public static final C48711a f123830c = new C48711a(null);

    /* renamed from: a */
    public final String f123831a;

    /* renamed from: b */
    public final int f123832b;

    /* renamed from: shark.a$a */
    public static final class C48711a {

        /* renamed from: shark.a$a$a */
        static final class C48712a extends Lambda implements C7561a<C48710a> {

            /* renamed from: a */
            final /* synthetic */ C48746h f123833a;

            C48712a(C48746h hVar) {
                this.f123833a = hVar;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C48710a invoke() {
                C48749b a = this.f123833a.mo123470a("android.os.Build");
                if (a == null) {
                    C7573i.m23580a();
                }
                C48749b a2 = this.f123833a.mo123470a("android.os.Build$VERSION");
                if (a2 == null) {
                    C7573i.m23580a();
                }
                C48745g a3 = a.mo123481a("MANUFACTURER");
                if (a3 == null) {
                    C7573i.m23580a();
                }
                String i = a3.f123887c.mo123584i();
                if (i == null) {
                    C7573i.m23580a();
                }
                C48745g a4 = a2.mo123481a("SDK_INT");
                if (a4 == null) {
                    C7573i.m23580a();
                }
                Integer b = a4.f123887c.mo123577b();
                if (b == null) {
                    C7573i.m23580a();
                }
                return new C48710a(i, b.intValue());
            }
        }

        private C48711a() {
        }

        public /* synthetic */ C48711a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static C48710a m150454a(C48746h hVar) {
            C7573i.m23587b(hVar, "graph");
            C48731d b = hVar.mo123472b();
            String name = C48710a.class.getName();
            C7573i.m23582a((Object) name, "AndroidBuildMirror::class.java.name");
            return (C48710a) b.mo123465a(name, (C7561a<? extends T>) new C48712a<Object>(hVar));
        }
    }

    public C48710a(String str, int i) {
        C7573i.m23587b(str, "manufacturer");
        this.f123831a = str;
        this.f123832b = i;
    }
}
