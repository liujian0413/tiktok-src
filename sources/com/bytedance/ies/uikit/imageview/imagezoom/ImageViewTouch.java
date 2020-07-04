package com.bytedance.ies.uikit.imageview.imagezoom;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.ScaleGestureDetector.SimpleOnScaleGestureListener;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

public class ImageViewTouch extends ImageViewTouchBase {

    /* renamed from: a */
    protected ScaleGestureDetector f29919a;

    /* renamed from: b */
    protected GestureDetector f29920b;

    /* renamed from: c */
    protected int f29921c;

    /* renamed from: d */
    protected float f29922d;

    /* renamed from: e */
    protected float f29923e;

    /* renamed from: f */
    protected int f29924f;

    /* renamed from: g */
    protected OnGestureListener f29925g;

    /* renamed from: h */
    protected OnScaleGestureListener f29926h;

    /* renamed from: i */
    protected boolean f29927i = true;

    /* renamed from: j */
    protected boolean f29928j = true;

    /* renamed from: k */
    protected boolean f29929k = true;

    /* renamed from: l */
    public C11033b f29930l;

    /* renamed from: m */
    protected boolean f29931m = true;

    /* renamed from: n */
    protected OnClickListener f29932n;

    /* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch$a */
    public class C11032a extends SimpleOnGestureListener {
        public C11032a() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (ImageViewTouch.this.isLongClickable() && !ImageViewTouch.this.f29919a.isInProgress()) {
                ImageViewTouch.this.setPressed(true);
                ImageViewTouch.this.performLongClick();
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.f29932n == null || !ImageViewTouch.this.f29931m) {
                return super.onSingleTapConfirmed(motionEvent);
            }
            ImageViewTouch.this.f29932n.onClick(ImageViewTouch.this);
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (ImageViewTouch.this.f29927i) {
                float min = Math.min(ImageViewTouch.this.getMaxZoom(), Math.max(ImageViewTouch.this.mo26650a(ImageViewTouch.this.getScale(), ImageViewTouch.this.getMaxZoom()), ImageViewTouch.this.getMinZoom()));
                ImageViewTouch.this.f29922d = min;
                ImageViewTouch.this.mo26679a(min, motionEvent.getX(), motionEvent.getY(), 200.0f);
                ImageViewTouch.this.invalidate();
            }
            if (ImageViewTouch.this.f29930l != null) {
                ImageViewTouch.this.f29930l.mo26673a();
            }
            return super.onDoubleTap(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return ImageViewTouch.this.mo26658b(motionEvent, motionEvent2, f, f2);
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return ImageViewTouch.this.mo26656a(motionEvent, motionEvent2, f, f2);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch$b */
    public interface C11033b {
        /* renamed from: a */
        void mo26673a();
    }

    /* renamed from: com.bytedance.ies.uikit.imageview.imagezoom.ImageViewTouch$c */
    public class C11034c extends SimpleOnScaleGestureListener {
        public C11034c() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            scaleGestureDetector.getCurrentSpan();
            scaleGestureDetector.getPreviousSpan();
            float scaleFactor = ImageViewTouch.this.f29922d * scaleGestureDetector.getScaleFactor();
            if (!ImageViewTouch.this.f29928j) {
                return false;
            }
            float min = Math.min(ImageViewTouch.this.getMaxZoom(), Math.max(scaleFactor, ImageViewTouch.this.getMinZoom() - 0.1f));
            ImageViewTouch.this.mo26678a(min, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            ImageViewTouch.this.f29922d = Math.min(ImageViewTouch.this.getMaxZoom(), Math.max(min, ImageViewTouch.this.getMinZoom() - 1.0f));
            ImageViewTouch.this.f29924f = 1;
            ImageViewTouch.this.invalidate();
            return true;
        }
    }

    public boolean getDoubleTapEnabled() {
        return this.f29927i;
    }

    /* access modifiers changed from: protected */
    public OnGestureListener getGestureListener() {
        return new C11032a();
    }

    /* access modifiers changed from: protected */
    public OnScaleGestureListener getScaleListener() {
        return new C11034c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26651a() {
        super.mo26651a();
        this.f29921c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f29925g = getGestureListener();
        this.f29926h = getScaleListener();
        this.f29919a = new ScaleGestureDetector(getContext().getApplicationContext(), this.f29926h);
        this.f29920b = new GestureDetector(getContext().getApplicationContext(), this.f29925g, null, true);
        this.f29922d = 1.0f;
        this.f29924f = 1;
    }

    public void setDoubleTapEnabled(boolean z) {
        this.f29927i = z;
    }

    public void setDoubleTapListener(C11033b bVar) {
        this.f29930l = bVar;
    }

    public void setMyOnClickListener(OnClickListener onClickListener) {
        this.f29932n = onClickListener;
    }

    public void setScaleEnabled(boolean z) {
        this.f29928j = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f29929k = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26652a(float f) {
        super.mo26652a(f);
        if (!this.f29919a.isInProgress()) {
            this.f29922d = f;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo26657b(float f) {
        super.mo26657b(f);
        if (!this.f29919a.isInProgress()) {
            this.f29922d = f;
        }
        if (f < getMinZoom()) {
            mo26683b(getMinZoom(), 50.0f);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26653a(Drawable drawable) {
        super.mo26653a(drawable);
        float[] fArr = new float[9];
        this.f29945q.getValues(fArr);
        this.f29922d = fArr[0];
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 0) {
            this.f29931m = true;
        }
        if (motionEvent.getPointerCount() > 1) {
            this.f29931m = false;
        }
        this.f29919a.onTouchEvent(motionEvent);
        if (!this.f29919a.isInProgress()) {
            this.f29920b.onTouchEvent(motionEvent);
        }
        switch (action) {
            case 0:
                this.f29941G = false;
                break;
            case 1:
                if (getScale() < getMinZoom()) {
                    mo26683b(getMinZoom(), 50.0f);
                    break;
                }
                break;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo26655a(int i) {
        if (getDrawable() == null) {
            return false;
        }
        RectF bitmapRect = getBitmapRect();
        if (bitmapRect == null) {
            return false;
        }
        mo26680a(bitmapRect, this.f29940F);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect.right < ((float) rect.right) || i >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.f29940F.left)) > 1.0d) {
                return true;
            }
            return false;
        } else if (Math.abs(bitmapRect.right - ((float) rect.right)) > 1.0f) {
            return true;
        } else {
            return false;
        }
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo26650a(float f, float f2) {
        if (this.f29924f != 1) {
            this.f29924f = 1;
            return 1.0f;
        } else if ((this.f29923e * 2.0f) + f <= f2) {
            return f + this.f29923e;
        } else {
            this.f29924f = -1;
            return f2;
        }
    }

    /* renamed from: b */
    public final boolean mo26658b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f29929k || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.f29919a.isInProgress()) {
            return false;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f) <= 800.0f && Math.abs(f2) <= 800.0f) {
            return false;
        }
        mo26677a(x / 2.0f, y / 2.0f, 300.0d);
        invalidate();
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo26654a(Drawable drawable, boolean z, Matrix matrix, float f) {
        super.mo26654a(drawable, z, matrix, f);
        this.f29923e = getMaxZoom() / 3.0f;
    }

    /* renamed from: a */
    public final boolean mo26656a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (!this.f29929k || motionEvent == null || motionEvent2 == null || motionEvent.getPointerCount() > 1 || motionEvent2.getPointerCount() > 1 || this.f29919a.isInProgress()) {
            return false;
        }
        if (getScale() == 1.0f && !this.f29954z) {
            return false;
        }
        mo26685c(-f, -f2);
        invalidate();
        return true;
    }
}
