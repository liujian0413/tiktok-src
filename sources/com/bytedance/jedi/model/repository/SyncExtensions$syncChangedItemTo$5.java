package com.bytedance.jedi.model.repository;

import com.bytedance.jedi.model.p603e.C11801a.C11808c;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48006q;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public final class SyncExtensions$syncChangedItemTo$5 extends Lambda implements C7562b<C11808c<K, V, K1, V1>, C7581n> {
    final /* synthetic */ C7563m $update;
    final /* synthetic */ C7562b $where;

    public SyncExtensions$syncChangedItemTo$5(C7562b bVar, C7563m mVar) {
        this.$where = bVar;
        this.$update = mVar;
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C11808c) obj);
        return C7581n.f20898a;
    }

    public final void invoke(C11808c<K, V, K1, V1> cVar) {
        C7573i.m23587b(cVar, "$this$keySyncTo");
        cVar.mo29359a((C7563m<? super K, ? super V, ? extends K1>) new C7563m<K, V, K1>(this) {
            final /* synthetic */ SyncExtensions$syncChangedItemTo$5 this$0;

            {
                this.this$0 = r1;
            }

            public final K1 invoke(K k, V v) {
                return this.this$0.$where.invoke(k);
            }
        });
        cVar.mo29360a((C48006q<? super K, ? super V, ? super V1, ? extends V1>) new C48006q<K, V, V1, V1>(this) {
            final /* synthetic */ SyncExtensions$syncChangedItemTo$5 this$0;

            {
                this.this$0 = r1;
            }

            public final V1 invoke(K k, V v, V1 v1) {
                if (v == null || v1 == null) {
                    return v1;
                }
                return this.this$0.$update.invoke(v1, v);
            }
        });
    }
}
