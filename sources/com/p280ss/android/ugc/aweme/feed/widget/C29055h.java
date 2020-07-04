package com.p280ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.Op;
import android.graphics.PointF;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.R$styleable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.h */
public final class C29055h {

    /* renamed from: a */
    public float[] f76632a = new float[8];

    /* renamed from: b */
    public Path f76633b;

    /* renamed from: c */
    public Paint f76634c;

    /* renamed from: d */
    public boolean f76635d;

    /* renamed from: e */
    public int f76636e;

    /* renamed from: f */
    public int f76637f;

    /* renamed from: g */
    public ColorStateList f76638g;

    /* renamed from: h */
    public int f76639h;

    /* renamed from: i */
    public boolean f76640i;

    /* renamed from: j */
    public Region f76641j;

    /* renamed from: k */
    public RectF f76642k;

    /* renamed from: a */
    public final Path mo74468a() {
        Path path = this.f76633b;
        if (path == null) {
            C7573i.m23583a("mClipPath");
        }
        return path;
    }

    /* renamed from: b */
    public final Region mo74473b() {
        Region region = this.f76641j;
        if (region == null) {
            C7573i.m23583a("mAreaRegion");
        }
        return region;
    }

    /* renamed from: c */
    public final RectF mo74474c() {
        RectF rectF = this.f76642k;
        if (rectF == null) {
            C7573i.m23583a("mLayer");
        }
        return rectF;
    }

    /* renamed from: a */
    public final void mo74470a(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        if (this.f76639h > 0) {
            Paint paint = this.f76634c;
            if (paint == null) {
                C7573i.m23583a("mPaint");
            }
            paint.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
            Paint paint2 = this.f76634c;
            if (paint2 == null) {
                C7573i.m23583a("mPaint");
            }
            paint2.setColor(-1);
            Paint paint3 = this.f76634c;
            if (paint3 == null) {
                C7573i.m23583a("mPaint");
            }
            paint3.setStrokeWidth((float) (this.f76639h * 2));
            Paint paint4 = this.f76634c;
            if (paint4 == null) {
                C7573i.m23583a("mPaint");
            }
            paint4.setStyle(Style.STROKE);
            Path path = this.f76633b;
            if (path == null) {
                C7573i.m23583a("mClipPath");
            }
            Paint paint5 = this.f76634c;
            if (paint5 == null) {
                C7573i.m23583a("mPaint");
            }
            canvas.drawPath(path, paint5);
            Paint paint6 = this.f76634c;
            if (paint6 == null) {
                C7573i.m23583a("mPaint");
            }
            paint6.setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
            Paint paint7 = this.f76634c;
            if (paint7 == null) {
                C7573i.m23583a("mPaint");
            }
            paint7.setColor(this.f76637f);
            Paint paint8 = this.f76634c;
            if (paint8 == null) {
                C7573i.m23583a("mPaint");
            }
            paint8.setStyle(Style.STROKE);
            Path path2 = this.f76633b;
            if (path2 == null) {
                C7573i.m23583a("mClipPath");
            }
            Paint paint9 = this.f76634c;
            if (paint9 == null) {
                C7573i.m23583a("mPaint");
            }
            canvas.drawPath(path2, paint9);
        }
        Paint paint10 = this.f76634c;
        if (paint10 == null) {
            C7573i.m23583a("mPaint");
        }
        paint10.setColor(-1);
        Paint paint11 = this.f76634c;
        if (paint11 == null) {
            C7573i.m23583a("mPaint");
        }
        paint11.setStyle(Style.FILL);
        if (VERSION.SDK_INT <= 27) {
            Paint paint12 = this.f76634c;
            if (paint12 == null) {
                C7573i.m23583a("mPaint");
            }
            paint12.setXfermode(new PorterDuffXfermode(Mode.DST_IN));
            Path path3 = this.f76633b;
            if (path3 == null) {
                C7573i.m23583a("mClipPath");
            }
            Paint paint13 = this.f76634c;
            if (paint13 == null) {
                C7573i.m23583a("mPaint");
            }
            canvas.drawPath(path3, paint13);
            return;
        }
        Paint paint14 = this.f76634c;
        if (paint14 == null) {
            C7573i.m23583a("mPaint");
        }
        paint14.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        Path path4 = new Path();
        RectF rectF = this.f76642k;
        if (rectF == null) {
            C7573i.m23583a("mLayer");
        }
        float width = rectF.width();
        RectF rectF2 = this.f76642k;
        if (rectF2 == null) {
            C7573i.m23583a("mLayer");
        }
        path4.addRect(0.0f, 0.0f, width, rectF2.height(), Direction.CW);
        Path path5 = this.f76633b;
        if (path5 == null) {
            C7573i.m23583a("mClipPath");
        }
        path4.op(path5, Op.DIFFERENCE);
        Paint paint15 = this.f76634c;
        if (paint15 == null) {
            C7573i.m23583a("mPaint");
        }
        canvas.drawPath(path4, paint15);
    }

