package com.p280ss.android.ugc.aweme.discover.p1185ui;

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

/* renamed from: com.ss.android.ugc.aweme.discover.ui.HotSearchImageSectionDecoration */
public class HotSearchImageSectionDecoration extends C1272h {

    /* renamed from: a */
    private Drawable f71006a;

    /* renamed from: b */
    private Drawable f71007b;

    /* renamed from: a */
    private static int m88377a(RecyclerView recyclerView) {
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).f4716b;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).f5123a;
        }
        return -1;
    }

    public HotSearchImageSectionDecoration(Drawable drawable, Drawable drawable2) {
        this.f71006a = drawable;
        this.f71007b = drawable2;
    }

    /* renamed from: a */
    private void m88378a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int a = m88377a(recyclerView);
        int childCount = recyclerView.getChildCount();
        int i2 = childCount / a;
        int i3 = childCount % a;
        for (int i4 = 1; i4 < a; i4++) {
            if (i4 < i3) {
                i = i2 * a;
            } else {
                i = (i2 - 1) * a;
            }
            int i5 = i + i4;
            View childAt = recyclerView.getChildAt(i4);
            View childAt2 = recyclerView.getChildAt(i5);
            int top = childAt.getTop();
            int left = childAt.getLeft();
            this.f71006a.setBounds(left - this.f71006a.getIntrinsicWidth(), top, left, childAt2.getBottom());
            this.f71006a.draw(canvas);
        }
    }

    /* renamed from: b */
    private void m88380b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int a = m88377a(recyclerView);
        int childCount = recyclerView.getChildCount() / a;
        for (int i2 = 1; i2 < childCount; i2++) {
            if (i2 == childCount) {
                i = recyclerView.getChildCount();
            } else {
                i = (i2 * a) + a;
            }
            int i3 = i - 1;
            View childAt = recyclerView.getChildAt(i2 * a);
            View childAt2 = recyclerView.getChildAt(i3);
            int left = childAt.getLeft();
            int top = childAt.getTop();
            this.f71007b.setBounds(left, top - this.f71007b.getIntrinsicHeight(), childAt2.getRight(), top);
            this.f71007b.draw(canvas);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        m88378a(canvas, recyclerView);
        m88380b(canvas, recyclerView);
    }

    /* renamed from: a */
    private static boolean m88379a(RecyclerView recyclerView, int i, int i2, int i3) {
        int i4;
        C1273i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            if (i3 % i2 == 0) {
                i4 = i3 / i2;
            } else {
                i4 = (i3 / i2) + 1;
            }
            if (i4 == (i / i2) + 1) {
                return true;
            }
            return false;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
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

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int bn_ = ((LayoutParams) view.getLayoutParams()).bn_();
        int a = m88377a(recyclerView);
        boolean a2 = m88379a(recyclerView, bn_, a, recyclerView.getAdapter().getItemCount());
        int intrinsicWidth = ((a - 1) * this.f71006a.getIntrinsicWidth()) / a;
        int intrinsicWidth2 = (bn_ % a) * (this.f71006a.getIntrinsicWidth() - intrinsicWidth);
        int i = intrinsicWidth - intrinsicWidth2;
        int intrinsicHeight = this.f71007b.getIntrinsicHeight();
        if (a2) {
            intrinsicHeight = 0;
        }
        rect.set(intrinsicWidth2, 0, i, intrinsicHeight);
    }
}
