package com.p280ss.android.ugc.aweme.p1416n;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.n.b */
public final class C34033b implements OnTouchListener {

    /* renamed from: a */
    private final float f88774a = 1.2f;

    /* renamed from: b */
    private final long f88775b;

    /* renamed from: c */
    private final OnTouchListener f88776c;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.animate().scaleX(this.f88774a).scaleY(this.f88774a).setDuration(this.f88775b).start();
                    break;
                case 1:
                    break;
            }
        }
        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(this.f88775b).start();
        if (this.f88776c == null || !this.f88776c.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }

    public C34033b(float f, long j, OnTouchListener onTouchListener) {
        this.f88775b = j;
        this.f88776c = null;
    }
}
