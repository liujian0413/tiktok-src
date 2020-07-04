package com.p280ss.android.ugc.aweme.feed.p1238ui.seekbar.detailvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DispatchTouchEventLinearLayout */
public final class DispatchTouchEventLinearLayout extends LinearLayout {

    /* renamed from: a */
    private C29010a f76422a;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.detailvideo.DispatchTouchEventLinearLayout$a */
    public interface C29010a {
        /* renamed from: a */
        boolean mo67665a(KeyEvent keyEvent);

        /* renamed from: a */
        boolean mo67666a(MotionEvent motionEvent);
    }

    public final void setDispatchTouchEventCallBack(C29010a aVar) {
        this.f76422a = aVar;
    }

    public DispatchTouchEventLinearLayout(Context context) {
        this(context, null);
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C29010a aVar = this.f76422a;
        if (aVar != null) {
            return aVar.mo67666a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public DispatchTouchEventLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DispatchTouchEventLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
