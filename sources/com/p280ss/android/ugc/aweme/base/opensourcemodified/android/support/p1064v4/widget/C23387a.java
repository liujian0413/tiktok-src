package com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.AppCompatImageView;
import android.view.View;
import android.view.animation.Animation.AnimationListener;

/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a */
final class C23387a extends AppCompatImageView {

    /* renamed from: a */
    int f61540a;

    /* renamed from: b */
    public ShapeDrawable f61541b;

    /* renamed from: c */
    private AnimationListener f61542c;

    /* renamed from: d */
    private boolean f61543d;

    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.a$a */
    class C23388a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f61545b;

        /* renamed from: c */
        private Paint f61546c = new Paint();

        /* renamed from: a */
        private void m76691a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C23387a.this.f61540a, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f61545b = radialGradient;
            this.f61546c.setShader(this.f61545b);
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            m76691a((int) f);
        }

        C23388a(int i) {
            C23387a.this.f61540a = i;
            m76691a((int) rect().width());
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = C23387a.this.getWidth();
            int height = C23387a.this.getHeight();
            int i = width / 2;
            if (i >= 0 && i - C23387a.this.f61540a >= 0) {
                float f = (float) i;
                float f2 = (float) (height / 2);
                canvas.drawCircle(f, f2, f, this.f61546c);
                canvas.drawCircle(f, f2, (float) (i - C23387a.this.f61540a), paint);
            }
        }
    }

    /* renamed from: a */
    private static boolean m76689a() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f61542c != null) {
            this.f61542c.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.f61542c != null) {
            this.f61542c.onAnimationStart(getAnimation());
        }
    }

    /* renamed from: a */
    public final void mo60745a(AnimationListener animationListener) {
        this.f61542c = animationListener;
    }

    public final void draw(Canvas canvas) {
        if (!this.f61543d) {
            super.draw(canvas);
        }
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m76689a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f61540a * 2), getMeasuredHeight() + (this.f61540a * 2));
        }
    }

    C23387a(Context context, int i) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f61540a = (int) (3.5f * f);
        if (m76689a()) {
            this.f61541b = new ShapeDrawable(new OvalShape());
            C0991u.m4230k((View) this, f * 4.0f);
        } else {
            this.f61541b = new ShapeDrawable(new C23388a(this.f61540a));
            C0991u.m4180a((View) this, 1, this.f61541b.getPaint());
            this.f61541b.getPaint().setShadowLayer((float) this.f61540a, (float) i3, (float) i2, 503316480);
            int i4 = this.f61540a;
            setPadding(i4, i4, i4, i4);
        }
        this.f61541b.getPaint().setColor(-328966);
        C0991u.m4185a((View) this, (Drawable) this.f61541b);
    }
}
