package android.support.p029v7.widget;

import android.support.p029v7.widget.RecyclerView.C1293v;
import kotlin.jvm.internal.C7573i;

/* renamed from: android.support.v7.widget.ac */
public final class C1337ac {
    /* renamed from: a */
    public static final void m6610a(C1293v vVar) {
        C7573i.m23587b(vVar, "viewHolder");
        vVar.resetInternal();
    }

    /* renamed from: a */
    public static final int m6609a(RecyclerView recyclerView, int i) {
        C7573i.m23587b(recyclerView, "recyclerView");
        C1283a aVar = (C1283a) recyclerView.getRecycledViewPool().f4973a.get(i);
        if (aVar != null) {
            return aVar.f4976b;
        }
        return -1;
    }
}
