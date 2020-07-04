package com.squareup.picasso;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.widget.ImageView;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.squareup.picasso.Picasso.LoadedFrom;

/* renamed from: com.squareup.picasso.q */
final class C18843q extends BitmapDrawable {

    /* renamed from: e */
    private static final Paint f50781e = new Paint();

    /* renamed from: a */
    Drawable f50782a;

    /* renamed from: b */
    long f50783b;

    /* renamed from: c */
    boolean f50784c;

    /* renamed from: d */
    int f50785d = NormalGiftView.ALPHA_255;

    /* renamed from: f */
    private final boolean f50786f;

    /* renamed from: g */
    private final float f50787g;

    /* renamed from: h */
    private final LoadedFrom f50788h;

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        if (this.f50782a != null) {
            this.f50782a.setBounds(rect);
        }
        super.onBoundsChange(rect);
    }

    public final void setAlpha(int i) {
        this.f50785d = i;
        if (this.f50782a != null) {
            this.f50782a.setAlpha(i);
        }
        super.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f50782a != null) {
            this.f50782a.setColorFilter(colorFilter);
        }
        super.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    private void m61539a(Canvas canvas) {
        f50781e.setColor(-1);
        canvas.drawPath(m61538a(new Point(0, 0), (int) (this.f50787g * 16.0f)), f50781e);
        f50781e.setColor(this.f50788h.debugColor);
        canvas.drawPath(m61538a(new Point(0, 0), (int) (this.f50787g * 15.0f)), f50781e);
    }

    public final void draw(Canvas canvas) {
        if (!this.f50784c) {
            super.draw(canvas);
        } else {
            float uptimeMillis = ((float) (SystemClock.uptimeMillis() - this.f50783b)) / 200.0f;
            if (uptimeMillis >= 1.0f) {
                this.f50784c = false;
                this.f50782a = null;
                super.draw(canvas);
            } else {
                if (this.f50782a != null) {
                    this.f50782a.draw(canvas);
                }
                super.setAlpha((int) (((float) this.f50785d) * uptimeMillis));
                super.draw(canvas);
                super.setAlpha(this.f50785d);
                if (VERSION.SDK_INT <= 10) {
                    invalidateSelf();
                }
            }
        }
        if (this.f50786f) {
            m61539a(canvas);
        }
    }

    /* renamed from: a */
    private static Path m61538a(Point point, int i) {
        Point point2 = new Point(point.x + i, point.y);
        Point point3 = new Point(point.x, point.y + i);
        Path path = new Path();
        path.moveTo((float) point.x, (float) point.y);
        path.lineTo((float) point2.x, (float) point2.y);
        path.lineTo((float) point3.x, (float) point3.y);
        return path;
    }

    /* renamed from: a */
    static void m61541a(ImageView imageView, Drawable drawable) {
        imageView.setImageDrawable(drawable);
        if (imageView.getDrawable() instanceof AnimationDrawable) {
            ((AnimationDrawable) imageView.getDrawable()).start();
        }
    }

    /* renamed from: a */
    static void m61540a(ImageView imageView, Context context, Bitmap bitmap, LoadedFrom loadedFrom, boolean z, boolean z2) {
        Drawable drawable = imageView.getDrawable();
        if (drawable instanceof AnimationDrawable) {
            ((AnimationDrawable) drawable).stop();
        }
        C18843q qVar = new C18843q(context, bitmap, drawable, loadedFrom, z, z2);
        imageView.setImageDrawable(qVar);
    }

    private C18843q(Context context, Bitmap bitmap, Drawable drawable, LoadedFrom loadedFrom, boolean z, boolean z2) {
        boolean z3;
        super(context.getResources(), bitmap);
        this.f50786f = z2;
        this.f50787g = context.getResources().getDisplayMetrics().density;
        this.f50788h = loadedFrom;
        if (loadedFrom == LoadedFrom.MEMORY || z) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            this.f50782a = drawable;
            this.f50784c = true;
            this.f50783b = SystemClock.uptimeMillis();
        }
    }
}
