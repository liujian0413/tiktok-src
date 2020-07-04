package com.p280ss.android.p817ad.splash.core;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p828c.C19002c.C19003a;

/* renamed from: com.ss.android.ad.splash.core.BDASplashImageView */
public class BDASplashImageView extends ImageView {

    /* renamed from: a */
    public C19001b f51125a;

    /* renamed from: b */
    private C19049n f51126b;

    /* renamed from: c */
    private float f51127c;

    /* renamed from: d */
    private float f51128d;

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public boolean performClick() {
        return super.performClick();
    }

    public BDASplashImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: 0000 */
    public void setInteraction(C19049n nVar) {
        this.f51126b = nVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f51125a.mo50377r() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        super.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0) {
            this.f51127c = motionEvent.getX();
            this.f51128d = motionEvent.getY();
        } else if (motionEvent.getAction() == 1) {
            this.f51126b.mo50548a(this.f51125a, new C19003a().mo50499a(m61920a(this.f51127c, this.f51128d)).mo50500a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo50503a());
        }
        return true;
    }

    public BDASplashImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    private int m61920a(float f, float f2) {
        int i;
        int width = getWidth();
        int height = getHeight();
        float f3 = (float) width;
        if (f3 > 0.0f) {
            float f4 = (float) height;
            if (f4 > 0.0f) {
                float f5 = f / f3;
                float f6 = f2 / f4;
                int i2 = 1;
                if (f5 < 0.33f) {
                    i = 0;
                } else if (0.33f > f5 || f5 > 0.67f) {
                    i = 2;
                } else {
                    i = 1;
                }
                if (f6 < 0.33f) {
                    i2 = 0;
                } else if (0.33f > f6 || f6 > 0.67f) {
                    i2 = 2;
                }
                return (i2 * 3) + i;
            }
        }
        return -1;
    }

    public BDASplashImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
