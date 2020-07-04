package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.support.p022v4.view.C0991u;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.p280ss.android.ugc.aweme.account.R$styleable;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingCircleView */
public final class LoadingCircleView extends View {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f59455a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LoadingCircleView.class), "rotateAnim", "getRotateAnim()Landroid/view/animation/RotateAnimation;"))};

    /* renamed from: b */
    public static final C22261a f59456b = new C22261a(null);

    /* renamed from: c */
    private int f59457c;

    /* renamed from: d */
    private float f59458d;

    /* renamed from: e */
    private float f59459e;

    /* renamed from: f */
    private boolean f59460f;

    /* renamed from: g */
    private boolean f59461g;

    /* renamed from: h */
    private Paint f59462h;

    /* renamed from: i */
    private RectF f59463i;

    /* renamed from: j */
    private final C7541d f59464j;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingCircleView$a */
    public static final class C22261a {
        private C22261a() {
        }

        public /* synthetic */ C22261a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.LoadingCircleView$b */
    static final class C22262b extends Lambda implements C7561a<RotateAnimation> {

        /* renamed from: a */
        public static final C22262b f59465a = new C22262b();

        C22262b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m73787a();
        }

        /* renamed from: a */
        private static RotateAnimation m73787a() {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatCount(-1);
            rotateAnimation.setDuration(1000);
            return rotateAnimation;
        }
    }

    public LoadingCircleView(Context context) {
        this(context, null, 0, 6, null);
    }

    public LoadingCircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: f */
    private final void m73784f() {
        clearAnimation();
    }

    private final RotateAnimation getRotateAnim() {
        return (RotateAnimation) this.f59464j.getValue();
    }

    /* renamed from: b */
    public final void mo58684b() {
        this.f59461g = false;
        m73784f();
    }

    /* renamed from: a */
    public final void mo58683a() {
        this.f59461g = true;
        if (this.f59460f) {
            m73783e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f59460f = true;
        if (this.f59461g) {
            m73783e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f59460f = false;
        m73784f();
    }

    /* renamed from: c */
    private final void m73781c() {
        this.f59462h.setAntiAlias(true);
        this.f59462h.setStyle(Style.STROKE);
        this.f59462h.setStrokeCap(Cap.ROUND);
        setLoadingColor(this.f59457c);
        setLineWidth(this.f59458d);
    }

    /* renamed from: d */
    private boolean m73782d() {
        if (!getRotateAnim().hasStarted() || getRotateAnim().hasEnded()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private final void m73783e() {
        if (!m73782d()) {
            startAnimation(getRotateAnim());
        }
    }

    public final void setLineWidth(float f) {
        this.f59462h.setStrokeWidth(f);
    }

    public final void setLoadingColor(int i) {
        this.f59462h.setColor(i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        if (this.f59463i == null) {
            float f = this.f59458d / 2.0f;
            View view = this;
            this.f59463i = new RectF(((float) C0991u.m4229k(view)) + f, ((float) getPaddingTop()) + f, ((float) (getWidth() - C0991u.m4232l(view))) - f, ((float) (getHeight() - getPaddingBottom())) - f);
        }
        if (canvas != null) {
            RectF rectF = this.f59463i;
            if (rectF == null) {
                C7573i.m23580a();
            }
            canvas.drawArc(rectF, 0.0f, this.f59459e, false, this.f59462h);
        }
    }

    public LoadingCircleView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f59462h = new Paint();
        this.f59464j = C7546e.m23569a(C22262b.f59465a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LoadingCircleView);
        this.f59457c = obtainStyledAttributes.getColor(0, -16777216);
        this.f59458d = (float) obtainStyledAttributes.getDimensionPixelSize(1, C23486n.m77122a(5.0d));
        this.f59459e = obtainStyledAttributes.getFloat(2, 300.0f);
        obtainStyledAttributes.recycle();
        m73781c();
    }

    public /* synthetic */ LoadingCircleView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
