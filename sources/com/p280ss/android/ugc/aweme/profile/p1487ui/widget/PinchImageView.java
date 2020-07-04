package com.p280ss.android.ugc.aweme.profile.p1487ui.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView.ScaleType;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView */
public class PinchImageView extends AppCompatImageView {

    /* renamed from: a */
    public OnClickListener f96054a;

    /* renamed from: b */
    public OnLongClickListener f96055b;

    /* renamed from: c */
    public Matrix f96056c = new Matrix();

    /* renamed from: d */
    public RectF f96057d;

    /* renamed from: e */
    public int f96058e = 0;

    /* renamed from: f */
    public C36613f f96059f;

    /* renamed from: g */
    private boolean f96060g;

    /* renamed from: h */
    private Rect f96061h;

    /* renamed from: i */
    private List<Object> f96062i;

    /* renamed from: j */
    private List<Object> f96063j;

    /* renamed from: k */
    private int f96064k;

    /* renamed from: l */
    private PointF f96065l = new PointF();

    /* renamed from: m */
    private PointF f96066m = new PointF();

    /* renamed from: n */
    private float f96067n = 0.0f;

    /* renamed from: o */
    private C36608a f96068o;

    /* renamed from: p */
    private GestureDetector f96069p = new GestureDetector(getContext(), new SimpleOnGestureListener() {
        public final void onLongPress(MotionEvent motionEvent) {
            if (PinchImageView.this.f96055b != null) {
                PinchImageView.this.f96055b.onLongClick(PinchImageView.this);
            }
        }

        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (PinchImageView.this.f96054a != null) {
                PinchImageView.this.f96054a.onClick(PinchImageView.this);
            }
            return true;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            if (PinchImageView.this.f96058e == 1 && (PinchImageView.this.f96059f == null || !PinchImageView.this.f96059f.isRunning())) {
                PinchImageView.this.mo92867b(motionEvent.getX(), motionEvent.getY());
            }
            return true;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (PinchImageView.this.f96058e == 0 && (PinchImageView.this.f96059f == null || !PinchImageView.this.f96059f.isRunning())) {
                PinchImageView.this.mo92868c(f, f2);
            }
            return true;
        }
    });

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$a */
    class C36608a extends ValueAnimator implements AnimatorUpdateListener {

        /* renamed from: b */
        private float[] f96072b;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            boolean a = PinchImageView.this.mo92866a(this.f96072b[0], this.f96072b[1]);
            float[] fArr = this.f96072b;
            fArr[0] = fArr[0] * 0.9f;
            float[] fArr2 = this.f96072b;
            fArr2[1] = fArr2[1] * 0.9f;
            if (!a || C36609b.m118131b(0.0f, 0.0f, this.f96072b[0], this.f96072b[1]) < 1.0f) {
                valueAnimator.cancel();
            }
        }

        C36608a(float f, float f2) {
            setFloatValues(new float[]{0.0f, 1.0f});
            setDuration(1000000);
            addUpdateListener(this);
            this.f96072b = new float[]{f, f2};
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$b */
    public static class C36609b {

        /* renamed from: a */
        private static C36610c f96073a = new C36610c(16);

        /* renamed from: b */
        private static C36612e f96074b = new C36612e(16);

        /* renamed from: a */
        public static Matrix m118126a() {
            return (Matrix) f96073a.mo92887b();
        }

        /* renamed from: b */
        public static RectF m118132b() {
            return (RectF) f96074b.mo92887b();
        }

        /* renamed from: a */
        public static void m118129a(RectF rectF) {
            f96074b.mo92888b(rectF);
        }

        /* renamed from: b */
        public static void m118133b(Matrix matrix) {
            f96073a.mo92888b(matrix);
        }

        /* renamed from: a */
        public static Matrix m118127a(Matrix matrix) {
            Matrix matrix2 = (Matrix) f96073a.mo92887b();
            if (matrix != null) {
                matrix2.set(matrix);
            }
            return matrix2;
        }

        /* renamed from: c */
        public static float[] m118135c(Matrix matrix) {
            if (matrix == null) {
                return new float[2];
            }
            float[] fArr = new float[9];
            matrix.getValues(fArr);
            return new float[]{fArr[0], fArr[4]};
        }

        /* renamed from: a */
        public static float[] m118130a(float[] fArr, Matrix matrix) {
            if (fArr == null || matrix == null) {
                return new float[2];
            }
            float[] fArr2 = new float[2];
            Matrix a = m118126a();
            matrix.invert(a);
            a.mapPoints(fArr2, fArr);
            m118133b(a);
            return fArr2;
        }

        /* renamed from: b */
        public static float m118131b(float f, float f2, float f3, float f4) {
            float f5 = f - f3;
            float f6 = f2 - f4;
            return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        }

        /* renamed from: c */
        public static float[] m118134c(float f, float f2, float f3, float f4) {
            return new float[]{(f + f3) / 2.0f, (f2 + f4) / 2.0f};
        }

        /* renamed from: a */
        public static RectF m118128a(float f, float f2, float f3, float f4) {
            RectF rectF = (RectF) f96074b.mo92887b();
            rectF.set(0.0f, 0.0f, f3, f4);
            return rectF;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$c */
    static class C36610c extends C36611d<Matrix> {
        /* renamed from: c */
        private static Matrix m118137c() {
            return new Matrix();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo92885a() {
            return m118137c();
        }

        C36610c(int i) {
            super(16);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Matrix mo92886a(Matrix matrix) {
            if (matrix == null) {
                return m118137c();
            }
            matrix.reset();
            return matrix;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$d */
    static abstract class C36611d<T> {

        /* renamed from: a */
        private int f96075a;

        /* renamed from: b */
        private Queue<T> f96076b = new LinkedList();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo92885a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract T mo92886a(T t);

        /* renamed from: b */
        public final T mo92887b() {
            if (this.f96076b.size() == 0) {
                return mo92885a();
            }
            try {
                return mo92886a(this.f96076b.poll());
            } catch (NoSuchElementException unused) {
                return mo92885a();
            }
        }

        C36611d(int i) {
            this.f96075a = i;
        }

        /* renamed from: b */
        public final void mo92888b(T t) {
            if (t != null && this.f96076b.size() < this.f96075a) {
                this.f96076b.offer(t);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$e */
    static class C36612e extends C36611d<RectF> {
        /* renamed from: c */
        private static RectF m118145c() {
            return new RectF();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* synthetic */ Object mo92885a() {
            return m118145c();
        }

        C36612e(int i) {
            super(16);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RectF mo92886a(RectF rectF) {
            if (rectF == null) {
                return m118145c();
            }
            rectF.setEmpty();
            return rectF;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.PinchImageView$f */
    class C36613f extends ValueAnimator implements AnimatorUpdateListener {

        /* renamed from: b */
        private float[] f96078b;

        /* renamed from: c */
        private float[] f96079c;

        /* renamed from: d */
        private float[] f96080d;

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (int i = 0; i < 9; i++) {
                this.f96080d[i] = this.f96078b[i] + ((this.f96079c[i] - this.f96078b[i]) * floatValue);
            }
            PinchImageView.this.f96056c.setValues(this.f96080d);
            PinchImageView.this.mo92865a();
            PinchImageView.this.invalidate();
        }

        C36613f(PinchImageView pinchImageView, Matrix matrix, Matrix matrix2) {
            this(matrix, matrix2, 200);
        }

        private C36613f(Matrix matrix, Matrix matrix2, long j) {
            this.f96078b = new float[9];
            this.f96079c = new float[9];
            this.f96080d = new float[9];
            setFloatValues(new float[]{0.0f, 1.0f});
            setDuration(200);
            addUpdateListener(this);
            matrix.getValues(this.f96078b);
            matrix2.getValues(this.f96079c);
        }
    }

    public int getPinchMode() {
        return this.f96058e;
    }

    public void setScaleType(ScaleType scaleType) {
    }

    /* renamed from: b */
    private void m118116b() {
        super.setScaleType(ScaleType.MATRIX);
    }

    public RectF getMask() {
        if (this.f96057d != null) {
            return new RectF(this.f96057d);
        }
        return null;
    }

    /* renamed from: e */
    private void m118120e() {
        if (this.f96059f != null) {
            this.f96059f.cancel();
            this.f96059f = null;
        }
        if (this.f96068o != null) {
            this.f96068o.cancel();
            this.f96068o = null;
        }
    }

    /* renamed from: c */
    private boolean m118117c() {
        if (getDrawable() == null || getDrawable().getIntrinsicWidth() <= 0 || getDrawable().getIntrinsicHeight() <= 0 || getWidth() <= 0 || getHeight() <= 0) {
            return false;
        }
        return true;
    }

    private float getMinScale() {
        if (!m118117c() || this.f96061h == null) {
            return 1.0f;
        }
        float intrinsicWidth = ((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight());
        float width = ((float) getWidth()) / ((float) getHeight());
        if (intrinsicWidth >= ((float) this.f96061h.width()) / ((float) this.f96061h.height()) && intrinsicWidth >= width) {
            return ((float) this.f96061h.height()) / (((float) getWidth()) / intrinsicWidth);
        }
        return (((float) this.f96061h.width()) / ((float) getWidth())) * (((float) getWidth()) / (C36609b.m118135c(m118112a((Matrix) null))[0] * ((float) getDrawable().getIntrinsicWidth())));
    }

    /* access modifiers changed from: protected */
    public float getMaxScale() {
        float f;
        if (!m118117c()) {
            f = 4.0f;
        } else if (((float) getDrawable().getIntrinsicWidth()) / ((float) getDrawable().getIntrinsicHeight()) < ((float) getWidth()) / ((float) getHeight())) {
            f = ((float) getWidth()) / ((float) getDrawable().getIntrinsicWidth());
        } else {
            f = ((float) getHeight()) / ((float) getDrawable().getIntrinsicHeight());
        }
        return Math.max(f, 4.0f);
    }

    /* renamed from: d */
    private void m118119d() {
        float f;
        int width;
        float f2;
        int height;
        int width2;
        int height2;
        float f3;
        float f4;
        float f5;
        if (m118117c()) {
            Matrix a = C36609b.m118126a();
            m118115b(a);
            boolean z = false;
            float f6 = C36609b.m118135c(a)[0];
            float f7 = C36609b.m118135c(this.f96056c)[0];
            if (this.f96060g) {
                f = (float) this.f96061h.left;
            } else {
                f = 0.0f;
            }
            if (this.f96060g) {
                width = this.f96061h.right;
            } else {
                width = getWidth();
            }
            float f8 = (float) width;
            if (this.f96060g) {
                f2 = (float) this.f96061h.top;
            } else {
                f2 = 0.0f;
            }
            if (this.f96060g) {
                height = this.f96061h.bottom;
            } else {
                height = getHeight();
            }
            float f9 = (float) height;
            if (this.f96060g) {
                width2 = this.f96061h.width();
            } else {
                width2 = getWidth();
            }
            float f10 = (float) width2;
            if (this.f96060g) {
                height2 = this.f96061h.height();
            } else {
                height2 = getHeight();
            }
            float f11 = (float) height2;
            float maxScale = getMaxScale();
            if (f6 > maxScale) {
                f3 = maxScale / f6;
            } else {
                f3 = 1.0f;
            }
            float minScale = getMinScale();
            if (f7 * f3 < minScale) {
                f3 = minScale / f7;
            }
            if (f3 != 1.0f) {
                z = true;
            }
            Matrix a2 = C36609b.m118127a(a);
            a2.postScale(f3, f3, this.f96065l.x, this.f96065l.y);
            RectF a3 = C36609b.m118128a(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            a2.mapRect(a3);
            if (a3.right - a3.left < f10) {
                f4 = ((f + f8) / 2.0f) - ((a3.right + a3.left) / 2.0f);
            } else if (a3.left > f) {
                f4 = f - a3.left;
            } else if (a3.right < f8) {
                f4 = f8 - a3.right;
            } else {
                f4 = 0.0f;
            }
            if (a3.bottom - a3.top < f11) {
                f5 = ((f2 + f9) / 2.0f) - ((a3.bottom + a3.top) / 2.0f);
            } else if (a3.top > f2) {
                f5 = f2 - a3.top;
            } else if (a3.bottom < f9) {
                f5 = f9 - a3.bottom;
            } else {
                f5 = 0.0f;
            }
            if (!(f4 == 0.0f && f5 == 0.0f)) {
                z = true;
            }
            if (z) {
                Matrix a4 = C36609b.m118127a(this.f96056c);
                a4.postScale(f3, f3, this.f96065l.x, this.f96065l.y);
                a4.postTranslate(f4, f5);
                m118120e();
                this.f96059f = new C36613f(this, this.f96056c, a4);
                this.f96059f.start();
                C36609b.m118133b(a4);
            }
            C36609b.m118129a(a3);
            C36609b.m118133b(a2);
            C36609b.m118133b(a);
        }
    }

    /* renamed from: a */
    public final void mo92865a() {
        if (this.f96062i != null) {
            this.f96064k++;
            Iterator it = this.f96062i.iterator();
            while (it.hasNext()) {
                it.next();
            }
            this.f96064k--;
            if (this.f96064k == 0 && this.f96063j != null) {
                this.f96062i = this.f96063j;
                this.f96063j = null;
            }
        }
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.f96054a = onClickListener;
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f96055b = onLongClickListener;
    }

    public void setDisplayWindowRect(Rect rect) {
        this.f96061h = rect;
        if (rect != null) {
            this.f96060g = true;
        }
    }

    /* renamed from: b */
    private Matrix m118115b(Matrix matrix) {
        Matrix a = m118112a(matrix);
        a.postConcat(this.f96056c);
        return a;
    }

    public PinchImageView(Context context) {
        super(context);
        m118116b();
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f96058e == 2) {
            return true;
        }
        RectF a = mo92864a((RectF) null);
        if (a == null || a.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (a.right > ((float) getWidth())) {
                return true;
            }
            return false;
        } else if (a.left < 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    public boolean canScrollVertically(int i) {
        if (this.f96058e == 2) {
            return true;
        }
        RectF a = mo92864a((RectF) null);
        if (a == null || a.isEmpty()) {
            return false;
        }
        if (i > 0) {
            if (a.bottom > ((float) getHeight())) {
                return true;
            }
            return false;
        } else if (a.top < 0.0f) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (m118117c()) {
            Matrix a = C36609b.m118126a();
            setImageMatrix(m118115b(a));
            C36609b.m118133b(a);
        }
        if (this.f96057d != null) {
            canvas.save();
            canvas.clipRect(this.f96057d);
            super.onDraw(canvas);
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }

    /* renamed from: a */
    private Matrix m118112a(Matrix matrix) {
        if (matrix == null) {
            matrix = new Matrix();
        } else {
            matrix.reset();
        }
        if (m118117c()) {
            RectF a = C36609b.m118128a(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            RectF a2 = C36609b.m118128a(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            matrix.setRectToRect(a, a2, ScaleToFit.CENTER);
            C36609b.m118129a(a2);
            C36609b.m118129a(a);
        }
        return matrix;
    }

    /* renamed from: a */
    public final RectF mo92864a(RectF rectF) {
        if (rectF == null) {
            rectF = new RectF();
        } else {
            rectF.setEmpty();
        }
        if (!m118117c()) {
            return rectF;
        }
        Matrix a = C36609b.m118126a();
        m118115b(a);
        rectF.set(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
        a.mapRect(rectF);
        C36609b.m118133b(a);
        return rectF;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (action == 1 || action == 3) {
            if (this.f96058e == 2) {
                m118119d();
            }
            this.f96058e = 0;
        } else if (action == 6) {
            if (this.f96058e == 2 && motionEvent.getPointerCount() > 2) {
                if ((motionEvent.getAction() >> 8) == 0) {
                    m118113a(motionEvent.getX(1), motionEvent.getY(1), motionEvent.getX(2), motionEvent.getY(2));
                } else if ((motionEvent.getAction() >> 8) == 1) {
                    m118113a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(2), motionEvent.getY(2));
                }
            }
        } else if (action == 0) {
            if (this.f96059f == null || !this.f96059f.isRunning()) {
                m118120e();
                this.f96058e = 1;
                this.f96065l.set(motionEvent.getX(), motionEvent.getY());
            }
        } else if (action == 5) {
            m118120e();
            this.f96058e = 2;
            m118113a(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
        } else if (action == 2 && (this.f96059f == null || !this.f96059f.isRunning())) {
            if (this.f96058e == 1) {
                mo92866a(motionEvent.getX() - this.f96065l.x, motionEvent.getY() - this.f96065l.y);
                this.f96065l.set(motionEvent.getX(), motionEvent.getY());
            } else if (this.f96058e == 2 && motionEvent.getPointerCount() > 1) {
                float b = C36609b.m118131b(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                float[] c = C36609b.m118134c(motionEvent.getX(0), motionEvent.getY(0), motionEvent.getX(1), motionEvent.getY(1));
                this.f96065l.set(c[0], c[1]);
                m118114a(this.f96066m, this.f96067n, b, this.f96065l);
            }
        }
        this.f96069p.onTouchEvent(motionEvent);
        return true;
    }

    /* renamed from: d */
    private float m118118d(float f, float f2) {
        if (f2 * f < getMaxScale()) {
            return getMaxScale();
        }
        return f;
    }

    /* renamed from: c */
    public final void mo92868c(float f, float f2) {
        if (m118117c()) {
            m118120e();
            this.f96068o = new C36608a(f / 60.0f, f2 / 60.0f);
            this.f96068o.start();
        }
    }

    public PinchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118116b();
    }

    /* renamed from: b */
    public final void mo92867b(float f, float f2) {
        float f3;
        int width;
        float f4;
        int height;
        int width2;
        int height2;
        float f5;
        float f6;
        float f7 = f;
        float f8 = f2;
        if (m118117c()) {
            Matrix a = C36609b.m118126a();
            m118112a(a);
            float f9 = C36609b.m118135c(a)[0];
            float f10 = C36609b.m118135c(this.f96056c)[0];
            float f11 = f9 * f10;
            if (this.f96060g) {
                f3 = (float) this.f96061h.left;
            } else {
                f3 = 0.0f;
            }
            if (this.f96060g) {
                width = this.f96061h.right;
            } else {
                width = getWidth();
            }
            float f12 = (float) width;
            if (this.f96060g) {
                f4 = (float) this.f96061h.top;
            } else {
                f4 = 0.0f;
            }
            if (this.f96060g) {
                height = this.f96061h.bottom;
            } else {
                height = getHeight();
            }
            float f13 = (float) height;
            if (this.f96060g) {
                width2 = this.f96061h.width();
            } else {
                width2 = getWidth();
            }
            float f14 = (float) width2;
            if (this.f96060g) {
                height2 = this.f96061h.height();
            } else {
                height2 = getHeight();
            }
            float f15 = (float) height2;
            float maxScale = getMaxScale();
            float d = m118118d(f9, f10);
            if (d <= maxScale) {
                maxScale = d;
            }
            if (maxScale < f9) {
                maxScale = f9;
            }
            Matrix a2 = C36609b.m118127a(this.f96056c);
            float f16 = maxScale / f11;
            a2.postScale(f16, f16, f7, f8);
            float f17 = f14 / 2.0f;
            float f18 = f15 / 2.0f;
            a2.postTranslate(f17 - f7, f18 - f8);
            Matrix a3 = C36609b.m118127a(a);
            a3.postConcat(a2);
            RectF a4 = C36609b.m118128a(0.0f, 0.0f, (float) getDrawable().getIntrinsicWidth(), (float) getDrawable().getIntrinsicHeight());
            a3.mapRect(a4);
            if (a4.right - a4.left < f14) {
                f5 = f17 - ((a4.right + a4.left) / 2.0f);
            } else if (a4.left > f3) {
                f5 = f3 - a4.left;
            } else if (a4.right < f12) {
                f5 = f12 - a4.right;
            } else {
                f5 = 0.0f;
            }
            if (a4.bottom - a4.top < f15) {
                f6 = f18 - ((a4.bottom + a4.top) / 2.0f);
            } else if (a4.top > f4) {
                f6 = f4 - a4.top;
            } else if (a4.bottom < f13) {
                f6 = f13 - a4.bottom;
            } else {
                f6 = 0.0f;
            }
            a2.postTranslate(f5, f6);
            m118120e();
            this.f96059f = new C36613f(this, this.f96056c, a2);
            this.f96059f.start();
            C36609b.m118129a(a4);
            C36609b.m118133b(a3);
            C36609b.m118133b(a2);
            C36609b.m118133b(a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo92866a(float r12, float r13) {
        /*
            r11 = this;
            boolean r0 = r11.m118117c()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.graphics.RectF r0 = com.p280ss.android.ugc.aweme.profile.p1487ui.widget.PinchImageView.C36609b.m118132b()
            r11.mo92864a(r0)
            boolean r2 = r11.f96060g
            r3 = 0
            if (r2 == 0) goto L_0x001a
            android.graphics.Rect r2 = r11.f96061h
            int r2 = r2.left
            float r2 = (float) r2
            goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            boolean r4 = r11.f96060g
            if (r4 == 0) goto L_0x0025
            android.graphics.Rect r4 = r11.f96061h
            int r4 = r4.right
        L_0x0023:
            float r4 = (float) r4
            goto L_0x002a
        L_0x0025:
            int r4 = r11.getWidth()
            goto L_0x0023
        L_0x002a:
            boolean r5 = r11.f96060g
            if (r5 == 0) goto L_0x0034
            android.graphics.Rect r5 = r11.f96061h
            int r5 = r5.top
            float r5 = (float) r5
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            boolean r6 = r11.f96060g
            if (r6 == 0) goto L_0x003f
            android.graphics.Rect r6 = r11.f96061h
            int r6 = r6.bottom
        L_0x003d:
            float r6 = (float) r6
            goto L_0x0044
        L_0x003f:
            int r6 = r11.getHeight()
            goto L_0x003d
        L_0x0044:
            boolean r7 = r11.f96060g
            if (r7 == 0) goto L_0x0050
            android.graphics.Rect r7 = r11.f96061h
            int r7 = r7.width()
        L_0x004e:
            float r7 = (float) r7
            goto L_0x0055
        L_0x0050:
            int r7 = r11.getWidth()
            goto L_0x004e
        L_0x0055:
            boolean r8 = r11.f96060g
            if (r8 == 0) goto L_0x0061
            android.graphics.Rect r8 = r11.f96061h
            int r8 = r8.height()
        L_0x005f:
            float r8 = (float) r8
            goto L_0x0066
        L_0x0061:
            int r8 = r11.getHeight()
            goto L_0x005f
        L_0x0066:
            float r9 = r0.right
            float r10 = r0.left
            float r9 = r9 - r10
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0093
            float r7 = r0.left
            float r7 = r7 + r12
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x0081
            float r12 = r0.left
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto L_0x0093
            float r12 = r0.left
            float r12 = r2 - r12
            goto L_0x0094
        L_0x0081:
            float r2 = r0.right
            float r2 = r2 + r12
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0094
            float r12 = r0.right
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0093
            float r12 = r0.right
            float r12 = r4 - r12
            goto L_0x0094
        L_0x0093:
            r12 = 0
        L_0x0094:
            float r2 = r0.bottom
            float r4 = r0.top
            float r2 = r2 - r4
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x00c1
            float r2 = r0.top
            float r2 = r2 + r13
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x00af
            float r13 = r0.top
            int r13 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r13 >= 0) goto L_0x00c1
            float r13 = r0.top
            float r13 = r5 - r13
            goto L_0x00c2
        L_0x00af:
            float r2 = r0.bottom
            float r2 = r2 + r13
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c2
            float r13 = r0.bottom
            int r13 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r13 <= 0) goto L_0x00c1
            float r13 = r0.bottom
            float r13 = r6 - r13
            goto L_0x00c2
        L_0x00c1:
            r13 = 0
        L_0x00c2:
            com.p280ss.android.ugc.aweme.profile.p1487ui.widget.PinchImageView.C36609b.m118129a(r0)
            android.graphics.Matrix r0 = r11.f96056c
            r0.postTranslate(r12, r13)
            r11.mo92865a()
            r11.invalidate()
            int r12 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r12 != 0) goto L_0x00da
            int r12 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r12 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            return r1
        L_0x00da:
            r12 = 1
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.p1487ui.widget.PinchImageView.mo92866a(float, float):boolean");
    }

    public PinchImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118116b();
    }

    /* renamed from: a */
    private void m118113a(float f, float f2, float f3, float f4) {
        this.f96067n = C36609b.m118135c(this.f96056c)[0] / C36609b.m118131b(f, f2, f3, f4);
        float[] a = C36609b.m118130a(C36609b.m118134c(f, f2, f3, f4), this.f96056c);
        this.f96066m.set(a[0], a[1]);
    }

    /* renamed from: a */
    private void m118114a(PointF pointF, float f, float f2, PointF pointF2) {
        if (m118117c()) {
            float f3 = f * f2;
            Matrix a = C36609b.m118126a();
            a.postScale(f3, f3, pointF.x, pointF.y);
            a.postTranslate(pointF2.x - pointF.x, pointF2.y - pointF.y);
            this.f96056c.set(a);
            C36609b.m118133b(a);
            mo92865a();
            invalidate();
        }
    }
}
