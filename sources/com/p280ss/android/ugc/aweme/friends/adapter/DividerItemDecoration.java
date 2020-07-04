package com.p280ss.android.ugc.aweme.friends.adapter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.DividerItemDecoration */
public class DividerItemDecoration extends C1272h {

    /* renamed from: a */
    int f78885a;

    /* renamed from: b */
    int f78886b;

    /* renamed from: c */
    private Paint f78887c;

    /* renamed from: d */
    private int f78888d;

    /* renamed from: e */
    private int f78889e;

    /* renamed from: f */
    private int f78890f;

    /* renamed from: g */
    private float f78891g;

    /* renamed from: h */
    private float f78892h;

    /* renamed from: a */
    private void m98396a(Canvas canvas, RecyclerView recyclerView) {
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int f = RecyclerView.m5892f(childAt);
            if (f > 0 && f < childCount - 1 && f != this.f78885a + 1) {
                int left = childAt.getLeft() + ((LayoutParams) childAt.getLayoutParams()).leftMargin;
                float f2 = (float) (left - this.f78889e);
                canvas.drawRect(f2, 0.0f, f2, this.f78891g + 0.0f, this.f78887c);
                float f3 = (float) left;
                float f4 = (float) measuredHeight;
                canvas.drawRect(f3, f4 - this.f78892h, f3, f4, this.f78887c);
            }
        }
    }

    /* renamed from: b */
    private void m98397b(Canvas canvas, RecyclerView recyclerView) {
        int measuredWidth = recyclerView.getMeasuredWidth();
        int childCount = recyclerView.getChildCount();
        int itemCount = recyclerView.getAdapter().getItemCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int f = RecyclerView.m5892f(childAt);
            if (f > 0 && f < itemCount - 1 && f != this.f78885a + 1) {
                int top = childAt.getTop() + ((LayoutParams) childAt.getLayoutParams()).topMargin;
                int i2 = top + 1;
                float f2 = (float) top;
                float f3 = (float) i2;
                canvas.drawRect(0.0f, f2, this.f78891g + 0.0f, f3, this.f78887c);
                float f4 = (float) measuredWidth;
                canvas.drawRect(f4 - this.f78892h, f2, f4, f3, this.f78887c);
            }
        }
    }

    public DividerItemDecoration(int i, int i2, int i3) {
        this(i, i2, 0, 0.0f, 0.0f);
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (this.f78890f == 1) {
            m98397b(canvas, recyclerView);
        } else {
            m98396a(canvas, recyclerView);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        int i2;
        int f = RecyclerView.m5892f(view);
        if (this.f78890f == 1) {
            if (f == this.f78885a) {
                i2 = this.f78886b;
            } else {
                i2 = this.f78889e;
            }
            rect.set(0, 0, 0, i2);
            return;
        }
        if (f == this.f78885a) {
            i = this.f78886b;
        } else {
            i = this.f78889e;
        }
        rect.set(0, 0, i, 0);
    }

    public DividerItemDecoration(int i, int i2, int i3, float f, float f2) {
        this.f78885a = -1;
        this.f78888d = i;
        this.f78889e = i2;
        this.f78890f = i3;
        this.f78887c = new Paint(1);
        this.f78887c.setColor(this.f78888d);
        this.f78887c.setStyle(Style.FILL);
        this.f78891g = f;
        this.f78892h = f2;
    }
}
