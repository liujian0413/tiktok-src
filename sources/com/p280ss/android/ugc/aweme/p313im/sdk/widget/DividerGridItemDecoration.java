package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
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

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.DividerGridItemDecoration */
public class DividerGridItemDecoration extends C1272h {

    /* renamed from: a */
    private static final int[] f83503a = {16843284};

    /* renamed from: b */
    private Drawable f83504b;

    public DividerGridItemDecoration(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f83503a);
        this.f83504b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private static int m103816a(RecyclerView recyclerView) {
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).f4716b;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).f5123a;
        }
        return -1;
    }

    /* renamed from: b */
    private void m103819b(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int top = childAt.getTop() - layoutParams.topMargin;
            int bottom = childAt.getBottom() + layoutParams.bottomMargin;
            int right = childAt.getRight() + layoutParams.rightMargin;
            this.f83504b.setBounds(right, top, this.f83504b.getIntrinsicWidth() + right, bottom);
            this.f83504b.draw(canvas);
        }
    }

    /* renamed from: a */
    private void m103817a(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int left = childAt.getLeft() - layoutParams.leftMargin;
            int right = childAt.getRight() + layoutParams.rightMargin + this.f83504b.getIntrinsicWidth();
            int bottom = childAt.getBottom() + layoutParams.bottomMargin;
            this.f83504b.setBounds(left, bottom, right, this.f83504b.getIntrinsicHeight() + bottom);
            this.f83504b.draw(canvas);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        m103817a(canvas, recyclerView);
        m103819b(canvas, recyclerView);
    }

    public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        int a = m103816a(recyclerView);
        int itemCount = recyclerView.getAdapter().getItemCount();
        if (m103820b(recyclerView, i, a, itemCount)) {
            rect.set(0, 0, this.f83504b.getIntrinsicWidth(), 0);
        } else if (m103818a(recyclerView, i, a, itemCount)) {
            rect.set(0, 0, 0, this.f83504b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f83504b.getIntrinsicWidth(), this.f83504b.getIntrinsicHeight());
        }
    }

    /* renamed from: a */
    private static boolean m103818a(RecyclerView recyclerView, int i, int i2, int i3) {
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            if ((i + 1) % i2 == 0) {
                return true;
            }
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            if (((StaggeredGridLayoutManager) layoutManager).f5127e == 1) {
                if ((i + 1) % i2 == 0) {
                    return true;
                }
            } else if (i >= i3 - (i3 % i2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m103820b(RecyclerView recyclerView, int i, int i2, int i3) {
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            if (i >= i3 - (i3 % i2)) {
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
