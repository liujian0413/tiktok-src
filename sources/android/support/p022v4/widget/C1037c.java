package android.support.p022v4.widget;

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
import android.view.View;
import android.view.animation.Animation.AnimationListener;
import android.widget.ImageView;

/* renamed from: android.support.v4.widget.c */
final class C1037c extends ImageView {

    /* renamed from: a */
    int f3606a;

    /* renamed from: b */
    private AnimationListener f3607b;

    /* renamed from: android.support.v4.widget.c$a */
    class C1038a extends OvalShape {

        /* renamed from: b */
        private RadialGradient f3609b;

        /* renamed from: c */
        private Paint f3610c = new Paint();

        /* renamed from: a */
        private void m4473a(int i) {
            float f = (float) (i / 2);
            RadialGradient radialGradient = new RadialGradient(f, f, (float) C1037c.this.f3606a, new int[]{1023410176, 0}, null, TileMode.CLAMP);
            this.f3609b = radialGradient;
            this.f3610c.setShader(this.f3609b);
        }

        /* access modifiers changed from: protected */
        public final void onResize(float f, float f2) {
            super.onResize(f, f2);
            m4473a((int) f);
        }

        C1038a(int i) {
            C1037c.this.f3606a = i;
            m4473a((int) rect().width());
        }

        public final void draw(Canvas canvas, Paint paint) {
            int width = C1037c.this.getWidth() / 2;
            float f = (float) width;
            float height = (float) (C1037c.this.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f3610c);
            canvas.drawCircle(f, height, (float) (width - C1037c.this.f3606a), paint);
        }
    }

    /* renamed from: a */
    private static boolean m4471a() {
        if (VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public final void onAnimationEnd() {
        super.onAnimationEnd();
        if (this.f3607b != null) {
            this.f3607b.onAnimationEnd(getAnimation());
        }
    }

    public final void onAnimationStart() {
        super.onAnimationStart();
        if (this.f3607b != null) {
            this.f3607b.onAnimationStart(getAnimation());
        }
    }

    /* renamed from: a */
    public final void mo4081a(AnimationListener animationListener) {
        this.f3607b = animationListener;
    }

    public final void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m4471a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f3606a * 2), getMeasuredHeight() + (this.f3606a * 2));
        }
    }

    C1037c(Context context, int i) {
        ShapeDrawable shapeDrawable;
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        int i2 = (int) (1.75f * f);
        int i3 = (int) (0.0f * f);
        this.f3606a = (int) (3.5f * f);
        if (m4471a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C0991u.m4230k((View) this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1038a(this.f3606a));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f3606a, (float) i3, (float) i2, 503316480);
            int i4 = this.f3606a;
            setPadding(i4, i4, i4, i4);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(-328966);
        C0991u.m4185a((View) this, (Drawable) shapeDrawable);
    }
}
