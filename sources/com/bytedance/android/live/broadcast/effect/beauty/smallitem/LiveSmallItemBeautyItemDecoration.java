package com.bytedance.android.live.broadcast.effect.beauty.smallitem;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.bytedance.android.live.core.utils.C3358ac;

public class LiveSmallItemBeautyItemDecoration extends C1272h {
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        int f = RecyclerView.m5892f(view);
        if (f == 0) {
            rect.set(C3358ac.m12510a(10.0f), 0, 0, 0);
            return;
        }
        if (f == recyclerView.getAdapter().getItemCount() - 1) {
            rect.set(0, 0, C3358ac.m12510a(10.0f), 0);
        }
    }
}
