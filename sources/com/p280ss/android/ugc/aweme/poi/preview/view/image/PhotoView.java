package com.p280ss.android.ugc.aweme.poi.preview.view.image;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView.ScaleType;
import android.widget.OverScroller;
import android.widget.Scroller;
import com.p280ss.android.vesdk.filterparam.VETransitionFilterParam;

/* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView */
public class PhotoView extends AppCompatImageView {

    /* renamed from: A */
    public RectF f92055A;

    /* renamed from: B */
    public Runnable f92056B;

    /* renamed from: C */
    public OnLongClickListener f92057C;

    /* renamed from: D */
    public Runnable f92058D = new Runnable() {
        public final void run() {
            if (PhotoView.this.f92083f != null) {
                PhotoView.this.f92083f.onClick(PhotoView.this);
            }
        }
    };

    /* renamed from: E */
    private int f92059E;

    /* renamed from: F */
    private int f92060F;

    /* renamed from: G */
    private int f92061G;

    /* renamed from: H */
    private int f92062H = VETransitionFilterParam.TransitionDuration_DEFAULT;

    /* renamed from: I */
    private Matrix f92063I = new Matrix();

    /* renamed from: J */
    private Matrix f92064J = new Matrix();

    /* renamed from: K */
    private GestureDetector f92065K;

    /* renamed from: L */
    private ScaleGestureDetector f92066L;

    /* renamed from: M */
    private ScaleType f92067M;

    /* renamed from: N */
    private boolean f92068N;

    /* renamed from: O */
    private boolean f92069O;

    /* renamed from: P */
    private boolean f92070P = false;

    /* renamed from: Q */
    private boolean f92071Q;

    /* renamed from: R */
    private boolean f92072R;

    /* renamed from: S */
    private PointF f92073S = new PointF();

    /* renamed from: T */
    private C35200a f92074T;

    /* renamed from: U */
    private long f92075U;

