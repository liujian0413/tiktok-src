package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout */
public class TouchSensitiveRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private C41672a f108413a;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.TouchSensitiveRelativeLayout$a */
    public interface C41672a {
        /* renamed from: a */
        void mo102417a();
    }

    public TouchSensitiveRelativeLayout(Context context) {
        super(context);
    }

    public void setNoBlockTouchListener(C41672a aVar) {
        this.f108413a = aVar;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f108413a != null) {
            this.f108413a.mo102417a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public TouchSensitiveRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TouchSensitiveRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
