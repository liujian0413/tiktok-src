package com.p280ss.android.ugc.aweme.interest;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.interest.InterestDivider */
public final class InterestDivider extends C1272h {

    /* renamed from: a */
    public final int f83960a = C23486n.m77122a(1.5d);

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        int i2;
        int i3;
        C7573i.m23587b(rect, "outRect");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(recyclerView, "parent");
        C7573i.m23587b(sVar, "state");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int bn_ = ((RecyclerView.LayoutParams) layoutParams).bn_();
            if (bn_ != 0) {
                int i4 = bn_ - 1;
                if (i4 % 3 == 1) {
                    i2 = this.f83960a;
                    i = this.f83960a;
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (i4 > 2) {
                    i3 = this.f83960a;
                } else {
                    i3 = 0;
                }
                rect.set(i2, i3, i, 0);
                return;
            }
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.RecyclerView.LayoutParams");
    }
}
