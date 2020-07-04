package com.bytedance.jedi.arch.ext.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class ListViewModel$removeAll$$inlined$updateListInternal$1 extends Lambda implements C7562b<S, S> {
    final /* synthetic */ C7562b $predicate$inlined;
    final /* synthetic */ ListViewModel this$0;

    public ListViewModel$removeAll$$inlined$updateListInternal$1(ListViewModel listViewModel, C7562b bVar) {
        this.this$0 = listViewModel;
        this.$predicate$inlined = bVar;
        super(1);
    }

    public final S invoke(S s) {
        C7573i.m23587b(s, "$this$setState");
        Iterable list = ((ListState) s.getSubstate()).getList();
        C7562b bVar = this.$predicate$inlined;
        Collection arrayList = new ArrayList();
        for (Object next : list) {
            if (!((Boolean) bVar.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        List list2 = (List) arrayList;
        S newSubstate = s.newSubstate(ListState.copy$default((ListState) s.getSubstate(), null, list2, null, null, ListViewModel.m33981a((ListState) s.getSubstate(), list2), 13, null));
        if (newSubstate != null) {
            return (IListState) newSubstate;
        }
        throw new TypeCastException("null cannot be cast to non-null type S");
    }
}
