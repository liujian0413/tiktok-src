package com.p280ss.android.ugc.aweme.notification.view.copy;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.notification.view.copy.DividerItemDecoration */
public class DividerItemDecoration extends C1272h {

    /* renamed from: a */
    int f90402a;

    /* renamed from: b */
    int f90403b;

    /* renamed from: c */
    private Paint f90404c;

    /* renamed from: d */
    private int f90405d;

    /* renamed from: e */
    private int f90406e;

    /* renamed from: f */
    private float f90407f;

    /* renamed from: g */
    private float f90408g;

    /* renamed from: a */
    private void m111918a(Canvas canvas, RecyclerView recyclerView) {
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int f = RecyclerView.m5892f(childAt);
            if (f > 0 && f < childCount - 1 && f != this.f90402a + 1) {
                int left = childAt.getLeft() + ((LayoutParams) childAt.getLayoutParams()).leftMargin;
                float f2 = (float) (left - this.f90405d);
                canvas.drawRect(f2, 0.0f, f2, this.f90407f + 0.0f, this.f90404c);
                float f3 = (float) left;
                float f4 = (float) measuredHeight;
                canvas.drawRect(f3, f4 - this.f90408g, f3, f4, this.f90404c);
            }
        }
    }

    /* renamed from: b */
    private void m111919b(Canvas canvas, RecyclerView recyclerView) {
        int measuredWidth = recyclerView.getMeasuredWidth();
        int childCount = recyclerView.getChildCount();
        int itemCount = recyclerView.getAdapter().getItemCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int f = RecyclerView.m5892f(childAt);
            if (f > 0 && f < itemCount - 1 && f != this.f90402a + 1) {
                int top = childAt.getTop() + ((LayoutParams) childAt.getLayoutParams()).topMargin;
                int i2 = top + 1;
                float f2 = (float) top;
                float f3 = (float) i2;
                canvas.drawRect(0.0f, f2, this.f90407f + 0.0f, f3, this.f90404c);
                float f4 = (float) measuredWidth;
                canvas.drawRect(f4 - this.f90408g, f2, f4, f3, this.f90404c);
            }
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (this.f90406e == 1) {
            m111919b(canvas, recyclerView);
        } else {
            m111918a(canvas, recyclerView);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        int i2;
        int f = RecyclerView.m5892f(view);
        if (this.f90406e == 1) {
            if (f == this.f90402a) {
                i2 = this.f90403b;
            } else {
                i2 = this.f90405d;
            }
            rect.set(0, 0, 0, i2);
            return;
        }
        if (f == this.f90402a) {
            i = this.f90403b;
        } else {
            i = this.f90405d;
        }
        rect.set(0, 0, i, 0);
    }
}
