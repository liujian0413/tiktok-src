package com.bytedance.jedi.model.repository;

import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public final class SyncExtensions$syncRemovedItemTo$2 extends Lambda implements C7562b<C11811d<K, V, K1, List<? extends V1>>, C7581n> {
    final /* synthetic */ C7563m $needRemove;

    public SyncExtensions$syncRemovedItemTo$2(C7563m mVar) {
        this.$needRemove = mVar;
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11811d) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11811d<K, V, K1, List<V1>> dVar) {
        C7573i.m23587b(dVar, "$this$predicatedSyncTo");
        dVar.mo29361a(C119871.INSTANCE);
        dVar.mo29362b(new C7563m<V, List<? extends V1>, List<? extends V1>>(this) {
            final /* synthetic */ SyncExtensions$syncRemovedItemTo$2 this$0;

            {
                this.this$0 = r1;
            }

            public final List<V1> invoke(V v, List<? extends V1> list) {
                C7573i.m23587b(list, "curV");
                Iterable iterable = list;
                Collection arrayList = new ArrayList();
                for (Object next : iterable) {
                    if (!((Boolean) this.this$0.$needRemove.invoke(next, v)).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                return (List) arrayList;
            }
        });
    }
}
