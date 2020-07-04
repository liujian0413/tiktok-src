package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.BaseDetailItemDecoration */
public class BaseDetailItemDecoration extends C1272h {
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        int i2;
        int f = RecyclerView.m5892f(view);
        if (f > 2) {
            i = (int) C9738o.m28708b(view.getContext(), 1.5f);
        } else {
            i = 0;
        }
        if (f % 3 != 0) {
            i2 = (int) C9738o.m28708b(view.getContext(), 1.5f);
        } else {
            i2 = 0;
        }
        rect.set(i2, i, 0, 0);
    }
}
