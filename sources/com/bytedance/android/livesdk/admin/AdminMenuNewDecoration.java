package com.bytedance.android.livesdk.admin;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import com.bytedance.android.livesdk.admin.p184b.C3891d;
import com.bytedance.common.utility.C9738o;
import java.util.List;

public class AdminMenuNewDecoration extends C1272h {

    /* renamed from: a */
    protected Drawable f11601a;

    /* renamed from: b */
    private Context f11602b;

    /* renamed from: c */
    private List<C3891d> f11603c;

    /* renamed from: d */
    private int f11604d;

    /* renamed from: a */
    private void m13747a(Canvas canvas, RecyclerView recyclerView) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount() - 1;
        if (childCount > 0 && ((C3891d) this.f11603c.get(this.f11603c.size() - 1)).f11621a == 3) {
            childCount--;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f11601a.setBounds(paddingLeft, bottom, width, (this.f11601a.getIntrinsicHeight() + bottom) - 1);
            this.f11601a.draw(canvas);
        }
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (this.f11604d == 1) {
            m13747a(canvas, recyclerView);
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        if (RecyclerView.m5892f(view) == this.f11603c.size() - 2) {
            rect.set(0, 0, 0, (int) C9738o.m28708b(this.f11602b, 8.0f));
        } else {
            rect.set(0, 0, 0, this.f11601a.getIntrinsicHeight());
        }
    }
}
