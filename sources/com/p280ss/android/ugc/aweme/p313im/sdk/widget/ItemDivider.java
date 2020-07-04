package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.ItemDivider */
public class ItemDivider extends C1272h {

    /* renamed from: a */
    private boolean f83602a;

    /* renamed from: b */
    private int f83603b;

    /* renamed from: c */
    private int f83604c;

    /* renamed from: d */
    private int f83605d;

    /* renamed from: e */
    private int f83606e;

    /* renamed from: f */
    private Paint f83607f;

    /* renamed from: g */
    private final Rect f83608g;

    /* renamed from: b */
    private void m103876b(Canvas canvas, RecyclerView recyclerView) {
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
            C1273i.m6053a(childAt, this.f83608g);
            int round = this.f83608g.right + Math.round(C0991u.m4234m(childAt));
            canvas.drawRect((float) (round - this.f83603b), (float) (this.f83606e + i2), (float) round, (float) (i - this.f83606e), this.f83607f);
        }
        canvas.restore();
    }

    /* renamed from: a */
    private void m103875a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            Canvas canvas2 = canvas;
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.m5876a(childAt, this.f83608g);
            int round = this.f83608g.bottom + Math.round(C0991u.m4235n(childAt));
            canvas.drawRect((float) (this.f83606e + i2), (float) (round - this.f83604c), (float) (i - this.f83606e), (float) round, this.f83607f);
            if (i3 == 0 && this.f83602a) {
                int round2 = this.f83608g.top + Math.round(C0991u.m4235n(childAt));
                canvas.drawRect((float) i2, (float) round2, (float) i, (float) (round2 + this.f83604c), this.f83607f);
            }
        }
        canvas.restore();
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (recyclerView.getLayoutManager() != null) {
            if (this.f83605d == 1) {
                m103875a(canvas, recyclerView);
            } else {
                m103876b(canvas, recyclerView);
            }
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        recyclerView.getLayoutManager();
        if (C1273i.m6060c(view) != 0) {
            i = 0;
        } else if (this.f83605d == 1) {
            i = this.f83604c;
        } else {
            i = this.f83603b;
        }
        if (this.f83605d == 1) {
            rect.set(0, i, 0, this.f83604c);
        } else {
            rect.set(0, i, this.f83603b, 0);
        }
    }
}
