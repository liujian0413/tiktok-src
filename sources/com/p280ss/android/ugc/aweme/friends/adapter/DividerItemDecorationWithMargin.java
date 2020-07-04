package com.p280ss.android.ugc.aweme.friends.adapter;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.DividerItemDecorationWithMargin */
public class DividerItemDecorationWithMargin extends C1272h {

    /* renamed from: a */
    private static final int[] f78893a = {16843284};

    /* renamed from: b */
    private Drawable f78894b;

    /* renamed from: c */
    private int f78895c;

    /* renamed from: d */
    private int f78896d;

    /* renamed from: e */
    private int f78897e;

    /* renamed from: f */
    private int f78898f;

    /* renamed from: g */
    private int f78899g;

    /* renamed from: h */
    private final Rect f78900h = new Rect();

    /* renamed from: a */
    private void m98398a(int i) {
        this.f78899g = 1;
    }

    /* renamed from: a */
    private void m98399a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.m5876a(childAt, this.f78900h);
            int round = this.f78900h.bottom + Math.round(childAt.getTranslationY());
            this.f78894b.setBounds(this.f78895c + i2, round - this.f78898f, i - this.f78896d, round);
            this.f78894b.draw(canvas);
        }
        canvas.restore();
    }

    /* renamed from: b */
    private void m98400b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingTop();
            i = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i2, recyclerView.getWidth() - recyclerView.getPaddingRight(), i);
        } else {
            i = recyclerView.getHeight();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            recyclerView.getLayoutManager();
            C1273i.m6053a(childAt, this.f78900h);
            int round = this.f78900h.right + Math.round(childAt.getTranslationX());
            this.f78894b.setBounds(round - this.f78894b.getIntrinsicWidth(), i2, round, i);
            this.f78894b.draw(canvas);
        }
        canvas.restore();
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (recyclerView.getLayoutManager() != null && this.f78894b != null) {
            if (this.f78899g == 1) {
                m98399a(canvas, recyclerView);
            } else {
                m98400b(canvas, recyclerView);
            }
        }
    }

    public DividerItemDecorationWithMargin(int i, int i2, int i3, int i4) {
        this.f78894b = new ColorDrawable(i);
        m98398a(1);
        this.f78895c = i2;
        this.f78896d = i3;
        this.f78897e = i4;
        this.f78898f = i4;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        if (this.f78894b == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        RecyclerView.m5892f(view);
        if (this.f78899g == 1) {
            rect.set(0, 0, 0, this.f78897e);
        } else {
            rect.set(0, 0, this.f78898f, 0);
        }
    }
}
