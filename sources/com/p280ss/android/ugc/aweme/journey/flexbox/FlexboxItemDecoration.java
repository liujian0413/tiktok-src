package com.p280ss.android.ugc.aweme.journey.flexbox;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.journey.flexbox.FlexboxItemDecoration */
public class FlexboxItemDecoration extends C1272h {

    /* renamed from: b */
    private static final int[] f84184b = {16843284};

    /* renamed from: a */
    public int f84185a;

    /* renamed from: c */
    private Drawable f84186c;

    /* renamed from: a */
    private boolean m104554a() {
        if ((this.f84185a & 1) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m104557b() {
        if ((this.f84185a & 2) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m104551a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        if (m104557b()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top = recyclerView.getTop() - recyclerView.getPaddingTop();
            int bottom = recyclerView.getBottom() + recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            int c = flexboxLayoutManager.mo83413c();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = recyclerView.getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (flexboxLayoutManager.f84199c) {
                    i2 = childAt.getRight() + layoutParams.rightMargin;
                    i = this.f84186c.getIntrinsicWidth() + i2;
                } else {
                    i = childAt.getLeft() - layoutParams.leftMargin;
                    i2 = i - this.f84186c.getIntrinsicWidth();
                }
                if (flexboxLayoutManager.mo83417i()) {
                    i3 = childAt.getTop() - layoutParams.topMargin;
                    i4 = childAt.getBottom() + layoutParams.bottomMargin;
                } else if (c == 3) {
                    int min = Math.min(childAt.getBottom() + layoutParams.bottomMargin + this.f84186c.getIntrinsicHeight(), bottom);
                    i3 = childAt.getTop() - layoutParams.topMargin;
                    i4 = min;
                } else {
                    i3 = Math.max((childAt.getTop() - layoutParams.topMargin) - this.f84186c.getIntrinsicHeight(), top);
                    i4 = childAt.getBottom() + layoutParams.bottomMargin;
                }
                this.f84186c.setBounds(i2, i3, i, i4);
                this.f84186c.draw(canvas);
            }
        }
    }

    /* renamed from: b */
    private void m104556b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int i3;
        int i4;
        if (m104554a()) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int c = flexboxLayoutManager.mo83413c();
            int left = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int right = recyclerView.getRight() + recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = recyclerView.getChildAt(i5);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (c == 3) {
                    i2 = childAt.getBottom() + layoutParams.bottomMargin;
                    i = this.f84186c.getIntrinsicHeight() + i2;
                } else {
                    i = childAt.getTop() - layoutParams.topMargin;
                    i2 = i - this.f84186c.getIntrinsicHeight();
                }
                if (!flexboxLayoutManager.mo83417i()) {
                    i3 = childAt.getLeft() - layoutParams.leftMargin;
                    i4 = childAt.getRight() + layoutParams.rightMargin;
                } else if (flexboxLayoutManager.f84199c) {
                    int min = Math.min(childAt.getRight() + layoutParams.rightMargin + this.f84186c.getIntrinsicWidth(), right);
                    i3 = childAt.getLeft() - layoutParams.leftMargin;
                    i4 = min;
                } else {
                    i3 = Math.max((childAt.getLeft() - layoutParams.leftMargin) - this.f84186c.getIntrinsicWidth(), left);
                    i4 = childAt.getRight() + layoutParams.rightMargin;
                }
                this.f84186c.setBounds(i3, i2, i4, i);
                this.f84186c.draw(canvas);
            }
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        m104556b(canvas, recyclerView);
        m104551a(canvas, recyclerView);
    }

    /* renamed from: a */
    private static boolean m104555a(int i, List<C32240b> list, FlexboxLayoutManager flexboxLayoutManager) {
        int b = flexboxLayoutManager.mo5427b(i);
        if ((b != -1 && b < flexboxLayoutManager.mo83420l().size() && ((C32240b) flexboxLayoutManager.mo83420l().get(b)).f84259o == i) || i == 0) {
            return true;
        }
        if (list.size() != 0 && ((C32240b) list.get(list.size() - 1)).f84260p == i - 1) {
            return true;
        }
        return false;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int f = RecyclerView.m5892f(view);
        if (f != 0) {
            if (m104554a() || m104557b()) {
                FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
                List m = flexboxLayoutManager.mo83421m();
                m104553a(rect, f, flexboxLayoutManager, m, flexboxLayoutManager.mo83413c());
                m104552a(rect, f, flexboxLayoutManager, m);
                return;
            }
            rect.set(0, 0, 0, 0);
        }
    }

    /* renamed from: a */
    private void m104552a(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<C32240b> list) {
        if (list.size() != 0 && flexboxLayoutManager.mo5427b(i) != 0) {
            if (flexboxLayoutManager.mo83417i()) {
                if (!m104554a()) {
                    rect.top = 0;
                    rect.bottom = 0;
                    return;
                }
                rect.top = this.f84186c.getIntrinsicHeight();
                rect.bottom = 0;
            } else if (m104557b()) {
                if (flexboxLayoutManager.f84199c) {
                    rect.right = this.f84186c.getIntrinsicWidth();
                    rect.left = 0;
                    return;
                }
                rect.left = this.f84186c.getIntrinsicWidth();
                rect.right = 0;
            }
        }
    }

    /* renamed from: a */
    private void m104553a(Rect rect, int i, FlexboxLayoutManager flexboxLayoutManager, List<C32240b> list, int i2) {
        if (!m104555a(i, list, flexboxLayoutManager)) {
            if (flexboxLayoutManager.mo83417i()) {
                if (!m104557b()) {
                    rect.left = 0;
                    rect.right = 0;
                } else if (flexboxLayoutManager.f84199c) {
                    rect.right = this.f84186c.getIntrinsicWidth();
                    rect.left = 0;
                } else {
                    rect.left = this.f84186c.getIntrinsicWidth();
                    rect.right = 0;
                }
            } else if (!m104554a()) {
                rect.top = 0;
                rect.bottom = 0;
            } else if (i2 == 3) {
                rect.bottom = this.f84186c.getIntrinsicHeight();
                rect.top = 0;
            } else {
                rect.top = this.f84186c.getIntrinsicHeight();
                rect.bottom = 0;
            }
        }
    }
}
