package com.bytedance.android.live.broadcast.effect.adapter;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.bytedance.android.live.core.utils.C3358ac;

public class LiveFilterListItemDecoration extends C1272h {
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (RecyclerView.m5892f(view) == 0) {
            rect.set(C3358ac.m12510a(10.0f), 0, 0, 0);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
