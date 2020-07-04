package com.bytedance.polaris.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;

public class FullscreenVideoFrame extends FrameLayout {

    /* renamed from: a */
    private C12437a f33030a;

    /* renamed from: com.bytedance.polaris.widget.FullscreenVideoFrame$a */
    public interface C12437a {
        /* renamed from: a */
        void mo30235a();
    }

    /* renamed from: a */
    private void m36181a() {
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void setListener(C12437a aVar) {
        this.f33030a = aVar;
    }

    public FullscreenVideoFrame(Context context) {
        super(context);
        m36181a();
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m36181a();
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f33030a != null) {
            this.f33030a.mo30235a();
        }
        return true;
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m36181a();
    }
}
