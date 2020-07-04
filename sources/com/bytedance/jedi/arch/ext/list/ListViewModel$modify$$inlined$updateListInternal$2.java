package com.bytedance.jedi.arch.ext.list;

import java.util.Collection;
import java.util.List;
import kotlin.C48020o;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class ListViewModel$modify$$inlined$updateListInternal$2 extends Lambda implements C7562b<S, S> {
    final /* synthetic */ int $position$inlined;
    final /* synthetic */ C7562b $reducer$inlined;
    final /* synthetic */ ListViewModel this$0;

    public ListViewModel$modify$$inlined$updateListInternal$2(ListViewModel listViewModel, int i, C7562b bVar) {
        this.this$0 = listViewModel;
        this.$position$inlined = i;
        this.$reducer$inlined = bVar;
        super(1);
    }

    public final S invoke(S s) {
        boolean z;
        C7573i.m23587b(s, "$this$setState");
        List list = ((ListState) s.getSubstate()).getList();
        int size = list.size();
        int i = this.$position$inlined;
        if (i >= 0 && size > i) {
            z = true;
        } else {
            z = false;
        }
        if (!C48020o.f122844a || z) {
            List d = C7525m.m23509d((Collection<? extends T>) list);
            d.set(this.$position$inlined, this.$reducer$inlined.invoke(d.get(this.$position$inlined)));
            S newSubstate = s.newSubstate(ListState.copy$default((ListState) s.getSubstate(), null, d, null, null, ListViewModel.m33981a((ListState) s.getSubstate(), d), 13, null));
            if (newSubstate != null) {
                return (IListState) newSubstate;
            }
            throw new TypeCastException("null cannot be cast to non-null type S");
        }
        throw new AssertionError("Assertion failed");
    }
}
