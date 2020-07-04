package com.bytedance.android.live.uikit.recyclerview;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import com.bytedance.common.utility.C9738o;

public class DividerItemDecoration extends C1272h {

    /* renamed from: c */
    private static final int[] f10583c = {16843284};

    /* renamed from: a */
    protected Drawable f10584a;

    /* renamed from: b */
    public int f10585b;

    /* renamed from: d */
    private int f10586d;

    /* renamed from: e */
    private boolean f10587e;

    /* renamed from: f */
    private boolean f10588f;

    /* renamed from: a */
    private void m13058a(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        if (!this.f10588f) {
            childCount--;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f10584a.setBounds(paddingLeft, bottom, width, (this.f10584a.getIntrinsicHeight() + bottom) - 1);
            this.f10584a.draw(canvas);
        }
        if (this.f10587e) {
            View childAt2 = recyclerView.getChildAt(0);
            if (recyclerView.mo5571e(childAt2) == 0) {
                int top = childAt2.getTop() - ((LayoutParams) childAt2.getLayoutParams()).topMargin;
                this.f10584a.setBounds(paddingLeft, (top - this.f10584a.getIntrinsicHeight()) + 1, width, top);
                this.f10584a.draw(canvas);
            }
        }
    }

    /* renamed from: b */
    private void m13059b(Canvas canvas, RecyclerView recyclerView) {
        int paddingTop = recyclerView.getPaddingTop();
        int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
        int childCount = recyclerView.getChildCount();
        if (!this.f10588f) {
            childCount--;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int right = childAt.getRight() + ((LayoutParams) childAt.getLayoutParams()).rightMargin;
            this.f10584a.setBounds(right, paddingTop, this.f10584a.getIntrinsicHeight() + right, height);
            this.f10584a.draw(canvas);
        }
        if (this.f10587e) {
            View childAt2 = recyclerView.getChildAt(0);
            if (recyclerView.mo5571e(childAt2) == 0) {
                this.f10584a.setBounds(childAt2.getLeft() - ((LayoutParams) childAt2.getLayoutParams()).leftMargin, paddingTop, this.f10584a.getIntrinsicHeight() + paddingTop, height);
                this.f10584a.draw(canvas);
            }
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (this.f10586d == 1) {
            m13058a(canvas, recyclerView);
        } else {
            m13059b(canvas, recyclerView);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        int f = RecyclerView.m5892f(view);
        if (!this.f10587e || f != 0) {
            i = 0;
        } else {
            i = this.f10584a.getIntrinsicHeight();
        }
        if (this.f10586d == 1) {
            if (f == 0) {
                i += (int) C9738o.m28708b(recyclerView.getContext(), (float) this.f10585b);
            }
            rect.set(0, i, 0, this.f10584a.getIntrinsicHeight());
            return;
        }
        rect.set(0, i, this.f10584a.getIntrinsicWidth(), 0);
    }
}
