package com.bytedance.jedi.model.p600b;

import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p601c.C11786e;
import com.bytedance.jedi.model.p602d.C11789a;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import p346io.reactivex.C7492s;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.bytedance.jedi.model.b.a */
public final class C11766a<K, V, REQ, RESP, K1, V1> {

    /* renamed from: d */
    public static final C11767a f31558d = new C11767a(null);

    /* renamed from: a */
    public C11789a<K, V, REQ, RESP> f31559a;

    /* renamed from: b */
    public C11785d<K1, V1> f31560b;

    /* renamed from: c */
    public C11768b<K, RESP, K1, V1> f31561c;

    /* renamed from: com.bytedance.jedi.model.b.a$a */
    public static final class C11767a {
        private C11767a() {
        }

        public /* synthetic */ C11767a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static <K, V, REQ, RESP, K1, V1> C11766a<K, V, REQ, RESP, K1, V1> m34495a(C11789a<K, V, REQ, RESP> aVar, C11785d<K1, V1> dVar, C7562b<? super C11768b<K, RESP, K1, V1>, C7581n> bVar) {
            C7573i.m23587b(aVar, "fetcher");
            C7573i.m23587b(dVar, "cache");
            C7573i.m23587b(bVar, "block");
            C11768b bVar2 = new C11768b();
            bVar.invoke(bVar2);
            return new C11766a<>(aVar, dVar, bVar2, null);
        }
    }

    /* renamed from: com.bytedance.jedi.model.b.a$b */
    public static final class C11768b<K, V, K1, V1> {

        /* renamed from: a */
        public C7562b<? super K, ? extends K1> f31562a = C11769a.f31564a;

        /* renamed from: b */
        public C7562b<? super V1, ? extends V> f31563b = C11770b.f31565a;

        /* renamed from: com.bytedance.jedi.model.b.a$b$a */
        static final class C11769a extends Lambda implements C7562b<K, K1> {

            /* renamed from: a */
            public static final C11769a f31564a = new C11769a();

            C11769a() {
                super(1);
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [K1, K] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=K, code=null, for r1v0, types: [K1, K] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final K1 invoke(K r1) {
                /*
                    r0 = this;
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.p600b.C11766a.C11768b.C11769a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: com.bytedance.jedi.model.b.a$b$b */
        static final class C11770b extends Lambda implements C7562b<V1, V> {

            /* renamed from: a */
            public static final C11770b f31565a = new C11770b();

            C11770b() {
                super(1);
            }

            /* JADX WARNING: type inference failed for: r1v0, types: [V, V1] */
            /* JADX WARNING: Incorrect type for immutable var: ssa=V1, code=null, for r1v0, types: [V, V1] */
            /* JADX WARNING: Unknown variable types count: 1 */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final V invoke(V1 r1) {
                /*
                    r0 = this;
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.p600b.C11766a.C11768b.C11770b.invoke(java.lang.Object):java.lang.Object");
            }
        }
    }

    /* renamed from: com.bytedance.jedi.model.b.a$c */
    public static final class C11771c extends C11789a<K, V, REQ, RESP> {

        /* renamed from: a */
        final /* synthetic */ C11766a f31566a;

        /* renamed from: b */
        final /* synthetic */ C7563m f31567b;

        /* renamed from: com.bytedance.jedi.model.b.a$c$a */
        static final class C11772a<T> implements C7328l<C11786e<? extends V1>> {

            /* renamed from: a */
            public static final C11772a f31568a = new C11772a();

            C11772a() {
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
                return m34499a((C11786e) obj);
            }

            /* renamed from: a */
            private static boolean m34499a(C11786e<? extends V1> eVar) {
                C7573i.m23587b(eVar, "it");
                if (eVar.mo29356a() != null) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.bytedance.jedi.model.b.a$c$b */
        static final class C11773b<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            final /* synthetic */ C11771c f31569a;

            C11773b(C11771c cVar) {
                this.f31569a = cVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public RESP apply(C11786e<? extends V1> eVar) {
                C7573i.m23587b(eVar, "it");
                C7562b<? super V1, ? extends V> bVar = this.f31569a.f31566a.f31561c.f31563b;
                Object a = eVar.mo29356a();
                if (a == null) {
                    C7573i.m23580a();
                }
                return bVar.invoke(a);
            }
        }

        /* renamed from: b */
        public final K mo29352b(REQ req) {
            return this.f31566a.f31559a.mo29352b(req);
        }

        /* renamed from: a */
        public final C7492s<RESP> mo29350a(REQ req) {
            C7563m mVar = this.f31567b;
            C7492s c = this.f31566a.f31559a.mo29357c(req);
            C7492s d = this.f31566a.f31560b.mo29341a(this.f31566a.f31561c.f31562a.invoke(this.f31566a.f31559a.mo29352b(req))).mo19291a((C7328l<? super T>) C11772a.f31568a).mo19317d((C7327h<? super T, ? extends R>) new C11773b<Object,Object>(this));
            C7573i.m23582a((Object) d, "_cache.request(_mapper._…map.invoke(it.some()!!) }");
            return (C7492s) mVar.invoke(c, d);
        }

        C11771c(C11766a aVar, C7563m mVar) {
            this.f31566a = aVar;
            this.f31567b = mVar;
        }

        /* renamed from: a */
        public final V mo29351a(REQ req, RESP resp) {
            return this.f31566a.f31559a.mo29351a(req, resp);
        }
    }

    /* renamed from: a */
    public final C11789a<K, V, REQ, RESP> mo29349a(C7563m<? super C7492s<RESP>, ? super C7492s<RESP>, ? extends C7492s<RESP>> mVar) {
        C7573i.m23587b(mVar, "strategy");
        return new C11771c<>(this, mVar);
    }

    private C11766a(C11789a<K, V, REQ, RESP> aVar, C11785d<K1, V1> dVar, C11768b<K, RESP, K1, V1> bVar) {
        this.f31559a = aVar;
        this.f31560b = dVar;
        this.f31561c = bVar;
    }

    public /* synthetic */ C11766a(C11789a aVar, C11785d dVar, C11768b bVar, C7571f fVar) {
        this(aVar, dVar, bVar);
    }
}
