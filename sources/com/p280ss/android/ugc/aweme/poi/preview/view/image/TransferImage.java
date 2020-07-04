package com.p280ss.android.ugc.aweme.poi.preview.view.image;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.generic.C13439b;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.view.C13445b;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage */
public class TransferImage extends PhotoView {

    /* renamed from: E */
    public int f92127E;

    /* renamed from: F */
    public int f92128F;

    /* renamed from: G */
    public int f92129G;

    /* renamed from: H */
    public int f92130H;

    /* renamed from: I */
    public int f92131I;

    /* renamed from: J */
    public int f92132J;

    /* renamed from: K */
    public int f92133K;

    /* renamed from: L */
    public Paint f92134L;

    /* renamed from: M */
    public C35199c f92135M;

    /* renamed from: N */
    public C35198b f92136N;

    /* renamed from: O */
    private C13445b<C13438a> f92137O;

    /* renamed from: P */
    private long f92138P;

    /* renamed from: Q */
    private boolean f92139Q;

    /* renamed from: R */
    private Matrix f92140R;

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$a */
    class C35197a implements Cloneable {

        /* renamed from: a */
        float f92146a;

        /* renamed from: b */
        float f92147b;

        /* renamed from: c */
        float f92148c;

        /* renamed from: d */
        float f92149d;

        public final Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("[left:");
            sb.append(this.f92146a);
            sb.append(" top:");
            sb.append(this.f92147b);
            sb.append(" width:");
            sb.append(this.f92148c);
            sb.append(" height:");
            sb.append(this.f92149d);
            sb.append("]");
            return sb.toString();
        }

        private C35197a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$b */
    public interface C35198b {
        /* renamed from: a */
        void mo89519a(int i, int i2, int i3);
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage$c */
    class C35199c {

        /* renamed from: a */
        float f92151a;

        /* renamed from: b */
        float f92152b;

        /* renamed from: c */
        float f92153c;

        /* renamed from: d */
        int f92154d;

        /* renamed from: e */
        C35197a f92155e;

        /* renamed from: f */
        C35197a f92156f;

        /* renamed from: g */
        C35197a f92157g;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo89611a() {
            this.f92153c = this.f92151a;
            try {
                this.f92157g = (C35197a) this.f92155e.clone();
            } catch (CloneNotSupportedException unused) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo89612b() {
            this.f92153c = this.f92152b;
            try {
                this.f92157g = (C35197a) this.f92156f.clone();
            } catch (CloneNotSupportedException unused) {
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final void mo89613c() {
            this.f92153c = this.f92151a;
            try {
                this.f92157g = (C35197a) this.f92156f.clone();
            } catch (CloneNotSupportedException unused) {
            }
        }

        C35199c(boolean z) {
            int i;
            if (z) {
                i = NormalGiftView.ALPHA_255;
            } else {
                i = 0;
            }
            this.f92154d = i;
        }
    }

    public long getDuration() {
        return this.f92138P;
    }

    public int getState() {
        return this.f92127E;
    }

    /* renamed from: f */
    public final void mo89587f() {
        this.f92127E = 3;
        this.f92139Q = true;
    }

    public C13386a getController() {
        return this.f92137O.f35652b;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f92137O.mo32934b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f92137O.mo32935c();
    }

    public void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        this.f92137O.mo32934b();
    }

    public void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
        this.f92137O.mo32935c();
    }

    /* renamed from: g */
    public final void mo89588g() {
        this.f92128F = 100;
        this.f92127E = 1;
        this.f92139Q = true;
        this.f92134L.setAlpha(0);
        invalidate();
    }

    /* renamed from: h */
    public final void mo89592h() {
        this.f92128F = 100;
        this.f92127E = 2;
        this.f92139Q = true;
        this.f92134L.setAlpha(NormalGiftView.ALPHA_255);
        invalidate();
    }

    /* renamed from: i */
    private void m113571i() {
        this.f92140R = new Matrix();
        this.f92134L = new Paint();
        if (this.f92137O == null) {
            this.f92137O = C13445b.m39493a(new C13439b(getResources()).mo32908a(), getContext());
        }
    }

