package com.p280ss.android.ugc.aweme.utils;

import android.support.p029v7.util.C1143a;
import android.support.p029v7.widget.RecyclerView.C1262a;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.aw */
public final class C42953aw {
    /* renamed from: a */
    public static final void m136346a(C1262a<?> aVar, List<?> list, List<?> list2) {
        C7573i.m23587b(aVar, "adapter");
        C7573i.m23587b(list, "oldList");
        C7573i.m23587b(list2, "newList");
        C1143a.m5066a(new DiffCallback(list, list2)).mo4548a((C1262a) aVar);
    }
}
