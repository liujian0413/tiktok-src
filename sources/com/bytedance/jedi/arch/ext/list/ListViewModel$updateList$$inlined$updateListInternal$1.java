package com.bytedance.jedi.arch.ext.list;

import java.util.List;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class ListViewModel$updateList$$inlined$updateListInternal$1 extends Lambda implements C7562b<S, S> {
    final /* synthetic */ List $list$inlined;
    final /* synthetic */ ListViewModel this$0;

    public ListViewModel$updateList$$inlined$updateListInternal$1(ListViewModel listViewModel, List list) {
        this.this$0 = listViewModel;
        this.$list$inlined = list;
        super(1);
    }

    public final S invoke(S s) {
        C7573i.m23587b(s, "$this$setState");
        ((ListState) s.getSubstate()).getList();
        List list = this.$list$inlined;
        S newSubstate = s.newSubstate(ListState.copy$default((ListState) s.getSubstate(), null, list, null, null, ListViewModel.m33981a((ListState) s.getSubstate(), list), 13, null));
        if (newSubstate != null) {
            return (IListState) newSubstate;
        }
        throw new TypeCastException("null cannot be cast to non-null type S");
    }
}
