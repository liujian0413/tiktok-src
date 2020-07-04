package com.bytedance.scene.p643c;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: com.bytedance.scene.c.c */
public class C12593c extends FrameLayout {

    /* renamed from: a */
    private boolean f33412a = true;

    public void setTouchEnabled(boolean z) {
        this.f33412a = z;
    }

    public C12593c(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f33412a) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
