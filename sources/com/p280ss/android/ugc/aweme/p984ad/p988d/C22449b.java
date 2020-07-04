package com.p280ss.android.ugc.aweme.p984ad.p988d;

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

/* renamed from: com.ss.android.ugc.aweme.ad.d.b */
public final class C22449b extends ReplacementSpan {

    /* renamed from: a */
    public boolean f59863a;

    /* renamed from: b */
    private Context f59864b;

    /* renamed from: c */
    private String f59865c;

    /* renamed from: d */
    private float f59866d;

    /* renamed from: e */
    private float f59867e;

    /* renamed from: f */
    private float f59868f;

    /* renamed from: g */
    private float f59869g;

    /* renamed from: h */
    private float f59870h;

    /* renamed from: i */
    private float f59871i;

    /* renamed from: j */
    private float f59872j;

    /* renamed from: k */
    private String f59873k;

    /* renamed from: l */
    private String f59874l;

    /* renamed from: a */
    private static Xfermode m74305a() {
        return new PorterDuffXfermode(Mode.DST_OUT);
    }

    /* renamed from: a */
    private float m74304a(String str) {
        if (str.length() <= 1) {
            return this.f59866d;
        }
        Rect rect = new Rect();
        Paint paint = new Paint();
        paint.setTextSize(this.f59871i);
        paint.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) + (this.f59872j * 4.0f * 2.0f);
    }

    /* renamed from: a */
    private void m74307a(Canvas canvas, float f, float f2) {
        int i;
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.f59871i);
        if (this.f59863a) {
            textPaint.setXfermode(m74305a());
        }
        try {
            if (!TextUtils.isEmpty(this.f59874l)) {
                if (this.f59863a) {
                    i = -16777216;
                } else {
                    i = Color.parseColor(this.f59874l);
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
            f += this.f59870h;
        }
        RectF rectF = new RectF(f, f2, this.f59867e + f, this.f59866d + f2);
        canvas.drawText(this.f59865c, (f + (this.f59872j * 4.0f)) - (this.f59872j * 0.5f), ((float) ((int) ((((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f))) - (this.f59872j * 0.5f), textPaint);
    }

    public C22449b(Context context, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str2)) {
            m74306a(context, str, str2, str3);
            this.f59867e = m74304a(str2);
        }
    }

    /* renamed from: a */
    private float m74303a(Canvas canvas, float f, int i, Paint paint) {
        Paint paint2 = new Paint();
        try {
            if (!TextUtils.isEmpty(this.f59873k)) {
                paint2.setColor(Color.parseColor(this.f59873k));
            } else {
                paint2.setColor(C0683b.m2912c(this.f59864b, R.color.w0));
            }
        } catch (Exception unused) {
            paint2.setColor(-1);
        }
        paint2.setStyle(Style.FILL);
        paint2.setAntiAlias(true);
        FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = ((float) i) + (((fontMetrics.descent - fontMetrics.ascent) - this.f59866d) / 2.0f) + fontMetrics.ascent;
        if (f != 0.0f) {
            f += this.f59870h;
        }
        canvas.drawRoundRect(new RectF(f, f2, this.f59867e + f, this.f59866d + f2), this.f59868f, this.f59868f, paint2);
        return f2;
    }

    /* renamed from: a */
    private void m74306a(Context context, String str, String str2, String str3) {
        this.f59864b = context.getApplicationContext();
        this.f59873k = str;
        this.f59865c = str2;
        this.f59872j = TypedValue.applyDimension(1, 1.0f, this.f59864b.getResources().getDisplayMetrics());
        this.f59866d = this.f59872j * 16.0f;
        this.f59869g = this.f59872j * 2.0f;
        this.f59868f = this.f59872j * 2.0f;
        this.f59871i = this.f59872j * 10.0f;
        this.f59874l = str3;
        this.f59870h = this.f59872j * 3.0f;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) (this.f59867e + this.f59870h);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        m74307a(canvas, f, m74303a(canvas, f, i4, paint));
    }
}
