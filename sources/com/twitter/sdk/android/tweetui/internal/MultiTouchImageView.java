package com.twitter.sdk.android.tweetui.internal;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.twitter.sdk.android.tweetui.internal.C47077j.C47079b;

public class MultiTouchImageView extends ImageView implements C47079b {

    /* renamed from: a */
    final ScaleGestureDetector f120702a;

    /* renamed from: b */
    final GestureDetector f120703b;

    /* renamed from: c */
    final Matrix f120704c;

    /* renamed from: d */
    final Matrix f120705d;

    /* renamed from: e */
    final Matrix f120706e;

    /* renamed from: f */
    final RectF f120707f;

    /* renamed from: g */
    final RectF f120708g;

    /* renamed from: h */
    final float[] f120709h;

    /* renamed from: i */
    boolean f120710i;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118256a() {
        this.f120706e.reset();
    }

    /* renamed from: d */
    private boolean m147088d() {
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicWidth() <= 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo118262b() {
        m147090f();
        setScaleType(ScaleType.MATRIX);
        setImageMatrix(getDrawMatrix());
    }

    /* renamed from: c */
    public final boolean mo118263c() {
        if (getScale() == 1.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public float getScale() {
        this.f120706e.getValues(this.f120709h);
        return this.f120709h[0];
    }

    /* access modifiers changed from: 0000 */
    public Matrix getDrawMatrix() {
        this.f120704c.set(this.f120705d);
        this.f120704c.postConcat(this.f120706e);
        return this.f120704c;
    }

    /* renamed from: e */
    private void m147089e() {
        this.f120707f.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (getWidth() - getPaddingRight()), (float) (getHeight() - getPaddingBottom()));
    }

    /* renamed from: f */
    private void m147090f() {
        float f;
        RectF a = m147086a(getDrawMatrix());
        float f2 = 0.0f;
        if (a.height() <= this.f120707f.height()) {
            f = ((this.f120707f.height() - a.height()) / 2.0f) - a.top;
        } else if (a.top > 0.0f) {
            f = -a.top;
        } else if (a.bottom < this.f120707f.height()) {
            f = this.f120707f.height() - a.bottom;
        } else {
            f = 0.0f;
        }
        if (a.width() <= this.f120707f.width()) {
            this.f120710i = true;
            f2 = ((this.f120707f.width() - a.width()) / 2.0f) - a.left;
        } else if (a.left > 0.0f) {
            this.f120710i = true;
            f2 = -a.left;
        } else if (a.right < this.f120707f.width()) {
            this.f120710i = true;
            f2 = this.f120707f.width() - a.right;
        } else {
            this.f120710i = false;
        }
        mo118257a(f2, f);
    }

    public MultiTouchImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private RectF m147086a(Matrix matrix) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            this.f120708g.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            matrix.mapRect(this.f120708g);
        }
        return this.f120708g;
    }

    /* renamed from: a */
    private void m147087a(Drawable drawable) {
        RectF rectF = new RectF(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        this.f120705d.reset();
        this.f120705d.setRectToRect(rectF, this.f120707f, ScaleToFit.CENTER);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (!m147088d()) {
            return false;
        }
        mo118261a(true);
        boolean onTouchEvent = this.f120702a.onTouchEvent(motionEvent);
        if (this.f120703b.onTouchEvent(motionEvent) || onTouchEvent) {
            z = true;
        } else {
            z = false;
        }
        if (z || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118261a(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118257a(float f, float f2) {
        this.f120706e.postTranslate(f, f2);
    }

    public MultiTouchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f120704c = new Matrix();
        this.f120705d = new Matrix();
        this.f120706e = new Matrix();
        this.f120707f = new RectF();
        this.f120708g = new RectF();
        this.f120709h = new float[9];
        this.f120702a = new ScaleGestureDetector(context, new SimpleOnScaleGestureListener() {
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                MultiTouchImageView.this.mo118258a(scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                MultiTouchImageView.this.mo118262b();
                return true;
            }

            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
                if (MultiTouchImageView.this.getScale() < 1.0f) {
                    MultiTouchImageView.this.mo118256a();
                    MultiTouchImageView.this.mo118262b();
                }
            }
        });
        this.f120703b = new GestureDetector(context, new SimpleOnGestureListener() {
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                if (MultiTouchImageView.this.getScale() > 1.0f) {
                    MultiTouchImageView.this.mo118259a(MultiTouchImageView.this.getScale(), 1.0f, motionEvent.getX(), motionEvent.getY());
                } else {
                    MultiTouchImageView.this.mo118259a(MultiTouchImageView.this.getScale(), 2.0f, motionEvent.getX(), motionEvent.getY());
                }
                return true;
            }

            public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                MultiTouchImageView.this.mo118257a(-f, -f2);
                MultiTouchImageView.this.mo118262b();
                if (MultiTouchImageView.this.f120710i && !MultiTouchImageView.this.f120702a.isInProgress()) {
                    MultiTouchImageView.this.mo118261a(false);
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118258a(float f, float f2, float f3) {
        this.f120706e.postScale(f, f, f2, f3);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo118260a(float f, float f2, ValueAnimator valueAnimator) {
        mo118258a(((Float) valueAnimator.getAnimatedValue()).floatValue() / getScale(), f, f2);
        mo118262b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo118259a(float f, float f2, float f3, float f4) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addUpdateListener(new C47072f(this, f3, f4));
        ofFloat.start();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (m147088d()) {
            m147089e();
            m147087a(getDrawable());
            mo118262b();
        }
    }
}
