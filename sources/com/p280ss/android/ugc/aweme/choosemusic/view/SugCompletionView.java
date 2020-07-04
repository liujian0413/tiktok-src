package com.p280ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

/* renamed from: com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView */
public class SugCompletionView extends AppCompatImageView {

    /* renamed from: a */
    private int f63300a;

    /* renamed from: b */
    private C23955a f63301b;

    /* renamed from: com.ss.android.ugc.aweme.choosemusic.view.SugCompletionView$a */
    public interface C23955a {
        /* renamed from: a */
        void mo62159a();

        /* renamed from: a */
        void mo62160a(boolean z);
    }

    public void setKeyboardDismissHandler(C23955a aVar) {
        this.f63301b = aVar;
    }

    public SugCompletionView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m78634a(Context context) {
        this.f63300a = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f63301b != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            switch (motionEvent.getAction()) {
                case 0:
                    this.f63301b.mo62160a(false);
                    break;
                case 1:
                case 3:
                    this.f63301b.mo62160a(true);
                    break;
                case 2:
                    if (!m78635a(x, y, (float) this.f63300a)) {
                        this.f63301b.mo62159a();
                        break;
                    }
                    break;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public SugCompletionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SugCompletionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m78634a(context);
    }

    /* renamed from: a */
    private boolean m78635a(float f, float f2, float f3) {
        float f4 = -f3;
        if (f < f4 || f2 < f4 || f >= ((float) (getRight() - getLeft())) + f3 || f2 >= ((float) (getBottom() - getTop())) + f3) {
            return false;
        }
        return true;
    }
}
