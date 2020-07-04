package com.p280ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.C0683b;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.f */
public final class C29053f extends ReplacementSpan {

    /* renamed from: a */
    private Context f76618a;

    /* renamed from: b */
    private int f76619b;

    /* renamed from: c */
    private String f76620c;

    /* renamed from: d */
    private float f76621d;

    /* renamed from: e */
    private float f76622e;

    /* renamed from: f */
    private float f76623f;

    /* renamed from: g */
    private float f76624g;

    /* renamed from: h */
    private float f76625h;

    /* renamed from: i */
    private float f76626i;

    /* renamed from: j */
    private int f76627j;

    /* renamed from: k */
    private Paint f76628k;

    /* renamed from: l */
    private TextPaint f76629l;

    /* renamed from: m */
    private WeakReference<Drawable> f76630m;

    /* renamed from: d */
    private static Xfermode m95346d() {
        return new PorterDuffXfermode(Mode.DST_OUT);
    }

    /* renamed from: a */
    public final Drawable mo74464a() {
        return this.f76618a.getResources().getDrawable(this.f76627j);
    }

    /* renamed from: e */
    private Drawable m95347e() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f76630m;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable a = mo74464a();
        this.f76630m = new WeakReference<>(a);
        return a;
    }

    /* renamed from: b */
    private void m95344b() {
        if (this.f76628k == null) {
            this.f76628k = new Paint();
            this.f76628k.setColor(C0683b.m2912c(this.f76618a, this.f76619b));
            this.f76628k.setStyle(Style.FILL);
            this.f76628k.setAntiAlias(true);
        }
    }

    /* renamed from: c */
    private void m95345c() {
        if (this.f76629l == null) {
            this.f76629l = new TextPaint();
            this.f76629l.setTextSize(this.f76625h);
            this.f76629l.setXfermode(m95346d());
            this.f76629l.setAntiAlias(true);
        }
    }

    /* renamed from: a */
    private float m95339a(String str) {
        if (str.length() <= 1) {
            return this.f76621d;
        }
        m95345c();
        Rect rect = new Rect();
        this.f76629l.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) + (this.f76626i * 4.0f * 3.0f) + ((float) m95347e().getIntrinsicWidth());
    }

    /* renamed from: a */
    private void m95341a(Canvas canvas, float f, float f2) {
        canvas.drawText(this.f76620c, f + (this.f76626i * 6.0f) + ((float) m95347e().getIntrinsicWidth()), f2, this.f76629l);
    }

    /* renamed from: a */
    private void m95342a(Canvas canvas, float f, int i) {
        Bitmap bitmap = ((BitmapDrawable) m95347e()).getBitmap();
        Paint paint = new Paint();
        paint.setXfermode(m95346d());
        canvas.drawBitmap(bitmap, f + C9738o.m28708b(this.f76618a, 4.0f), ((float) (i - m95347e().getMinimumHeight())) + C9738o.m28708b(this.f76618a, 1.5f), paint);
    }

    public C29053f(Context context, int i, String str, int i2) {
        this(context, R.color.en, str, R.drawable.aod, 15);
    }

    /* renamed from: a */
    private void m95343a(Canvas canvas, float f, int i, Paint paint) {
        FontMetrics fontMetrics = this.f76629l.getFontMetrics();
        float f2 = (float) i;
        float f3 = fontMetrics.ascent + f2;
        float f4 = f2 + fontMetrics.descent;
        float min = Math.min(Math.min(f3, ((float) canvas.getHeight()) - f4), (this.f76621d - (f4 - f3)) * 0.5f);
        canvas.drawRoundRect(new RectF(f, f3 - min, this.f76622e + f, f4 + min), this.f76623f, this.f76623f, this.f76628k);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) this.f76622e;
    }

    public C29053f(Context context, int i, String str, int i2, int i3) {
        if (!TextUtils.isEmpty(str)) {
            m95340a(context, i, str, i2, i3);
            this.f76622e = m95339a(str);
        }
    }

    /* renamed from: a */
    private void m95340a(Context context, int i, String str, int i2, int i3) {
        this.f76618a = context.getApplicationContext();
        this.f76619b = i;
        this.f76620c = str;
        this.f76626i = TypedValue.applyDimension(1, 1.0f, this.f76618a.getResources().getDisplayMetrics());
        this.f76621d = ((float) i3) * this.f76626i;
        this.f76624g = this.f76626i * 2.0f;
        this.f76623f = this.f76626i * 2.0f;
        this.f76625h = this.f76626i * 12.0f;
        this.f76627j = i2;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        m95344b();
        m95345c();
        m95343a(canvas, f, i4, paint);
        m95341a(canvas, f, (float) i4);
        m95342a(canvas, f, i4);
    }
}
