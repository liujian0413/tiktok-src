package com.p280ss.android.ugc.aweme.p984ad.p988d;

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

/* renamed from: com.ss.android.ugc.aweme.ad.d.d */
public final class C22451d extends ReplacementSpan {

    /* renamed from: a */
    private Context f59875a;

    /* renamed from: b */
    private int f59876b;

    /* renamed from: c */
    private String f59877c;

    /* renamed from: d */
    private float f59878d;

    /* renamed from: e */
    private float f59879e;

    /* renamed from: f */
    private float f59880f;

    /* renamed from: g */
    private float f59881g;

    /* renamed from: h */
    private float f59882h;

    /* renamed from: i */
    private float f59883i;

    /* renamed from: j */
    private int f59884j;

    /* renamed from: k */
    private Paint f59885k;

    /* renamed from: l */
    private TextPaint f59886l;

    /* renamed from: m */
    private WeakReference<Drawable> f59887m;

    /* renamed from: c */
    private static Xfermode m74315c() {
        return new PorterDuffXfermode(Mode.DST_OUT);
    }

    /* renamed from: e */
    private Drawable m74317e() {
        return this.f59875a.getResources().getDrawable(this.f59884j);
    }

    /* renamed from: d */
    private Drawable m74316d() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f59887m;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable e = m74317e();
        this.f59887m = new WeakReference<>(e);
        return e;
    }

    /* renamed from: b */
    private void m74314b() {
        if (this.f59886l == null) {
            this.f59886l = new TextPaint();
            this.f59886l.setTextSize(this.f59882h);
            this.f59886l.setXfermode(m74315c());
            this.f59886l.setAntiAlias(true);
        }
    }

    /* renamed from: a */
    private void m74309a() {
        if (this.f59885k == null) {
            this.f59885k = new Paint();
            this.f59885k.setColor(C0683b.m2912c(this.f59875a, this.f59876b));
            this.f59885k.setStyle(Style.FILL);
            this.f59885k.setAntiAlias(true);
        }
    }

    /* renamed from: a */
    private float m74308a(String str) {
        if (str.length() <= 1) {
            return this.f59878d;
        }
        m74314b();
        Rect rect = new Rect();
        this.f59886l.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) + (this.f59883i * 4.0f * 3.0f) + ((float) m74316d().getIntrinsicWidth());
    }

    /* renamed from: a */
    private void m74311a(Canvas canvas, float f, float f2) {
        canvas.drawText(this.f59877c, f + (this.f59883i * 6.0f) + ((float) m74316d().getIntrinsicWidth()), f2, this.f59886l);
    }

    /* renamed from: a */
    private void m74312a(Canvas canvas, float f, int i) {
        Bitmap bitmap = ((BitmapDrawable) m74316d()).getBitmap();
        Paint paint = new Paint();
        paint.setXfermode(m74315c());
        canvas.drawBitmap(bitmap, f + C9738o.m28708b(this.f59875a, 4.0f), ((float) (i - m74316d().getMinimumHeight())) + C9738o.m28708b(this.f59875a, 1.5f), paint);
    }

    public C22451d(Context context, int i, String str, int i2) {
        this(context, R.color.en, str, R.drawable.aod, 15);
    }

    /* renamed from: a */
    private void m74313a(Canvas canvas, float f, int i, Paint paint) {
        FontMetrics fontMetrics = this.f59886l.getFontMetrics();
        float f2 = (float) i;
        float f3 = fontMetrics.ascent + f2;
        float f4 = f2 + fontMetrics.descent;
        float min = Math.min(Math.min(f3, ((float) canvas.getHeight()) - f4), (this.f59878d - (f4 - f3)) * 0.5f);
        canvas.drawRoundRect(new RectF(f, f3 - min, this.f59879e + f, f4 + min), this.f59880f, this.f59880f, this.f59885k);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) this.f59879e;
    }

    private C22451d(Context context, int i, String str, int i2, int i3) {
        if (!TextUtils.isEmpty(str)) {
            m74310a(context, i, str, i2, 15);
            this.f59879e = m74308a(str);
        }
    }

    /* renamed from: a */
    private void m74310a(Context context, int i, String str, int i2, int i3) {
        this.f59875a = context.getApplicationContext();
        this.f59876b = i;
        this.f59877c = str;
        this.f59883i = TypedValue.applyDimension(1, 1.0f, this.f59875a.getResources().getDisplayMetrics());
        this.f59878d = ((float) i3) * this.f59883i;
        this.f59881g = this.f59883i * 2.0f;
        this.f59880f = this.f59883i * 2.0f;
        this.f59882h = this.f59883i * 12.0f;
        this.f59884j = i2;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        m74309a();
        m74314b();
        m74313a(canvas, f, i4, paint);
        m74311a(canvas, f, (float) i4);
        m74312a(canvas, f, i4);
    }
}
