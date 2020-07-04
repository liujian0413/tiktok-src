package com.p280ss.android.ugc.aweme.p313im.sdk.chat.view;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.view.a */
public final class C31008a extends PopupWindow {

    /* renamed from: a */
    public int f81181a;

    /* renamed from: b */
    public int f81182b;

    /* renamed from: c */
    public int f81183c;

    /* renamed from: d */
    private View f81184d;

    /* renamed from: e */
    private Context f81185e;

    /* renamed from: f */
    private int f81186f;

    /* renamed from: b */
    private void m100878b(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f81181a, iArr[0] + i, (iArr[1] - this.f81186f) + i2);
    }

    /* renamed from: d */
    private void m100880d(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f81181a, iArr[0] - view.getWidth(), iArr[1]);
    }

    /* renamed from: e */
    private void m100881e(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        showAtLocation(view, this.f81181a, iArr[0] + view.getWidth(), iArr[1]);
    }

    /* renamed from: c */
    private void m100879c(View view, int i, int i2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i3 = this.f81181a;
        double width = (double) (iArr[0] + (view.getWidth() / 2));
        double d = (double) this.f81183c;
        Double.isNaN(d);
        double d2 = d * 0.6666666666666666d;
        Double.isNaN(width);
        showAtLocation(view, i3, (int) (width - d2), iArr[1] + view.getHeight());
    }

    /* renamed from: a */
    public final void mo81418a(View view, int i, int i2) {
        dismiss();
        if (view != null) {
            switch (this.f81182b) {
                case 0:
                    m100878b(view, i, i2);
                    return;
                case 1:
                    m100879c(view, i, i2);
                    return;
                case 2:
                    m100880d(view, i, i2);
                    return;
                case 3:
                    m100881e(view, i, i2);
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo81419a(View view, Activity activity, int i, int i2) {
        this.f81184d = view;
        this.f81185e = activity;
        setContentView(view);
        setWidth(-2);
        setHeight(-2);
        setOutsideTouchable(true);
        this.f81183c = i;
        this.f81186f = i2;
    }
}
