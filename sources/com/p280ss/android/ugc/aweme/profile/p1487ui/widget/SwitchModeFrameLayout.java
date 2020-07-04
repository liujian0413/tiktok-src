package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout */
public class SwitchModeFrameLayout extends FrameLayout {

    /* renamed from: a */
    private C36657b f96266a;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout$a */
    public static class C36656a implements C36657b {
        /* renamed from: a */
        public void mo91979a(MotionEvent motionEvent) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.SwitchModeFrameLayout$b */
    public interface C36657b {
        /* renamed from: a */
        void mo91979a(MotionEvent motionEvent);
    }

    public SwitchModeFrameLayout(Context context) {
        super(context);
    }

    public void setIntercepter(C36657b bVar) {
        this.f96266a = bVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f96266a != null) {
            this.f96266a.mo91979a(motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public SwitchModeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SwitchModeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
