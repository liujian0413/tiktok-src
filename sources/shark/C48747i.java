package shark;

import java.util.Iterator;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.collections.C7525m;
import kotlin.jvm.C7560a;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference0;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7584c;
import kotlin.reflect.C7595j;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;
import kotlin.text.C7634n;
import shark.C48823n.C48825b.C48828c;
import shark.C48823n.C48825b.C48828c.C48829a;
import shark.C48823n.C48825b.C48828c.C48829a.C48830a;
import shark.C48823n.C48825b.C48828c.C48829a.C48831b;
import shark.C48823n.C48825b.C48828c.C48833c;
import shark.C48823n.C48825b.C48828c.C48835e;
import shark.C48823n.C48825b.C48828c.C48837g;
import shark.C48823n.C48825b.C48828c.C48837g.C48838a;
import shark.C48823n.C48825b.C48828c.C48837g.C48839b;
import shark.C48823n.C48825b.C48828c.C48837g.C48840c;
import shark.C48823n.C48825b.C48828c.C48837g.C48841d;
import shark.C48823n.C48825b.C48828c.C48837g.C48842e;
import shark.C48823n.C48825b.C48828c.C48837g.C48843f;
import shark.C48823n.C48825b.C48828c.C48837g.C48844g;
import shark.C48823n.C48825b.C48828c.C48837g.C48845h;
import shark.PrimitiveType.C48709a;
import shark.internal.C48769c;
import shark.internal.C48779e.C48780a;
import shark.internal.C48779e.C48781b;
import shark.internal.C48779e.C48782c;
import shark.internal.C48779e.C48783d;

/* renamed from: shark.i */
public abstract class C48747i {

    /* renamed from: a */
    public static final C48748a f123888a = new C48748a(null);

    /* renamed from: shark.i$a */
    public static final class C48748a {
        private C48748a() {
        }

