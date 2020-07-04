package com.p280ss.android.ugc.aweme.poi.preview.p1467b.p1469b;

import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.p280ss.android.ugc.aweme.poi.preview.p1467b.C35153c;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.b.b.a */
public final class C35152a implements C35153c {

    /* renamed from: a */
    private SparseArray<View> f91929a = new SparseArray<>();

    /* renamed from: a */
    public final void mo89450a(int i) {
        View view = (View) this.f91929a.get(i);
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* renamed from: b */
    public final void mo89452b(int i) {
        View view = (View) this.f91929a.get(i);
        if (view != null) {
            view.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: a */
    public final void mo89451a(int i, FrameLayout frameLayout) {
        Context context = frameLayout.getContext();
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(context);
        dmtLoadingLayout.setLayoutParams(layoutParams);
        frameLayout.addView(dmtLoadingLayout, frameLayout.getChildCount());
        this.f91929a.put(i, dmtLoadingLayout);
        dmtLoadingLayout.setVisibility(0);
    }
}
