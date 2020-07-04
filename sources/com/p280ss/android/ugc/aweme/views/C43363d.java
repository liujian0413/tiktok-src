package com.p280ss.android.ugc.aweme.views;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p022v4.widget.C1060q;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.views.d */
public final class C43363d extends RelativeLayout {

    /* renamed from: g */
    public static final C43364a f112326g = new C43364a(null);

    /* renamed from: a */
    public int f112327a;

    /* renamed from: b */
    public int f112328b;

    /* renamed from: c */
    public int f112329c;

    /* renamed from: d */
    public int f112330d;

    /* renamed from: e */
    public int f112331e;

    /* renamed from: f */
    public View f112332f;

    /* renamed from: h */
    private C1060q f112333h;

    /* renamed from: i */
    private boolean f112334i;

    /* renamed from: com.ss.android.ugc.aweme.views.d$a */
    public static final class C43364a {
        private C43364a() {
        }

        public /* synthetic */ C43364a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.d$b */
    static final class C43365b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f112335a;

        /* renamed from: b */
        final /* synthetic */ int f112336b;

        /* renamed from: c */
        final /* synthetic */ int f112337c;

        C43365b(View view, int i, int i2) {
            this.f112335a = view;
            this.f112336b = i;
            this.f112337c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                this.f112335a.layout(this.f112336b + intValue, this.f112337c, this.f112336b + intValue + this.f112335a.getWidth(), this.f112337c + this.f112335a.getHeight());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.views.d$c */
    static final class C43366c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f112338a;

        /* renamed from: b */
        final /* synthetic */ int f112339b;

        /* renamed from: c */
        final /* synthetic */ int f112340c;

        C43366c(View view, int i, int i2) {
            this.f112338a = view;
            this.f112339b = i;
            this.f112340c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C7573i.m23582a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                this.f112338a.layout(this.f112339b, this.f112340c + intValue, this.f112339b + this.f112338a.getWidth(), this.f112340c + intValue + this.f112338a.getHeight());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f112332f = getChildAt(0);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        this.f112334i = m137648a(motionEvent);
        if (!this.f112334i) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        C1060q qVar = this.f112333h;
        if (qVar != null) {
            return qVar.mo4156a(motionEvent);
        }
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        if (!this.f112334i) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            C1060q qVar = this.f112333h;
            if (qVar != null) {
                qVar.mo4161b(motionEvent);
            }
        } catch (IllegalArgumentException unused) {
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m137648a(MotionEvent motionEvent) {
        int i;
        int i2;
        int i3;
        int i4;
        View view = this.f112332f;
        if (view != null) {
            i = view.getLeft();
        } else {
            i = 0;
        }
        View view2 = this.f112332f;
        if (view2 != null) {
            i2 = view2.getTop();
        } else {
            i2 = 0;
        }
        View view3 = this.f112332f;
        if (view3 != null) {
            i3 = view3.getRight();
        } else {
            i3 = 0;
        }
        View view4 = this.f112332f;
        if (view4 != null) {
            i4 = view4.getBottom();
        } else {
            i4 = 0;
        }
        if (motionEvent.getX() < ((float) i) || motionEvent.getX() > ((float) i3) || motionEvent.getY() < ((float) i2) || motionEvent.getY() > ((float) i4)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m137646a(View view, int i, int i2) {
        ValueAnimator valueAnimator;
        int left = view.getLeft();
        int top = view.getTop();
        if (i != 0) {
            valueAnimator = ValueAnimator.ofInt(new int[]{0, i});
            valueAnimator.addUpdateListener(new C43365b(view, left, top));
        } else if (i2 != 0) {
            valueAnimator = ValueAnimator.ofInt(new int[]{0, i2});
            valueAnimator.addUpdateListener(new C43366c(view, left, top));
        } else {
            valueAnimator = null;
        }
        if (valueAnimator != null) {
            valueAnimator.setDuration(250);
        }
        if (valueAnimator != null) {
            valueAnimator.start();
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m137647a(C43363d dVar, View view, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        m137646a(view, i, i2);
    }
}
