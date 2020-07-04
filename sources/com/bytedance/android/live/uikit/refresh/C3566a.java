package com.bytedance.android.live.uikit.refresh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build.VERSION;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* renamed from: com.bytedance.android.live.uikit.refresh.a */
final class C3566a extends ImageView {

    /* renamed from: a */
    private AnimationListener f10647a;

    /* renamed from: b */
    private int f10648b;

    /* renamed from: com.bytedance.android.live.uikit.refresh.a$a */
    class C3567a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f10650b;

        /* renamed from: c */
        private int f10651c;

        /* renamed from: d */
        private Paint f10652d = new Paint();

        /* renamed from: e */
        private int f10653e;

        public final void draw(Canvas canvas, Paint paint) {
            float width = (float) (C3566a.this.getWidth() / 2);
            float height = (float) (C3566a.this.getHeight() / 2);
            canvas.drawCircle(width, height, (float) ((this.f10653e / 2) + this.f10651c), this.f10652d);
            canvas.drawCircle(width, height, (float) (this.f10653e / 2), paint);
        }

        public C3567a(int i, int i2) {
            this.f10651c = i;
            this.f10653e = i2;
            RadialGradient radialGradient = new RadialGradient((float) (this.f10653e / 2), (float) (this.f10653e / 2), (float) this.f10651c, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f10650b = radialGradient;
            this.f10652d.setShader(this.f10650b);
        }
    }

    /* renamed from: a */
    private static boolean m13112a() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f10647a != null) {
            this.f10647a.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.f10647a != null) {
            this.f10647a.onAnimationStart(getAnimation());
        }
    }

    /* renamed from: a */
    public final void mo10879a(AnimationListener animationListener) {
        this.f10647a = animationListener;
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(getResources().getColor(i));
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m13112a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f10648b * 2), getMeasuredHeight() + (this.f10648b * 2));
        }
    }

    public C3566a(Context context, int i, float f) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f2 = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (20.0f * f2 * 2.0f);
        int i3 = (int) (1.75f * f2);
        int i4 = (int) (0.0f * f2);
        this.f10648b = (int) (3.5f * f2);
        if (m13112a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0991u.m4230k((View) this, f2 * 4.0f);
        } else {
            shapeDrawable = new ShapeDrawable(new C3567a(this.f10648b, i2));
            C0991u.m4180a((View) this, 1, shapeDrawable.getPaint());
            shapeDrawable.getPaint().setShadowLayer((float) this.f10648b, (float) i4, (float) i3, 503316480);
            int i5 = this.f10648b;
            setPadding(i5, i5, i5, i5);
        }
        shapeDrawable.getPaint().setColor(-328966);
        setBackgroundDrawable(shapeDrawable);
    }
}
