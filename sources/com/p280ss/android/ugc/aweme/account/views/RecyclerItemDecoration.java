package com.p280ss.android.ugc.aweme.account.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.account.views.RecyclerItemDecoration */
public class RecyclerItemDecoration extends C1272h {

    /* renamed from: a */
    private static final String f59637a = "RecyclerItemDecoration";

    /* renamed from: b */
    private final int f59638b;

    /* renamed from: c */
    private final int f59639c;

    /* renamed from: d */
    private final int f59640d;

    /* renamed from: e */
    private final Paint f59641e;

    /* renamed from: f */
    private int f59642f;

    /* renamed from: g */
    private int f59643g;

    /* renamed from: a */
    private void m74046a(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        int paddingLeft = recyclerView.getPaddingLeft() + this.f59642f;
        int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f59643g;
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
                canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) (this.f59640d + bottom), this.f59641e);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private void m74047b(Canvas canvas, RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        int paddingTop = recyclerView.getPaddingTop();
        int i = 0;
        while (i < childCount) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != null) {
                int height = childAt.getHeight() - recyclerView.getPaddingBottom();
                int right = childAt.getRight() + ((LayoutParams) childAt.getLayoutParams()).rightMargin;
                canvas.drawRect((float) right, (float) paddingTop, (float) (this.f59640d + right), (float) height, this.f59641e);
                i++;
            } else {
                return;
            }
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
        if (this.f59638b == 1) {
            m74046a(canvas, recyclerView);
        } else {
            m74047b(canvas, recyclerView);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        C1273i layoutManager = recyclerView.getLayoutManager();
        int b = sVar.mo5870b();
        int g = RecyclerView.m5893g(view);
        if (g != -1 && (layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
            if (this.f59638b == 1) {
                if (g == b) {
                    rect.set(0, 0, 0, 0);
                } else {
                    rect.set(0, 0, 0, this.f59639c);
                }
            } else if (g == b) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, this.f59639c, 0);
            }
        }
    }
}
