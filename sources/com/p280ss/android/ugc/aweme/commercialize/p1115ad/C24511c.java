package com.p280ss.android.ugc.aweme.commercialize.p1115ad;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.style.ReplacementSpan;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.c */
public final class C24511c extends ReplacementSpan {

    /* renamed from: a */
    public float f64694a;

    /* renamed from: b */
    public float f64695b;

    /* renamed from: c */
    public float f64696c;

    /* renamed from: d */
    public int f64697d;

    /* renamed from: e */
    private final TextExtraStruct f64698e;

    /* renamed from: f */
    private final int f64699f;

    /* renamed from: g */
    private final int f64700g = -1;

    /* renamed from: h */
    private float f64701h;

    /* renamed from: i */
    private final Context f64702i;

    /* renamed from: j */
    private String f64703j;

    /* renamed from: k */
    private float f64704k;

    /* renamed from: a */
    private static String m80511a(String str, Paint paint, float f, float f2) {
        String str2 = "…";
        int measureText = (int) (paint.measureText(str) + f2);
        if (f == 0.0f || ((float) measureText) <= f) {
            return str;
        }
        while (true) {
            int length = str.length() - 1;
            int length2 = str.length();
            if (str != null) {
                str = C7634n.m23733a((CharSequence) str, length, length2).toString();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(str2);
                if (((float) ((int) (paint.measureText(sb.toString()) + f2))) <= f && !Character.isHighSurrogate(str.charAt(str.length() - 1))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(str2);
                    return sb2.toString();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
    }

    public C24511c(Context context, float f, int i, int i2, TextExtraStruct textExtraStruct) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(textExtraStruct, "struct");
        this.f64698e = textExtraStruct;
        this.f64699f = i;
        this.f64701h = f;
        this.f64702i = context;
        this.f64694a = -1.0f;
        this.f64703j = "";
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C7573i.m23587b(paint, "paint");
        if (i + 1 >= i2) {
            return 0;
        }
        if (this.f64694a != -1.0f) {
            paint.setTextSize(this.f64694a);
        }
        String valueOf = String.valueOf(charSequence);
        if (valueOf != null) {
            String substring = valueOf.substring(i, i2);
            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            this.f64703j = m80511a(substring, paint, this.f64701h, this.f64695b);
            this.f64697d = (int) (paint.measureText(this.f64703j) + this.f64695b);
            return this.f64697d;
        }
        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
    }

    /* renamed from: a */
    private final void m80512a(Canvas canvas, Paint paint, float f, float f2, int i, int i2) {
        paint.setColor(-1);
        paint.setPathEffect(new CornerPathEffect(C9738o.m28708b(this.f64702i, 2.0f)));
        Path path = new Path();
        float b = C9738o.m28708b(this.f64702i, 10.0f);
        float f3 = ((float) (i2 + i)) / 2.0f;
        float sqrt = (float) Math.sqrt((Math.pow((double) b, 2.0d) * 3.0d) / 4.0d);
        float f4 = b / 2.0f;
        path.moveTo((this.f64695b / 2.0f) + f, f3 + f4);
        path.lineTo((this.f64695b / 2.0f) + f + sqrt, f3);
        path.lineTo(f + (this.f64695b / 2.0f), f3 - f4);
        path.close();
        canvas.drawPath(path, paint);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        boolean z;
        Canvas canvas2 = canvas;
        int i6 = i;
        float f2 = f;
        int i7 = i4;
        Paint paint2 = paint;
        C7573i.m23587b(canvas, "canvas");
        C7573i.m23587b(paint2, "paint");
        if (i6 + 1 < i2) {
            if (((float) this.f64697d) + f2 > this.f64701h) {
                this.f64698e.setClickable(false);
                canvas.drawText("…", f2, (float) i7, paint2);
                return;
            }
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || charSequence.length() <= i6 || charSequence.charAt(i) != 8230) {
                this.f64698e.setClickable(true);
                paint2.setTypeface(Typeface.DEFAULT);
                if (this.f64694a != -1.0f) {
                    paint2.setTextSize(this.f64694a);
                }
                FontMetrics fontMetrics = paint.getFontMetrics();
                paint2.setColor(this.f64699f);
                float f3 = (float) i7;
                float f4 = fontMetrics.top + f3;
                float f5 = fontMetrics.bottom + f3;
                canvas.drawRoundRect(new RectF(f2, f4, ((float) this.f64697d) + f2, f5), this.f64696c, this.f64696c, paint2);
                if (this.f64703j.charAt(0) == '@') {
                    this.f64704k = paint2.measureText(String.valueOf(this.f64703j.charAt(0)));
                    String str = this.f64703j;
                    int length = this.f64703j.length();
                    if (str != null) {
                        String substring = str.substring(1, length);
                        C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        this.f64703j = substring;
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                }
                paint2.setColor(this.f64700g);
                canvas.drawText(this.f64703j, (this.f64695b / 2.0f) + f2 + this.f64704k, f3 - C9738o.m28708b(this.f64702i, 1.0f), paint2);
                m80512a(canvas, paint, f, f3, (int) f4, (int) f5);
                return;
            }
            this.f64698e.setClickable(false);
            canvas.drawText("…", f2, (float) i7, paint2);
        }
    }
}
