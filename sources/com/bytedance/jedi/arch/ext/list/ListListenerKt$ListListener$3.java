package com.bytedance.jedi.arch.ext.list;

import java.util.List;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7563m;

public final class ListListenerKt$ListListener$3 extends Lambda implements C7563m<RECEIVER, List<? extends T>, C7581n> {
    public static final ListListenerKt$ListListener$3 INSTANCE = new ListListenerKt$ListListener$3();

    public ListListenerKt$ListListener$3() {
        super(2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((RECEIVER) obj, (List) obj2);
        return C7581n.f20898a;
    }

    public final void invoke(RECEIVER receiver, List<? extends T> list) {
        C7573i.m23587b(list, "it");
    }
}
