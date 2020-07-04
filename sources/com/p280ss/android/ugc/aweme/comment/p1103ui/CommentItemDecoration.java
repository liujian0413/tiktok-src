package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentItemDecoration */
public class CommentItemDecoration extends C1272h {

    /* renamed from: a */
    protected Drawable f64023a;

    /* renamed from: b */
    protected int f64024b;

    /* renamed from: c */
    protected int f64025c;

    /* renamed from: d */
    private final Rect f64026d;

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft() + this.f64024b;
            i2 = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f64025c;
            canvas.clipRect(i, recyclerView.getPaddingTop(), i2, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = this.f64024b;
            i2 = recyclerView.getWidth() - this.f64025c;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount - 1; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.m5876a(childAt, this.f64026d);
            int round = this.f64026d.bottom + Math.round(C0991u.m4235n(childAt));
            this.f64023a.setBounds(i, round - this.f64023a.getIntrinsicHeight(), i2, round);
            this.f64023a.draw(canvas);
        }
        canvas.restore();
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        rect.set(0, 0, 0, this.f64023a.getIntrinsicHeight());
    }
}
