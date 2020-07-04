package com.p280ss.android.ugc.aweme.p313im.sdk.widget.photodraweeview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0967d;
import android.support.p022v4.view.C0978j;
import android.support.p022v4.widget.C1055m;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.facebook.drawee.drawable.C13421p.C13423b;
import com.facebook.drawee.generic.C13438a;
import com.facebook.drawee.view.DraweeView;
import com.p280ss.android.image.p878a.C19581a;
import com.p280ss.android.image.p878a.C19582b;
import com.p280ss.android.image.p878a.C19583c;
import com.p280ss.android.image.p878a.C19584d;
import com.p280ss.android.image.p878a.C19585e;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a */
public final class C31995a implements OnTouchListener, C19583c {

    /* renamed from: a */
    public final Interpolator f83690a = new AccelerateDecelerateInterpolator();

    /* renamed from: b */
    public long f83691b = 200;

    /* renamed from: c */
    public final Matrix f83692c = new Matrix();

    /* renamed from: d */
    public OnLongClickListener f83693d;

    /* renamed from: e */
    private final float[] f83694e = new float[9];

    /* renamed from: f */
    private final RectF f83695f = new RectF();

    /* renamed from: g */
    private float f83696g = 1.0f;

    /* renamed from: h */
    private float f83697h = 1.75f;

    /* renamed from: i */
    private float f83698i = 3.0f;

    /* renamed from: j */
    private C19585e f83699j;

    /* renamed from: k */
    private C0967d f83700k;

    /* renamed from: l */
    private boolean f83701l = false;

    /* renamed from: m */
    private boolean f83702m = true;

    /* renamed from: n */
    private int f83703n = 2;

    /* renamed from: o */
    private int f83704o = -1;

    /* renamed from: p */
    private int f83705p = -1;

    /* renamed from: q */
    private C31998b f83706q;

    /* renamed from: r */
    private WeakReference<DraweeView<C13438a>> f83707r;

    /* renamed from: s */
    private C19581a f83708s;

    /* renamed from: t */
    private C19584d f83709t;

    /* renamed from: u */
    private C19582b f83710u;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a$a */
    class C31997a implements Runnable {

        /* renamed from: b */
        private final float f83713b;

        /* renamed from: c */
        private final float f83714c;

        /* renamed from: d */
        private final long f83715d = System.currentTimeMillis();

        /* renamed from: e */
        private final float f83716e;

        /* renamed from: f */
        private final float f83717f;

