package com.bytedance.jedi.model.repository;

import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public final class SyncExtensions$syncChangedItemTo$3 extends Lambda implements C7562b<C11808c<K, V, K1, List<? extends V1>>, C7581n> {
    final /* synthetic */ C7563m $needUpdate;
    final /* synthetic */ C7563m $update;
    final /* synthetic */ C7562b $where;

    public SyncExtensions$syncChangedItemTo$3(C7562b bVar, C7563m mVar, C7563m mVar2) {
        this.$where = bVar;
        this.$needUpdate = mVar;
        this.$update = mVar2;
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11808c) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11808c<K, V, K1, List<V1>> cVar) {
        C7573i.m23587b(cVar, "$this$keySyncTo");
        cVar.mo29359a((C7563m<? super K, ? super V, ? extends K1>) new C7563m<K, V, K1>(this) {
            final /* synthetic */ SyncExtensions$syncChangedItemTo$3 this$0;

            {
                this.this$0 = r1;
            }

            public final K1 invoke(K k, V v) {
                return this.this$0.$where.invoke(k);
            }
        });
        cVar.mo29360a((C48006q<? super K, ? super V, ? super V1, ? extends V1>) new C48006q<K, V, List<? extends V1>, List<? extends V1>>(this) {
            final /* synthetic */ SyncExtensions$syncChangedItemTo$3 this$0;

            {
                this.this$0 = r1;
            }

            public final List<V1> invoke(K k, V v, List<? extends V1> list) {
                if (list == null) {
                    return null;
                }
                Iterable iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (Object next : iterable) {
                    if (v != null && ((Boolean) this.this$0.$needUpdate.invoke(next, v)).booleanValue()) {
                        next = this.this$0.$update.invoke(next, v);
                    }
                    arrayList.add(next);
                }
                return (List) arrayList;
            }
        });
    }
}
