package com.p280ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.support.p022v4.content.C0683b;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.a */
public final class C29048a extends ReplacementSpan {

    /* renamed from: a */
    public boolean f76574a;

    /* renamed from: b */
    private Context f76575b;

    /* renamed from: c */
    private String f76576c;

    /* renamed from: d */
    private float f76577d;

    /* renamed from: e */
    private float f76578e;

    /* renamed from: f */
    private float f76579f;

    /* renamed from: g */
    private float f76580g;

    /* renamed from: h */
    private float f76581h;

    /* renamed from: i */
    private float f76582i;

    /* renamed from: j */
    private float f76583j;

    /* renamed from: k */
    private String f76584k;

    /* renamed from: l */
    private String f76585l;

    /* renamed from: a */
    private static Xfermode m95318a() {
        return new PorterDuffXfermode(Mode.DST_OUT);
    }

    /* renamed from: a */
    private float m95317a(String str) {
        if (str.length() <= 1) {
            return this.f76577d;
        }
        Rect rect = new Rect();
        Paint paint = new Paint();
        paint.setTextSize(this.f76582i);
        paint.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) + (this.f76583j * 4.0f * 2.0f);
    }

    /* renamed from: a */
    private void m95320a(Canvas canvas, float f, float f2) {
        int i;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.f76582i);
        if (this.f76574a) {
            textPaint.setXfermode(m95318a());
        }
        try {
            if (!TextUtils.isEmpty(this.f76585l)) {
                if (this.f76574a) {
                    i = -16777216;
                } else {
                    i = Color.parseColor(this.f76585l);
                }
                textPaint.setColor(i);
            } else {
                textPaint.setColor(-1);
            }
            textPaint.setFakeBoldText(true);
        } catch (Exception unused) {
            textPaint.setColor(-1);
        }
        textPaint.setAntiAlias(true);
        FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        if (f != 0.0f) {
            f += this.f76581h;
        }
        RectF rectF = new RectF(f, f2, this.f76578e + f, this.f76577d + f2);
        canvas.drawText(this.f76576c, (f + (this.f76583j * 4.0f)) - (this.f76583j * 0.5f), ((float) ((int) ((((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f))) - (this.f76583j * 0.5f), textPaint);
    }

    public C29048a(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            m95319a(context, str, str2, str3);
            this.f76578e = m95317a(str2);
        }
    }

    /* renamed from: a */
    private float m95316a(Canvas canvas, float f, int i, Paint paint) {
        Paint paint2 = new Paint();
        try {
            if (!TextUtils.isEmpty(this.f76584k)) {
                paint2.setColor(Color.parseColor(this.f76584k));
            } else {
                paint2.setColor(C0683b.m2912c(this.f76575b, R.color.w0));
            }
        } catch (Exception unused) {
            paint2.setColor(-1);
        }
        paint2.setStyle(Style.FILL);
        paint2.setAntiAlias(true);
        FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = ((float) i) + (((fontMetrics.descent - fontMetrics.ascent) - this.f76577d) / 2.0f) + fontMetrics.ascent;
        if (f != 0.0f) {
            f += this.f76581h;
        }
        canvas.drawRoundRect(new RectF(f, f2, this.f76578e + f, this.f76577d + f2), this.f76579f, this.f76579f, paint2);
        return f2;
    }

    /* renamed from: a */
    private void m95319a(Context context, String str, String str2, String str3) {
        this.f76575b = context.getApplicationContext();
        this.f76584k = str;
        this.f76576c = str2;
        this.f76583j = TypedValue.applyDimension(1, 1.0f, this.f76575b.getResources().getDisplayMetrics());
        this.f76577d = this.f76583j * 16.0f;
        this.f76580g = this.f76583j * 2.0f;
        this.f76579f = this.f76583j * 2.0f;
        this.f76582i = this.f76583j * 10.0f;
        this.f76585l = str3;
        this.f76581h = this.f76583j * 3.0f;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) (this.f76578e + this.f76581h);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        m95320a(canvas, f, m95316a(canvas, f, i4, paint));
    }
}
