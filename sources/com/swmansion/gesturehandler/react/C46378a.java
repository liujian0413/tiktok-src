package com.swmansion.gesturehandler.react;

import android.os.Bundle;
import android.view.MotionEvent;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;

/* renamed from: com.swmansion.gesturehandler.react.a */
public final class C46378a extends ReactRootView {

    /* renamed from: a */
    private ReactInstanceManager f119412a;

    /* renamed from: b */
    private C46384g f119413b;

    /* renamed from: b */
    public final void mo115297b() {
        if (this.f119413b != null) {
            this.f119413b.mo115307a();
            this.f119413b = null;
        }
    }

    /* renamed from: a */
    public final void mo115296a() {
        if (this.f119413b == null) {
            this.f119413b = new C46384g(this.f119412a.getCurrentReactContext(), this);
            return;
        }
        StringBuilder sb = new StringBuilder("GestureHandler already initialized for root view ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        if (this.f119413b != null) {
            this.f119413b.mo115309a(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f119413b == null || !this.f119413b.mo115310a(motionEvent)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public final void startReactApplication(ReactInstanceManager reactInstanceManager, String str, Bundle bundle) {
        super.startReactApplication(reactInstanceManager, str, bundle);
        this.f119412a = reactInstanceManager;
    }
}
