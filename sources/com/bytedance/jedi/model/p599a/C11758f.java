package com.bytedance.jedi.model.p599a;

import com.bytedance.jedi.model.p601c.C11778a;
import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p601c.C11786e;
import com.bytedance.jedi.model.p601c.C11788f;
import com.bytedance.jedi.model.p605g.C11847a;
import com.bytedance.jedi.model.p605g.C11848b;
import com.bytedance.jedi.model.p605g.C11849c;
import com.bytedance.jedi.model.p605g.C11850d;
import com.bytedance.jedi.model.p605g.C11853f;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.p1865a.p1867b.C47549a;
import p346io.reactivex.p1870h.C47589b;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.bytedance.jedi.model.a.f */
public final class C11758f {

    /* renamed from: com.bytedance.jedi.model.a.f$a */
    public static final class C11759a extends C11778a<K, List<? extends V>> implements C11849c<Pair<? extends K, ? extends List<? extends V>>>, C11850d<Pair<? extends K, ? extends List<? extends V>>> {

        /* renamed from: a */
        final /* synthetic */ C11757e f31549a;

        /* renamed from: b */
        private final /* synthetic */ C11853f f31550b = new C11853f(this.f31549a);

        /* renamed from: com.bytedance.jedi.model.a.f$a$a */
        static final class C11760a<T> implements C7328l<Pair<? extends K, ? extends List<? extends V>>> {

            /* renamed from: a */
            final /* synthetic */ Object f31551a;

            C11760a(Object obj) {
                this.f31551a = obj;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public boolean mo9283a(Pair<? extends K, ? extends List<? extends V>> pair) {
                C7573i.m23587b(pair, "it");
                return C7573i.m23585a(this.f31551a, pair.getFirst());
            }
        }

        /* renamed from: com.bytedance.jedi.model.a.f$a$b */
        static final class C11761b<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            public static final C11761b f31552a = new C11761b();

            C11761b() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                return m34484a((Pair) obj);
            }

            /* renamed from: a */
            private static C11786e<List<V>> m34484a(Pair<? extends K, ? extends List<? extends V>> pair) {
                C7573i.m23587b(pair, "it");
                return C11788f.m34527a(pair.getSecond());
            }
        }

        /* renamed from: com.bytedance.jedi.model.a.f$a$c */
        static final class C11762c<T> implements C7328l<C11848b<Pair<? extends K, ? extends List<? extends V>>>> {

            /* renamed from: a */
            final /* synthetic */ C11785d[] f31553a;

            C11762c(C11785d[] dVarArr) {
                this.f31553a = dVarArr;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public boolean mo9283a(C11848b<Pair<K, List<V>>> bVar) {
                boolean z;
                C7573i.m23587b(bVar, "traceable");
                C11785d[] dVarArr = this.f31553a;
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

        /* renamed from: com.bytedance.jedi.model.a.f$a$d */
        static final class C11763d<T, R> implements C7327h<T, R> {

            /* renamed from: a */
            public static final C11763d f31554a = new C11763d();

            C11763d() {
            }

            public final /* synthetic */ Object apply(Object obj) {
                return m34487a((C11848b) obj);
            }

            /* renamed from: a */
            private static Pair<K, List<V>> m34487a(C11848b<Pair<K, List<V>>> bVar) {
                C7573i.m23587b(bVar, "it");
                return (Pair) bVar.mo29376a();
            }
        }

        /* renamed from: b */
        public final C7492s<C11848b<Pair<K, List<V>>>> mo29345b() {
            return this.f31550b.mo29345b();
        }

        /* renamed from: b */
        public final void mo29346b(C11848b<Pair<K, List<V>>> bVar) {
            C7573i.m23587b(bVar, "traceable");
            this.f31550b.mo29346b(bVar);
        }

        /* renamed from: a */
        public final C7492s<List<Pair<K, List<V>>>> mo29340a() {
            return this.f31549a.mo29330a();
        }

        /* renamed from: a */
        public final C7492s<C11786e<List<V>>> mo29341a(K k) {
            return this.f31549a.mo29331a(k);
        }

        /* renamed from: a */
        public final void mo29344a(C11848b<Pair<K, List<V>>> bVar) {
            C7573i.m23587b(bVar, "traceable");
            C11847a aVar = this.f31549a;
            C11764g.f31555a.mo29347a(aVar);
            try {
                Map map = (Map) C11765h.f31557a.get(aVar);
                if (map == null) {
                    map = new LinkedHashMap();
                    C11765h.f31557a.put(aVar, map);
                }
                C11765h.m34491a(map).put(((Pair) bVar.mo29376a()).getFirst(), bVar);
                this.f31549a.mo29332a(((Pair) bVar.mo29376a()).getFirst(), (List) ((Pair) bVar.mo29376a()).getSecond());
                Map map2 = (Map) C11765h.f31557a.get(aVar);
                if (map2 != null) {
                    Map a = C11765h.m34491a(map2);
                    if (a != null) {
                        a.put(((Pair) bVar.mo29376a()).getFirst(), null);
                    }
                }
            } finally {
                C11764g.f31555a.mo29348b(aVar);
            }
        }

        C11759a(C11757e<K, V> eVar, C11847a aVar) {
            this.f31549a = eVar;
            super(aVar);
        }

        /* renamed from: a */
        public final C7492s<C11786e<List<V>>> mo29342a(K k, C11785d<?, ?>... dVarArr) {
            C7573i.m23587b(dVarArr, "exclude");
            C7492s i = mo29343a(false, (C11785d<?, ?>[]) (C11785d[]) Arrays.copyOf(dVarArr, dVarArr.length)).mo19330i();
            C7573i.m23582a((Object) i, "observeAll(false, *exclude).share()");
            C7492s<C11786e<List<V>>> d = C47589b.m148385a(i).mo19291a((C7328l<? super T>) new C11760a<Object>(k)).mo19317d((C7327h<? super T, ? extends R>) C11761b.f31552a);
            C7573i.m23582a((Object) d, "observeAll(false, *exclu… { it.second.optional() }");
            return d;
        }

        /* renamed from: a */
        public final C7492s<List<Pair<K, List<V>>>> mo29343a(boolean z, C11785d<?, ?>... dVarArr) {
            C7573i.m23587b(dVarArr, "exclude");
            C7492s d = mo29345b().mo19291a((C7328l<? super T>) new C11762c<Object>(dVarArr)).mo19317d((C7327h<? super T, ? extends R>) C11763d.f31554a);
            C7573i.m23582a((Object) d, "observeTraceable()\n     …    .map { it.payload() }");
            C7492s<List<Pair<K, List<V>>>> a = m34507a(d, z).mo19294a(C47549a.m148327a());
            C7573i.m23582a((Object) a, "observeTraceable()\n     …dSchedulers.mainThread())");
            return a;
        }
    }

    /* renamed from: a */
    public static final <K, V> C11785d<K, List<V>> m34474a(C11757e<K, V> eVar) {
        C7573i.m23587b(eVar, "$this$createDataSource");
        return new C11759a<>(eVar, eVar);
    }
}
