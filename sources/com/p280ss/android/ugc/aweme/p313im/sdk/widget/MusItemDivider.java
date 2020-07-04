package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.MusItemDivider */
public class MusItemDivider extends C1272h {

    /* renamed from: a */
    private int f83609a;

    /* renamed from: b */
    private int f83610b;

    /* renamed from: c */
    private int f83611c;

    /* renamed from: d */
    private Paint f83612d;

    /* renamed from: e */
    private final Rect f83613e = new Rect();

    /* renamed from: a */
    private void m103877a(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        float f;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i2 = recyclerView.getPaddingLeft();
            i = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i2, recyclerView.getPaddingTop(), i, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            i = recyclerView.getWidth();
            i2 = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            RecyclerView.m5876a(childAt, this.f83613e);
            int round = this.f83613e.bottom + Math.round(C0991u.m4235n(childAt));
            int i4 = round - this.f83609a;
            if (i3 == childCount - 1) {
                f = (float) i2;
            } else {
                f = (float) (this.f83610b + i2);
            }
            canvas.drawRect(f, (float) i4, (float) i, (float) round, this.f83612d);
        }
        canvas.restore();
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1290s sVar) {
        if (recyclerView.getLayoutManager() != null) {
            m103877a(canvas, recyclerView);
        }
    }

    public MusItemDivider(int i, int i2, int i3) {
        this.f83611c = i;
        this.f83612d = new Paint(1);
        this.f83612d.setColor(this.f83611c);
        this.f83609a = i2;
        this.f83610b = i3;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
        int i;
        recyclerView.getLayoutManager();
        if (C1273i.m6060c(view) == 0) {
            i = this.f83609a;
        } else {
            i = 0;
        }
        rect.set(0, i, 0, this.f83609a);
    }
}
