package com.bytedance.jedi.model.p604f;

import com.bytedance.jedi.model.p601c.C11785d;
import com.bytedance.jedi.model.p601c.C11786e;
import com.bytedance.jedi.model.p603e.C11801a;
import com.bytedance.jedi.model.p603e.C11801a.C11802a;
import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import com.bytedance.jedi.model.p605g.C11848b;
import com.bytedance.jedi.model.p605g.C11850d;
import com.bytedance.jedi.model.p605g.C11851e.C11852a;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.C7579l;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C48016b;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7585d;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7497x;
import p346io.reactivex.p1870h.C47589b;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.bytedance.jedi.model.f.e */
public final class C11823e<K, V, K1, V1> {

    /* renamed from: c */
    public static final C11829b f31618c = new C11829b(null);

    /* renamed from: a */
    public final C11785d<K1, V1> f31619a;

    /* renamed from: b */
    public final C11801a<K, V, K1, V1> f31620b;

    /* renamed from: d */
    private final C11785d<K, V> f31621d;

    /* renamed from: com.bytedance.jedi.model.f.e$a */
    static final class C11824a<V, K1, V1> implements C7497x<V, Pair<? extends K1, ? extends V1>> {

        /* renamed from: a */
        public final C11785d<K1, V1> f31622a;

        /* renamed from: b */
        public final C11801a<?, V, K1, V1> f31623b;

        /* renamed from: com.bytedance.jedi.model.f.e$a$a */
        static final class C11825a<T, R> implements C7327h<T, Iterable<? extends U>> {

            /* renamed from: a */
            final /* synthetic */ C11824a f31624a;

            C11825a(C11824a aVar) {
                this.f31624a = aVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public List<Pair<K1, V1>> apply(V v) {
                return (List) ((C11802a) this.f31624a.f31623b).f31594b.invoke(v);
            }
        }

        /* renamed from: com.bytedance.jedi.model.f.e$a$b */
        static final class C11826b<T, R> implements C7327h<T, C7496w<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ C11824a f31625a;

            C11826b(C11824a aVar) {
                this.f31625a = aVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7492s<Pair<K1, V1>> apply(Pair<? extends K1, ? extends V1> pair) {
                C7573i.m23587b(pair, "<name for destructuring parameter 0>");
                final Object component1 = pair.component1();
                final Object component2 = pair.component2();
                return this.f31625a.f31622a.mo29341a(component1).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                    /* renamed from: a */
                    final /* synthetic */ C11826b f31626a;

                    {
                        this.f31626a = r1;
                    }

                    /* access modifiers changed from: private */
                    /* renamed from: a */
                    public Pair<K1, V1> apply(C11786e<? extends V1> eVar) {
                        C7573i.m23587b(eVar, "cur");
                        Object a = eVar.mo29356a();
                        Object invoke = ((C11802a) this.f31626a.f31625a.f31623b).f31595c.invoke(component2, a);
                        if (!(!C7573i.m23585a(invoke, a))) {
                            invoke = null;
                        }
                        return C7579l.m23633a(component1, invoke);
                    }
                }).mo19291a((C7328l<? super T>) C118282.f31629a);
            }
        }

