package com.bytedance.jedi.model.repository;

import com.bytedance.jedi.model.p603e.C11801a.C11802a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.C7581n;
import kotlin.Pair;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class SyncExtensions$syncChangedListTo$2 extends Lambda implements C7562b<C11802a<? extends Object, List<? extends V>, K1, V1>, C7581n> {
    final /* synthetic */ C7562b $map;

    public SyncExtensions$syncChangedListTo$2(C7562b bVar) {
        this.$map = bVar;
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11802a) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11802a<? extends Object, List<V>, K1, V1> aVar) {
        C7573i.m23587b(aVar, "$receiver");
        aVar.mo29358a(new C7562b<List<? extends V>, List<? extends Pair<? extends K1, ? extends V1>>>(this) {
            final /* synthetic */ SyncExtensions$syncChangedListTo$2 this$0;

            {
                this.this$0 = r1;
            }

            public final List<Pair<K1, V1>> invoke(List<? extends V> list) {
                C7573i.m23587b(list, "it");
                Iterable<Object> iterable = list;
                Collection arrayList = new ArrayList(C7525m.m23469a(iterable, 10));
                for (Object invoke : iterable) {
                    arrayList.add(this.this$0.$map.invoke(invoke));
                }
                return (List) arrayList;
            }
        });
    }
}
