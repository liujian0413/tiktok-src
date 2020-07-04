package com.bytedance.jedi.model.ext.cache.guava;

import com.bytedance.jedi.model.p599a.C11748b;
import com.p280ss.android.vesdk.C45323k;
import java.util.List;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.jedi.model.ext.cache.guava.e */
public class C11818e<V> extends C11748b<C7581n, V> {

    /* renamed from: a */
    private List<? extends V> f31613a;

    /* renamed from: d */
    public final void mo29337d() {
        this.f31613a = null;
    }

    /* renamed from: c */
    public final List<Pair<C7581n, List<V>>> mo29336c() {
        List<? extends V> list = this.f31613a;
        if (list != null) {
            List<Pair<C7581n, List<V>>> a = C7525m.m23457a(new Pair(C7581n.f20898a, list));
            if (a != null) {
                return a;
            }
        }
        return C7525m.m23461a();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public List<V> mo29333b(C7581n nVar) {
        C7573i.m23587b(nVar, C45323k.f116730a);
        return this.f31613a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo29335b(C7581n nVar, List<? extends V> list) {
        C7573i.m23587b(nVar, C45323k.f116730a);
        this.f31613a = list;
    }
}