        /* renamed from: a */
        private float m103962a() {
            return C31995a.this.f83690a.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.f83715d)) * 1.0f) / ((float) C31995a.this.f83691b)));
        }

        public final void run() {
            DraweeView b = C31995a.this.mo82957b();
            if (b != null) {
                float a = m103962a();
                C31995a.this.mo51759a((this.f83716e + ((this.f83717f - this.f83716e) * a)) / C31995a.this.mo82964f(), this.f83713b, this.f83714c);
                if (a < 1.0f) {
                    C31995a.m103925a((View) b, (Runnable) this);
                }
            }
        }

        public C31997a(float f, float f2, float f3, float f4) {
            this.f83713b = f3;
            this.f83714c = f4;
            this.f83716e = f;
            this.f83717f = f2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a$b */
    class C31998b implements Runnable {

        /* renamed from: b */
        private final C1055m f83719b;

        /* renamed from: c */
        private int f83720c;

        /* renamed from: d */
        private int f83721d;

        /* renamed from: a */
        public final void mo82972a() {
            this.f83719b.mo4145e();
        }

        public final void run() {
            if (!this.f83719b.mo4141a()) {
                DraweeView b = C31995a.this.mo82957b();
                if (b != null && this.f83719b.mo4144d()) {
                    int b2 = this.f83719b.mo4142b();
                    int c = this.f83719b.mo4143c();
                    C31995a.this.f83692c.postTranslate((float) (this.f83720c - b2), (float) (this.f83721d - c));
                    b.invalidate();
                    this.f83720c = b2;
                    this.f83721d = c;
                    C31995a.m103925a((View) b, (Runnable) this);
                }
            }
        }

        public C31998b(Context context) {
            this.f83719b = C1055m.m4554a(context);
        }

        /* renamed from: a */
        public final void mo82973a(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF i9 = C31995a.this.mo82967i();
            if (i9 != null) {
                int round = Math.round(-i9.left);
                float f = (float) i;
                if (f < i9.width()) {
                    i5 = Math.round(i9.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-i9.top);
                float f2 = (float) i2;
                if (f2 < i9.height()) {
                    i7 = Math.round(i9.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.f83720c = round;
                this.f83721d = round2;
                if (!(round == i5 && round2 == i7)) {
                    this.f83719b.mo4140a(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo51757a() {
        m103933q();
    }

    /* renamed from: c */
    public final float mo82959c() {
        return this.f83696g;
    }

    /* renamed from: d */
    public final float mo82961d() {
        return this.f83697h;
    }

    /* renamed from: e */
    public final float mo82963e() {
        return this.f83698i;
    }

    /* renamed from: g */
    public final C19581a mo82965g() {
        return this.f83708s;
    }

    /* renamed from: h */
    public final C19584d mo82966h() {
        return this.f83709t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo82968j() {
        m103934r();
    }

    /* renamed from: a */
    public final void mo82951a(OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f83700k.mo3750a(onDoubleTapListener);
        } else {
            this.f83700k.mo3750a((OnDoubleTapListener) new C31999b(this));
        }
    }

    /* renamed from: a */
    public final void mo82948a(float f, float f2, float f3, boolean z) {
        DraweeView b = mo82957b();
        if (b != null && f >= this.f83696g && f <= this.f83698i) {
            if (z) {
                C31997a aVar = new C31997a(mo82964f(), f, f2, f3);
                b.post(aVar);
                return;
            }
            this.f83692c.setScale(f, f, f2, f3);
            m103929m();
        }
    }

    /* renamed from: a */
    public final void mo82950a(long j) {
        if (j < 0) {
            j = 200;
        }
        this.f83691b = j;
    }

    /* renamed from: a */
    public final void mo82956a(boolean z) {
        this.f83702m = z;
    }

    /* renamed from: a */
    public final void mo82954a(C19582b bVar) {
        this.f83710u = bVar;
    }

    /* renamed from: a */
    public final void mo82952a(OnLongClickListener onLongClickListener) {
        this.f83693d = onLongClickListener;
    }

    /* renamed from: a */
    public final void mo82953a(C19581a aVar) {
        this.f83708s = aVar;
    }

    /* renamed from: a */
    public final void mo82955a(C19584d dVar) {
        this.f83709t = dVar;
    }

    /* renamed from: o */
    private void m103931o() {
        if (this.f83705p != -1 || this.f83704o != -1) {
            m103932p();
        }
    }

    /* renamed from: r */
    private void m103934r() {
        if (this.f83706q != null) {
            this.f83706q.mo82972a();
            this.f83706q = null;
        }
    }

    /* renamed from: b */
    public final DraweeView<C13438a> mo82957b() {
        return (DraweeView) this.f83707r.get();
    }

    /* renamed from: i */
    public final RectF mo82967i() {
        m103930n();
        return mo82946a(this.f83692c);
    }

    /* renamed from: k */
    private int m103927k() {
        DraweeView b = mo82957b();
        if (b != null) {
            return (b.getWidth() - b.getPaddingLeft()) - b.getPaddingRight();
        }
        return 0;
    }

    /* renamed from: l */
    private int m103928l() {
        DraweeView b = mo82957b();
        if (b != null) {
            return (b.getHeight() - b.getPaddingTop()) - b.getPaddingBottom();
        }
        return 0;
    }

    /* renamed from: m */
    private void m103929m() {
        DraweeView b = mo82957b();
        if (b != null && m103930n()) {
            b.invalidate();
        }
    }

    /* renamed from: q */
    private void m103933q() {
        DraweeView b = mo82957b();
        if (b != null && mo82964f() < this.f83696g) {
            RectF i = mo82967i();
            if (i != null) {
                C31997a aVar = new C31997a(mo82964f(), this.f83696g, i.centerX(), i.centerY());
                b.post(aVar);
            }
        }
    }

    /* renamed from: f */
    public final float mo82964f() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) m103923a(this.f83692c, 0), 2.0d)) + ((float) Math.pow((double) m103923a(this.f83692c, 3), 2.0d))));
    }

    /* renamed from: n */
    private boolean m103930n() {
        float f;
        RectF a = mo82946a(this.f83692c);
        if (a == null) {
            return false;
        }
        float height = a.height();
        float width = a.width();
        float l = (float) m103928l();
        float f2 = 0.0f;
        if (height <= l) {
            f = ((l - height) / 2.0f) - a.top;
        } else if (a.top > 0.0f) {
            f = -a.top;
        } else if (a.bottom < l) {
            f = l - a.bottom;
        } else {
            f = 0.0f;
        }
        float k = (float) m103927k();
        if (width <= k) {
            f2 = ((k - width) / 2.0f) - a.left;
            this.f83703n = 2;
        } else if (a.left > 0.0f) {
            f2 = -a.left;
            this.f83703n = 0;
        } else if (a.right < k) {
            f2 = k - a.right;
            this.f83703n = 1;
        } else {
            this.f83703n = -1;
        }
        this.f83692c.postTranslate(f2, f);
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0037  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m103932p() {
        /*
            r9 = this;
            com.facebook.drawee.view.DraweeView r0 = r9.mo82957b()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0031
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r3 = r2.heightPixels
            float r3 = (float) r3
            float r3 = r3 * r1
            int r4 = r9.f83704o
            float r4 = (float) r4
            float r3 = r3 / r4
            int r4 = r9.f83705p
            float r4 = (float) r4
            float r3 = r3 * r4
            int r3 = (int) r3
            int r4 = r2.widthPixels
            if (r3 < r4) goto L_0x0028
            goto L_0x0031
        L_0x0028:
            int r2 = r2.widthPixels
            float r2 = (float) r2
            float r2 = r2 * r1
            float r3 = (float) r3
            float r2 = r2 / r3
            r6 = r2
            goto L_0x0033
        L_0x0031:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x0033:
            int r2 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x005d
            android.graphics.RectF r2 = r9.mo82967i()
            if (r2 == 0) goto L_0x005d
            float r1 = r1 * r6
            r9.f83696g = r1
            r1 = 1071644672(0x3fe00000, float:1.75)
            float r1 = r1 * r6
            r9.f83697h = r1
            r1 = 1077936128(0x40400000, float:3.0)
            float r1 = r1 * r6
            r9.f83698i = r1
            com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a$a r1 = new com.ss.android.ugc.aweme.im.sdk.widget.photodraweeview.a$a
            float r7 = r2.centerX()
            r8 = 0
            r3 = r1
            r4 = r9
            r5 = r6
            r3.<init>(r5, r6, r7, r8)
            r0.post(r1)
        L_0x005d:
            android.graphics.Matrix r1 = r9.f83692c
            r1.reset()
            r9.m103930n()
            if (r0 == 0) goto L_0x006a
            r0.invalidate()
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.p313im.sdk.widget.photodraweeview.C31995a.m103932p():void");
    }

    /* renamed from: d */
    public final void mo82962d(float f) {
        m103924a(f, false);
    }

    /* renamed from: c */
    public final void mo82960c(float f) {
        m103926b(f, this.f83697h, this.f83698i);
        this.f83696g = f;
    }

    /* renamed from: b */
    public final void mo82958b(float f) {
        m103926b(this.f83696g, f, this.f83698i);
        this.f83697h = f;
    }

    public C31995a(DraweeView<C13438a> draweeView) {
        this.f83707r = new WeakReference<>(draweeView);
        ((C13438a) draweeView.getHierarchy()).mo32896a(C13423b.f35595c);
        draweeView.setOnTouchListener(this);
        this.f83699j = new C19585e(draweeView.getContext(), this);
        this.f83700k = new C0967d(draweeView.getContext(), new SimpleOnGestureListener() {
            public final void onLongPress(MotionEvent motionEvent) {
                super.onLongPress(motionEvent);
                if (C31995a.this.f83693d != null) {
                    C31995a.this.f83693d.onLongClick(C31995a.this.mo82957b());
                }
            }
        });
        this.f83700k.mo3750a((OnDoubleTapListener) new C31999b(this));
    }

    /* renamed from: a */
    public final RectF mo82946a(Matrix matrix) {
        DraweeView b = mo82957b();
        if (b == null || (this.f83705p == -1 && this.f83704o == -1)) {
            return null;
        }
        this.f83695f.set(0.0f, 0.0f, (float) this.f83705p, (float) this.f83704o);
        ((C13438a) b.getHierarchy()).mo32894a(this.f83695f);
        matrix.mapRect(this.f83695f);
        return this.f83695f;
    }

    /* renamed from: a */
    public final void mo82947a(float f) {
        m103926b(this.f83696g, this.f83697h, f);
        this.f83698i = f;
    }

    /* renamed from: a */
    public final void mo82949a(int i, int i2) {
        this.f83705p = i;
        this.f83704o = i2;
        m103931o();
    }

    /* renamed from: a */
    private float m103923a(Matrix matrix, int i) {
        matrix.getValues(this.f83694e);
        return this.f83694e[i];
    }

    /* renamed from: a */
    private void m103924a(float f, boolean z) {
        DraweeView b = mo82957b();
        if (b != null) {
            mo82948a(f, (float) (b.getRight() / 2), (float) (b.getBottom() / 2), false);
        }
    }

    /* renamed from: a */
    public static void m103925a(View view, Runnable runnable) {
        if (VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, 16);
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int a = C0978j.m4129a(motionEvent);
        boolean z3 = false;
        if (a != 3) {
            switch (a) {
                case 0:
                    ViewParent parent = view.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    m103934r();
                    break;
                case 1:
                    break;
            }
        }
        ViewParent parent2 = view.getParent();
        if (parent2 != null) {
            parent2.requestDisallowInterceptTouchEvent(false);
        }
        boolean a2 = this.f83699j.mo51761a();
        boolean z4 = this.f83699j.f52968a;
        this.f83699j.mo51762a(motionEvent);
        if (a2 || this.f83699j.mo51761a()) {
            z = false;
        } else {
            z = true;
        }
        if (z4 || this.f83699j.f52968a) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z && z2) {
            z3 = true;
        }
        this.f83701l = z3;
        this.f83700k.mo3752a(motionEvent);
        return true;
    }

    /* renamed from: a */
    public final void mo51758a(float f, float f2) {
        DraweeView b = mo82957b();
        if (b != null && !this.f83699j.mo51761a()) {
            this.f83692c.postTranslate(f, f2);
            m103929m();
            ViewParent parent = b.getParent();
            if (parent != null) {
                if (!this.f83702m || this.f83699j.mo51761a() || this.f83701l) {
                    parent.requestDisallowInterceptTouchEvent(true);
                } else if (this.f83703n == 2 || ((this.f83703n == 0 && f >= 1.0f) || (this.f83703n == 1 && f <= -1.0f))) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            }
        }
    }

    /* renamed from: b */
    private static void m103926b(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
    }

    /* renamed from: a */
    public final void mo51759a(float f, float f2, float f3) {
        if (mo82964f() < this.f83698i || f < 1.0f) {
            this.f83692c.postScale(f, f, f2, f3);
            m103929m();
        }
    }

    /* renamed from: a */
    public final void mo51760a(float f, float f2, float f3, float f4) {
        DraweeView b = mo82957b();
        if (b != null) {
            this.f83706q = new C31998b(b.getContext());
            this.f83706q.mo82973a(m103927k(), m103928l(), (int) f3, (int) f4);
            b.post(this.f83706q);
        }
    }
}
