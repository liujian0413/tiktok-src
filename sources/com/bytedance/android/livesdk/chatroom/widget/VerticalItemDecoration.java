package com.bytedance.android.livesdk.chatroom.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

public class VerticalItemDecoration extends C1272h {

    /* renamed from: b */
    private static final int[] f17014b = {16843284};

    /* renamed from: a */
    public int f17015a;

    /* renamed from: c */
    private Drawable f17016c;

    /* renamed from: d */
    private final Rect f17017d;

    /* renamed from: a */
    private void m18218a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft() + this.f17015a;
            i = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f17015a;
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i2 = this.f17015a;
            i = recyclerView.getWidth() - this.f17015a;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.m5876a(childAt, this.f17017d);
            int round = this.f17017d.bottom + Math.round(childAt.getTranslationY());
            this.f17016c.setBounds(i2, round - this.f17016c.getIntrinsicHeight(), i, round);
            this.f17016c.draw(canvas);
        }
        canvas.restore();
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (recyclerView.getLayoutManager() != null && this.f17016c != null) {
            m18218a(canvas, recyclerView);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        if (this.f17016c == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, 0, 0, this.f17016c.getIntrinsicHeight());
        }
    }
}