    /* renamed from: a */
    public final void mo74471a(View view) {
        float f;
        C7573i.m23587b(view, "view");
        RectF rectF = this.f76642k;
        if (rectF == null) {
            C7573i.m23583a("mLayer");
        }
        int width = (int) rectF.width();
        RectF rectF2 = this.f76642k;
        if (rectF2 == null) {
            C7573i.m23583a("mLayer");
        }
        int height = (int) rectF2.height();
        RectF rectF3 = new RectF();
        rectF3.left = (float) view.getPaddingLeft();
        rectF3.top = (float) view.getPaddingTop();
        float f2 = (float) width;
        rectF3.right = f2 - ((float) view.getPaddingRight());
        float f3 = (float) height;
        rectF3.bottom = f3 - ((float) view.getPaddingBottom());
        Path path = this.f76633b;
        if (path == null) {
            C7573i.m23583a("mClipPath");
        }
        path.reset();
        if (this.f76635d) {
            if (rectF3.width() >= rectF3.height()) {
                f = rectF3.height();
            } else {
                f = rectF3.width();
            }
            float f4 = f / 2.0f;
            float f5 = (float) (height / 2);
            PointF pointF = new PointF((float) (width / 2), f5);
            if (VERSION.SDK_INT <= 27) {
                Path path2 = this.f76633b;
                if (path2 == null) {
                    C7573i.m23583a("mClipPath");
                }
                path2.addCircle(pointF.x, pointF.y, f4, Direction.CW);
                Path path3 = this.f76633b;
                if (path3 == null) {
                    C7573i.m23583a("mClipPath");
                }
                path3.moveTo(0.0f, 0.0f);
                Path path4 = this.f76633b;
                if (path4 == null) {
                    C7573i.m23583a("mClipPath");
                }
                path4.moveTo(f2, f3);
            } else {
                float f6 = f5 - f4;
                Path path5 = this.f76633b;
                if (path5 == null) {
                    C7573i.m23583a("mClipPath");
                }
                path5.moveTo(rectF3.left, f6);
                Path path6 = this.f76633b;
                if (path6 == null) {
                    C7573i.m23583a("mClipPath");
                }
                path6.addCircle(pointF.x, f6 + f4, f4, Direction.CW);
            }
        } else {
            Path path7 = this.f76633b;
            if (path7 == null) {
                C7573i.m23583a("mClipPath");
            }
            path7.addRoundRect(rectF3, this.f76632a, Direction.CW);
        }
        Region region = new Region((int) rectF3.left, (int) rectF3.top, (int) rectF3.right, (int) rectF3.bottom);
        Region region2 = this.f76641j;
        if (region2 == null) {
            C7573i.m23583a("mAreaRegion");
        }
        Path path8 = this.f76633b;
        if (path8 == null) {
            C7573i.m23583a("mClipPath");
        }
        region2.setPath(path8, region);
    }

    /* renamed from: a */
    public final void mo74469a(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RectCornerAttrs);
        this.f76635d = obtainStyledAttributes.getBoolean(1, false);
        this.f76638g = obtainStyledAttributes.getColorStateList(7);
        if (this.f76638g != null) {
            ColorStateList colorStateList = this.f76638g;
            if (colorStateList == null) {
                C7573i.m23580a();
            }
            this.f76637f = colorStateList.getDefaultColor();
            ColorStateList colorStateList2 = this.f76638g;
            if (colorStateList2 == null) {
                C7573i.m23580a();
            }
            this.f76636e = colorStateList2.getDefaultColor();
        } else {
            this.f76637f = -1;
            this.f76636e = -1;
        }
        this.f76639h = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f76640i = obtainStyledAttributes.getBoolean(0, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        obtainStyledAttributes.recycle();
        float f = (float) dimensionPixelSize2;
        this.f76632a[0] = f;
        this.f76632a[1] = f;
        float f2 = (float) dimensionPixelSize3;
        this.f76632a[2] = f2;
        this.f76632a[3] = f2;
        float f3 = (float) dimensionPixelSize5;
        this.f76632a[4] = f3;
        this.f76632a[5] = f3;
        float f4 = (float) dimensionPixelSize4;
        this.f76632a[6] = f4;
        this.f76632a[7] = f4;
        this.f76642k = new RectF();
        this.f76633b = new Path();
        this.f76641j = new Region();
        this.f76634c = new Paint();
        Paint paint = this.f76634c;
        if (paint == null) {
            C7573i.m23583a("mPaint");
        }
        paint.setColor(-1);
        Paint paint2 = this.f76634c;
        if (paint2 == null) {
            C7573i.m23583a("mPaint");
        }
        paint2.setAntiAlias(true);
    }

    /* renamed from: a */
    public final void mo74472a(View view, int i, int i2) {
        C7573i.m23587b(view, "view");
        RectF rectF = this.f76642k;
        if (rectF == null) {
            C7573i.m23583a("mLayer");
        }
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        mo74471a(view);
    }
}
