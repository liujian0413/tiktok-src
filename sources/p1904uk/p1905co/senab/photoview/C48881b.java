package p1904uk.p1905co.senab.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.FloatMath;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.C1642a;
import java.lang.ref.WeakReference;
import p1904uk.p1905co.senab.photoview.p1906a.C48878d;
import p1904uk.p1905co.senab.photoview.p1906a.C48879e;
import p1904uk.p1905co.senab.photoview.p1906a.C48880f;
import p1904uk.p1905co.senab.photoview.p1907b.C48891d;

/* renamed from: uk.co.senab.photoview.b */
public final class C48881b implements OnDoubleTapListener, OnTouchListener, OnGlobalLayoutListener, C48879e {

    /* renamed from: B */
    private static /* synthetic */ int[] f124242B;

    /* renamed from: a */
    public static final boolean f124243a = Log.isLoggable("PhotoViewAttacher", 3);

    /* renamed from: b */
    static final Interpolator f124244b = new AccelerateDecelerateInterpolator();

    /* renamed from: A */
    private float f124245A = 0.0f;

    /* renamed from: c */
    public final Matrix f124246c = new Matrix();

    /* renamed from: d */
    public OnLongClickListener f124247d;

    /* renamed from: e */
    private float f124248e = 1.0f;

    /* renamed from: f */
    private float f124249f = 1.75f;

    /* renamed from: g */
    private float f124250g = 3.0f;

    /* renamed from: h */
    private boolean f124251h = true;

    /* renamed from: i */
    private WeakReference<ImageView> f124252i;

    /* renamed from: j */
    private GestureDetector f124253j;

    /* renamed from: k */
    private C48878d f124254k;

    /* renamed from: l */
    private final Matrix f124255l = new Matrix();

    /* renamed from: m */
    private final Matrix f124256m = new Matrix();

    /* renamed from: n */
    private final RectF f124257n = new RectF();

    /* renamed from: o */
    private final float[] f124258o = new float[9];

    /* renamed from: p */
    private C48885c f124259p;

    /* renamed from: q */
    private C48886d f124260q;

    /* renamed from: r */
    private C48887e f124261r;

    /* renamed from: s */
    private int f124262s;

    /* renamed from: t */
    private int f124263t;

    /* renamed from: u */
    private int f124264u;

    /* renamed from: v */
    private int f124265v;

    /* renamed from: w */
    private C48884b f124266w;

    /* renamed from: x */
    private int f124267x = 2;

    /* renamed from: y */
    private boolean f124268y;

    /* renamed from: z */
    private ScaleType f124269z = ScaleType.FIT_CENTER;

    /* renamed from: uk.co.senab.photoview.b$a */
    class C48883a implements Runnable {

        /* renamed from: b */
        private final float f124272b;

        /* renamed from: c */
        private final float f124273c;

        /* renamed from: d */
        private final long f124274d = System.currentTimeMillis();

        /* renamed from: e */
        private final float f124275e;

        /* renamed from: f */
        private final float f124276f;

