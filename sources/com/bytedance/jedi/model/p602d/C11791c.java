package com.bytedance.jedi.model.p602d;

import com.bytedance.jedi.model.p601c.C11778a;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p601c.C11786e;
import com.bytedance.jedi.model.p601c.C11788f;
import com.bytedance.jedi.model.p605g.C11847a;
import com.bytedance.jedi.model.p605g.C11848b;
import com.bytedance.jedi.model.p605g.C11849c;
import com.bytedance.jedi.model.p605g.C11853f;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p1870h.C47589b;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.bytedance.jedi.model.d.c */
public final class C11791c {

    /* renamed from: com.bytedance.jedi.model.d.c$a */
    public static final class C11792a extends C11778a<K, V> implements C11849c<Pair<? extends K, ? extends V>> {

        /* renamed from: a */
        final /* synthetic */ C11790b f31583a;

        /* renamed from: b */
        private final /* synthetic */ C11853f f31584b = new C11853f(this.f31583a);

        /* renamed from: com.bytedance.jedi.model.d.c$a$a */
        static final class C11793a<T> implements C7328l<Pair<? extends K, ? extends V>> {

            /* renamed from: a */
            final /* synthetic */ Object f31585a;

            C11793a(Object obj) {
                this.f31585a = obj;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public boolean mo9283a(Pair<? extends K, ? extends V> pair) {
                C7573i.m23587b(pair, "it");
                return C7573i.m23585a(this.f31585a, pair.getFirst());
            }
        }

        /* renamed from: com.bytedance.jedi.model.d.c$a$b */
        static final class C11794b<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            public static final C11794b f31586a = new C11794b();

            C11794b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                return m34544a((Pair) obj);
            }

            /* renamed from: a */
            private static C11786e<V> m34544a(Pair<? extends K, ? extends V> pair) {
                C7573i.m23587b(pair, "it");
                return C11788f.m34527a(pair.getSecond());
            }
        }

        /* renamed from: com.bytedance.jedi.model.d.c$a$c */
        static final class C11795c<T> implements C7328l<C11848b<Pair<? extends K, ? extends V>>> {

            /* renamed from: a */
            final /* synthetic */ C11785d[] f31587a;

            C11795c(C11785d[] dVarArr) {
                this.f31587a = dVarArr;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public boolean mo9283a(C11848b<Pair<K, V>> bVar) {
                boolean z;
                C7573i.m23587b(bVar, "traceable");
                C11785d[] dVarArr = this.f31587a;
                int length = dVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (bVar.mo29377a(dVarArr[i].mo29353c())) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: com.bytedance.jedi.model.d.c$a$d */
        static final class C11796d<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            public static final C11796d f31588a = new C11796d();

            C11796d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                return m34547a((C11848b) obj);
            }

            /* renamed from: a */
            private static Pair<K, V> m34547a(C11848b<Pair<K, V>> bVar) {
                C7573i.m23587b(bVar, "it");
                return (Pair) bVar.mo29376a();
            }
        }

        /* renamed from: com.bytedance.jedi.model.d.c$a$e */
        static final class C11797e<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            final /* synthetic */ C11792a f31589a;

            /* renamed from: b */
            final /* synthetic */ Object f31590b;

            C11797e(C11792a aVar, Object obj) {
                this.f31589a = aVar;
                this.f31590b = obj;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C11786e<V> apply(RESP resp) {
                return C11788f.m34527a(this.f31589a.f31583a.mo29351a(this.f31590b, resp));
            }
        }

        /* renamed from: b */
        public final C7492s<C11848b<Pair<K, V>>> mo29345b() {
            return this.f31584b.mo29345b();
        }

        /* renamed from: b */
        public final void mo29346b(C11848b<Pair<K, V>> bVar) {
            C7573i.m23587b(bVar, "traceable");
            this.f31584b.mo29346b(bVar);
        }

        /* renamed from: a */
        public final C7492s<List<Pair<K, V>>> mo29340a() {
            C7492s<List<Pair<K, V>>> c = C7492s.m23303c();
            C7573i.m23582a((Object) c, "Observable.empty()");
            return c;
        }

        /* renamed from: a */
        public final C7492s<C11786e<V>> mo29341a(K k) {
            K k2;
            if (!(k instanceof Object)) {
                k2 = null;
            } else {
                k2 = k;
            }
            if (k2 != null) {
                C7492s<C11786e<V>> d = this.f31583a.mo29357c(k2).mo19317d((C7327h<? super T, ? extends R>) new C11797e<Object,Object>(this, k));
                if (d != null) {
                    return d;
                }
            }
            C7492s<C11786e<V>> c = C7492s.m23303c();
            C7573i.m23582a((Object) c, "Observable.empty()");
            return c;
        }

        C11792a(C11790b<K, V, REQ, RESP> bVar, C11847a aVar) {
            this.f31583a = bVar;
            super(aVar);
        }

        /* renamed from: a */
        public final C7492s<C11786e<V>> mo29342a(K k, C11785d<?, ?>... dVarArr) {
            C7573i.m23587b(dVarArr, "exclude");
            C7492s i = mo29343a(false, (C11785d<?, ?>[]) (C11785d[]) Arrays.copyOf(dVarArr, dVarArr.length)).mo19330i();
            C7573i.m23582a((Object) i, "observeAll(false, *exclude).share()");
            C7492s<C11786e<V>> d = C47589b.m148385a(i).mo19291a((C7328l<? super T>) new C11793a<Object>(k)).mo19317d((C7327h<? super T, ? extends R>) C11794b.f31586a);
            C7573i.m23582a((Object) d, "observeAll(false, *exclu… { it.second.optional() }");
            return d;
        }

        /* renamed from: a */
        public final C7492s<List<Pair<K, V>>> mo29343a(boolean z, C11785d<?, ?>... dVarArr) {
            C7573i.m23587b(dVarArr, "exclude");
            C7492s d = mo29345b().mo19291a((C7328l<? super T>) new C11795c<Object>(dVarArr)).mo19317d((C7327h<? super T, ? extends R>) C11796d.f31588a);
            C7573i.m23582a((Object) d, "observeTraceable()\n     …    .map { it.payload() }");
            C7492s<List<Pair<K, V>>> a = m34507a(d, z).mo19294a(C47549a.m148327a());
            C7573i.m23582a((Object) a, "observeTraceable()\n     …dSchedulers.mainThread())");
            return a;
        }
    }

    /* renamed from: a */
    public static final <K, V, REQ, RESP> C11785d<K, V> m34535a(C11790b<K, V, REQ, RESP> bVar) {
        C7573i.m23587b(bVar, "$this$createDataSource");
        return new C11792a<>(bVar, bVar);
    }
}
