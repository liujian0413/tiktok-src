package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ChatRecyclerView */
public class ChatRecyclerView extends RecyclerView {

    /* renamed from: M */
    int f83488M;

    /* renamed from: N */
    LinearLayoutManager f83489N;

    public ChatRecyclerView(Context context) {
        this(context, null);
    }

    public ChatRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChatRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f83489N == null) {
            C1273i layoutManager = getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                this.f83489N = (LinearLayoutManager) layoutManager;
            }
        }
        if (this.f83489N != null && !this.f83489N.f4751m) {
            int l = this.f83489N.mo5447l();
            if (l >= 0) {
                View c = this.f83489N.mo5432c(l);
                if (c != null) {
                    int i5 = ((LayoutParams) c.getLayoutParams()).topMargin;
                    int top = c.getTop();
                    if (top > i5 && this.f83488M == 0) {
                        this.f83488M = i5 - top;
                        this.f83489N.mo5792i(this.f83488M);
                        this.f83489N.mo5379a(true);
                    }
                }
            }
        }
    }
}