        /* renamed from: a */
        private float m150876a() {
            return C48881b.f124244b.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f124274d)) * 1.0f) / 200.0f));
        }

        public final void run() {
            ImageView c = C48881b.this.mo123692c();
            if (c != null) {
                float a = m150876a();
                float g = (this.f124275e + ((this.f124276f - this.f124275e) * a)) / C48881b.this.mo123699g();
                C48881b.this.f124246c.postScale(g, g, this.f124272b, this.f124273c);
                C48881b.this.mo123703k();
                if (a < 1.0f) {
                    C48873a.m150812a(c, this);
                }
            }
        }

        public C48883a(float f, float f2, float f3, float f4) {
            this.f124272b = f3;
            this.f124273c = f4;
            this.f124275e = f;
            this.f124276f = f2;
        }
    }

    /* renamed from: uk.co.senab.photoview.b$b */
    class C48884b implements Runnable {

        /* renamed from: b */
        private final C48891d f124278b;

        /* renamed from: c */
        private int f124279c;

        /* renamed from: d */
        private int f124280d;

        /* renamed from: a */
        public final void mo123711a() {
            this.f124278b.mo123715a(true);
        }

        public final void run() {
            if (!this.f124278b.mo123717b()) {
                ImageView c = C48881b.this.mo123692c();
                if (c != null && this.f124278b.mo123716a()) {
                    int c2 = this.f124278b.mo123718c();
                    int d = this.f124278b.mo123719d();
                    if (C48881b.f124243a) {
                        StringBuilder sb = new StringBuilder("fling run(). CurrentX:");
                        sb.append(this.f124279c);
                        sb.append(" CurrentY:");
                        sb.append(this.f124280d);
                        sb.append(" NewX:");
                        sb.append(c2);
                        sb.append(" NewY:");
                        sb.append(d);
                    }
                    C48881b.this.f124246c.postTranslate((float) (this.f124279c - c2), (float) (this.f124280d - d));
                    C48881b.this.mo123682a(C48881b.this.mo123702j());
                    this.f124279c = c2;
                    this.f124280d = d;
                    C48873a.m150812a(c, this);
                }
            }
        }

        public C48884b(Context context) {
            this.f124278b = C48891d.m150893a(context);
        }

        /* renamed from: a */
        public final void mo123712a(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF b = C48881b.this.mo123689b();
            if (b != null) {
                int round = Math.round(-b.left);
                float f = (float) i;
                if (f < b.width()) {
                    i5 = Math.round(b.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-b.top);
                float f2 = (float) i2;
                if (f2 < b.height()) {
                    i7 = Math.round(b.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.f124279c = round;
                this.f124280d = round2;
                if (C48881b.f124243a) {
                    StringBuilder sb = new StringBuilder("fling. StartX:");
                    sb.append(round);
                    sb.append(" StartY:");
                    sb.append(round2);
                    sb.append(" MaxX:");
                    sb.append(i5);
                    sb.append(" MaxY:");
                    sb.append(i7);
                }
                if (!(round == i5 && round2 == i7)) {
                    this.f124278b.mo123714a(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }
    }

    /* renamed from: uk.co.senab.photoview.b$c */
    public interface C48885c {
    }

    /* renamed from: uk.co.senab.photoview.b$d */
    public interface C48886d {
        /* renamed from: a */
        void mo80811a(View view, float f, float f2);
    }

    /* renamed from: uk.co.senab.photoview.b$e */
    public interface C48887e {
    }

    /* renamed from: d */
    public final float mo123694d() {
        return this.f124248e;
    }

    /* renamed from: e */
    public final float mo123696e() {
        return this.f124249f;
    }

    /* renamed from: f */
    public final float mo123698f() {
        return this.f124250g;
    }

    /* renamed from: h */
    public final ScaleType mo123700h() {
        return this.f124269z;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: a */
    public final void mo123679a(float f, float f2, float f3, float f4) {
        if (f124243a) {
            StringBuilder sb = new StringBuilder("onFling. sX: ");
            sb.append(f);
            sb.append(" sY: ");
            sb.append(f2);
            sb.append(" Vx: ");
            sb.append(f3);
            sb.append(" Vy: ");
            sb.append(f4);
        }
        ImageView c = mo123692c();
        this.f124266w = new C48884b(c.getContext());
        this.f124266w.mo123712a(m150842c(c), m150843d(c), (int) f3, (int) f4);
        c.post(this.f124266w);
    }

    /* renamed from: a */
    public final void mo123678a(float f, float f2, float f3) {
        if (f124243a) {
            C1642a.m8034a("onScale: scale: %.2f. fX: %.2f. fY: %.2f", new Object[]{Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)});
        }
        if (mo123699g() < this.f124250g || f < 1.0f) {
            this.f124246c.postScale(f, f, f2, f3);
            mo123703k();
        }
    }

    /* renamed from: a */
    public final void mo123688a(boolean z) {
        this.f124251h = z;
    }

    /* renamed from: a */
    public final void mo123686a(C48886d dVar) {
        this.f124260q = dVar;
    }

    /* renamed from: a */
    public final void mo123687a(C48887e eVar) {
        this.f124261r = eVar;
    }

    /* renamed from: a */
    public final void mo123684a(ScaleType scaleType) {
        if (m150841b(scaleType) && scaleType != this.f124269z) {
            this.f124269z = scaleType;
            mo123701i();
        }
    }

    /* renamed from: a */
    public final void mo123682a(Matrix matrix) {
        ImageView c = mo123692c();
        if (c != null) {
            m150845m();
            c.setImageMatrix(matrix);
            if (this.f124259p != null) {
                m150838b(matrix);
            }
        }
    }

    /* renamed from: l */
    private void m150844l() {
        if (this.f124266w != null) {
            this.f124266w.mo123711a();
            this.f124266w = null;
        }
    }

    /* renamed from: o */
    private void m150847o() {
        this.f124246c.reset();
        mo123682a(mo123702j());
        m150846n();
    }

    /* renamed from: b */
    public final RectF mo123689b() {
        m150846n();
        return m150838b(mo123702j());
    }

    /* renamed from: k */
    public final void mo123703k() {
        if (m150846n()) {
            mo123682a(mo123702j());
        }
    }

    /* renamed from: m */
    private void m150845m() {
        ImageView c = mo123692c();
        if (c != null && !(c instanceof PhotoView) && !ScaleType.MATRIX.equals(c.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        }
    }

    /* renamed from: i */
    public final void mo123701i() {
        ImageView c = mo123692c();
        if (c != null) {
            if (this.f124268y) {
                m150840b(c);
                m150836a(c.getDrawable());
                return;
            }
            m150847o();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final Matrix mo123702j() {
        this.f124256m.set(this.f124255l);
        this.f124256m.postConcat(this.f124246c);
        return this.f124256m;
    }

    /* renamed from: c */
    public final ImageView mo123692c() {
        ImageView imageView;
        if (this.f124252i != null) {
            imageView = (ImageView) this.f124252i.get();
        } else {
            imageView = null;
        }
        if (imageView == null) {
            mo123680a();
        }
        return imageView;
    }

    /* renamed from: g */
    public final float mo123699g() {
        return FloatMath.sqrt(((float) Math.pow((double) m150833a(this.f124246c, 0), 2.0d)) + ((float) Math.pow((double) m150833a(this.f124246c, 3), 2.0d)));
    }

    public final void onGlobalLayout() {
        ImageView c = mo123692c();
        if (c != null && this.f124268y) {
            int top = c.getTop();
            int right = c.getRight();
            int bottom = c.getBottom();
            int left = c.getLeft();
            if (top != this.f124262s || bottom != this.f124264u || left != this.f124265v || right != this.f124263t) {
                m150836a(c.getDrawable());
                this.f124262s = top;
                this.f124263t = right;
                this.f124264u = bottom;
                this.f124265v = left;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|(2:18|19)|20|22) */
    /* JADX WARNING: Can't wrap try/catch for region: R(19:3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0027 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0039 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0042 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0015 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001e */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static /* synthetic */ int[] m150848p() {
        /*
            int[] r0 = f124242B
            if (r0 == 0) goto L_0x0005
            return r0
        L_0x0005:
            android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0015 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0015 }
            r2 = 1
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0015 }
        L_0x0015:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001e }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001e }
            r2 = 2
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001e }
        L_0x001e:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0027 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
            r2 = 3
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
        L_0x0027:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0030 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0030 }
            r2 = 4
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0030 }
        L_0x0030:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0039 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
            r2 = 5
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0039 }
        L_0x0039:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0042 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0042 }
            r2 = 6
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0042 }
        L_0x0042:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x004b }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
            r2 = 7
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
        L_0x004b:
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0055 }
            int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
            r2 = 8
            r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0055 }
        L_0x0055:
            f124242B = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p1904uk.p1905co.senab.photoview.C48881b.m150848p():int[]");
    }

    /* renamed from: n */
    private boolean m150846n() {
        float f;
        float f2;
        ImageView c = mo123692c();
        if (c == null) {
            return false;
        }
        RectF b = m150838b(mo123702j());
        if (b == null) {
            return false;
        }
        float height = b.height();
        float width = b.width();
        float d = (float) m150843d(c);
        float f3 = 0.0f;
        if (height <= d) {
            switch (m150848p()[this.f124269z.ordinal()]) {
                case 5:
                    f = (d - height) - b.top;
                    break;
                case 6:
                    f = -b.top;
                    break;
                default:
                    f = ((d - height) / 2.0f) - b.top;
                    break;
            }
        } else if (b.top > 0.0f) {
            f = -b.top;
        } else if (b.bottom < d) {
            f = d - b.bottom;
        } else {
            f = 0.0f;
        }
        float c2 = (float) m150842c(c);
        if (width <= c2) {
            switch (m150848p()[this.f124269z.ordinal()]) {
                case 5:
                    f2 = (c2 - width) - b.left;
                    break;
                case 6:
                    f2 = -b.left;
                    break;
                default:
                    f2 = ((c2 - width) / 2.0f) - b.left;
                    break;
            }
            f3 = f2;
            this.f124267x = 2;
        } else if (b.left > 0.0f) {
            this.f124267x = 0;
            f3 = -b.left;
        } else if (b.right < c2) {
            f3 = c2 - b.right;
            this.f124267x = 1;
        } else {
            this.f124267x = -1;
        }
        this.f124246c.postTranslate(f3, f);
        return true;
    }

    /* renamed from: a */
    public final void mo123680a() {
        if (this.f124252i != null) {
            ImageView imageView = (ImageView) this.f124252i.get();
            if (imageView != null) {
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                imageView.setOnTouchListener(null);
                m150844l();
            }
            if (this.f124253j != null) {
                this.f124253j.setOnDoubleTapListener(null);
            }
            this.f124259p = null;
            this.f124260q = null;
            this.f124261r = null;
            this.f124252i = null;
        }
    }

    /* renamed from: a */
    public final void mo123683a(OnLongClickListener onLongClickListener) {
        this.f124247d = onLongClickListener;
    }

    /* renamed from: a */
    public final void mo123685a(C48885c cVar) {
        this.f124259p = cVar;
    }

    /* renamed from: b */
    public final void mo123691b(boolean z) {
        this.f124268y = z;
        mo123701i();
    }

    /* renamed from: e */
    public final void mo123697e(float f) {
        m150835a(f, false);
    }

    /* renamed from: c */
    public final void mo123693c(float f) {
        m150839b(this.f124248e, f, this.f124250g);
        this.f124249f = f;
    }

    /* renamed from: d */
    public final void mo123695d(float f) {
        m150839b(this.f124248e, this.f124249f, f);
        this.f124250g = f;
    }

    /* renamed from: c */
    private static int m150842c(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    /* renamed from: d */
    private static int m150843d(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* renamed from: b */
    private RectF m150838b(Matrix matrix) {
        ImageView c = mo123692c();
        if (c != null) {
            Drawable drawable = c.getDrawable();
            if (drawable != null) {
                this.f124257n.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
                matrix.mapRect(this.f124257n);
                return this.f124257n;
            }
        }
        return null;
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        try {
            float g = mo123699g();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (g < this.f124249f) {
                m150834a(this.f124249f, x, y, true);
            } else if (g < this.f124249f || g >= this.f124250g) {
                m150834a(this.f124248e, x, y, true);
            } else {
                m150834a(this.f124250g, x, y, true);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return true;
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ImageView c = mo123692c();
        if (this.f124260q != null) {
            RectF b = mo123689b();
            if (b != null) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (b.contains(x, y)) {
                    this.f124260q.mo80811a(c, (x - b.left) / b.width(), (y - b.top) / b.height());
                    return true;
                }
            }
        }
        if (this.f124261r != null) {
            motionEvent.getX();
            motionEvent.getY();
        }
        return false;
    }

    public C48881b(ImageView imageView) {
        this.f124252i = new WeakReference<>(imageView);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m150840b(imageView);
        if (!imageView.isInEditMode()) {
            this.f124254k = C48880f.m150832a(imageView.getContext(), this);
            this.f124253j = new GestureDetector(imageView.getContext(), new SimpleOnGestureListener() {
                public final void onLongPress(MotionEvent motionEvent) {
                    if (C48881b.this.f124247d != null) {
                        C48881b.this.f124247d.onLongClick(C48881b.this.mo123692c());
                    }
                }
            });
            this.f124253j.setOnDoubleTapListener(this);
            mo123691b(true);
        }
    }

    /* renamed from: a */
    private static boolean m150837a(ImageView imageView) {
        if (imageView == null || imageView.getDrawable() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static void m150840b(ImageView imageView) {
        if (imageView != null && !(imageView instanceof PhotoView) && !ScaleType.MATRIX.equals(imageView.getScaleType())) {
            imageView.setScaleType(ScaleType.MATRIX);
        }
    }

    /* renamed from: a */
    private void m150836a(Drawable drawable) {
        ImageView c = mo123692c();
        if (c != null && drawable != null) {
            float c2 = (float) m150842c(c);
            float d = (float) m150843d(c);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f124255l.reset();
            float f = (float) intrinsicWidth;
            float f2 = c2 / f;
            float f3 = (float) intrinsicHeight;
            float f4 = d / f3;
            if (this.f124269z != ScaleType.CENTER) {
                if (this.f124269z != ScaleType.CENTER_CROP) {
                    if (this.f124269z != ScaleType.CENTER_INSIDE) {
                        RectF rectF = new RectF(0.0f, 0.0f, f, f3);
                        RectF rectF2 = new RectF(0.0f, 0.0f, c2, d);
                        switch (m150848p()[this.f124269z.ordinal()]) {
                            case 4:
                                this.f124255l.setRectToRect(rectF, rectF2, ScaleToFit.CENTER);
                                break;
                            case 5:
                                this.f124255l.setRectToRect(rectF, rectF2, ScaleToFit.END);
                                break;
                            case 6:
                                this.f124255l.setRectToRect(rectF, rectF2, ScaleToFit.START);
                                break;
                            case 7:
                                this.f124255l.setRectToRect(rectF, rectF2, ScaleToFit.FILL);
                                break;
                        }
                    } else {
                        float min = Math.min(1.0f, Math.min(f2, f4));
                        this.f124255l.postScale(min, min);
                        this.f124255l.postTranslate((c2 - (f * min)) / 2.0f, (d - (f3 * min)) / 2.0f);
                    }
                } else {
                    float max = Math.max(f2, f4);
                    this.f124255l.postScale(max, max);
                    this.f124255l.postTranslate((c2 - (f * max)) / 2.0f, (d - (f3 * max)) / 2.0f);
                }
            } else {
                this.f124255l.postTranslate((c2 - f) / 2.0f, (d - f3) / 2.0f);
            }
            m150847o();
        }
    }

    /* renamed from: b */
    private static boolean m150841b(ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (m150848p()[scaleType.ordinal()] != 8) {
            return true;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(scaleType.name()));
        sb.append(" is not supported in PhotoView");
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: b */
    public final void mo123690b(float f) {
        m150839b(f, this.f124249f, this.f124250g);
        this.f124248e = f;
    }

    /* renamed from: a */
    public final void mo123681a(float f) {
        float f2 = f % 360.0f;
        this.f124246c.postRotate(this.f124245A - f2);
        this.f124245A = f2;
        mo123703k();
    }

    /* renamed from: a */
    private float m150833a(Matrix matrix, int i) {
        matrix.getValues(this.f124258o);
        return this.f124258o[i];
    }

    /* renamed from: a */
    private void m150835a(float f, boolean z) {
        ImageView c = mo123692c();
        if (c != null) {
            m150834a(f, (float) (c.getRight() / 2), (float) (c.getBottom() / 2), false);
        }
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            boolean r0 = r11.f124268y
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0074
            r0 = r12
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            boolean r0 = m150837a(r0)
            if (r0 == 0) goto L_0x0074
            android.view.ViewParent r0 = r12.getParent()
            int r3 = r13.getAction()
            r4 = 3
            if (r3 == r4) goto L_0x0027
            switch(r3) {
                case 0: goto L_0x001e;
                case 1: goto L_0x0027;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x0051
        L_0x001e:
            if (r0 == 0) goto L_0x0023
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x0023:
            r11.m150844l()
            goto L_0x0051
        L_0x0027:
            float r3 = r11.mo123699g()
            float r4 = r11.f124248e
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0051
            android.graphics.RectF r3 = r11.mo123689b()
            if (r3 == 0) goto L_0x0051
            uk.co.senab.photoview.b$a r10 = new uk.co.senab.photoview.b$a
            float r6 = r11.mo123699g()
            float r7 = r11.f124248e
            float r8 = r3.centerX()
            float r9 = r3.centerY()
            r4 = r10
            r5 = r11
            r4.<init>(r6, r7, r8, r9)
            r12.post(r10)
            r12 = 1
            goto L_0x0052
        L_0x0051:
            r12 = 0
        L_0x0052:
            android.view.GestureDetector r3 = r11.f124253j
            if (r3 == 0) goto L_0x005f
            android.view.GestureDetector r3 = r11.f124253j
            boolean r3 = r3.onTouchEvent(r13)
            if (r3 == 0) goto L_0x005f
            r12 = 1
        L_0x005f:
            if (r12 != 0) goto L_0x0066
            if (r0 == 0) goto L_0x0066
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0066:
            uk.co.senab.photoview.a.d r0 = r11.f124254k
            if (r0 == 0) goto L_0x0075
            uk.co.senab.photoview.a.d r0 = r11.f124254k
            boolean r13 = r0.mo123673c(r13)
            if (r13 == 0) goto L_0x0075
            r12 = 1
            goto L_0x0075
        L_0x0074:
            r12 = 0
        L_0x0075:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p1904uk.p1905co.senab.photoview.C48881b.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo123677a(float f, float f2) {
        if (f124243a) {
            C1642a.m8034a("onDrag: dx: %.2f. dy: %.2f", new Object[]{Float.valueOf(f), Float.valueOf(f2)});
        }
        ImageView c = mo123692c();
        this.f124246c.postTranslate(f, f2);
        mo123703k();
        if (this.f124251h && !this.f124254k.mo123671a()) {
            if (this.f124267x == 2 || ((this.f124267x == 0 && f >= 1.0f) || (this.f124267x == 1 && f <= -1.0f))) {
                ViewParent parent = c.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m150839b(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
    }

    /* renamed from: a */
    private void m150834a(float f, float f2, float f3, boolean z) {
        ImageView c = mo123692c();
        if (c != null && f >= this.f124248e && f <= this.f124250g) {
            if (z) {
                C48883a aVar = new C48883a(mo123699g(), f, f2, f3);
                c.post(aVar);
                return;
            }
            this.f124246c.setScale(f, f, f2, f3);
            mo123703k();
        }
    }
}
