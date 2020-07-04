package com.bytedance.jedi.arch.ext.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

public final class ListViewModel$modifyAll$$inlined$updateListInternal$1 extends Lambda implements C7562b<S, S> {
    final /* synthetic */ C7563m $mapper$inlined;
    final /* synthetic */ ListViewModel this$0;

    public ListViewModel$modifyAll$$inlined$updateListInternal$1(ListViewModel listViewModel, C7563m mVar) {
        this.this$0 = listViewModel;
        this.$mapper$inlined = mVar;
        super(1);
    }

    public final S invoke(S s) {
        C7573i.m23587b(s, "$this$setState");
        Iterable list = ((ListState) s.getSubstate()).getList();
        C7563m mVar = this.$mapper$inlined;
        Collection arrayList = new ArrayList(C7525m.m23469a(list, 10));
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            arrayList.add(mVar.invoke(Integer.valueOf(i), next));
            i = i2;
        }
        List list2 = (List) arrayList;
        S newSubstate = s.newSubstate(ListState.copy$default((ListState) s.getSubstate(), null, list2, null, null, ListViewModel.m33981a((ListState) s.getSubstate(), list2), 13, null));
        if (newSubstate != null) {
            return (IListState) newSubstate;
        }
        throw new TypeCastException("null cannot be cast to non-null type S");
    }
}
