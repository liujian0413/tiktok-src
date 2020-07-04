package com.p280ss.android.ugc.aweme.emoji.views;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: com.ss.android.ugc.aweme.emoji.views.b */
public final class C27682b extends PopupWindow {

    /* renamed from: a */
    public int f72972a;

    /* renamed from: b */
    public int f72973b;

    /* renamed from: c */
    public int f72974c;

    /* renamed from: d */
    private View f72975d;

    /* renamed from: e */
    private Context f72976e;

    /* renamed from: f */
    private int f72977f;

    /* renamed from: a */
    public final void mo71117a(View view, Context context) {
        this.f72975d = view;
        this.f72976e = context;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        view.measure(0, 0);
        this.f72974c = view.getMeasuredWidth();
        this.f72977f = view.getMeasuredHeight();
    }

    /* renamed from: b */
    private void m90818b(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f72972a, iArr[0] + i, (iArr[1] - this.f72977f) + i2);
    }

    /* renamed from: d */
    private void m90820d(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f72972a, iArr[0] - view.getWidth(), iArr[1]);
    }

    /* renamed from: e */
    private void m90821e(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        showAtLocation(view, this.f72972a, iArr[0] + view.getWidth(), iArr[1]);
    }

    /* renamed from: c */
    private void m90819c(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i3 = this.f72972a;
        double width = (double) (iArr[0] + (view.getWidth() / 2));
        double d = (double) this.f72974c;
        Double.isNaN(d);
        double d2 = d * 0.6666666666666666d;
        Double.isNaN(width);
        showAtLocation(view, i3, (int) (width - d2), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public final void mo71116a(View view, int i, int i2) {
        dismiss();
        if (view != null) {
            switch (this.f72973b) {
                case 0:
                    m90818b(view, i, i2);
                    return;
                case 1:
                    m90819c(view, i, i2);
                    return;
                case 2:
                    m90820d(view, i, i2);
                    return;
                case 3:
                    m90821e(view, i, i2);
                    break;
            }
        }
    }
}
