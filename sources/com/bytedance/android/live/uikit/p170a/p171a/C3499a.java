package com.bytedance.android.live.uikit.p170a.p171a;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.bytedance.android.live.uikit.a.a.a */
public final class C3499a extends C3504b {

    /* renamed from: a */
    protected ScaleGestureDetector f10314a;

    /* renamed from: b */
    protected GestureDetector f10315b;

    /* renamed from: c */
    protected float f10316c;

    /* renamed from: d */
    protected float f10317d;

    /* renamed from: e */
    protected int f10318e;

    /* renamed from: f */
    protected boolean f10319f;

    /* renamed from: g */
    protected boolean f10320g;

    /* renamed from: h */
    protected boolean f10321h;

    /* renamed from: i */
    public C3501b f10322i;

    /* renamed from: j */
    protected boolean f10323j;

    /* renamed from: k */
    protected OnClickListener f10324k;

    /* renamed from: com.bytedance.android.live.uikit.a.a.a$a */
    public class C3500a extends SimpleOnGestureListener {
        public C3500a() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (C3499a.this.isLongClickable() && !C3499a.this.f10314a.isInProgress()) {
                C3499a.this.setPressed(true);
                C3499a.this.performLongClick();
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (C3499a.this.f10324k == null || !C3499a.this.f10323j) {
                return super.onSingleTapConfirmed(motionEvent);
            }
            C3499a.this.f10324k.onClick(C3499a.this);
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (C3499a.this.f10319f) {
                float min = Math.min(C3499a.this.getMaxZoom(), Math.max(C3499a.this.mo10532a(C3499a.this.getScale(), C3499a.this.getMaxZoom()), C3499a.this.getMinZoom()));
                C3499a.this.f10316c = min;
                C3499a.this.mo10561a(min, motionEvent.getX(), motionEvent.getY(), 200.0f);
                C3499a.this.invalidate();
            }
            return super.onDoubleTap(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return C3499a.this.mo10539b(motionEvent, motionEvent2, f, f2);
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return C3499a.this.mo10537a(motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.a.a.a$b */
    public interface C3501b {
    }

    /* renamed from: com.bytedance.android.live.uikit.a.a.a$c */
    public class C3502c extends SimpleOnScaleGestureListener {
        public C3502c() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getCurrentSpan();
            scaleGestureDetector.getPreviousSpan();
            float scaleFactor = C3499a.this.f10316c * scaleGestureDetector.getScaleFactor();
            if (!C3499a.this.f10320g) {
                return false;
            }
            float min = Math.min(C3499a.this.getMaxZoom(), Math.max(scaleFactor, C3499a.this.getMinZoom() - 0.1f));
            C3499a.this.mo10560a(min, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            C3499a.this.f10316c = Math.min(C3499a.this.getMaxZoom(), Math.max(min, C3499a.this.getMinZoom() - 1.0f));
            C3499a.this.f10318e = 1;
            C3499a.this.invalidate();
            return true;
        }
    }

    public final boolean getDoubleTapEnabled() {
        return this.f10319f;
    }

    /* access modifiers changed from: protected */
    public final OnGestureListener getGestureListener() {
        return new C3500a();
    }

    /* access modifiers changed from: protected */
    public final OnScaleGestureListener getScaleListener() {
        return new C3502c();
    }

    public final void setDoubleTapEnabled(boolean z) {
        this.f10319f = z;
    }

    public final void setDoubleTapListener(C3501b bVar) {
        this.f10322i = bVar;
    }

    public final void setMyOnClickListener(OnClickListener onClickListener) {
        this.f10324k = onClickListener;
    }

    public final void setScaleEnabled(boolean z) {
        this.f10320g = z;
    }

    public final void setScrollEnabled(boolean z) {
        this.f10321h = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10533a(float f) {
        super.mo10533a(f);
        if (!this.f10314a.isInProgress()) {
            this.f10316c = f;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10538b(float f) {
        super.mo10538b(f);
        if (!this.f10314a.isInProgress()) {
            this.f10316c = f;
        }
        if (f < getMinZoom()) {
            mo10564b(getMinZoom(), 50.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10534a(Drawable drawable) {
        super.mo10534a(drawable);
        float[] fArr = new float[9];
        this.f10332n.getValues(fArr);
        this.f10316c = fArr[0];
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 0) {
            this.f10323j = true;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f10323j = false;
        }
        this.f10314a.onTouchEvent(motionEvent);
        if (!this.f10314a.isInProgress()) {
            this.f10315b.onTouchEvent(motionEvent);
        }
        switch (action) {
            case 0:
                this.f10328B = false;
                break;
            case 1:
                if (getScale() < getMinZoom()) {
                    mo10564b(getMinZoom(), 50.0f);
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo10536a(int i) {
        if (getDrawable() == null) {
            return false;
        }
        RectF bitmapRect = getBitmapRect();
        if (bitmapRect == null) {
            return false;
        }
        mo10562a(bitmapRect, this.f10327A);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect.right < ((float) rect.right) || i >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.f10327A.left)) > 1.0d) {
                return true;
            }
            return false;
        } else if (Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo10532a(float f, float f2) {
        if (this.f10318e != 1) {
            this.f10318e = 1;
            return 1.0f;
        } else if ((this.f10317d * 2.0f) + f <= f2) {
            return f + this.f10317d;
        } else {
            this.f10318e = -1;
            return f2;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10535a(Drawable drawable, boolean z, Matrix matrix, float f) {
        super.mo10535a(drawable, z, matrix, f);
        this.f10317d = getMaxZoom() / 3.0f;
    }

    /* renamed from: b */
    public final boolean mo10539b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f10321h || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.f10314a.isInProgress()) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f) <= 800.0f && Math.abs(f2) <= 800.0f) {
            return false;
        }
        mo10559a(x / 2.0f, y / 2.0f, 300.0d);
        invalidate();
        return true;
    }

    /* renamed from: a */
    public final boolean mo10537a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f10321h || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.f10314a.isInProgress()) {
            return false;
        }
        if (getScale() == 1.0f && !this.f10341w) {
            return false;
        }
        mo10566c(-f, -f2);
        invalidate();
        return true;
    }
}