        /* renamed from: a */
        public final C7496w<Pair<K1, V1>> mo10161a(C7492s<V> sVar) {
            C7573i.m23587b(sVar, "upstream");
            if (this.f31623b instanceof C11802a) {
                C7492s a = sVar.mo19300b((C7327h<? super T, ? extends Iterable<? extends U>>) new C11825a<Object,Object>(this)).mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) new C11826b<Object,Object>(this));
                C7573i.m23582a((Object) a, "upstream.flatMapIterable…                        }");
                return a;
            }
            throw new RuntimeException();
        }

        public C11824a(C11785d<K1, V1> dVar, C11801a<?, V, K1, V1> aVar) {
            C7573i.m23587b(dVar, "to");
            C7573i.m23587b(aVar, "mergeStrategy");
            this.f31622a = dVar;
            this.f31623b = aVar;
        }
    }

    /* renamed from: com.bytedance.jedi.model.f.e$b */
    public static final class C11829b {
        private C11829b() {
        }

        public /* synthetic */ C11829b(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final <T> boolean mo29374a(T t, T t2) {
            Object obj;
            Object obj2;
            Object obj3;
            if (t != t2) {
                Boolean bool = null;
                if (C7519g.m23444c((T[]) new Object[]{t, t2}).size() == 2) {
                    obj = Boolean.valueOf(t instanceof C11820b);
                } else {
                    obj = null;
                }
                if (!C7573i.m23585a(obj, (Object) Boolean.valueOf(true))) {
                    if (C7519g.m23444c((T[]) new Object[]{t, t2}).size() == 2) {
                        obj2 = Boolean.valueOf(t instanceof List);
                    } else {
                        obj2 = null;
                    }
                    if (!C7573i.m23585a(obj2, (Object) Boolean.valueOf(true))) {
                        if (C7519g.m23444c((T[]) new Object[]{t, t2}).size() == 2) {
                            obj3 = Boolean.valueOf(t instanceof Object[]);
                        } else {
                            obj3 = null;
                        }
                        if (!C7573i.m23585a(obj3, (Object) Boolean.valueOf(true))) {
                            if (C7519g.m23444c((T[]) new Object[]{t, t2}).size() == 2) {
                                bool = Boolean.valueOf(t instanceof Map);
                            }
                            if (!C7573i.m23585a((Object) bool, (Object) Boolean.valueOf(true))) {
                                return C7573i.m23585a((Object) t2, (Object) t);
                            }
                            if (t != null) {
                                Map map = (Map) t;
                                if (t2 != null) {
                                    Map map2 = (Map) t2;
                                    if (map.size() != map2.size()) {
                                        return false;
                                    }
                                    Iterable entrySet = map.entrySet();
                                    if (!(entrySet instanceof Collection) || !((Collection) entrySet).isEmpty()) {
                                        Iterator it = entrySet.iterator();
                                        if (it.hasNext()) {
                                            Entry entry = (Entry) it.next();
                                            Object key = entry.getKey();
                                            Object value = entry.getValue();
                                            if (map2 == null) {
                                                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                                            } else if (!map2.containsKey(key)) {
                                                return false;
                                            } else {
                                                if (!C11823e.f31618c.mo29374a(value, map2.get(key))) {
                                                    return false;
                                                }
                                                return true;
                                            }
                                        }
                                    }
                                    return true;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                        } else if (t != null) {
                            Object[] objArr = (Object[]) t;
                            if (t2 != null) {
                                Object[] objArr2 = (Object[]) t2;
                                if (objArr.length != objArr2.length) {
                                    return false;
                                }
                                Iterator a = C48016b.m148956a(objArr);
                                Iterator a2 = C48016b.m148956a(objArr2);
                                while (a.hasNext() && a2.hasNext()) {
                                    if (!C11823e.f31618c.mo29374a(a.next(), a2.next())) {
                                        return false;
                                    }
                                }
                                return true;
                            }
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<*>");
                        }
                    } else if (t != null) {
                        List list = (List) t;
                        if (t2 != null) {
                            List list2 = (List) t2;
                            if (list.size() != list2.size()) {
                                return false;
                            }
                            ListIterator listIterator = list.listIterator();
                            ListIterator listIterator2 = list2.listIterator();
                            while (listIterator.hasNext() && listIterator2.hasNext()) {
                                if (!C11823e.f31618c.mo29374a(listIterator.next(), listIterator2.next())) {
                                    return false;
                                }
                            }
                            return true;
                        }
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                } else if (t != null) {
                    C11820b bVar = (C11820b) t;
                    if (t2 == null) {
                        C7573i.m23580a();
                    }
                    return bVar.mo29372a(t2);
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.bytedance.jedi.model.sync.ISyncComparable<T>");
                }
            } else if ((t instanceof Collection) || (t instanceof Map) || (t instanceof Object[])) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: com.bytedance.jedi.model.f.e$c */
    static final class C11830c<K, V, K1, V1> implements C7497x<Pair<? extends K, ? extends V>, Pair<? extends K1, ? extends V1>> {

        /* renamed from: a */
        public final C11785d<K1, V1> f31630a;

        /* renamed from: b */
        public final C11801a<K, V, K1, V1> f31631b;

        /* renamed from: com.bytedance.jedi.model.f.e$c$a */
        static final class C11831a<T, R> implements C7327h<T, C7496w<? extends R>> {

            /* renamed from: a */
            final /* synthetic */ C11830c f31632a;

            C11831a(C11830c cVar) {
                this.f31632a = cVar;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C7492s<Pair<K1, V1>> apply(Pair<? extends K, ? extends V> pair) {
                C7573i.m23587b(pair, "<name for destructuring parameter 0>");
                final Object component1 = pair.component1();
                final Object component2 = pair.component2();
                C11801a<K, V, K1, V1> aVar = this.f31632a.f31631b;
                if (aVar instanceof C11808c) {
                    return C7492s.m23301b(((C11808c) this.f31632a.f31631b).f31600b.invoke(component1, component2)).mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) new C7327h<T, C7496w<? extends R>>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C11831a f31633a;

                        {
                            this.f31633a = r1;
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public C7492s<Pair<K1, V1>> apply(final K1 k1) {
                            return this.f31633a.f31632a.f31630a.mo29341a(k1).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>() {
                                /* access modifiers changed from: private */
                                /* renamed from: a */
                                public Pair<K1, V1> apply(C11786e<? extends V1> eVar) {
                                    C7573i.m23587b(eVar, "it");
                                    return C7579l.m23633a(k1, eVar.mo29356a());
                                }
                            });
                        }
                    }).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C11831a f31635a;

                        {
                            this.f31635a = r1;
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Pair<K1, V1> apply(Pair<? extends K1, ? extends V1> pair) {
                            C7573i.m23587b(pair, "<name for destructuring parameter 0>");
                            Object component1 = pair.component1();
                            Object component2 = pair.component2();
                            Object invoke = ((C11808c) this.f31635a.f31632a.f31631b).f31601c.invoke(component1, component2, component2);
                            if (C11823e.f31618c.mo29374a(invoke, component2)) {
                                invoke = null;
                            }
                            return C7579l.m23633a(component1, invoke);
                        }
                    });
                }
                if (aVar instanceof C11811d) {
                    return C47589b.m148385a(this.f31632a.f31630a.mo29340a()).mo19291a((C7328l<? super T>) new C7328l<Pair<? extends K1, ? extends V1>>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C11831a f31638a;

                        {
                            this.f31638a = r1;
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public boolean mo9283a(Pair<? extends K1, ? extends V1> pair) {
                            Boolean bool;
                            C7573i.m23587b(pair, "<name for destructuring parameter 0>");
                            Object component2 = pair.component2();
                            if (C7519g.m23444c((T[]) new Object[]{component2, component2}).size() == 2) {
                                C7563m<? super V, ? super V1, Boolean> mVar = ((C11811d) this.f31638a.f31632a.f31631b).f31604b;
                                Object obj = component2;
                                if (obj == null) {
                                    C7573i.m23580a();
                                }
                                if (component2 == null) {
                                    C7573i.m23580a();
                                }
                                bool = Boolean.valueOf(((Boolean) mVar.invoke(obj, component2)).booleanValue());
                            } else {
                                bool = null;
                            }
                            if (bool != null) {
                                return bool.booleanValue();
                            }
                            return false;
                        }
                    }).mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>(this) {

                        /* renamed from: a */
                        final /* synthetic */ C11831a f31640a;

                        {
                            this.f31640a = r1;
                        }

                        /* access modifiers changed from: private */
                        /* renamed from: a */
                        public Pair<K1, V1> apply(Pair<? extends K1, ? extends V1> pair) {
                            C7573i.m23587b(pair, "<name for destructuring parameter 0>");
                            Object component1 = pair.component1();
                            Object component2 = pair.component2();
                            C7563m<? super V, ? super V1, ? extends V1> mVar = ((C11811d) this.f31640a.f31632a.f31631b).f31605c;
                            Object obj = component2;
                            if (obj == null) {
                                C7573i.m23580a();
                            }
                            if (component2 == null) {
                                C7573i.m23580a();
                            }
                            Object invoke = mVar.invoke(obj, component2);
                            if (C11823e.f31618c.mo29374a(invoke, component2)) {
                                invoke = null;
                            }
                            return C7579l.m23633a(component1, invoke);
                        }
                    });
                }
                throw new RuntimeException();
            }
        }

        /* renamed from: com.bytedance.jedi.model.f.e$c$b */
        static final class C11837b<T> implements C7328l<Pair<? extends K1, ? extends V1>> {

            /* renamed from: a */
            public static final C11837b f31642a = new C11837b();

            C11837b() {
            }

            /* renamed from: a */
            public final /* bridge */ /* synthetic */ boolean mo9283a(Object obj) {
                return m34604a((Pair) obj);
            }

            /* renamed from: a */
            private static boolean m34604a(Pair<? extends K1, ? extends V1> pair) {
                C7573i.m23587b(pair, "it");
                if (pair.getSecond() != null) {
                    return true;
                }
                return false;
            }
        }

        /* renamed from: a */
        public final C7496w<Pair<K1, V1>> mo10161a(C7492s<Pair<K, V>> sVar) {
            C7573i.m23587b(sVar, "upstream");
            C7492s a = sVar.mo19290a((C7327h<? super T, ? extends C7496w<? extends R>>) new C11831a<Object,Object>(this)).mo19291a((C7328l<? super T>) C11837b.f31642a);
            C7573i.m23582a((Object) a, "upstream.flatMap { (newK…ter { it.second != null }");
            return a;
        }

        public C11830c(C11785d<K1, V1> dVar, C11801a<K, V, K1, V1> aVar) {
            C7573i.m23587b(dVar, "to");
            C7573i.m23587b(aVar, "mergeStrategy");
            this.f31630a = dVar;
            this.f31631b = aVar;
        }
    }

    /* renamed from: com.bytedance.jedi.model.f.e$d */
    static final class C11838d<T> implements C7328l<C11848b<Pair<? extends K, ? extends V>>> {

        /* renamed from: a */
        final /* synthetic */ C11823e f31643a;

        C11838d(C11823e eVar) {
            this.f31643a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean mo9283a(C11848b<Pair<K, V>> bVar) {
            C7573i.m23587b(bVar, "it");
            if (!bVar.mo29377a(this.f31643a.f31619a.mo29353c())) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.bytedance.jedi.model.f.e$e */
    static final class C11839e<T, R> implements C7327h<T, C7496w<? extends R>> {

        /* renamed from: a */
        final /* synthetic */ C11823e f31644a;

        C11839e(C11823e eVar) {
            this.f31644a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C7492s<C11848b<Pair<K1, V1>>> apply(final C11848b<Pair<K, V>> bVar) {
            C7492s sVar;
            C7573i.m23587b(bVar, "traceable");
            if (this.f31644a.f31620b instanceof C11802a) {
                sVar = C7492s.m23301b(bVar.mo29376a()).mo19291a((C7328l<? super T>) C118401.f31645a).mo19317d((C7327h<? super T, ? extends R>) C118412.f31646a).mo19293a((C7497x<? super T, ? extends R>) new C11824a<Object,Object>(this.f31644a.f31619a, this.f31644a.f31620b));
            } else {
                sVar = C7492s.m23301b(bVar.mo29376a()).mo19293a((C7497x<? super T, ? extends R>) new C11830c<Object,Object>(this.f31644a.f31619a, this.f31644a.f31620b));
            }
            return sVar.mo19317d((C7327h<? super T, ? extends R>) new C7327h<T, R>() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public C11848b<Pair<K1, V1>> apply(Pair<? extends K1, ? extends V1> pair) {
                    C7573i.m23587b(pair, "it");
                    C11848b bVar = bVar;
                    C7573i.m23582a((Object) bVar, "traceable");
                    return C11852a.m34630a(pair, bVar);
                }
            }).mo19307c((C7326g<? super Throwable>) C118434.f31648a).mo19310c((C7496w<? extends T>) C7492s.m23303c()).mo19302b((C7496w<? extends T>) C7492s.m23303c());
        }
    }

    /* renamed from: com.bytedance.jedi.model.f.e$f */
    static final class C11844f<T> implements C7326g<C11848b<Pair<? extends K1, ? extends V1>>> {

        /* renamed from: a */
        final /* synthetic */ C11823e f31649a;

        C11844f(C11823e eVar) {
            this.f31649a = eVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C11848b<Pair<K1, V1>> bVar) {
            C11785d<K1, V1> dVar = this.f31649a.f31619a;
            if (!(dVar instanceof C11850d)) {
                dVar = null;
            }
            C11850d dVar2 = (C11850d) dVar;
            if (dVar2 != null) {
                C7573i.m23582a((Object) bVar, "it");
                dVar2.mo29344a(bVar);
            }
        }
    }

    /* renamed from: com.bytedance.jedi.model.f.e$g */
    static final /* synthetic */ class C11845g extends FunctionReference implements C7562b<Throwable, C7581n> {

        /* renamed from: a */
        public static final C11845g f31650a = new C11845g();

        C11845g() {
            super(1);
        }

        /* renamed from: a */
        private static void m34615a(Throwable th) {
            C7573i.m23587b(th, "p1");
        }

        public final String getName() {
            return "printStackTrace";
        }

        public final C7585d getOwner() {
            return C7575l.m23595a(Throwable.class);
        }

        public final String getSignature() {
            return "printStackTrace()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            m34615a((Throwable) obj);
            return C7581n.f20898a;
        }
    }

    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r3v1, types: [com.bytedance.jedi.model.f.f] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bytedance.jedi.model.p604f.C11821c mo29373a() {
        /*
            r5 = this;
            com.bytedance.jedi.model.c.d<K, V> r0 = r5.f31621d
            if (r0 == 0) goto L_0x0054
            com.bytedance.jedi.model.g.c r0 = (com.bytedance.jedi.model.p605g.C11849c) r0
            io.reactivex.s r0 = r0.mo29345b()
            com.bytedance.jedi.model.h.i r1 = com.bytedance.jedi.model.p608h.C11952i.f31852b
            io.reactivex.z r1 = r1.mo29566d()
            io.reactivex.s r0 = r0.mo19294a(r1)
            com.bytedance.jedi.model.f.e$d r1 = new com.bytedance.jedi.model.f.e$d
            r1.<init>(r5)
            io.reactivex.d.l r1 = (p346io.reactivex.p348d.C7328l) r1
            io.reactivex.s r0 = r0.mo19291a(r1)
            com.bytedance.jedi.model.f.e$e r1 = new com.bytedance.jedi.model.f.e$e
            r1.<init>(r5)
            io.reactivex.d.h r1 = (p346io.reactivex.p348d.C7327h) r1
            io.reactivex.s r0 = r0.mo19290a(r1)
            com.bytedance.jedi.model.f.e$f r1 = new com.bytedance.jedi.model.f.e$f
            r1.<init>(r5)
            io.reactivex.d.g r1 = (p346io.reactivex.p348d.C7326g) r1
            com.bytedance.jedi.model.f.e$g r2 = com.bytedance.jedi.model.p604f.C11823e.C11845g.f31650a
            kotlin.jvm.a.b r2 = (kotlin.jvm.p357a.C7562b) r2
            if (r2 == 0) goto L_0x003d
            com.bytedance.jedi.model.f.f r3 = new com.bytedance.jedi.model.f.f
            r3.<init>(r2)
            r2 = r3
        L_0x003d:
            io.reactivex.d.g r2 = (p346io.reactivex.p348d.C7326g) r2
            io.reactivex.b.c r0 = r0.mo19280a(r1, r2)
            com.bytedance.jedi.model.f.d r1 = new com.bytedance.jedi.model.f.d
            com.bytedance.jedi.model.c.d<K, V> r2 = r5.f31621d
            com.bytedance.jedi.model.c.d<K1, V1> r3 = r5.f31619a
            java.lang.String r4 = "it"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            r1.<init>(r2, r3, r0)
            com.bytedance.jedi.model.f.c r1 = (com.bytedance.jedi.model.p604f.C11821c) r1
            return r1
        L_0x0054:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.bytedance.jedi.model.traceable.ITraceableObserved<kotlin.Pair<K, V?>>"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.model.p604f.C11823e.mo29373a():com.bytedance.jedi.model.f.c");
    }

    public C11823e(C11785d<K, V> dVar, C11785d<K1, V1> dVar2, C11801a<K, V, K1, V1> aVar) {
        C7573i.m23587b(dVar, "from");
        C7573i.m23587b(dVar2, "to");
        C7573i.m23587b(aVar, "strategy");
        this.f31621d = dVar;
        this.f31619a = dVar2;
        this.f31620b = aVar;
    }
}
