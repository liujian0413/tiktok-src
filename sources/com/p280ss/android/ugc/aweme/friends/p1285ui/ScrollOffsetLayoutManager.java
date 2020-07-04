package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.content.Context;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ScrollOffsetLayoutManager */
public class ScrollOffsetLayoutManager extends WrapLinearLayoutManager {

    /* renamed from: a */
    private final SparseIntArray f79346a = new SparseIntArray();

    /* renamed from: a */
    public final void mo5373a(C1290s sVar) {
        super.mo5373a(sVar);
        int s = mo5800s();
        for (int i = 0; i < s; i++) {
            View g = mo5788g(i);
            if (g != null) {
                this.f79346a.put(i, g.getHeight());
            }
        }
    }

    /* renamed from: c */
    public final int mo5431c(C1290s sVar) {
        int i;
        if (mo5800s() == 0) {
            return 0;
        }
        try {
            int j = mo5445j();
            int i2 = -((int) mo5432c(j).getY());
            for (int i3 = 0; i3 < j; i3++) {
                if (this.f79346a.indexOfKey(i3) >= 0) {
                    i = 0;
                } else {
                    i = this.f79346a.get(i3);
                }
                i2 += i;
            }
            return i2;
        } catch (Exception unused) {
            return 0;
        }
    }

    public ScrollOffsetLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
