package com.bytedance.jedi.ext.adapter.decorator.internal;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.h */
public interface C11693h {

    /* renamed from: com.bytedance.jedi.ext.adapter.decorator.internal.h$a */
    public static final class C11694a {
        /* renamed from: a */
        public static int m34285a(C11693h hVar) {
            if (hVar.mo29254g()) {
                return 1;
            }
            return 0;
        }

        /* renamed from: b */
        public static void m34286b(C11693h hVar) {
            if (!hVar.mo29246a()) {
                C1293v b = hVar.mo29247b();
                if (b != null) {
                    View view = b.itemView;
                    if (view != null) {
                        LayoutParams layoutParams = view.getLayoutParams();
                        if (!(layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                            layoutParams = null;
                        }
                        StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
                        if (layoutParams2 != null) {
                            layoutParams2.f5145b = true;
                            hVar.mo29245a(true);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    C1293v mo29252a(ViewGroup viewGroup);

    /* renamed from: a */
    void mo29245a(boolean z);

    /* renamed from: a */
    boolean mo29246a();

    /* renamed from: b */
    C1293v mo29247b();

    /* renamed from: f */
    int mo29253f();

    /* renamed from: g */
    boolean mo29254g();
}