        public /* synthetic */ C48748a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static String m150512a(String str) {
            int b = C7634n.m23757b((CharSequence) str, '.', C7634n.m23780f(str), false);
            if (b == -1) {
                return str;
            }
            int i = b + 1;
            if (str != null) {
                String substring = str.substring(i);
                C7573i.m23582a((Object) substring, "(this as java.lang.String).substring(startIndex)");
                return substring;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: shark.i$b */
    public static final class C48749b extends C48747i {

        /* renamed from: b */
        public final C48813l f123889b;

        /* renamed from: c */
        private final C48780a f123890c;

        /* renamed from: d */
        private final long f123891d;

        /* renamed from: shark.i$b$a */
        static final class C48750a extends Lambda implements C7562b<C48749b, C48749b> {

            /* renamed from: a */
            public static final C48750a f123892a = new C48750a();

            C48750a() {
                super(1);
            }

            public final /* synthetic */ Object invoke(Object obj) {
                return m150526a((C48749b) obj);
            }

            /* renamed from: a */
            private static C48749b m150526a(C48749b bVar) {
                C7573i.m23587b(bVar, "it");
                return bVar.mo123486i();
            }
        }

        /* renamed from: shark.i$b$b */
        static final class C48751b extends Lambda implements C7562b<C48831b, C48745g> {

            /* renamed from: a */
            final /* synthetic */ C48749b f123893a;

            C48751b(C48749b bVar) {
                this.f123893a = bVar;
                super(1);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C48745g invoke(C48831b bVar) {
                C7573i.m23587b(bVar, "fieldRecord");
                return new C48745g(this.f123893a, this.f123893a.f123889b.mo123586a(this.f123893a.mo123478b(), bVar), new C48812k(this.f123893a.f123889b, bVar.f124134c));
            }
        }

        /* renamed from: b */
        public final long mo123478b() {
            return this.f123891d;
        }

        /* renamed from: a */
        public final C48746h mo123477a() {
            return this.f123889b;
        }

        /* renamed from: g */
        public final int mo123484g() {
            return this.f123890c.f124001b;
        }

        /* renamed from: e */
        public final String mo123482e() {
            return this.f123889b.mo123593c(mo123478b());
        }

        /* renamed from: f */
        public final String mo123483f() {
            return C48748a.m150512a(mo123482e());
        }

        /* renamed from: j */
        public final C7604g<C48749b> mo123487j() {
            return C7605h.m23636a(this, (C7562b<? super T, ? extends T>) C48750a.f123892a);
        }

        /* renamed from: k */
        public final C48829a mo123479c() {
            return this.f123889b.mo123589a(mo123478b(), this.f123890c);
        }

        /* renamed from: l */
        public final C7604g<C48745g> mo123489l() {
            return C7605h.m23659d(C7525m.m23526p(mo123479c().f124128h), new C48751b(this));
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("class ");
            sb.append(mo123482e());
            return sb.toString();
        }

        /* renamed from: h */
        public final int mo123485h() {
            int i;
            int i2 = 0;
            for (C48830a aVar : mo123479c().f124129i) {
                if (aVar.f124131b == 2) {
                    i = this.f123889b.mo123469a();
                } else {
                    i = ((Number) C7507ae.m23398b(C48709a.m150452a(), Integer.valueOf(aVar.f124131b))).intValue();
                }
                i2 += i;
            }
            return i2;
        }

        /* renamed from: i */
        public final C48749b mo123486i() {
            if (this.f123890c.f124000a == 0) {
                return null;
            }
            C48747i a = this.f123889b.mo123471a(this.f123890c.f124000a);
            if (a != null) {
                return (C48749b) a;
            }
            throw new TypeCastException("null cannot be cast to non-null type shark.HeapObject.HeapClass");
        }

        /* renamed from: a */
        public final C48745g mo123481a(String str) {
            C7573i.m23587b(str, "fieldName");
            return m150513b(str);
        }

        /* renamed from: b */
        private C48745g m150513b(String str) {
            C7573i.m23587b(str, "fieldName");
            for (C48831b bVar : mo123479c().f124128h) {
                if (C7573i.m23585a((Object) this.f123889b.mo123586a(mo123478b(), bVar), (Object) str)) {
                    return new C48745g(this, this.f123889b.mo123586a(mo123478b(), bVar), new C48812k(this.f123889b, bVar.f124134c));
                }
            }
            return null;
        }

        public C48749b(C48813l lVar, C48780a aVar, long j) {
            C7573i.m23587b(lVar, "hprofGraph");
            C7573i.m23587b(aVar, "indexedObject");
            super(null);
            this.f123889b = lVar;
            this.f123890c = aVar;
            this.f123891d = j;
        }
    }

    /* renamed from: shark.i$c */
    public static final class C48752c extends C48747i {

        /* renamed from: b */
        static final /* synthetic */ C7595j[] f123894b = {C7575l.m23601a((PropertyReference0) new PropertyReference0Impl(C7575l.m23595a(C48752c.class), "fieldReader", "<v#0>"))};

        /* renamed from: c */
        public final C48813l f123895c;

        /* renamed from: d */
        public final C48781b f123896d;

        /* renamed from: e */
        public final boolean f123897e;

        /* renamed from: f */
        private final long f123898f;

        /* renamed from: shark.i$c$a */
        static final class C48753a extends Lambda implements C7562b<C48749b, C7604g<? extends C48745g>> {

            /* renamed from: a */
            final /* synthetic */ C48752c f123899a;

            /* renamed from: b */
            final /* synthetic */ C7541d f123900b;

            /* renamed from: c */
            final /* synthetic */ C7595j f123901c;

            C48753a(C48752c cVar, C7541d dVar, C7595j jVar) {
                this.f123899a = cVar;
                this.f123900b = dVar;
                this.f123901c = jVar;
                super(1);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7604g<C48745g> invoke(final C48749b bVar) {
                C7573i.m23587b(bVar, "heapClass");
                return C7605h.m23659d(C7525m.m23526p(bVar.mo123479c().f124129i), new C7562b<C48830a, C48745g>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C48753a f123902a;

                    {
                        this.f123902a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public C48745g invoke(C48830a aVar) {
                        C7573i.m23587b(aVar, "fieldRecord");
                        return new C48745g(bVar, this.f123902a.f123899a.f123895c.mo123585a(bVar.mo123478b(), aVar), new C48812k(this.f123902a.f123899a.f123895c, ((C48769c) this.f123902a.f123900b.getValue()).mo123541a(aVar)));
                    }
                });
            }
        }

        /* renamed from: shark.i$c$b */
        static final class C48755b extends Lambda implements C7561a<C48769c> {

            /* renamed from: a */
            final /* synthetic */ C48752c f123904a;

            C48755b(C48752c cVar) {
                this.f123904a = cVar;
                super(0);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C48769c invoke() {
                return this.f123904a.f123895c.mo123588a(this.f123904a.mo123479c());
            }
        }

        /* renamed from: b */
        public final long mo123478b() {
            return this.f123898f;
        }

        /* renamed from: a */
        public final C48746h mo123477a() {
            return this.f123895c;
        }

        /* renamed from: e */
        public final int mo123494e() {
            return mo123497h().mo123484g();
        }

        /* renamed from: f */
        public final String mo123495f() {
            return this.f123895c.mo123593c(this.f123896d.f124003a);
        }

        /* renamed from: g */
        public final String mo123496g() {
            return C48748a.m150512a(mo123495f());
        }

        /* renamed from: i */
        public final C48833c mo123479c() {
            return this.f123895c.mo123590a(mo123478b(), this.f123896d);
        }

        /* renamed from: h */
        public final C48749b mo123497h() {
            C48747i a = this.f123895c.mo123471a(this.f123896d.f124003a);
            if (a != null) {
                return (C48749b) a;
            }
            throw new TypeCastException("null cannot be cast to non-null type shark.HeapObject.HeapClass");
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("instance @");
            sb.append(mo123478b());
            sb.append(" of ");
            sb.append(mo123495f());
            return sb.toString();
        }

        /* renamed from: j */
        public final C7604g<C48745g> mo123499j() {
            return C7605h.m23640a(C7605h.m23659d(mo123497h().mo123487j(), new C48753a(this, C7546e.m23569a(new C48755b(this)), f123894b[0])));
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x003a  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0098  */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo123500k() {
            /*
                r5 = this;
                java.lang.String r0 = r5.mo123495f()
                java.lang.String r1 = "java.lang.String"
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                r0 = r0 ^ 1
                r1 = 0
                if (r0 == 0) goto L_0x0010
                return r1
            L_0x0010:
                java.lang.String r0 = "java.lang.String"
                java.lang.String r2 = "count"
                shark.g r0 = r5.mo123491a(r0, r2)
                if (r0 == 0) goto L_0x0023
                shark.k r0 = r0.f123887c
                if (r0 == 0) goto L_0x0023
                java.lang.Integer r0 = r0.mo123577b()
                goto L_0x0024
            L_0x0023:
                r0 = r1
            L_0x0024:
                if (r0 != 0) goto L_0x0027
                goto L_0x0030
            L_0x0027:
                int r2 = r0.intValue()
                if (r2 != 0) goto L_0x0030
                java.lang.String r0 = ""
                return r0
            L_0x0030:
                java.lang.String r2 = "java.lang.String"
                java.lang.String r3 = "value"
                shark.g r2 = r5.mo123491a(r2, r3)
                if (r2 != 0) goto L_0x003d
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x003d:
                shark.k r2 = r2.f123887c
                shark.i r2 = r2.mo123583h()
                if (r2 != 0) goto L_0x0048
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0048:
                shark.n$b$c r2 = r2.mo123479c()
                boolean r3 = r2 instanceof shark.C48823n.C48825b.C48828c.C48837g.C48840c
                if (r3 == 0) goto L_0x0098
                java.lang.String r3 = "java.lang.String"
                java.lang.String r4 = "offset"
                shark.g r3 = r5.mo123491a(r3, r4)
                if (r3 == 0) goto L_0x0062
                shark.k r3 = r3.f123887c
                if (r3 == 0) goto L_0x0062
                java.lang.Integer r1 = r3.mo123577b()
            L_0x0062:
                if (r0 == 0) goto L_0x008e
                if (r1 == 0) goto L_0x008e
                int r3 = r1.intValue()
                int r4 = r0.intValue()
                int r3 = r3 + r4
                shark.n$b$c$g$c r2 = (shark.C48823n.C48825b.C48828c.C48837g.C48840c) r2
                char[] r4 = r2.f124165a
                int r4 = r4.length
                if (r3 <= r4) goto L_0x007a
                char[] r0 = r2.f124165a
                int r0 = r0.length
                goto L_0x0083
            L_0x007a:
                int r3 = r1.intValue()
                int r0 = r0.intValue()
                int r0 = r0 + r3
            L_0x0083:
                char[] r2 = r2.f124165a
                int r1 = r1.intValue()
                char[] r0 = kotlin.collections.C7519g.m23420a(r2, r1, r0)
                goto L_0x0092
            L_0x008e:
                shark.n$b$c$g$c r2 = (shark.C48823n.C48825b.C48828c.C48837g.C48840c) r2
                char[] r0 = r2.f124165a
            L_0x0092:
                java.lang.String r1 = new java.lang.String
                r1.<init>(r0)
                return r1
            L_0x0098:
                boolean r0 = r2 instanceof shark.C48823n.C48825b.C48828c.C48837g.C48839b
                if (r0 == 0) goto L_0x00b1
                shark.n$b$c$g$b r2 = (shark.C48823n.C48825b.C48828c.C48837g.C48839b) r2
                byte[] r0 = r2.f124162a
                java.lang.String r1 = "UTF-8"
                java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
                java.lang.String r2 = "Charset.forName(\"UTF-8\")"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                java.lang.String r2 = new java.lang.String
                r2.<init>(r0, r1)
                return r2
            L_0x00b1:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "'value' field "
                r1.<init>(r2)
                java.lang.String r2 = "java.lang.String"
                java.lang.String r3 = "value"
                shark.g r2 = r5.mo123491a(r2, r3)
                if (r2 != 0) goto L_0x00c7
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x00c7:
                shark.k r2 = r2.f123887c
                r1.append(r2)
                java.lang.String r2 = " was expected to be either a char or byte array in string instance with id "
                r1.append(r2)
                long r2 = r5.mo123478b()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: shark.C48747i.C48752c.mo123500k():java.lang.String");
        }

        /* renamed from: a */
        public final boolean mo123493a(String str) {
            C7573i.m23587b(str, "className");
            Iterator a = mo123497h().mo123487j().mo19416a();
            while (a.hasNext()) {
                if (C7573i.m23585a((Object) ((C48749b) a.next()).mo123482e(), (Object) str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final C48745g mo123491a(String str, String str2) {
            C7573i.m23587b(str, "declaringClassName");
            C7573i.m23587b(str2, "fieldName");
            return m150528b(str, str2);
        }

        /* renamed from: b */
        private C48745g m150529b(C7584c<? extends Object> cVar, String str) {
            C7573i.m23587b(cVar, "declaringClass");
            C7573i.m23587b(str, "fieldName");
            String name = C7560a.m23571a(cVar).getName();
            C7573i.m23582a((Object) name, "declaringClass.java.name");
            return m150528b(name, str);
        }

        /* renamed from: a */
        public final C48745g mo123492a(C7584c<? extends Object> cVar, String str) {
            C7573i.m23587b(cVar, "declaringClass");
            C7573i.m23587b(str, "fieldName");
            return m150529b(cVar, str);
        }

        /* renamed from: b */
        private C48745g m150528b(String str, String str2) {
            Object obj;
            boolean z;
            C7573i.m23587b(str, "declaringClassName");
            C7573i.m23587b(str2, "fieldName");
            Iterator a = mo123499j().mo19416a();
            while (true) {
                if (!a.hasNext()) {
                    obj = null;
                    break;
                }
                obj = a.next();
                C48745g gVar = (C48745g) obj;
                if (!C7573i.m23585a((Object) gVar.f123885a.mo123482e(), (Object) str) || !C7573i.m23585a((Object) gVar.f123886b, (Object) str2)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            return (C48745g) obj;
        }

        public C48752c(C48813l lVar, C48781b bVar, long j, boolean z) {
            C7573i.m23587b(lVar, "hprofGraph");
            C7573i.m23587b(bVar, "indexedObject");
            super(null);
            this.f123895c = lVar;
            this.f123896d = bVar;
            this.f123898f = j;
            this.f123897e = z;
        }
    }

    /* renamed from: shark.i$d */
    public static final class C48756d extends C48747i {

        /* renamed from: b */
        public final C48813l f123905b;

        /* renamed from: c */
        public final boolean f123906c;

        /* renamed from: d */
        private final C48782c f123907d;

        /* renamed from: e */
        private final long f123908e;

        /* renamed from: b */
        public final long mo123478b() {
            return this.f123908e;
        }

        /* renamed from: a */
        public final C48746h mo123477a() {
            return this.f123905b;
        }

        /* renamed from: e */
        public final String mo123502e() {
            return this.f123905b.mo123593c(this.f123907d.f124005a);
        }

        /* renamed from: f */
        public final int mo123503f() {
            return mo123479c().f124154d.length * this.f123905b.mo123469a();
        }

        /* renamed from: g */
        public final C48835e mo123479c() {
            return this.f123905b.mo123591a(mo123478b(), this.f123907d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("object array @");
            sb.append(mo123478b());
            sb.append(" of ");
            sb.append(mo123502e());
            return sb.toString();
        }

        public C48756d(C48813l lVar, C48782c cVar, long j, boolean z) {
            C7573i.m23587b(lVar, "hprofGraph");
            C7573i.m23587b(cVar, "indexedObject");
            super(null);
            this.f123905b = lVar;
            this.f123907d = cVar;
            this.f123908e = j;
            this.f123906c = z;
        }
    }

    /* renamed from: shark.i$e */
    public static final class C48757e extends C48747i {

        /* renamed from: b */
        private final C48813l f123909b;

        /* renamed from: c */
        private final C48783d f123910c;

        /* renamed from: d */
        private final long f123911d;

        /* renamed from: b */
        public final long mo123478b() {
            return this.f123911d;
        }

        /* renamed from: g */
        private PrimitiveType m150552g() {
            return this.f123910c.mo123552b();
        }

        /* renamed from: a */
        public final C48746h mo123477a() {
            return this.f123909b;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public C48837g mo123479c() {
            return this.f123909b.mo123592a(mo123478b(), this.f123910c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("primitive array @");
            sb.append(mo123478b());
            sb.append(" of ");
            sb.append(mo123507f());
            return sb.toString();
        }

        /* renamed from: f */
        public final String mo123507f() {
            switch (C48811j.f124081a[m150552g().ordinal()]) {
                case 1:
                    return "boolean[]";
                case 2:
                    return "char[]";
                case 3:
                    return "float[]";
                case 4:
                    return "double[]";
                case 5:
                    return "byte[]";
                case 6:
                    return "short[]";
                case 7:
                    return "int[]";
                case 8:
                    return "long[]";
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }

        /* renamed from: e */
        public final int mo123506e() {
            C48837g h = mo123479c();
            if (h instanceof C48838a) {
                return ((C48838a) h).f124159a.length * PrimitiveType.BOOLEAN.getByteSize();
            }
            if (h instanceof C48840c) {
                return ((C48840c) h).f124165a.length * PrimitiveType.CHAR.getByteSize();
            }
            if (h instanceof C48842e) {
                return ((C48842e) h).f124171a.length * PrimitiveType.FLOAT.getByteSize();
            }
            if (h instanceof C48841d) {
                return ((C48841d) h).f124168a.length * PrimitiveType.DOUBLE.getByteSize();
            }
            if (h instanceof C48839b) {
                return ((C48839b) h).f124162a.length * PrimitiveType.BYTE.getByteSize();
            }
            if (h instanceof C48845h) {
                return ((C48845h) h).f124180a.length * PrimitiveType.SHORT.getByteSize();
            }
            if (h instanceof C48843f) {
                return ((C48843f) h).f124174a.length * PrimitiveType.INT.getByteSize();
            }
            if (h instanceof C48844g) {
                return ((C48844g) h).f124177a.length * PrimitiveType.LONG.getByteSize();
            }
            throw new NoWhenBranchMatchedException();
        }

        public C48757e(C48813l lVar, C48783d dVar, long j) {
            C7573i.m23587b(lVar, "hprofGraph");
            C7573i.m23587b(dVar, "indexedObject");
            super(null);
            this.f123909b = lVar;
            this.f123910c = dVar;
            this.f123911d = j;
        }
    }

    private C48747i() {
    }

    /* renamed from: a */
    public abstract C48746h mo123477a();

    /* renamed from: b */
    public abstract long mo123478b();

    /* renamed from: c */
    public abstract C48828c mo123479c();

    /* renamed from: d */
    public final C48752c mo123480d() {
        if (this instanceof C48752c) {
            return (C48752c) this;
        }
        return null;
    }

    public /* synthetic */ C48747i(C7571f fVar) {
        this();
    }
}
