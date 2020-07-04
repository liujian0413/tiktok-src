package com.p280ss.android.ugc.aweme.base.p308ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;

/* renamed from: com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout */
public class CustomInterceptTouchEventFrameLayout extends FrameLayout {

    /* renamed from: a */
    public static final int f61680a = C23486n.m77122a(8.0d);

    /* renamed from: b */
    boolean f61681b;

    /* renamed from: c */
    private C23416a f61682c;

    /* renamed from: d */
    private Runnable f61683d;

    /* renamed from: e */
    private int f61684e;

    /* renamed from: f */
    private int f61685f;

    /* renamed from: g */
    private boolean f61686g;

    /* renamed from: com.ss.android.ugc.aweme.base.ui.CustomInterceptTouchEventFrameLayout$a */
    public interface C23416a {
        /* renamed from: a */
        boolean mo60922a(float f, float f2);
    }

    public CustomInterceptTouchEventFrameLayout(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        m76815a(motionEvent);
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        super.onInterceptTouchEvent(motionEvent);
        m76815a(motionEvent);
        return this.f61681b;
    }

    /* renamed from: a */
    private boolean m76815a(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.f61684e = (int) motionEvent.getX();
                this.f61685f = (int) motionEvent.getY();
                break;
            case 1:
            case 3:
                this.f61681b = false;
                this.f61686g = false;
                break;
            case 2:
                if (this.f61682c != null) {
                    float x = motionEvent.getX() - ((float) this.f61684e);
                    float y = motionEvent.getY() - ((float) this.f61685f);
                    if (Math.abs(x) > ((float) f61680a) || Math.abs(y) > ((float) f61680a)) {
                        if (!this.f61682c.mo60922a(x, y)) {
                            this.f61681b = false;
                            break;
                        } else {
                            this.f61683d.run();
                            break;
                        }
                    }
                }
                break;
        }
        return this.f61681b;
    }

    public CustomInterceptTouchEventFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomInterceptTouchEventFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CustomInterceptTouchEventFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