    /* renamed from: V */
    private OnScaleGestureListener f92076V = new OnScaleGestureListener() {
        public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            return true;
        }

        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }

        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            float scaleFactor = scaleGestureDetector.getScaleFactor();
            if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                return false;
            }
            PhotoView.this.f92091n *= scaleFactor;
            if (PhotoView.this.f92091n > 1.0f) {
                PhotoView.this.f92086i = true;
            } else {
                PhotoView.this.f92086i = false;
            }
            PhotoView.this.f92081d.postScale(scaleFactor, scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
            PhotoView.this.mo89541c();
            return true;
        }
    };

    /* renamed from: W */
    private OnGestureListener f92077W = new SimpleOnGestureListener() {
        public final void onLongPress(MotionEvent motionEvent) {
            if (PhotoView.this.f92057C != null) {
                PhotoView.this.f92057C.onLongClick(PhotoView.this);
            }
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            PhotoView.this.postDelayed(PhotoView.this.f92058D, 250);
            return false;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            PhotoView.this.f92085h = false;
            PhotoView.this.f92084g = false;
            PhotoView.this.f92087j = false;
            PhotoView.this.removeCallbacks(PhotoView.this.f92058D);
            return false;
        }

        public final boolean onDoubleTap(MotionEvent motionEvent) {
            float f;
            float f2;
            PhotoView.this.f92103z.mo89580b();
            float width = PhotoView.this.f92098u.left + (PhotoView.this.f92098u.width() / 2.0f);
            float height = PhotoView.this.f92098u.top + (PhotoView.this.f92098u.height() / 2.0f);
            PhotoView.this.f92101x.set(width, height);
            PhotoView.this.f92102y.set(width, height);
            PhotoView.this.f92092o = 0;
            PhotoView.this.f92093p = 0;
            if (PhotoView.this.f92086i) {
                f = PhotoView.this.f92091n;
                f2 = 1.0f;
            } else {
                float f3 = PhotoView.this.f92091n;
                float f4 = PhotoView.this.f92079b;
                PhotoView.this.f92101x.set(motionEvent.getX(), motionEvent.getY());
                f = f3;
                f2 = f4;
            }
            PhotoView.this.f92082e.reset();
            PhotoView.this.f92082e.postTranslate(-PhotoView.this.f92097t.left, -PhotoView.this.f92097t.top);
            PhotoView.this.f92082e.postTranslate(PhotoView.this.f92102y.x, PhotoView.this.f92102y.y);
            PhotoView.this.f92082e.postTranslate(-PhotoView.this.f92094q, -PhotoView.this.f92095r);
            PhotoView.this.f92082e.postRotate(PhotoView.this.f92090m, PhotoView.this.f92102y.x, PhotoView.this.f92102y.y);
            PhotoView.this.f92082e.postScale(f2, f2, PhotoView.this.f92101x.x, PhotoView.this.f92101x.y);
            PhotoView.this.f92082e.postTranslate((float) PhotoView.this.f92092o, (float) PhotoView.this.f92093p);
            PhotoView.this.f92082e.mapRect(PhotoView.this.f92099v, PhotoView.this.f92097t);
            PhotoView.this.mo89536a(PhotoView.this.f92099v);
            PhotoView.this.f92086i = !PhotoView.this.f92086i;
            PhotoView.this.f92103z.mo89575a(f, f2);
            PhotoView.this.f92103z.mo89574a();
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            float f3;
            float f4;
            if (PhotoView.this.f92084g) {
                return false;
            }
            if ((!PhotoView.this.f92088k && !PhotoView.this.f92089l) || PhotoView.this.f92103z.f92113a) {
                return false;
            }
            if (((float) Math.round(PhotoView.this.f92098u.left)) >= PhotoView.this.f92096s.left || ((float) Math.round(PhotoView.this.f92098u.right)) <= PhotoView.this.f92096s.right) {
                f3 = 0.0f;
            } else {
                f3 = f;
            }
            if (((float) Math.round(PhotoView.this.f92098u.top)) >= PhotoView.this.f92096s.top || ((float) Math.round(PhotoView.this.f92098u.bottom)) <= PhotoView.this.f92096s.bottom) {
                f4 = 0.0f;
            } else {
                f4 = f2;
            }
            if (PhotoView.this.f92087j || PhotoView.this.f92090m % 90.0f != 0.0f) {
                float f5 = (float) (((int) (PhotoView.this.f92090m / 90.0f)) * 90);
                float f6 = PhotoView.this.f92090m % 90.0f;
                if (f6 > 45.0f) {
                    f5 += 90.0f;
                } else if (f6 < -45.0f) {
                    f5 -= 90.0f;
                }
                PhotoView.this.f92103z.mo89577a((int) PhotoView.this.f92090m, (int) f5);
                PhotoView.this.f92090m = f5;
            }
            PhotoView.this.mo89536a(PhotoView.this.f92098u);
            PhotoView.this.f92103z.mo89581b(f3, f4);
            PhotoView.this.f92103z.mo89574a();
            return super.onFling(motionEvent, motionEvent2, f, f2);
        }

        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (PhotoView.this.f92103z.f92113a) {
                PhotoView.this.f92103z.mo89580b();
            }
            if (PhotoView.this.mo89537a(f)) {
                if (f < 0.0f && PhotoView.this.f92098u.left - f > PhotoView.this.f92096s.left) {
                    f = PhotoView.this.f92098u.left;
                }
                if (f > 0.0f && PhotoView.this.f92098u.right - f < PhotoView.this.f92096s.right) {
                    f = PhotoView.this.f92098u.right - PhotoView.this.f92096s.right;
                }
                PhotoView.this.f92081d.postTranslate(-f, 0.0f);
                PhotoView.this.f92092o = (int) (((float) PhotoView.this.f92092o) - f);
            } else if (PhotoView.this.f92088k || PhotoView.this.f92084g || PhotoView.this.f92085h) {
                PhotoView.this.mo89544d();
                if (!PhotoView.this.f92084g) {
                    if (f < 0.0f && PhotoView.this.f92098u.left - f > PhotoView.this.f92100w.left) {
                        f = PhotoView.this.mo89534a(PhotoView.this.f92098u.left - PhotoView.this.f92100w.left, f);
                    }
                    if (f > 0.0f && PhotoView.this.f92098u.right - f < PhotoView.this.f92100w.right) {
                        f = PhotoView.this.mo89534a(PhotoView.this.f92098u.right - PhotoView.this.f92100w.right, f);
                    }
                }
                PhotoView.this.f92092o = (int) (((float) PhotoView.this.f92092o) - f);
                PhotoView.this.f92081d.postTranslate(-f, 0.0f);
                PhotoView.this.f92085h = true;
            }
            if (PhotoView.this.mo89540b(f2)) {
                if (f2 < 0.0f && PhotoView.this.f92098u.top - f2 > PhotoView.this.f92096s.top) {
                    f2 = PhotoView.this.f92098u.top;
                }
                if (f2 > 0.0f && PhotoView.this.f92098u.bottom - f2 < PhotoView.this.f92096s.bottom) {
                    f2 = PhotoView.this.f92098u.bottom - PhotoView.this.f92096s.bottom;
                }
                PhotoView.this.f92081d.postTranslate(0.0f, -f2);
                PhotoView.this.f92093p = (int) (((float) PhotoView.this.f92093p) - f2);
            } else if (PhotoView.this.f92089l || PhotoView.this.f92085h || PhotoView.this.f92084g) {
                PhotoView.this.mo89544d();
                if (!PhotoView.this.f92084g) {
                    if (f2 < 0.0f && PhotoView.this.f92098u.top - f2 > PhotoView.this.f92100w.top) {
                        f2 = PhotoView.this.mo89538b(PhotoView.this.f92098u.top - PhotoView.this.f92100w.top, f2);
                    }
                    if (f2 > 0.0f && PhotoView.this.f92098u.bottom - f2 < PhotoView.this.f92100w.bottom) {
                        f2 = PhotoView.this.mo89538b(PhotoView.this.f92098u.bottom - PhotoView.this.f92100w.bottom, f2);
                    }
                }
                PhotoView.this.f92081d.postTranslate(0.0f, -f2);
                PhotoView.this.f92093p = (int) (((float) PhotoView.this.f92093p) - f2);
                PhotoView.this.f92085h = true;
            }
            PhotoView.this.mo89541c();
            return true;
        }
    };

    /* renamed from: a */
    public int f92078a;

    /* renamed from: b */
    public float f92079b;

    /* renamed from: c */
    public int f92080c;

    /* renamed from: d */
    public Matrix f92081d = new Matrix();

    /* renamed from: e */
    public Matrix f92082e = new Matrix();

    /* renamed from: f */
    public OnClickListener f92083f;

    /* renamed from: g */
    public boolean f92084g;

    /* renamed from: h */
    public boolean f92085h;

    /* renamed from: i */
    public boolean f92086i;

    /* renamed from: j */
    public boolean f92087j;

    /* renamed from: k */
    public boolean f92088k;

    /* renamed from: l */
    public boolean f92089l;

    /* renamed from: m */
    public float f92090m;

    /* renamed from: n */
    public float f92091n = 1.0f;

    /* renamed from: o */
    public int f92092o;

    /* renamed from: p */
    public int f92093p;

    /* renamed from: q */
    public float f92094q;

    /* renamed from: r */
    public float f92095r;

    /* renamed from: s */
    public RectF f92096s = new RectF();

    /* renamed from: t */
    public RectF f92097t = new RectF();

    /* renamed from: u */
    public RectF f92098u = new RectF();

    /* renamed from: v */
    public RectF f92099v = new RectF();

    /* renamed from: w */
    public RectF f92100w = new RectF();

    /* renamed from: x */
    public PointF f92101x = new PointF();

    /* renamed from: y */
    public PointF f92102y = new PointF();

    /* renamed from: z */
    public C35191f f92103z = new C35191f();

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$4 */
    static /* synthetic */ class C351854 {

        /* renamed from: a */
        static final /* synthetic */ int[] f92107a = new int[ScaleType.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f92107a = r0
                int[] r0 = f92107a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f92107a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f92107a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f92107a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f92107a     // Catch:{ NoSuchFieldError -> 0x0040 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f92107a     // Catch:{ NoSuchFieldError -> 0x004b }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f92107a     // Catch:{ NoSuchFieldError -> 0x0056 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.preview.view.image.PhotoView.C351854.<clinit>():void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$a */
    public interface C35186a {
        /* renamed from: a */
        float mo89572a();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$b */
    public class C35187b implements C35186a {
        /* renamed from: a */
        public final float mo89572a() {
            return PhotoView.this.f92098u.bottom;
        }

        public C35187b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$c */
    class C35188c implements Interpolator {

        /* renamed from: a */
        public Interpolator f92109a;

        private C35188c() {
            this.f92109a = new DecelerateInterpolator();
        }

        public final float getInterpolation(float f) {
            if (this.f92109a != null) {
                return this.f92109a.getInterpolation(f);
            }
            return f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$d */
    public class C35189d implements C35186a {
        /* renamed from: a */
        public final float mo89572a() {
            return (PhotoView.this.f92098u.top + PhotoView.this.f92098u.bottom) / 2.0f;
        }

        public C35189d() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$e */
    public class C35190e implements C35186a {
        /* renamed from: a */
        public final float mo89572a() {
            return PhotoView.this.f92098u.top;
        }

        public C35190e() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f */
    class C35191f implements Runnable {

        /* renamed from: a */
        boolean f92113a;

        /* renamed from: b */
        OverScroller f92114b;

        /* renamed from: c */
        OverScroller f92115c;

        /* renamed from: d */
        Scroller f92116d;

        /* renamed from: e */
        Scroller f92117e;

        /* renamed from: f */
        Scroller f92118f;

        /* renamed from: g */
        C35186a f92119g;

        /* renamed from: h */
        int f92120h;

        /* renamed from: i */
        int f92121i;

        /* renamed from: j */
        int f92122j;

        /* renamed from: k */
        int f92123k;

        /* renamed from: l */
        RectF f92124l = new RectF();

        /* renamed from: m */
        C35188c f92125m = new C35188c();

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo89574a() {
            this.f92113a = true;
            m113560d();
        }

        /* renamed from: d */
        private void m113560d() {
            if (this.f92113a) {
                PhotoView.this.post(this);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo89580b() {
            PhotoView.this.removeCallbacks(this);
            this.f92114b.abortAnimation();
            this.f92116d.abortAnimation();
            this.f92115c.abortAnimation();
            this.f92118f.abortAnimation();
            this.f92113a = false;
        }

        /* renamed from: c */
        private void m113559c() {
            PhotoView.this.f92081d.reset();
            PhotoView.this.f92081d.postTranslate(-PhotoView.this.f92097t.left, -PhotoView.this.f92097t.top);
            PhotoView.this.f92081d.postTranslate(PhotoView.this.f92102y.x, PhotoView.this.f92102y.y);
            PhotoView.this.f92081d.postTranslate(-PhotoView.this.f92094q, -PhotoView.this.f92095r);
            PhotoView.this.f92081d.postRotate(PhotoView.this.f92090m, PhotoView.this.f92102y.x, PhotoView.this.f92102y.y);
            PhotoView.this.f92081d.postScale(PhotoView.this.f92091n, PhotoView.this.f92091n, PhotoView.this.f92101x.x, PhotoView.this.f92101x.y);
            PhotoView.this.f92081d.postTranslate((float) PhotoView.this.f92092o, (float) PhotoView.this.f92093p);
            PhotoView.this.mo89541c();
        }

        public final void run() {
            boolean z;
            boolean z2 = true;
            boolean z3 = false;
            if (this.f92116d.computeScrollOffset()) {
                PhotoView.this.f92091n = ((float) this.f92116d.getCurrX()) / 10000.0f;
                z = false;
            } else {
                z = true;
            }
            if (this.f92114b.computeScrollOffset()) {
                int currX = this.f92114b.getCurrX() - this.f92122j;
                int currY = this.f92114b.getCurrY() - this.f92123k;
                PhotoView.this.f92092o += currX;
                PhotoView.this.f92093p += currY;
                this.f92122j = this.f92114b.getCurrX();
                this.f92123k = this.f92114b.getCurrY();
                z = false;
            }
            if (this.f92115c.computeScrollOffset()) {
                int currX2 = this.f92115c.getCurrX() - this.f92120h;
                int currY2 = this.f92115c.getCurrY() - this.f92121i;
                this.f92120h = this.f92115c.getCurrX();
                this.f92121i = this.f92115c.getCurrY();
                PhotoView.this.f92092o += currX2;
                PhotoView.this.f92093p += currY2;
                z = false;
            }
            if (this.f92118f.computeScrollOffset()) {
                PhotoView.this.f92090m = (float) this.f92118f.getCurrX();
                z = false;
            }
            if (this.f92117e.computeScrollOffset() || PhotoView.this.f92055A != null) {
                float currX3 = ((float) this.f92117e.getCurrX()) / 10000.0f;
                float currY3 = ((float) this.f92117e.getCurrY()) / 10000.0f;
                PhotoView.this.f92082e.setScale(currX3, currY3, (PhotoView.this.f92098u.left + PhotoView.this.f92098u.right) / 2.0f, this.f92119g.mo89572a());
                PhotoView.this.f92082e.mapRect(this.f92124l, PhotoView.this.f92098u);
                if (currX3 == 1.0f) {
                    this.f92124l.left = PhotoView.this.f92096s.left;
                    this.f92124l.right = PhotoView.this.f92096s.right;
                }
                if (currY3 == 1.0f) {
                    this.f92124l.top = PhotoView.this.f92096s.top;
                    this.f92124l.bottom = PhotoView.this.f92096s.bottom;
                }
                PhotoView.this.f92055A = this.f92124l;
            }
            if (!z) {
                m113559c();
                m113560d();
                return;
            }
            this.f92113a = false;
            if (PhotoView.this.f92088k) {
                if (PhotoView.this.f92098u.left > 0.0f) {
                    PhotoView.this.f92092o = (int) (((float) PhotoView.this.f92092o) - PhotoView.this.f92098u.left);
                } else if (PhotoView.this.f92098u.right < PhotoView.this.f92096s.width()) {
                    PhotoView.this.f92092o -= (int) (PhotoView.this.f92096s.width() - PhotoView.this.f92098u.right);
                }
                z3 = true;
            }
            if (!PhotoView.this.f92089l) {
                z2 = z3;
            } else if (PhotoView.this.f92098u.top > 0.0f) {
                PhotoView.this.f92093p = (int) (((float) PhotoView.this.f92093p) - PhotoView.this.f92098u.top);
            } else if (PhotoView.this.f92098u.bottom < PhotoView.this.f92096s.height()) {
                PhotoView.this.f92093p -= (int) (PhotoView.this.f92096s.height() - PhotoView.this.f92098u.bottom);
            }
            if (z2) {
                m113559c();
            }
            PhotoView.this.invalidate();
            if (PhotoView.this.f92056B != null) {
                PhotoView.this.f92056B.run();
                PhotoView.this.f92056B = null;
            }
        }

        C35191f() {
            Context context = PhotoView.this.getContext();
            this.f92114b = new OverScroller(context, this.f92125m);
            this.f92116d = new Scroller(context, this.f92125m);
            this.f92115c = new OverScroller(context, this.f92125m);
            this.f92117e = new Scroller(context, this.f92125m);
            this.f92118f = new Scroller(context, this.f92125m);
        }

        /* renamed from: a */
        public final void mo89579a(Interpolator interpolator) {
            this.f92125m.f92109a = interpolator;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo89577a(int i, int i2) {
            this.f92118f.startScroll(i, 0, i2 - i, 0, PhotoView.this.f92078a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo89575a(float f, float f2) {
            this.f92116d.startScroll((int) (f * 10000.0f), 0, (int) ((f2 - f) * 10000.0f), 0, PhotoView.this.f92078a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo89581b(float f, float f2) {
            int i;
            float f3;
            int i2;
            int i3;
            int i4;
            float f4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9;
            int i10;
            int i11;
            int i12;
            float f5 = f;
            float f6 = f2;
            if (f5 < 0.0f) {
                i = Integer.MAX_VALUE;
            } else {
                i = 0;
            }
            this.f92120h = i;
            if (f5 > 0.0f) {
                f3 = Math.abs(PhotoView.this.f92098u.left);
            } else {
                f3 = PhotoView.this.f92098u.right - PhotoView.this.f92096s.right;
            }
            int i13 = (int) f3;
            if (f5 < 0.0f) {
                i13 = Integer.MAX_VALUE - i13;
            }
            if (f5 < 0.0f) {
                i2 = i13;
            } else {
                i2 = 0;
            }
            if (f5 < 0.0f) {
                i3 = Integer.MAX_VALUE;
            } else {
                i3 = i13;
            }
            if (f5 < 0.0f) {
                i13 = Integer.MAX_VALUE - i2;
            }
            if (f6 < 0.0f) {
                i4 = Integer.MAX_VALUE;
            } else {
                i4 = 0;
            }
            this.f92121i = i4;
            if (f6 > 0.0f) {
                f4 = Math.abs(PhotoView.this.f92098u.top);
            } else {
                f4 = PhotoView.this.f92098u.bottom - PhotoView.this.f92096s.bottom;
            }
            int i14 = (int) f4;
            if (f6 < 0.0f) {
                i14 = Integer.MAX_VALUE - i14;
            }
            if (f6 < 0.0f) {
                i5 = i14;
            } else {
                i5 = 0;
            }
            if (f6 < 0.0f) {
                i6 = Integer.MAX_VALUE;
            } else {
                i6 = i14;
            }
            if (f6 < 0.0f) {
                i14 = Integer.MAX_VALUE - i5;
            }
            if (f5 == 0.0f) {
                i8 = 0;
                i7 = 0;
            } else {
                i8 = i2;
                i7 = i3;
            }
            if (f6 == 0.0f) {
                i10 = 0;
                i9 = 0;
            } else {
                i10 = i5;
                i9 = i6;
            }
            OverScroller overScroller = this.f92115c;
            int i15 = this.f92120h;
            int i16 = this.f92121i;
            int i17 = (int) f5;
            int i18 = (int) f6;
            if (Math.abs(i13) < PhotoView.this.f92080c * 2) {
                i11 = 0;
            } else {
                i11 = PhotoView.this.f92080c;
            }
            if (Math.abs(i14) < PhotoView.this.f92080c * 2) {
                i12 = 0;
            } else {
                i12 = PhotoView.this.f92080c;
            }
            overScroller.fling(i15, i16, i17, i18, i8, i7, i10, i9, i11, i12);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo89578a(int i, int i2, int i3, int i4) {
            this.f92122j = 0;
            this.f92123k = 0;
            this.f92114b.startScroll(0, 0, i3, i4, PhotoView.this.f92078a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo89576a(float f, float f2, float f3, float f4, int i, C35186a aVar) {
            this.f92117e.startScroll((int) (f * 10000.0f), (int) (f2 * 10000.0f), (int) (f3 * 10000.0f), (int) (f4 * 10000.0f), i);
            this.f92119g = aVar;
        }
    }

    /* renamed from: a */
    public final void mo89535a() {
        this.f92070P = true;
    }

    /* renamed from: b */
    public final void mo89539b() {
        this.f92070P = false;
    }

    public int getAnimaDuring() {
        return this.f92078a;
    }

    public int getDefaultAnimaDuring() {
        return 340;
    }

    public float getMaxScale() {
        return this.f92079b;
    }

    /* renamed from: d */
    public final void mo89544d() {
        if (!this.f92085h) {
            m113525a(this.f92096s, this.f92098u, this.f92100w);
        }
    }

    /* renamed from: l */
    private void m113539l() {
        m113538k();
        float f = -this.f92098u.top;
        this.f92093p = (int) (((float) this.f92093p) + f);
        this.f92081d.postTranslate(0.0f, f);
        mo89541c();
        m113542o();
    }

    /* renamed from: m */
    private void m113540m() {
        m113538k();
        float f = this.f92096s.bottom - this.f92098u.bottom;
        this.f92093p = (int) (((float) this.f92093p) + f);
        this.f92081d.postTranslate(0.0f, f);
        mo89541c();
        m113542o();
    }

    /* renamed from: q */
    private void m113544q() {
        this.f92081d.reset();
        mo89541c();
        this.f92091n = 1.0f;
        this.f92092o = 0;
        this.f92093p = 0;
    }

    /* renamed from: k */
    private void m113538k() {
        if (this.f92098u.width() < this.f92096s.width()) {
            this.f92091n = this.f92096s.width() / this.f92098u.width();
            this.f92081d.postScale(this.f92091n, this.f92091n, this.f92073S.x, this.f92073S.y);
            mo89541c();
            m113542o();
        }
    }

    /* renamed from: n */
    private void m113541n() {
        this.f92081d.postScale(this.f92096s.width() / this.f92098u.width(), this.f92096s.height() / this.f92098u.height(), this.f92073S.x, this.f92073S.y);
        mo89541c();
        m113542o();
    }

    /* renamed from: e */
    public final boolean mo89547e() {
        if (this.f92090m == 0.0f && this.f92091n == 1.0f && getTranslationX() == 0.0f && getTranslationY() == 0.0f) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    private void mo89587f() {
        super.setScaleType(ScaleType.MATRIX);
        if (this.f92067M == null) {
            this.f92067M = ScaleType.CENTER_INSIDE;
        }
        this.f92065K = new GestureDetector(getContext(), this.f92077W);
        this.f92066L = new ScaleGestureDetector(getContext(), this.f92076V);
        float f = getResources().getDisplayMetrics().density;
        int i = (int) (30.0f * f);
        this.f92060F = i;
        this.f92080c = i;
        this.f92061G = (int) (f * 140.0f);
        this.f92059E = 35;
        this.f92078a = 340;
        this.f92079b = 2.5f;
    }

    /* renamed from: h */
    private void mo89592h() {
        if (this.f92068N && this.f92069O) {
            Drawable drawable = getDrawable();
            int b = m113529b(drawable);
            int c = m113531c(drawable);
            float f = (float) b;
            if (f > this.f92096s.width() || ((float) c) > this.f92096s.height()) {
                float width = f / this.f92098u.width();
                float height = ((float) c) / this.f92098u.height();
                if (width > height) {
                    height = width;
                }
                this.f92091n = height;
                this.f92081d.postScale(this.f92091n, this.f92091n, this.f92073S.x, this.f92073S.y);
                mo89541c();
                m113542o();
            }
        }
    }

    /* renamed from: i */
    private void m113536i() {
        if (this.f92098u.width() < this.f92096s.width() || this.f92098u.height() < this.f92096s.height()) {
            float width = this.f92096s.width() / this.f92098u.width();
            float height = this.f92096s.height() / this.f92098u.height();
            if (width <= height) {
                width = height;
            }
            this.f92091n = width;
            this.f92081d.postScale(this.f92091n, this.f92091n, this.f92073S.x, this.f92073S.y);
            mo89541c();
            m113542o();
        }
    }

    /* renamed from: j */
    private void m113537j() {
        if (this.f92098u.width() > this.f92096s.width() || this.f92098u.height() > this.f92096s.height()) {
            float width = this.f92096s.width() / this.f92098u.width();
            float height = this.f92096s.height() / this.f92098u.height();
            if (width >= height) {
                width = height;
            }
            this.f92091n = width;
            this.f92081d.postScale(this.f92091n, this.f92091n, this.f92073S.x, this.f92073S.y);
            mo89541c();
            m113542o();
        }
    }

    /* renamed from: o */
    private void m113542o() {
        Drawable drawable = getDrawable();
        this.f92097t.set(0.0f, 0.0f, (float) m113529b(drawable), (float) m113531c(drawable));
        this.f92063I.set(this.f92064J);
        this.f92063I.mapRect(this.f92097t);
        this.f92094q = this.f92097t.width() / 2.0f;
        this.f92095r = this.f92097t.height() / 2.0f;
        this.f92091n = 1.0f;
        this.f92092o = 0;
        this.f92093p = 0;
        this.f92081d.reset();
    }

    /* renamed from: c */
    public final void mo89541c() {
        boolean z;
        this.f92064J.set(this.f92063I);
        this.f92064J.postConcat(this.f92081d);
        setImageMatrix(this.f92064J);
        this.f92081d.mapRect(this.f92098u, this.f92097t);
        boolean z2 = false;
        if (this.f92098u.width() > this.f92096s.width()) {
            z = true;
        } else {
            z = false;
        }
        this.f92088k = z;
        if (this.f92098u.height() > this.f92096s.height()) {
            z2 = true;
        }
        this.f92089l = z2;
    }

    public C35200a getInfo() {
        RectF rectF = new RectF();
        int[] iArr = new int[2];
        m113526a((View) this, iArr);
        rectF.set(((float) iArr[0]) + this.f92098u.left, ((float) iArr[1]) + this.f92098u.top, ((float) iArr[0]) + this.f92098u.right, ((float) iArr[1]) + this.f92098u.bottom);
        C35200a aVar = new C35200a(rectF, this.f92098u, this.f92096s, this.f92097t, this.f92073S, this.f92091n, this.f92090m, this.f92067M);
        return aVar;
    }

    /* renamed from: p */
    private void m113543p() {
        if (!this.f92103z.f92113a) {
            if (this.f92087j || this.f92090m % 90.0f != 0.0f) {
                float f = (float) (((int) (this.f92090m / 90.0f)) * 90);
                float f2 = this.f92090m % 90.0f;
                if (f2 > 45.0f) {
                    f += 90.0f;
                } else if (f2 < -45.0f) {
                    f -= 90.0f;
                }
                this.f92103z.mo89577a((int) this.f92090m, (int) f);
                this.f92090m = f;
            }
            float f3 = this.f92091n;
            if (this.f92091n < 1.0f) {
                this.f92103z.mo89575a(this.f92091n, 1.0f);
                f3 = 1.0f;
            } else if (this.f92091n > this.f92079b) {
                f3 = this.f92079b;
                this.f92103z.mo89575a(this.f92091n, this.f92079b);
            }
            float width = this.f92098u.left + (this.f92098u.width() / 2.0f);
            float height = this.f92098u.top + (this.f92098u.height() / 2.0f);
            this.f92101x.set(width, height);
            this.f92102y.set(width, height);
            this.f92092o = 0;
            this.f92093p = 0;
            this.f92082e.reset();
            this.f92082e.postTranslate(-this.f92097t.left, -this.f92097t.top);
            this.f92082e.postTranslate(width - this.f92094q, height - this.f92095r);
            this.f92082e.postScale(f3, f3, width, height);
            this.f92082e.postRotate(this.f92090m, width, height);
            this.f92082e.mapRect(this.f92099v, this.f92097t);
            mo89536a(this.f92099v);
            this.f92103z.mo89574a();
        }
    }

    /* renamed from: g */
    private void mo89588g() {
        float f;
        if (this.f92068N && this.f92069O) {
            this.f92063I.reset();
            this.f92081d.reset();
            this.f92086i = false;
            Drawable drawable = getDrawable();
            int width = getWidth();
            int height = getHeight();
            int b = m113529b(drawable);
            int c = m113531c(drawable);
            float f2 = (float) b;
            float f3 = (float) c;
            this.f92097t.set(0.0f, 0.0f, f2, f3);
            int i = (width - b) / 2;
            int i2 = (height - c) / 2;
            float f4 = 1.0f;
            if (b > width) {
                f = ((float) width) / f2;
            } else {
                f = 1.0f;
            }
            if (c > height) {
                f4 = ((float) height) / f3;
            }
            if (f >= f4) {
                f = f4;
            }
            this.f92063I.reset();
            this.f92063I.postTranslate((float) i, (float) i2);
            this.f92063I.postScale(f, f, this.f92073S.x, this.f92073S.y);
            this.f92063I.mapRect(this.f92097t);
            this.f92094q = this.f92097t.width() / 2.0f;
            this.f92095r = this.f92097t.height() / 2.0f;
            this.f92101x.set(this.f92073S);
            this.f92102y.set(this.f92101x);
            mo89541c();
            switch (C351854.f92107a[this.f92067M.ordinal()]) {
                case 1:
                    mo89592h();
                    break;
                case 2:
                    m113536i();
                    break;
                case 3:
                    m113537j();
                    break;
                case 4:
                    m113538k();
                    break;
                case 5:
                    m113539l();
                    break;
                case 6:
                    m113540m();
                    break;
                case 7:
                    m113541n();
                    break;
            }
            this.f92071Q = true;
            if (this.f92074T != null && System.currentTimeMillis() - this.f92075U < ((long) this.f92062H)) {
                m113527a(this.f92074T);
            }
            this.f92074T = null;
            if (c > b * 3) {
                this.f92081d.postTranslate(0.0f, -this.f92098u.top);
                this.f92093p = (int) (((float) this.f92093p) - this.f92098u.top);
                mo89541c();
            }
        }
    }

    public void setAnimaDuring(int i) {
        this.f92078a = i;
    }

    public void setMaxAnimFromWaiteTime(int i) {
        this.f92062H = i;
    }

    public void setMaxScale(float f) {
        this.f92079b = f;
    }

    public void setOnLongClickListener(OnLongClickListener onLongClickListener) {
        this.f92057C = onLongClickListener;
    }

    public void setAdjustViewBounds(boolean z) {
        super.setAdjustViewBounds(z);
        this.f92072R = z;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f92103z.mo89579a(interpolator);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f92083f = onClickListener;
    }

    public boolean canScrollHorizontally(int i) {
        if (this.f92084g) {
            return true;
        }
        return mo89537a((float) i);
    }

    public boolean canScrollVertically(int i) {
        if (this.f92084g) {
            return true;
        }
        return mo89540b((float) i);
    }

    public void draw(Canvas canvas) {
        if (this.f92055A != null) {
            canvas.clipRect(this.f92055A);
            this.f92055A = null;
        }
        super.draw(canvas);
    }

    public void setImageResource(int i) {
        Drawable drawable;
        try {
            drawable = getResources().getDrawable(i);
        } catch (Exception unused) {
            drawable = null;
        }
        setImageDrawable(drawable);
    }

    public void setScaleType(ScaleType scaleType) {
        ScaleType scaleType2 = this.f92067M;
        this.f92067M = scaleType;
        if (scaleType2 != scaleType) {
            mo89588g();
        }
    }

    /* renamed from: b */
    private static int m113529b(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth <= 0) {
            intrinsicWidth = drawable.getMinimumWidth();
        }
        if (intrinsicWidth <= 0) {
            return drawable.getBounds().width();
        }
        return intrinsicWidth;
    }

    /* renamed from: c */
    private static int m113531c(Drawable drawable) {
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicHeight <= 0) {
            intrinsicHeight = drawable.getMinimumHeight();
        }
        if (intrinsicHeight <= 0) {
            return drawable.getBounds().height();
        }
        return intrinsicHeight;
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable == null) {
            this.f92068N = false;
        } else if (m113528a(drawable)) {
            if (!this.f92068N) {
                this.f92068N = true;
            }
            mo89588g();
        }
    }

    /* renamed from: a */
    private static boolean m113528a(Drawable drawable) {
        if ((drawable.getIntrinsicHeight() <= 0 || drawable.getIntrinsicWidth() <= 0) && ((drawable.getMinimumWidth() <= 0 || drawable.getMinimumHeight() <= 0) && (drawable.getBounds().width() <= 0 || drawable.getBounds().height() <= 0))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m113530b(RectF rectF) {
        if (Math.abs(((float) Math.round(rectF.top)) - ((this.f92096s.height() - rectF.height()) / 2.0f)) < 1.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private boolean m113532c(RectF rectF) {
        if (Math.abs(((float) Math.round(rectF.left)) - ((this.f92096s.width() - rectF.width()) / 2.0f)) < 1.0f) {
            return true;
        }
        return false;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.f92070P) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (motionEvent.getPointerCount() >= 2) {
            this.f92084g = true;
        }
        this.f92065K.onTouchEvent(motionEvent);
        this.f92066L.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            m113543p();
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo89540b(float f) {
        if (this.f92098u.height() <= this.f92096s.height()) {
            return false;
        }
        if (f < 0.0f && ((float) Math.round(this.f92098u.top)) - f >= this.f92096s.top) {
            return false;
        }
        if (f <= 0.0f || ((float) Math.round(this.f92098u.bottom)) - f > this.f92096s.bottom) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m113527a(C35200a aVar) {
        C35186a aVar2;
        if (this.f92071Q) {
            m113544q();
            C35200a info = getInfo();
            float width = aVar.f92160b.width() / info.f92160b.width();
            float height = aVar.f92160b.height() / info.f92160b.height();
            if (width < height) {
                height = width;
            }
            float width2 = aVar.f92159a.left + (aVar.f92159a.width() / 2.0f);
            float height2 = aVar.f92159a.top + (aVar.f92159a.height() / 2.0f);
            this.f92081d.reset();
            this.f92081d.postTranslate(-this.f92097t.left, -this.f92097t.top);
            this.f92081d.postTranslate(width2 - (this.f92097t.width() / 2.0f), height2 - (this.f92097t.height() / 2.0f));
            this.f92081d.postScale(height, height, width2, height2);
            this.f92081d.postRotate(aVar.f92165g, width2, height2);
            mo89541c();
            this.f92101x.set(width2, height2);
            this.f92102y.set(width2, height2);
            this.f92103z.mo89578a(0, 0, (int) (this.f92073S.x - width2), (int) (this.f92073S.y - height2));
            this.f92103z.mo89575a(height, 1.0f);
            this.f92103z.mo89577a((int) aVar.f92165g, 0);
            if (aVar.f92161c.width() < aVar.f92160b.width() || aVar.f92161c.height() < aVar.f92160b.height()) {
                float width3 = aVar.f92161c.width() / aVar.f92160b.width();
                float height3 = aVar.f92161c.height() / aVar.f92160b.height();
                if (width3 > 1.0f) {
                    width3 = 1.0f;
                }
                if (height3 > 1.0f) {
                    height3 = 1.0f;
                }
                if (aVar.f92166h == ScaleType.FIT_START) {
                    aVar2 = new C35190e();
                } else if (aVar.f92166h == ScaleType.FIT_END) {
                    aVar2 = new C35187b();
                } else {
                    aVar2 = new C35189d();
                }
                this.f92103z.mo89576a(width3, height3, 1.0f - width3, 1.0f - height3, this.f92078a / 3, aVar2);
                this.f92082e.setScale(width3, height3, (this.f92098u.left + this.f92098u.right) / 2.0f, aVar2.mo89572a());
                this.f92082e.mapRect(this.f92103z.f92124l, this.f92098u);
                this.f92055A = this.f92103z.f92124l;
            }
            this.f92103z.mo89574a();
            return;
        }
        this.f92074T = aVar;
        this.f92075U = System.currentTimeMillis();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a9  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo89536a(android.graphics.RectF r6) {
        /*
            r5 = this;
            float r0 = r6.width()
            android.graphics.RectF r1 = r5.f92096s
            float r1 = r1.width()
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0029
            boolean r0 = r5.m113532c(r6)
            if (r0 != 0) goto L_0x004f
            android.graphics.RectF r0 = r5.f92096s
            float r0 = r0.width()
            float r1 = r6.width()
            float r0 = r0 - r1
            float r0 = r0 / r2
            float r1 = r6.left
            float r0 = r0 - r1
            int r0 = (int) r0
            int r0 = -r0
            goto L_0x0050
        L_0x0029:
            float r0 = r6.left
            android.graphics.RectF r1 = r5.f92096s
            float r1 = r1.left
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
            float r0 = r6.left
            android.graphics.RectF r1 = r5.f92096s
            float r1 = r1.left
            float r0 = r0 - r1
            int r0 = (int) r0
            goto L_0x0050
        L_0x003c:
            float r0 = r6.right
            android.graphics.RectF r1 = r5.f92096s
            float r1 = r1.right
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x004f
            float r0 = r6.right
            android.graphics.RectF r1 = r5.f92096s
            float r1 = r1.right
            float r0 = r0 - r1
            int r0 = (int) r0
            goto L_0x0050
        L_0x004f:
            r0 = 0
        L_0x0050:
            float r1 = r6.height()
            android.graphics.RectF r4 = r5.f92096s
            float r4 = r4.height()
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0076
            boolean r1 = r5.m113530b(r6)
            if (r1 != 0) goto L_0x009b
            android.graphics.RectF r1 = r5.f92096s
            float r1 = r1.height()
            float r3 = r6.height()
            float r1 = r1 - r3
            float r1 = r1 / r2
            float r6 = r6.top
            float r1 = r1 - r6
            int r6 = (int) r1
            int r3 = -r6
            goto L_0x009b
        L_0x0076:
            float r1 = r6.top
            android.graphics.RectF r2 = r5.f92096s
            float r2 = r2.top
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0089
            float r6 = r6.top
            android.graphics.RectF r1 = r5.f92096s
            float r1 = r1.top
            float r6 = r6 - r1
            int r3 = (int) r6
            goto L_0x009b
        L_0x0089:
            float r1 = r6.bottom
            android.graphics.RectF r2 = r5.f92096s
            float r2 = r2.bottom
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x009b
            float r6 = r6.bottom
            android.graphics.RectF r1 = r5.f92096s
            float r1 = r1.bottom
            float r6 = r6 - r1
            int r3 = (int) r6
        L_0x009b:
            if (r0 != 0) goto L_0x009f
            if (r3 == 0) goto L_0x00bb
        L_0x009f:
            com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f r6 = r5.f92103z
            android.widget.OverScroller r6 = r6.f92115c
            boolean r6 = r6.isFinished()
            if (r6 != 0) goto L_0x00b0
            com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f r6 = r5.f92103z
            android.widget.OverScroller r6 = r6.f92115c
            r6.abortAnimation()
        L_0x00b0:
            com.ss.android.ugc.aweme.poi.preview.view.image.PhotoView$f r6 = r5.f92103z
            int r1 = r5.f92092o
            int r2 = r5.f92093p
            int r0 = -r0
            int r3 = -r3
            r6.mo89578a(r1, r2, r0, r3)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.preview.view.image.PhotoView.mo89536a(android.graphics.RectF):void");
    }

    /* renamed from: a */
    public final boolean mo89537a(float f) {
        if (this.f92098u.width() <= this.f92096s.width()) {
            return false;
        }
        if (f < 0.0f && ((float) Math.round(this.f92098u.left)) - f >= this.f92096s.left) {
            return false;
        }
        if (f <= 0.0f || ((float) Math.round(this.f92098u.right)) - f > this.f92096s.right) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final float mo89534a(float f, float f2) {
        return f2 * (Math.abs(Math.abs(f) - ((float) this.f92061G)) / ((float) this.f92061G));
    }

    /* renamed from: b */
    public final float mo89538b(float f, float f2) {
        return f2 * (Math.abs(Math.abs(f) - ((float) this.f92061G)) / ((float) this.f92061G));
    }

    /* renamed from: a */
    private static void m113526a(View view, int[] iArr) {
        iArr[0] = iArr[0] + view.getLeft();
        iArr[1] = iArr[1] + view.getTop();
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() != 16908290) {
                iArr[0] = iArr[0] - view2.getScrollX();
                iArr[1] = iArr[1] - view2.getScrollY();
                iArr[0] = iArr[0] + view2.getLeft();
                iArr[1] = iArr[1] + view2.getTop();
                parent = view2.getParent();
            } else {
                return;
            }
        }
        iArr[0] = (int) (((float) iArr[0]) + 0.5f);
        iArr[1] = (int) (((float) iArr[1]) + 0.5f);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (!this.f92068N) {
            super.onMeasure(i, i2);
            return;
        }
        Drawable drawable = getDrawable();
        int b = m113529b(drawable);
        int c = m113531c(drawable);
        int size = MeasureSpec.getSize(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode = MeasureSpec.getMode(i);
        int mode2 = MeasureSpec.getMode(i2);
        LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LayoutParams(-2, -2);
        }
        if (layoutParams.width != -1 ? mode != 1073741824 && (mode != Integer.MIN_VALUE || b <= size) : mode == 0) {
            size = b;
        }
        if (layoutParams.height != -1 ? mode2 != 1073741824 && (mode2 != Integer.MIN_VALUE || c <= size2) : mode2 == 0) {
            size2 = c;
        }
        if (this.f92072R) {
            float f = (float) b;
            float f2 = (float) c;
            float f3 = (float) size;
            float f4 = (float) size2;
            if (f / f2 != f3 / f4) {
                float f5 = f4 / f2;
                float f6 = f3 / f;
                if (f5 < f6) {
                    f6 = f5;
                }
                if (layoutParams.width != -1) {
                    size = (int) (f * f6);
                }
                if (layoutParams.height != -1) {
                    size2 = (int) (f2 * f6);
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    /* renamed from: a */
    private static void m113525a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f;
        float f2;
        float f3;
        float f4;
        if (rectF.left > rectF2.left) {
            f = rectF.left;
        } else {
            f = rectF2.left;
        }
        if (rectF.right < rectF2.right) {
            f2 = rectF.right;
        } else {
            f2 = rectF2.right;
        }
        if (f > f2) {
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
            return;
        }
        if (rectF.top > rectF2.top) {
            f3 = rectF.top;
        } else {
            f3 = rectF2.top;
        }
        if (rectF.bottom < rectF2.bottom) {
            f4 = rectF.bottom;
        } else {
            f4 = rectF2.bottom;
        }
        if (f3 > f4) {
            rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
        } else {
            rectF3.set(f, f3, f2, f4);
        }
    }

    public PhotoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo89587f();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f92096s.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f92073S.set((float) (i / 2), (float) (i2 / 2));
        if (!this.f92069O) {
            this.f92069O = true;
            mo89588g();
        }
    }
}
