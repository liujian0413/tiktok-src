package com.p280ss.android.p817ad.splash.p836g;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.ad.splash.g.d */
public final class C19125d extends TouchDelegate {

    /* renamed from: a */
    private View f51708a;

    /* renamed from: b */
    private Rect f51709b;

    /* renamed from: c */
    private Rect f51710c;

    /* renamed from: d */
    private boolean f51711d;

    /* renamed from: e */
    private int f51712e;

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            float r0 = r6.getX()
            int r0 = (int) r0
            float r1 = r6.getY()
            int r1 = (int) r1
            int r2 = r6.getAction()
            r3 = 1
            r4 = 0
            switch(r2) {
                case 0: goto L_0x0026;
                case 1: goto L_0x001b;
                case 2: goto L_0x001b;
                case 3: goto L_0x0015;
                default: goto L_0x0013;
            }
        L_0x0013:
            r2 = 0
            goto L_0x0035
        L_0x0015:
            boolean r0 = r5.f51711d
            r5.f51711d = r4
            r2 = r0
            goto L_0x0035
        L_0x001b:
            boolean r2 = r5.f51711d
            if (r2 == 0) goto L_0x0035
            android.graphics.Rect r3 = r5.f51710c
            boolean r3 = r3.contains(r0, r1)
            goto L_0x0035
        L_0x0026:
            android.graphics.Rect r2 = r5.f51709b
            boolean r0 = r2.contains(r0, r1)
            if (r0 == 0) goto L_0x0032
            r5.f51711d = r3
            r2 = 1
            goto L_0x0035
        L_0x0032:
            r5.f51711d = r4
            goto L_0x0013
        L_0x0035:
            if (r2 == 0) goto L_0x0060
            android.view.View r0 = r5.f51708a
            if (r3 == 0) goto L_0x004d
            int r1 = r0.getWidth()
            int r1 = r1 / 2
            float r1 = (float) r1
            int r2 = r0.getHeight()
            int r2 = r2 / 2
            float r2 = (float) r2
            r6.setLocation(r1, r2)
            goto L_0x0056
        L_0x004d:
            int r1 = r5.f51712e
            int r1 = r1 * 2
            int r1 = -r1
            float r1 = (float) r1
            r6.setLocation(r1, r1)
        L_0x0056:
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0060
            boolean r4 = r0.dispatchTouchEvent(r6)
        L_0x0060:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p817ad.splash.p836g.C19125d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C19125d(Rect rect, View view) {
        super(rect, view);
        this.f51709b = rect;
        this.f51712e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        this.f51710c = new Rect(rect);
        this.f51710c.inset(-this.f51712e, -this.f51712e);
        this.f51708a = view;
    }
}
