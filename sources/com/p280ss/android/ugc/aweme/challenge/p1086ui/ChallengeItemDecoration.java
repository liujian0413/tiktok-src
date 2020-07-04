package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeItemDecoration */
public class ChallengeItemDecoration extends C1272h {

    /* renamed from: a */
    private Drawable f62550a;

    /* renamed from: b */
    private int f62551b = 0;

    /* renamed from: c */
    private int f62552c = 0;

    public ChallengeItemDecoration(Context context, int i) {
        this.f62550a = context.getResources().getDrawable(R.drawable.wl);
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f62550a.setBounds(this.f62551b + paddingLeft, bottom, width - this.f62552c, this.f62550a.getIntrinsicHeight() + bottom);
            this.f62550a.draw(canvas);
        }
    }

    /* renamed from: a */
    public final ChallengeItemDecoration mo61721a(int i, int i2, int i3, int i4) {
        this.f62551b = i;
        this.f62552c = i3;
        return this;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int f = RecyclerView.m5892f(view);
        int intrinsicHeight = this.f62550a.getIntrinsicHeight();
        if (f == 0) {
            intrinsicHeight = 0;
        }
        rect.set(0, intrinsicHeight, 0, 0);
    }
}
