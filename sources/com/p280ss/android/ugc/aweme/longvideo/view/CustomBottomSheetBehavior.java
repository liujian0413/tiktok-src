package com.p280ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior */
public final class CustomBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {

    /* renamed from: p */
    private C32756a f85397p;

    /* renamed from: com.ss.android.ugc.aweme.longvideo.view.CustomBottomSheetBehavior$a */
    public interface C32756a {
        /* renamed from: a */
        void mo64987a(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent);
    }

    public CustomBottomSheetBehavior() {
    }

    /* renamed from: a */
    public final void mo84249a(C32756a aVar) {
        C7573i.m23587b(aVar, "onTouchEventCallBack");
        this.f85397p = aVar;
    }

    public CustomBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "ctx");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final boolean mo1219a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C7573i.m23587b(coordinatorLayout, "parent");
        C7573i.m23587b(v, "child");
        C7573i.m23587b(motionEvent, "event");
        C32756a aVar = this.f85397p;
        if (aVar != null) {
            aVar.mo64987a(coordinatorLayout, v, motionEvent);
        }
        return super.mo1219a(coordinatorLayout, (View) v, motionEvent);
    }
}
