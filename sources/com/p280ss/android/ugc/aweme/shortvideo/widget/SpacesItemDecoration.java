package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.SpacesItemDecoration */
public class SpacesItemDecoration extends C1272h {

    /* renamed from: a */
    private int f108390a;

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        if (RecyclerView.m5893g(view) == 0) {
            rect.left = this.f108390a;
            rect.right = this.f108390a / 2;
        } else if (RecyclerView.m5893g(view) == recyclerView.getAdapter().getItemCount() - 1) {
            rect.left = this.f108390a / 2;
            rect.right = this.f108390a;
        } else {
            rect.left = this.f108390a / 2;
            rect.right = this.f108390a / 2;
        }
    }
}
