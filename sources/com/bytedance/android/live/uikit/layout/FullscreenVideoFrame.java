package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;

public class FullscreenVideoFrame extends FrameLayout {

    /* renamed from: a */
    private C3536a f10510a;

    /* renamed from: com.bytedance.android.live.uikit.layout.FullscreenVideoFrame$a */
    public interface C3536a {
        /* renamed from: a */
        void mo10667a();
    }

    /* renamed from: a */
    private void m13007a() {
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    public void setListener(C3536a aVar) {
        this.f10510a = aVar;
    }

    public FullscreenVideoFrame(Context context) {
        super(context);
        m13007a();
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m13007a();
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
        if (this.f10510a != null) {
            this.f10510a.mo10667a();
        }
        return true;
    }

    public FullscreenVideoFrame(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13007a();
    }
}
