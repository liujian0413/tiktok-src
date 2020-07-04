package com.p280ss.android.ugc.aweme.p1416n;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.ss.android.ugc.aweme.n.a */
public final class C34032a implements OnTouchListener {

    /* renamed from: a */
    public OnTouchListener f88771a;

    /* renamed from: b */
    private final float f88772b = 0.5f;

    /* renamed from: c */
    private final long f88773c;

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.animate().alpha(this.f88772b).setDuration(this.f88773c).start();
                    break;
                case 1:
                    break;
            }
        }
        view.animate().alpha(1.0f).setDuration(this.f88773c).start();
        if (this.f88771a == null || !this.f88771a.onTouch(view, motionEvent)) {
            return false;
        }
        return true;
    }

    public C34032a(float f, long j, OnTouchListener onTouchListener) {
        this.f88773c = j;
        this.f88771a = onTouchListener;
    }
}
