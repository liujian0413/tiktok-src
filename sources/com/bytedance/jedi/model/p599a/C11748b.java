package com.bytedance.jedi.model.p599a;

import com.bytedance.jedi.model.p601c.C11786e;
import com.bytedance.jedi.model.p601c.C11788f;
import java.util.Comparator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1877a.C47886a;
import p346io.reactivex.C7492s;

/* renamed from: com.bytedance.jedi.model.a.b */
public abstract class C11748b<K, V> implements C11757e<K, V> {

    /* renamed from: com.bytedance.jedi.model.a.b$a */
    public static final class C11749a<T> implements Comparator<T> {

        /* renamed from: a */
        final /* synthetic */ C7562b f31542a;

        public C11749a(C7562b bVar) {
            this.f31542a = bVar;
        }

        public final int compare(T t, T t2) {
            return C47886a.m148819a((Comparable) this.f31542a.invoke(t), (Comparable) this.f31542a.invoke(t2));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract List<V> mo29333b(K k);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo29335b(K k, List<? extends V> list);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract List<Pair<K, List<V>>> mo29336c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo29337d();

    /* renamed from: e */
    public C7562b<V, Comparable<?>> mo29338e() {
        return null;
    }

    /* renamed from: b */
    public final void mo29334b() {
        mo29337d();
    }

    /* renamed from: a */
    public final C7492s<List<Pair<K, List<V>>>> mo29330a() {
        C7492s<List<Pair<K, List<V>>>> b = C7492s.m23301b(mo29336c());
        C7573i.m23582a((Object) b, "Observable.just(getAllActual())");
        return b;
    }

    /* renamed from: a */
    public final C7492s<C11786e<List<V>>> mo29331a(K k) {
        C7492s<C11786e<List<V>>> b = C7492s.m23301b(C11788f.m34527a(mo29333b(k)));
        C7573i.m23582a((Object) b, "Observable.just(getActual(k).optional())");
        return b;
    }

    /* renamed from: a */
    public final void mo29332a(K k, List<? extends V> list) {
        List<? extends V> list2;
        C11748b bVar = this;
        C7562b e = bVar.mo29338e();
        if (e != null) {
            if (list != null) {
                list2 = C7525m.m23494a((Iterable<? extends T>) list, (Comparator<? super T>) new C11749a<Object>(e));
            } else {
                list2 = null;
            }
            if (list2 != null) {
                list = list2;
            }
        }
        bVar.mo29335b(k, list);
        C11765h.m34493a((C11757e<K, V>) bVar, k, list);
    }
}
