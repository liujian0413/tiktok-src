package com.bytedance.jedi.arch.ext.list;

import java.util.Collection;
import java.util.List;
import kotlin.C48020o;
import kotlin.Pair;
import kotlin.TypeCastException;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class ListViewModel$modifyMultiple$$inlined$updateListInternal$1 extends Lambda implements C7562b<S, S> {
    final /* synthetic */ List $pairs$inlined;
    final /* synthetic */ ListViewModel this$0;

    public ListViewModel$modifyMultiple$$inlined$updateListInternal$1(ListViewModel listViewModel, List list) {
        this.this$0 = listViewModel;
        this.$pairs$inlined = list;
        super(1);
    }

    public final S invoke(S s) {
        boolean z;
        C7573i.m23587b(s, "$this$setState");
        List list = ((ListState) s.getSubstate()).getList();
        List d = C7525m.m23509d((Collection<? extends T>) list);
        for (Pair pair : this.$pairs$inlined) {
            int intValue = ((Number) pair.component1()).intValue();
            Object component2 = pair.component2();
            int size = list.size();
            if (intValue >= 0 && size > intValue) {
                z = true;
            } else {
                z = false;
            }
            if (!C48020o.f122844a || z) {
                d.set(intValue, component2);
            } else {
                throw new AssertionError("Assertion failed");
            }
        }
        S newSubstate = s.newSubstate(ListState.copy$default((ListState) s.getSubstate(), null, d, null, null, ListViewModel.m33981a((ListState) s.getSubstate(), d), 13, null));
        if (newSubstate != null) {
            return (IListState) newSubstate;
        }
        throw new TypeCastException("null cannot be cast to non-null type S");
    }
}
