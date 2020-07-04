package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;
import com.bytedance.common.utility.C9738o;

/* renamed from: com.ss.android.ugc.aweme.music.ui.ThirdMusicItemDecoration */
public class ThirdMusicItemDecoration extends C1272h {
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        if (RecyclerView.m5892f(view) == 0) {
            i = 0;
        } else {
            i = (int) C9738o.m28708b(view.getContext(), 8.0f);
        }
        rect.set(i, 0, (int) C9738o.m28708b(view.getContext(), 8.0f), 0);
    }
}
