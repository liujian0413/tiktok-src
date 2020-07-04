package com.bytedance.android.livesdk.chatroom.p220ui;

import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.SpaceItemDecoration */
public class SpaceItemDecoration extends C1272h {

    /* renamed from: a */
    private int f15196a;

    /* renamed from: b */
    private int f15197b = 1;

    public SpaceItemDecoration(int i, int i2) {
        this.f15196a = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int e = recyclerView.mo5571e(view);
        if (this.f15197b == 0) {
            if (e != 0) {
                rect.left = this.f15196a;
            }
        } else if (1 == this.f15197b) {
            rect.top = this.f15196a;
        }
    }
}
