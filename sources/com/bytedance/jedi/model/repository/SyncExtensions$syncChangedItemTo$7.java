package com.bytedance.jedi.model.repository;

import com.bytedance.jedi.model.p603e.C11801a.C11811d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public final class SyncExtensions$syncChangedItemTo$7 extends Lambda implements C7562b<C11811d<? extends Object, V, ? extends Object, List<? extends V1>>, C7581n> {
    final /* synthetic */ C7563m $needUpdate;
    final /* synthetic */ C7563m $update;

    public SyncExtensions$syncChangedItemTo$7(C7563m mVar, C7563m mVar2) {
        this.$needUpdate = mVar;
        this.$update = mVar2;
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11811d) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11811d<? extends Object, V, ? extends Object, List<V1>> dVar) {
        C7573i.m23587b(dVar, "$this$predicatedSyncTo");
        dVar.mo29361a(C119831.INSTANCE);
        dVar.mo29362b(new C7563m<V, List<? extends V1>, List<? extends V1>>(this) {
            final /* synthetic */ SyncExtensions$syncChangedItemTo$7 this$0;

            {
                this.this$0 = r1;
            }

            public final List<V1> invoke(V v, List<? extends V1> list) {
                C7573i.m23587b(list, "curV");
                Iterable iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (Object next : iterable) {
                    if (((Boolean) this.this$0.$needUpdate.invoke(next, v)).booleanValue()) {
                        next = this.this$0.$update.invoke(next, v);
                    }
                    arrayList.add(next);
                }
                return (List) arrayList;
            }
        });
    }
}
