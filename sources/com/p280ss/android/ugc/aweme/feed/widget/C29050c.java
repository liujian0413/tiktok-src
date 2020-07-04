package com.p280ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.c */
public final class C29050c extends ReplacementSpan {

    /* renamed from: a */
    public float f76587a;

    /* renamed from: b */
    private final Context f76588b;

    /* renamed from: c */
    private final String f76589c;

    /* renamed from: d */
    private final String f76590d;

    /* renamed from: e */
    private final int f76591e;

    /* renamed from: f */
    private final String f76592f;

    /* renamed from: g */
    private final String f76593g;

    /* renamed from: h */
    private final int f76594h;

    /* renamed from: i */
    private final float f76595i;

    /* renamed from: j */
    private float f76596j;

    /* renamed from: k */
    private float f76597k;

    /* renamed from: l */
    private final float f76598l;

    /* renamed from: m */
    private float f76599m;

    /* renamed from: n */
    private Paint f76600n;

    /* renamed from: o */
    private Paint f76601o;

    /* renamed from: p */
    private WeakReference<Drawable> f76602p;

    /* renamed from: c */
    private final Drawable m95328c() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f76602p;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable d = m95329d();
        this.f76602p = new WeakReference<>(d);
        return d;
    }

    /* renamed from: d */
    private Drawable m95329d() {
        Drawable drawable = this.f76588b.getResources().getDrawable(this.f76591e);
        C7573i.m23582a((Object) drawable, "mContext.resources.getDrawable(mDrawableRes)");
        return drawable;
    }

    /* renamed from: b */
    private final void m95326b() {
        if (!TextUtils.isEmpty(this.f76589c) && this.f76601o == null) {
            this.f76601o = new TextPaint();
            try {
                if (TextUtils.isEmpty(this.f76590d)) {
                    Paint paint = this.f76601o;
                    if (paint == null) {
                        C7573i.m23580a();
                    }
                    paint.setColor(this.f76594h);
                } else {
                    Paint paint2 = this.f76601o;
                    if (paint2 == null) {
                        C7573i.m23580a();
                    }
                    paint2.setColor(Color.parseColor(this.f76590d));
                }
            } catch (Exception unused) {
                Paint paint3 = this.f76601o;
                if (paint3 == null) {
                    C7573i.m23580a();
                }
                paint3.setColor(this.f76594h);
            }
            Paint paint4 = this.f76601o;
            if (paint4 == null) {
                C7573i.m23580a();
            }
            paint4.setTextSize(this.f76599m);
            Paint paint5 = this.f76601o;
            if (paint5 == null) {
                C7573i.m23580a();
            }
            paint5.setAntiAlias(true);
        }
    }

    /* renamed from: a */
    private final void m95323a() {
        if (!TextUtils.isEmpty(this.f76593g) && this.f76600n == null) {
            this.f76600n = new Paint();
            try {
                Paint paint = this.f76600n;
                if (paint == null) {
                    C7573i.m23580a();
                }
                paint.setColor(Color.parseColor(this.f76593g));
            } catch (Exception unused) {
                Paint paint2 = this.f76600n;
                if (paint2 == null) {
                    C7573i.m23580a();
                }
                paint2.setColor(-1);
            }
            Paint paint3 = this.f76600n;
            if (paint3 == null) {
                C7573i.m23580a();
            }
            paint3.setStyle(Style.FILL);
            Paint paint4 = this.f76600n;
            if (paint4 == null) {
                C7573i.m23580a();
            }
            paint4.setAntiAlias(true);
        }
    }

    /* renamed from: a */
    private final float m95322a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        m95326b();
        Rect rect = new Rect();
        Paint paint = this.f76601o;
        if (paint == null) {
            C7573i.m23580a();
        }
        if (str == null) {
            C7573i.m23580a();
        }
        paint.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) + (this.f76598l * 4.0f * 3.0f) + ((float) m95328c().getIntrinsicWidth());
    }

    /* renamed from: a */
    private final void m95324a(Canvas canvas, float f, float f2) {
        if (this.f76601o != null) {
            canvas.drawText(this.f76589c, f + (this.f76598l * 6.0f) + ((float) m95328c().getIntrinsicWidth()), f2 - (this.f76598l * 1.0f), this.f76601o);
        }
    }

    /* renamed from: b */
    private final void m95327b(Canvas canvas, float f, int i) {
        int i2;
        Drawable c = m95328c();
        if (!(c instanceof BitmapDrawable)) {
            c = null;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) c;
        if (bitmapDrawable != null) {
            Bitmap bitmap = bitmapDrawable.getBitmap();
            Paint paint = new Paint();
            try {
                if (TextUtils.isEmpty(this.f76592f)) {
                    i2 = this.f76594h;
                } else {
                    i2 = Color.parseColor(this.f76592f);
                }
            } catch (Exception unused) {
                i2 = this.f76594h;
            }
            paint.setColorFilter(new PorterDuffColorFilter(i2, Mode.SRC_ATOP));
            paint.setAntiAlias(true);
            canvas.drawBitmap(bitmap, f + C9738o.m28708b(this.f76588b, 4.0f), ((float) (i - bitmapDrawable.getMinimumHeight())) + C9738o.m28708b(this.f76588b, 1.0f) + this.f76587a, paint);
        }
    }

    /* renamed from: a */
    private final void m95325a(Canvas canvas, float f, int i) {
        if (this.f76601o != null && this.f76600n != null) {
            Paint paint = this.f76601o;
            if (paint == null) {
                C7573i.m23580a();
            }
            FontMetrics fontMetrics = paint.getFontMetrics();
            float f2 = (float) i;
            float f3 = fontMetrics.ascent + f2;
            float f4 = f2 + fontMetrics.descent;
            float min = Math.min(Math.min(f3, ((float) canvas.getHeight()) - f4), (this.f76596j - (f4 - f3)) * 0.5f);
            canvas.drawRoundRect(new RectF(f, (f3 - min) - (this.f76598l * 1.0f), this.f76595i + f, (f4 + min) - (this.f76598l * 1.0f)), this.f76597k, this.f76597k, this.f76600n);
        }
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C7573i.m23587b(paint, "paint");
        return (int) this.f76595i;
    }

    public C29050c(Context context, String str, String str2, int i, String str3) {
        C7573i.m23587b(context, "context");
        this(context, str, str2, R.drawable.aoe, str3, "");
    }

    private C29050c(Context context, String str, String str2, int i, String str3, String str4) {
        Context context2 = context;
        C7573i.m23587b(context, "context");
        this(context2, str, str2, i, str3, str4, 13, 20);
    }

    public C29050c(Context context, String str, String str2, int i, String str3, String str4, int i2, int i3) {
        C7573i.m23587b(context, "context");
        Context applicationContext = context.getApplicationContext();
        C7573i.m23582a((Object) applicationContext, "context.applicationContext");
        this.f76588b = applicationContext;
        this.f76594h = Color.parseColor("#FACE15");
        Resources resources = this.f76588b.getResources();
        C7573i.m23582a((Object) resources, "mContext.resources");
        this.f76598l = TypedValue.applyDimension(1, 1.0f, resources.getDisplayMetrics());
        this.f76599m = ((float) i2) * this.f76598l;
        this.f76596j = ((float) i3) * this.f76598l;
        this.f76597k = this.f76598l * 2.0f;
        this.f76589c = str;
        this.f76590d = str2;
        this.f76591e = i;
        this.f76592f = str3;
        this.f76593g = str4;
        this.f76595i = m95322a(str);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C7573i.m23587b(canvas, "canvas");
        C7573i.m23587b(paint, "paint");
        m95323a();
        m95326b();
        m95325a(canvas, f, i4);
        m95324a(canvas, f, (float) i4);
        m95327b(canvas, f, i4);
    }
}
