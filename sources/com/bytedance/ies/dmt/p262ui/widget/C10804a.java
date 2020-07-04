package com.bytedance.ies.dmt.p262ui.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

/* renamed from: com.bytedance.ies.dmt.ui.widget.a */
public final class C10804a implements OnTouchListener {

    /* renamed from: a */
    private float f29115a = 0.5f;

    /* renamed from: b */
    private float f29116b = 1.0f;

    public C10804a(float f, float f2) {
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    view.setAlpha(this.f29115a);
                    break;
                case 1:
                    break;
            }
        }
        view.setAlpha(this.f29116b);
        return false;
    }
}
