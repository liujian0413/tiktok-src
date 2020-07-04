package com.p280ss.android.ugc.aweme.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.views.DividerItemDecoration */
public class DividerItemDecoration extends C1272h {

    /* renamed from: a */
    int f112229a;

    /* renamed from: b */
    int f112230b;

    /* renamed from: c */
    private boolean f112231c;

    /* renamed from: d */
    private Paint f112232d;

    /* renamed from: e */
    private int f112233e;

    /* renamed from: f */
    private int f112234f;

    /* renamed from: g */
    private int f112235g;

    /* renamed from: h */
    private float f112236h;

    /* renamed from: i */
    private float f112237i;

    /* renamed from: a */
    private void m137570a(Canvas canvas, RecyclerView recyclerView) {
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int left = childAt.getLeft() + ((LayoutParams) childAt.getLayoutParams()).leftMargin;
            int i2 = left - this.f112234f;
            if (this.f112231c) {
                canvas.drawRect((float) i2, this.f112236h + 0.0f, (float) left, ((float) measuredHeight) - this.f112237i, this.f112232d);
            } else {
                float f = (float) i2;
                float f2 = (float) left;
                Canvas canvas2 = canvas;
                float f3 = f;
                float f4 = f2;
                canvas2.drawRect(f3, this.f112236h + 0.0f, f4, this.f112236h, this.f112232d);
                float f5 = (float) measuredHeight;
                canvas2.drawRect(f3, f5 - this.f112237i, f4, f5, this.f112232d);
            }
        }
    }

    /* renamed from: b */
    private void m137571b(Canvas canvas, RecyclerView recyclerView) {
        int measuredWidth = recyclerView.getMeasuredWidth();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int top = childAt.getTop() + ((LayoutParams) childAt.getLayoutParams()).topMargin;
            int i2 = top - this.f112234f;
            if (this.f112231c) {
                canvas.drawRect(this.f112236h + 0.0f, (float) i2, ((float) measuredWidth) - this.f112237i, (float) top, this.f112232d);
            } else {
                float f = (float) i2;
                float f2 = (float) top;
                canvas.drawRect(0.0f, f, this.f112236h, f2, this.f112232d);
                float f3 = (float) measuredWidth;
                canvas.drawRect(f3 - this.f112237i, f, f3, f2, this.f112232d);
            }
        }
    }

    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (this.f112235g == 1) {
            m137571b(canvas, recyclerView);
        } else {
            m137570a(canvas, recyclerView);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        int i2;
        int f = RecyclerView.m5892f(view);
        if (this.f112235g == 1) {
            if (f == this.f112229a) {
                i2 = this.f112230b;
            } else {
                i2 = this.f112234f;
            }
            rect.set(0, 0, 0, i2);
            return;
        }
        if (f == this.f112229a) {
            i = this.f112230b;
        } else {
            i = this.f112234f;
        }
        rect.set(0, 0, i, 0);
    }

    public DividerItemDecoration(int i, int i2, int i3, float f, float f2) {
        this(i, i2, 1, f, f2, true);
    }

    public DividerItemDecoration(int i, int i2, int i3, float f, float f2, boolean z) {
        this.f112229a = -1;
        this.f112233e = i;
        this.f112234f = i2;
        this.f112235g = i3;
        this.f112232d = new Paint(1);
        this.f112232d.setColor(this.f112233e);
        this.f112232d.setStyle(Style.FILL);
        this.f112236h = f;
        this.f112237i = f2;
        this.f112231c = z;
    }
}
