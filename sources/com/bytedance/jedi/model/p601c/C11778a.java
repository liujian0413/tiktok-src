package com.bytedance.jedi.model.p601c;

import com.bytedance.jedi.model.p605g.C11847a;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p349e.C47574b;
import p346io.reactivex.p354j.C7486b;
import p346io.reactivex.p354j.C7489f;

/* renamed from: com.bytedance.jedi.model.c.a */
public abstract class C11778a<K, V> implements C11785d<K, V> {

    /* renamed from: a */
    private final C11847a<Pair<K, V>> f31573a;

    /* renamed from: com.bytedance.jedi.model.c.a$a */
    static final class C11779a<T, R> implements C7327h<T, K> {

        /* renamed from: a */
        public static final C11779a f31574a = new C11779a();

        C11779a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m34509a((Pair) obj);
        }

        /* renamed from: a */
        private static K m34509a(Pair<? extends K, ? extends V> pair) {
            C7573i.m23587b(pair, "it");
            return pair.getFirst();
        }
    }

    /* renamed from: com.bytedance.jedi.model.c.a$b */
    static final class C11780b<T, R> implements C7327h<T, C7496w<? extends R>> {

        /* renamed from: a */
        public static final C11780b f31575a = new C11780b();

        C11780b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m34510a((C47574b) obj);
        }

        /* renamed from: a */
        private static C7492s<Pair<K, V>> m34510a(C47574b<K, Pair<K, V>> bVar) {
            C7573i.m23587b(bVar, "it");
            return bVar.mo19326f(100, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: com.bytedance.jedi.model.c.a$c */
    static final class C11781c<T> implements C7328l<List<Pair<? extends K, ? extends V>>> {

        /* renamed from: a */
        public static final C11781c f31576a = new C11781c();

        C11781c() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
            return m34511a((List) obj);
        }

        /* renamed from: a */
        private static boolean m34511a(List<Pair<K, V>> list) {
            C7573i.m23587b(list, "it");
            if (list.size() > 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.jedi.model.c.a$d */
    static final class C11782d<T, R> implements C7327h<T, R> {

        /* renamed from: a */
        public static final C11782d f31577a = new C11782d();

        C11782d() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            return m34513a((Pair) obj);
        }

        /* renamed from: a */
        private static List<Pair<K, V>> m34513a(Pair<? extends K, ? extends V> pair) {
            C7573i.m23587b(pair, "it");
            return C7525m.m23457a(pair);
        }
    }

    /* renamed from: c */
    public final C11847a<Pair<K, V>> mo29353c() {
        return this.f31573a;
    }

    public C11778a(C11847a<Pair<K, V>> aVar) {
        C7573i.m23587b(aVar, "point");
        this.f31573a = aVar;
    }

    /* renamed from: a */
    protected static C7492s<List<Pair<K, V>>> m34507a(C7492s<Pair<K, V>> sVar, boolean z) {
        C7573i.m23587b(sVar, "$this$batchEmit");
        if (z) {
            C7489f n = C7486b.m23223a().mo19260n();
            sVar.mo19308c((C7327h<? super T, ? extends K>) C11779a.f31574a).mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) C11780b.f31575a).mo19312c(n);
            C7492s<List<Pair<K, V>>> a = n.mo19306c(100, TimeUnit.MILLISECONDS).mo19291a((C7328l<? super T>) C11781c.f31576a);
            C7573i.m23582a((Object) a, "PublishSubject.create<Pa…S).filter { it.size > 0 }");
            return a;
        }
        C7492s<List<Pair<K, V>>> d = sVar.mo19317d((C7327h<? super T, ? extends R>) C11782d.f31577a);
        C7573i.m23582a((Object) d, "map { listOf(it) }");
        return d;
    }
}
