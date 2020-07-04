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
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.e */
public final class C29052e extends ReplacementSpan {

    /* renamed from: a */
    float f76604a = -1.0f;

    /* renamed from: b */
    int f76605b = -1;

    /* renamed from: c */
    private Context f76606c;

    /* renamed from: d */
    private int f76607d;

    /* renamed from: e */
    private String f76608e;

    /* renamed from: f */
    private float f76609f;

    /* renamed from: g */
    private float f76610g;

    /* renamed from: h */
    private float f76611h;

    /* renamed from: i */
    private float f76612i;

    /* renamed from: j */
    private float f76613j;

    /* renamed from: k */
    private float f76614k;

    /* renamed from: l */
    private int f76615l = 12;

    /* renamed from: m */
    private int f76616m;

    /* renamed from: n */
    private WeakReference<Drawable> f76617n;

    /* renamed from: a */
    private static Xfermode m95333a() {
        return new PorterDuffXfermode(Mode.DST_OUT);
    }

    /* renamed from: c */
    private Drawable m95338c() {
        return this.f76606c.getResources().getDrawable(this.f76616m);
    }

    /* renamed from: b */
    private Drawable m95337b() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f76617n;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable c = m95338c();
        this.f76617n = new WeakReference<>(c);
        return c;
    }

    /* renamed from: a */
    private float m95332a(String str) {
        if (str.length() <= 1) {
            return this.f76609f;
        }
        Rect rect = new Rect();
        Paint paint = new Paint();
        paint.setTextSize(this.f76613j);
        paint.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) + (this.f76614k * 4.0f * 3.0f) + ((float) m95337b().getIntrinsicWidth());
    }

    /* renamed from: a */
    private void m95335a(Canvas canvas, float f, float f2) {
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.f76613j);
        textPaint.setXfermode(m95333a());
        textPaint.setAntiAlias(true);
        FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        RectF rectF = new RectF(f, f2, this.f76610g + f, this.f76609f + f2);
        canvas.drawText(this.f76608e, f + (this.f76614k * 6.0f) + ((float) m95337b().getIntrinsicWidth()), (float) ((int) ((((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f)), textPaint);
    }

    /* renamed from: a */
    private void m95336a(Canvas canvas, float f, int i) {
        Bitmap bitmap = ((BitmapDrawable) m95337b()).getBitmap();
        Paint paint = new Paint();
        paint.setXfermode(m95333a());
        canvas.drawBitmap(bitmap, f + C9738o.m28708b(this.f76606c, 4.0f), ((float) (i - m95337b().getMinimumHeight())) + C9738o.m28708b(this.f76606c, -1.0f), paint);
    }

    public C29052e(Context context, int i, String str, int i2) {
        if (!TextUtils.isEmpty(str)) {
            m95334a(context, (int) R.color.en, str, (int) R.drawable.av1);
            this.f76610g = m95332a(str);
        }
    }

    /* renamed from: a */
    private float m95331a(Canvas canvas, float f, int i, Paint paint) {
        int i2;
        Paint paint2 = new Paint();
        paint2.setColor(this.f76606c.getResources().getColor(this.f76607d));
        paint2.setStyle(Style.FILL);
        paint2.setAntiAlias(true);
        FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = ((float) i) + (((fontMetrics.descent - fontMetrics.ascent) - this.f76609f) / 2.0f) + fontMetrics.ascent;
        RectF rectF = new RectF(f, f2, this.f76610g + f, this.f76609f + f2);
        if (VERSION.SDK_INT >= 21) {
            i2 = canvas.saveLayer(rectF, paint2);
        } else {
            i2 = canvas.saveLayer(rectF, paint2, 31);
        }
        canvas.drawRoundRect(rectF, this.f76611h, this.f76611h, paint2);
        m95335a(canvas, f, f2);
        m95336a(canvas, f, i);
        canvas.restoreToCount(i2);
        return f2;
    }

    /* renamed from: a */
    private void m95334a(Context context, int i, String str, int i2) {
        this.f76606c = context.getApplicationContext();
        this.f76607d = i;
        this.f76608e = str;
        this.f76614k = TypedValue.applyDimension(1, 1.0f, this.f76606c.getResources().getDisplayMetrics());
        this.f76609f = this.f76614k * 18.0f;
        this.f76612i = this.f76614k * 2.0f;
        this.f76611h = this.f76614k * 4.0f;
        this.f76613j = this.f76614k * 12.0f;
        this.f76616m = i2;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) this.f76610g;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f76604a < 0.0f) {
            this.f76604a = f;
        }
        if (this.f76605b < 0) {
            this.f76605b = i4;
        }
        m95331a(canvas, this.f76604a, this.f76605b, paint);
    }
}
