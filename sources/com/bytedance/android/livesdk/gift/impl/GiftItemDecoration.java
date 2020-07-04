package com.bytedance.android.livesdk.gift.impl;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.View;

public class GiftItemDecoration extends C1272h {

    /* renamed from: a */
    private final Drawable f22140a;

    /* renamed from: b */
    private int f22141b;

    /* renamed from: a */
    private static int m24888a(RecyclerView recyclerView) {
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).f4716b;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).f5123a;
        }
        return -1;
    }

    /* renamed from: a */
    private void m24889a(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int left = childAt.getLeft() - layoutParams.leftMargin;
            int right = childAt.getRight() + layoutParams.rightMargin + this.f22141b;
            int bottom = childAt.getBottom() + layoutParams.bottomMargin;
            int i2 = this.f22141b + bottom;
            if (this.f22140a != null) {
                this.f22140a.setBounds(left, bottom, right, i2);
                this.f22140a.draw(canvas);
            }
        }
    }

    /* renamed from: b */
    private void m24891b(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int top = childAt.getTop() - layoutParams.topMargin;
            int bottom = childAt.getBottom() + layoutParams.bottomMargin;
            int right = childAt.getRight() + layoutParams.rightMargin;
            int i2 = this.f22141b + right;
            if (this.f22140a != null) {
                this.f22140a.setBounds(right, top, i2, bottom);
                this.f22140a.draw(canvas);
            }
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
        m24891b(canvas, recyclerView);
        m24889a(canvas, recyclerView);
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        if (m24890a(recyclerView, RecyclerView.m5892f(view), m24888a(recyclerView), recyclerView.getAdapter().getItemCount())) {
            rect.set(0, 0, this.f22141b, 0);
        } else {
            rect.set(0, 0, this.f22141b, this.f22141b);
        }
    }

    /* renamed from: a */
    private static boolean m24890a(RecyclerView recyclerView, int i, int i2, int i3) {
        int i4;
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            int i5 = i3 % i2;
            if (i5 != 0) {
                i4 = i3 - i5;
            } else {
                i4 = i3 - i2;
            }
            if (i >= i4) {
                return true;
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            if (((StaggeredGridLayoutManager) layoutManager).f5127e == 1) {
                if (i >= i3 - (i3 % i2)) {
                    return true;
                }
            } else if ((i + 1) % i2 == 0) {
                return true;
            }
        }
        return false;
    }
}
