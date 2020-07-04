package p1874it.sephiroth.android.library.imagezoom;

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
import android.view.ViewConfiguration;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch */
public class ImageViewTouch extends ImageViewTouchBase {

    /* renamed from: a */
    protected ScaleGestureDetector f122684a;

    /* renamed from: b */
    protected GestureDetector f122685b;

    /* renamed from: c */
    protected int f122686c;

    /* renamed from: d */
    protected float f122687d;

    /* renamed from: e */
    protected int f122688e;

    /* renamed from: f */
    protected OnGestureListener f122689f;

    /* renamed from: g */
    protected OnScaleGestureListener f122690g;

    /* renamed from: h */
    protected boolean f122691h;

    /* renamed from: i */
    protected boolean f122692i;

    /* renamed from: j */
    protected boolean f122693j;

    /* renamed from: k */
    public C47874b f122694k;

    /* renamed from: l */
    public C47875c f122695l;

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$a */
    public class C47873a extends SimpleOnGestureListener {
        public final boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            return true;
        }

        public C47873a() {
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (ImageViewTouch.this.f122695l != null) {
                ImageViewTouch.this.f122695l.mo119410a();
            }
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (ImageViewTouch.this.isLongClickable() && !ImageViewTouch.this.f122684a.isInProgress()) {
                ImageViewTouch.this.setPressed(true);
                ImageViewTouch.this.performLongClick();
            }
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (ImageViewTouch.this.f122691h) {
                ImageViewTouch.this.f122716s = true;
                ImageViewTouch.this.mo119963a(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(ImageViewTouch.this.mo119934a(ImageViewTouch.this.getScale(), ImageViewTouch.this.getMaxScale()), ImageViewTouch.this.getMinScale())), motionEvent.getX(), motionEvent.getY(), 200.0f);
                ImageViewTouch.this.invalidate();
            }
            return super.onDoubleTap(motionEvent);
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ImageViewTouch.this.f122693j && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.f122684a.isInProgress() && ImageViewTouch.this.getScale() != 1.0f) {
                return ImageViewTouch.this.mo119940b(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (ImageViewTouch.this.f122693j && motionEvent != null && motionEvent2 != null && motionEvent.getPointerCount() <= 1 && motionEvent2.getPointerCount() <= 1 && !ImageViewTouch.this.f122684a.isInProgress()) {
                return ImageViewTouch.this.mo119939a(motionEvent, motionEvent2, f, f2);
            }
            return false;
        }
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$b */
    public interface C47874b {
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$c */
    public interface C47875c {
        /* renamed from: a */
        void mo119410a();
    }

    /* renamed from: it.sephiroth.android.library.imagezoom.ImageViewTouch$d */
    public class C47876d extends SimpleOnScaleGestureListener {

        /* renamed from: a */
        protected boolean f122697a;

        public C47876d() {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float currentSpan = scaleGestureDetector.getCurrentSpan() - scaleGestureDetector.getPreviousSpan();
            float scale = ImageViewTouch.this.getScale() * scaleGestureDetector.getScaleFactor();
            if (ImageViewTouch.this.f122692i) {
                if (this.f122697a && currentSpan != 0.0f) {
                    ImageViewTouch.this.f122716s = true;
                    ImageViewTouch.this.mo119962a(Math.min(ImageViewTouch.this.getMaxScale(), Math.max(scale, ImageViewTouch.this.getMinScale() - 0.1f)), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                    ImageViewTouch.this.f122688e = 1;
                    ImageViewTouch.this.invalidate();
                    return true;
                } else if (!this.f122697a) {
                    this.f122697a = true;
                }
            }
            return true;
        }
    }

    public boolean getDoubleTapEnabled() {
        return this.f122691h;
    }

    /* access modifiers changed from: protected */
    public OnGestureListener getGestureListener() {
        return new C47873a();
    }

    /* access modifiers changed from: protected */
    public OnScaleGestureListener getScaleListener() {
        return new C47876d();
    }

    public void setDoubleTapEnabled(boolean z) {
        this.f122691h = z;
    }

    public void setDoubleTapListener(C47874b bVar) {
        this.f122694k = bVar;
    }

    public void setScaleEnabled(boolean z) {
        this.f122692i = z;
    }

    public void setScrollEnabled(boolean z) {
        this.f122693j = z;
    }

    public void setSingleTapListener(C47875c cVar) {
        this.f122695l = cVar;
    }

    public ImageViewTouch(Context context) {
        super(context);
        this.f122691h = true;
        this.f122692i = true;
        this.f122693j = true;
    }

    /* renamed from: a */
    private boolean m148784a(MotionEvent motionEvent) {
        if (getScale() < getMinScale()) {
            mo119966b(getMinScale(), 50.0f);
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f122684a.onTouchEvent(motionEvent);
        if (!this.f122684a.isInProgress()) {
            this.f122685b.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() & NormalGiftView.ALPHA_255) != 1) {
            return true;
        }
        return m148784a(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119935a(float f) {
        if (f < getMinScale()) {
            mo119966b(getMinScale(), 50.0f);
        }
    }

    /* renamed from: a */
    public final boolean mo119938a(int i) {
        RectF bitmapRect = getBitmapRect();
        mo119964a(bitmapRect, this.f122723z);
        Rect rect = new Rect();
        getGlobalVisibleRect(rect);
        if (bitmapRect == null) {
            return false;
        }
        if (bitmapRect.right < ((float) rect.right) || i >= 0) {
            if (((double) Math.abs(bitmapRect.left - this.f122723z.left)) > 1.0d) {
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
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo119934a(float f, float f2) {
        if (this.f122688e != 1) {
            this.f122688e = 1;
            return 1.0f;
        } else if ((this.f122687d * 2.0f) + f <= f2) {
            return f + this.f122687d;
        } else {
            this.f122688e = -1;
            return f2;
        }
    }

    public ImageViewTouch(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f122691h = true;
        this.f122692i = true;
        this.f122693j = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119936a(Context context, AttributeSet attributeSet, int i) {
        super.mo119936a(context, attributeSet, i);
        this.f122686c = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f122689f = getGestureListener();
        this.f122690g = getScaleListener();
        this.f122684a = new ScaleGestureDetector(getContext(), this.f122690g);
        this.f122685b = new GestureDetector(getContext(), this.f122689f, null, true);
        this.f122688e = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo119937a(Drawable drawable, Matrix matrix, float f, float f2) {
        super.mo119937a(drawable, matrix, f, f2);
        this.f122687d = getMaxScale() / 3.0f;
    }

    /* renamed from: b */
    public final boolean mo119940b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = motionEvent2.getX() - motionEvent.getX();
        float y = motionEvent2.getY() - motionEvent.getY();
        if (Math.abs(f) <= 800.0f && Math.abs(f2) <= 800.0f) {
            return false;
        }
        this.f122716s = true;
        mo119961a(x / 2.0f, y / 2.0f, 300.0d);
        invalidate();
        return true;
    }

    /* renamed from: a */
    public final boolean mo119939a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (getScale() == 1.0f) {
            return false;
        }
        this.f122716s = true;
        mo119968c(-f, -f2);
        invalidate();
        return true;
    }
}