    /* renamed from: j */
    private void m113572j() {
        Drawable drawable = getDrawable();
        if (drawable != null && this.f92135M != null) {
            this.f92140R.setScale(this.f92135M.f92153c, this.f92135M.f92153c);
            this.f92140R.postTranslate(-(((this.f92135M.f92153c * ((float) drawable.getIntrinsicWidth())) / 2.0f) - (this.f92135M.f92157g.f92148c / 2.0f)), -(((this.f92135M.f92153c * ((float) drawable.getIntrinsicHeight())) / 2.0f) - (this.f92135M.f92157g.f92149d / 2.0f)));
        }
    }

    /* renamed from: k */
    private void m113573k() {
        if (this.f92135M != null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setDuration(this.f92138P);
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
            if (this.f92129G == 201) {
                valueAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("left", new float[]{this.f92135M.f92155e.f92146a, this.f92135M.f92156f.f92146a}), PropertyValuesHolder.ofFloat("top", new float[]{this.f92135M.f92155e.f92147b, this.f92135M.f92156f.f92147b}), PropertyValuesHolder.ofFloat("width", new float[]{this.f92135M.f92155e.f92148c, this.f92135M.f92156f.f92148c}), PropertyValuesHolder.ofFloat("height", new float[]{this.f92135M.f92155e.f92149d, this.f92135M.f92156f.f92149d})});
                valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                    public final synchronized void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TransferImage.this.f92134L.setAlpha((int) (valueAnimator.getAnimatedFraction() * 255.0f));
                        TransferImage.this.f92135M.f92157g.f92146a = ((Float) valueAnimator.getAnimatedValue("left")).floatValue();
                        TransferImage.this.f92135M.f92157g.f92147b = ((Float) valueAnimator.getAnimatedValue("top")).floatValue();
                        TransferImage.this.f92135M.f92157g.f92148c = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                        TransferImage.this.f92135M.f92157g.f92149d = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                        TransferImage.this.invalidate();
                    }
                });
            } else {
                PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat("left", new float[]{this.f92135M.f92155e.f92146a, this.f92135M.f92156f.f92146a});
                PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat("top", new float[]{this.f92135M.f92155e.f92147b, this.f92135M.f92156f.f92147b});
                PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat("width", new float[]{this.f92135M.f92155e.f92148c, this.f92135M.f92156f.f92148c});
                PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat("height", new float[]{this.f92135M.f92155e.f92149d, this.f92135M.f92156f.f92149d});
                valueAnimator.setValues(new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scale", new float[]{this.f92135M.f92151a, this.f92135M.f92152b}), ofFloat, ofFloat2, ofFloat3, ofFloat4});
                valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                    public final synchronized void onAnimationUpdate(ValueAnimator valueAnimator) {
                        TransferImage.this.f92135M.f92157g.f92146a = ((Float) valueAnimator.getAnimatedValue("left")).floatValue();
                        TransferImage.this.f92135M.f92157g.f92147b = ((Float) valueAnimator.getAnimatedValue("top")).floatValue();
                        TransferImage.this.f92135M.f92157g.f92148c = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                        TransferImage.this.f92135M.f92157g.f92149d = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                        TransferImage.this.f92135M.f92153c = ((Float) valueAnimator.getAnimatedValue("scale")).floatValue();
                        TransferImage.this.invalidate();
                    }
                });
            }
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (TransferImage.this.f92129G == 201) {
                        TransferImage.this.f92132J = (int) TransferImage.this.f92135M.f92156f.f92146a;
                        TransferImage.this.f92133K = (int) TransferImage.this.f92135M.f92156f.f92147b;
                        TransferImage.this.f92130H = (int) TransferImage.this.f92135M.f92156f.f92148c;
                        TransferImage.this.f92131I = (int) TransferImage.this.f92135M.f92156f.f92149d;
                    }
                    if (TransferImage.this.f92127E == 1 && TransferImage.this.f92129G == 202) {
                        TransferImage.this.f92127E = 0;
                    }
                    if (TransferImage.this.f92136N != null) {
                        TransferImage.this.f92136N.mo89519a(TransferImage.this.f92127E, TransferImage.this.f92128F, TransferImage.this.f92129G);
                    }
                }
            });
            if (this.f92127E == 1) {
                valueAnimator.start();
            } else {
                valueAnimator.reverse();
            }
        }
    }

    /* renamed from: l */
    private void m113574l() {
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        PropertyValuesHolder propertyValuesHolder3;
        PropertyValuesHolder propertyValuesHolder4;
        PropertyValuesHolder propertyValuesHolder5;
        if (this.f92135M != null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setDuration(this.f92138P);
            valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
            if (this.f92135M.f92155e.f92148c == 0.0f || this.f92135M.f92155e.f92149d == 0.0f) {
                propertyValuesHolder5 = PropertyValuesHolder.ofFloat("scale", new float[]{this.f92135M.f92152b, this.f92135M.f92152b});
                propertyValuesHolder4 = PropertyValuesHolder.ofFloat("left", new float[]{this.f92135M.f92156f.f92146a, this.f92135M.f92156f.f92146a});
                propertyValuesHolder3 = PropertyValuesHolder.ofFloat("top", new float[]{this.f92135M.f92156f.f92147b, this.f92135M.f92156f.f92147b});
                propertyValuesHolder2 = PropertyValuesHolder.ofFloat("width", new float[]{this.f92135M.f92156f.f92148c, this.f92135M.f92156f.f92148c});
                propertyValuesHolder = PropertyValuesHolder.ofFloat("height", new float[]{this.f92135M.f92156f.f92149d, this.f92135M.f92156f.f92149d});
            } else if (this.f92135M.f92156f.f92148c == 0.0f || this.f92135M.f92156f.f92149d == 0.0f) {
                propertyValuesHolder5 = PropertyValuesHolder.ofFloat("scale", new float[]{this.f92135M.f92151a, this.f92135M.f92151a});
                propertyValuesHolder4 = PropertyValuesHolder.ofFloat("left", new float[]{this.f92135M.f92155e.f92146a, this.f92135M.f92155e.f92146a});
                propertyValuesHolder3 = PropertyValuesHolder.ofFloat("top", new float[]{this.f92135M.f92155e.f92147b, this.f92135M.f92155e.f92147b});
                propertyValuesHolder2 = PropertyValuesHolder.ofFloat("width", new float[]{this.f92135M.f92155e.f92148c, this.f92135M.f92155e.f92148c});
                propertyValuesHolder = PropertyValuesHolder.ofFloat("height", new float[]{this.f92135M.f92155e.f92149d, this.f92135M.f92155e.f92149d});
            } else {
                propertyValuesHolder5 = PropertyValuesHolder.ofFloat("scale", new float[]{this.f92135M.f92151a, this.f92135M.f92152b});
                propertyValuesHolder4 = PropertyValuesHolder.ofFloat("left", new float[]{this.f92135M.f92155e.f92146a, this.f92135M.f92156f.f92146a});
                propertyValuesHolder3 = PropertyValuesHolder.ofFloat("top", new float[]{this.f92135M.f92155e.f92147b, this.f92135M.f92156f.f92147b});
                propertyValuesHolder2 = PropertyValuesHolder.ofFloat("width", new float[]{this.f92135M.f92155e.f92148c, this.f92135M.f92156f.f92148c});
                propertyValuesHolder = PropertyValuesHolder.ofFloat("height", new float[]{this.f92135M.f92155e.f92149d, this.f92135M.f92156f.f92149d});
            }
            valueAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder5, propertyValuesHolder4, propertyValuesHolder3, propertyValuesHolder2, propertyValuesHolder});
            valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                public final synchronized void onAnimationUpdate(ValueAnimator valueAnimator) {
                    int animatedFraction = (int) (valueAnimator.getAnimatedFraction() * 255.0f);
                    TransferImage.this.f92134L.setAlpha(animatedFraction);
                    TransferImage.this.f92135M.f92154d = animatedFraction;
                    TransferImage.this.f92135M.f92153c = ((Float) valueAnimator.getAnimatedValue("scale")).floatValue();
                    TransferImage.this.f92135M.f92157g.f92146a = ((Float) valueAnimator.getAnimatedValue("left")).floatValue();
                    TransferImage.this.f92135M.f92157g.f92147b = ((Float) valueAnimator.getAnimatedValue("top")).floatValue();
                    TransferImage.this.f92135M.f92157g.f92148c = ((Float) valueAnimator.getAnimatedValue("width")).floatValue();
                    TransferImage.this.f92135M.f92157g.f92149d = ((Float) valueAnimator.getAnimatedValue("height")).floatValue();
                    TransferImage.this.invalidate();
                }
            });
            valueAnimator.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    if (TransferImage.this.f92136N != null) {
                        TransferImage.this.f92136N.mo89519a(TransferImage.this.f92127E, TransferImage.this.f92128F, TransferImage.this.f92129G);
                    }
                    if (TransferImage.this.f92127E == 1) {
                        TransferImage.this.f92127E = 0;
                    }
                }
            });
            if (this.f92127E == 1) {
                valueAnimator.start();
            } else {
                valueAnimator.reverse();
            }
        }
    }

    public void setDuration(long j) {
        this.f92138P = j;
    }

    public void setOnTransferListener(C35198b bVar) {
        this.f92136N = bVar;
    }

    public void setState(int i) {
        this.f92127E = i;
    }

    public TransferImage(Context context) {
        this(context, null);
    }

    public void setController(C13386a aVar) {
        this.f92137O.mo32931a(aVar);
    }

    /* renamed from: b */
    public final void mo89586b(int i) {
        this.f92128F = C34943c.f91127w;
        this.f92127E = 2;
        this.f92129G = 201;
        this.f92139Q = true;
        this.f92134L.setAlpha(NormalGiftView.ALPHA_255);
        invalidate();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f92137O.mo32933a(motionEvent) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean verifyDrawable(Drawable drawable) {
        super.verifyDrawable(drawable);
        if (drawable == ((C13438a) this.f92137O.mo32936d()).mo32722a()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo89583a(int i) {
        this.f92128F = C34943c.f91127w;
        this.f92127E = 1;
        this.f92129G = i;
        this.f92139Q = true;
        if (this.f92129G == 201) {
            this.f92134L.setAlpha(0);
        } else {
            this.f92134L.setAlpha(NormalGiftView.ALPHA_255);
        }
        invalidate();
    }

    /* renamed from: a */
    private void m113569a(boolean z) {
        Drawable drawable = getDrawable();
        if (drawable != null && getWidth() != 0 && getHeight() != 0) {
            this.f92135M = new C35199c(z);
            float intrinsicWidth = ((float) this.f92130H) / ((float) drawable.getIntrinsicWidth());
            float intrinsicHeight = ((float) this.f92131I) / ((float) drawable.getIntrinsicHeight());
            if (intrinsicWidth <= intrinsicHeight) {
                intrinsicWidth = intrinsicHeight;
            }
            this.f92135M.f92151a = intrinsicWidth;
            float width = ((float) getWidth()) / ((float) drawable.getIntrinsicWidth());
            float height = ((float) getHeight()) / ((float) drawable.getIntrinsicHeight());
            if (width >= height) {
                width = height;
            }
            if (this.f92128F == 200 && this.f92129G == 201) {
                this.f92135M.f92152b = intrinsicWidth;
            } else {
                this.f92135M.f92152b = width;
            }
            this.f92135M.f92155e = new C35197a();
            this.f92135M.f92155e.f92146a = (float) this.f92132J;
            this.f92135M.f92155e.f92147b = (float) this.f92133K;
            this.f92135M.f92155e.f92148c = (float) this.f92130H;
            this.f92135M.f92155e.f92149d = (float) this.f92131I;
            this.f92135M.f92156f = new C35197a();
            float intrinsicWidth2 = ((float) drawable.getIntrinsicWidth()) * this.f92135M.f92152b;
            float intrinsicHeight2 = ((float) drawable.getIntrinsicHeight()) * this.f92135M.f92152b;
            this.f92135M.f92156f.f92146a = (((float) getWidth()) - intrinsicWidth2) / 2.0f;
            this.f92135M.f92156f.f92147b = (((float) getHeight()) - intrinsicHeight2) / 2.0f;
            this.f92135M.f92156f.f92148c = intrinsicWidth2;
            this.f92135M.f92156f.f92149d = intrinsicHeight2;
            this.f92135M.f92157g = new C35197a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        boolean z;
        if (getDrawable() != null) {
            if (this.f92127E != 0) {
                if (this.f92139Q) {
                    if (this.f92127E == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m113569a(z);
                }
                if (this.f92135M == null) {
                    super.onDraw(canvas);
                    return;
                }
                if (this.f92139Q) {
                    switch (this.f92127E) {
                        case 1:
                            this.f92135M.mo89611a();
                            break;
                        case 2:
                            this.f92135M.mo89612b();
                            break;
                        case 3:
                            this.f92134L.setAlpha(NormalGiftView.ALPHA_255);
                            this.f92135M.mo89613c();
                            break;
                    }
                }
                canvas.drawPaint(this.f92134L);
                int saveCount = canvas.getSaveCount();
                canvas.save();
                m113572j();
                canvas.translate(this.f92135M.f92157g.f92146a, this.f92135M.f92157g.f92147b);
                canvas.clipRect(0.0f, 0.0f, this.f92135M.f92157g.f92148c, this.f92135M.f92157g.f92149d);
                canvas.concat(this.f92140R);
                getDrawable().setAlpha(this.f92135M.f92154d);
                getDrawable().draw(canvas);
                canvas.restoreToCount(saveCount);
                if (this.f92139Q && this.f92127E != 3) {
                    this.f92139Q = false;
                    int i = this.f92128F;
                    if (i == 100) {
                        m113574l();
                    } else if (i == 200) {
                        m113573k();
                    }
                }
                return;
            }
            this.f92134L.setAlpha(NormalGiftView.ALPHA_255);
            canvas.drawPaint(this.f92134L);
            try {
                getDrawable().setAlpha(NormalGiftView.ALPHA_255);
                super.onDraw(canvas);
            } catch (Exception unused) {
            }
        }
    }

    public TransferImage(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TransferImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f92128F = 100;
        this.f92129G = 201;
        this.f92138P = 300;
        m113571i();
    }

    /* renamed from: a */
    public final void mo89584a(int i, int i2, int i3, int i4) {
        this.f92132J = i;
        this.f92133K = i2;
        this.f92130H = i3;
        this.f92131I = i4;
    }

    /* renamed from: a */
    public final void mo89585a(Drawable drawable, int i, int i2, int i3, int i4) {
        Rect b = m113570b(drawable, i, i2, i3, i4);
        this.f92132J = b.left;
        this.f92133K = b.top;
        this.f92130H = b.right;
        this.f92131I = b.bottom;
    }

    /* renamed from: b */
    private static Rect m113570b(Drawable drawable, int i, int i2, int i3, int i4) {
        Rect rect = new Rect();
        float intrinsicWidth = ((float) i) / ((float) drawable.getIntrinsicWidth());
        float intrinsicHeight = ((float) i2) / ((float) drawable.getIntrinsicHeight());
        if (intrinsicWidth <= intrinsicHeight) {
            intrinsicWidth = intrinsicHeight;
        }
        float intrinsicWidth2 = ((float) drawable.getIntrinsicWidth()) * intrinsicWidth;
        float intrinsicHeight2 = ((float) drawable.getIntrinsicHeight()) * intrinsicWidth;
        rect.left = (int) ((((float) i3) - intrinsicWidth2) / 2.0f);
        rect.top = (int) ((((float) i4) - intrinsicHeight2) / 2.0f);
        rect.right = (int) intrinsicWidth2;
        rect.bottom = (int) intrinsicHeight2;
        return rect;
    }
}
