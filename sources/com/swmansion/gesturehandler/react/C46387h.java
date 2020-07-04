package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import com.facebook.infer.p728a.C13854a;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.views.view.ReactViewGroup;

/* renamed from: com.swmansion.gesturehandler.react.h */
public final class C46387h extends ReactViewGroup {

    /* renamed from: a */
    private C46384g f119429a;

    /* renamed from: a */
    public final void mo115313a() {
        if (this.f119429a != null) {
            this.f119429a.mo115307a();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f119429a == null) {
            this.f119429a = new C46384g((ReactContext) getContext(), this);
        }
    }

    public C46387h(Context context) {
        super(context);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ((C46384g) C13854a.m40916b(this.f119429a)).mo115309a(z);
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((C46384g) C13854a.m40916b(this.f119429a)).mo115310a(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }
}
