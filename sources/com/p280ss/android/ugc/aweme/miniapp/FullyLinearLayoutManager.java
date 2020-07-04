package com.p280ss.android.ugc.aweme.miniapp;

import android.content.Context;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;

/* renamed from: com.ss.android.ugc.aweme.miniapp.FullyLinearLayoutManager */
public class FullyLinearLayoutManager extends LinearLayoutManager {

    /* renamed from: a */
    private int[] f86931a = new int[2];

    public FullyLinearLayoutManager(Context context, int i, boolean z) {
        super(context, 1, false);
    }

    /* renamed from: a */
    public final void mo5754a(C1284o oVar, C1290s sVar, int i, int i2) {
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < mo5744A(); i5++) {
            m107661a(oVar, i5, MeasureSpec.makeMeasureSpec(i5, 0), MeasureSpec.makeMeasureSpec(i5, 0), this.f86931a);
            if (this.f4747i == 0) {
                i3 += this.f86931a[0];
                if (i5 == 0) {
                    i4 = this.f86931a[1];
                }
            } else {
                i4 += this.f86931a[1];
                if (i5 == 0) {
                    i3 = this.f86931a[0];
                }
            }
        }
        if (mode != 1073741824) {
            size = i3;
        }
        mo5784d(size, i4);
    }

    /* renamed from: a */
    private void m107661a(C1284o oVar, int i, int i2, int i3, int[] iArr) {
        try {
            View c = oVar.mo5848c(0);
            if (c != null) {
                LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
                c.measure(ViewGroup.getChildMeasureSpec(i2, mo5801t() + mo5803v(), layoutParams.width), ViewGroup.getChildMeasureSpec(i3, mo5802u() + mo5804w(), layoutParams.height));
                iArr[0] = c.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
                iArr[1] = c.getMeasuredHeight() + layoutParams.bottomMargin + layoutParams.topMargin;
                oVar.mo5840a(c);
            }
        } catch (Exception unused) {
        }
    }
}
