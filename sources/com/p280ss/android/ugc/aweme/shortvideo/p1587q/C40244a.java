package com.p280ss.android.ugc.aweme.shortvideo.p1587q;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.q.a */
public final class C40244a extends ReplacementSpan {

    /* renamed from: a */
    private int f104575a;

    /* renamed from: b */
    private final float f104576b = 22.0f;

    /* renamed from: c */
    private final float f104577c = 15.0f;

    /* renamed from: d */
    private final float f104578d = 17.0f;

    /* renamed from: e */
    private final float f104579e = 10.0f;

    /* renamed from: f */
    private final float f104580f = 5.0f;

    /* renamed from: g */
    private String f104581g = "";

    /* renamed from: h */
    private final Context f104582h;

    /* renamed from: i */
    private final View f104583i;

    public C40244a(Context context, View view) {
        C7573i.m23587b(context, "mContext");
        C7573i.m23587b(view, "mView");
        this.f104582h = context;
        this.f104583i = view;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        C7573i.m23587b(paint, "paint");
        C7573i.m23587b(charSequence, "text");
        int i3 = i + 1;
        if (i3 >= i2) {
            return 0;
        }
        paint.setTextSize(C9738o.m28708b(this.f104582h, this.f104577c - 2.0f));
        this.f104575a = (int) (paint.measureText(charSequence, i3, i2) + C9738o.m28708b(this.f104582h, this.f104576b));
        if ((this.f104583i instanceof C40245b) && this.f104575a >= ((C40245b) this.f104583i).getHookAtMaxWidth()) {
            this.f104581g = m128590a(charSequence, i3, i2, paint, ((C40245b) this.f104583i).getHookAtMaxWidth(), C9738o.m28708b(this.f104582h, this.f104576b + 2.0f));
            this.f104575a = (int) (paint.measureText(this.f104581g) + C9738o.m28708b(this.f104582h, this.f104576b));
        }
        return this.f104575a;
    }

    /* renamed from: a */
    private static String m128590a(CharSequence charSequence, int i, int i2, Paint paint, int i3, float f) {
        C7573i.m23587b(charSequence, "text");
        C7573i.m23587b(paint, "paint");
        String str = "…";
        String obj = charSequence.subSequence(i, i2).toString();
        int measureText = (int) (paint.measureText(obj) + f);
        if (i3 == 0 || measureText <= i3) {
            return "";
        }
        while (obj.length() != 1) {
            int length = obj.length() - 1;
            int length2 = obj.length();
            if (obj != null) {
                obj = C7634n.m23733a((CharSequence) obj, length, length2).toString();
                StringBuilder sb = new StringBuilder();
                sb.append(obj);
                sb.append(str);
                if (((int) (paint.measureText(sb.toString()) + f)) <= i3 && !Character.isHighSurrogate(obj.charAt(obj.length() - 1))) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(obj);
                    sb2.append(str);
                    return sb2.toString();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            }
        }
        return str;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        int i6 = i;
        float f2 = f;
        int i7 = i4;
        Paint paint2 = paint;
        C7573i.m23587b(canvas2, "canvas");
        C7573i.m23587b(charSequence, "text");
        C7573i.m23587b(paint2, "paint");
        int i8 = i6 + 1;
        if (i8 < i2) {
            if (((float) this.f104575a) + f2 > ((float) this.f104583i.getWidth())) {
                canvas2.drawText("…", f2, (float) i7, paint2);
            } else if (charSequence.length() <= i6 || charSequence.charAt(i) != 8230) {
                paint2.setAntiAlias(true);
                int color = paint.getColor();
                PathEffect pathEffect = paint.getPathEffect();
                paint2.setTextSize(C9738o.m28708b(this.f104582h, this.f104577c));
                if (C6399b.m19946v()) {
                    paint2.setColor(Color.parseColor("#0B161823"));
                } else {
                    paint2.setColor(Color.parseColor("#33FFFFFF"));
                }
                paint2.setPathEffect(new CornerPathEffect(C9738o.m28708b(this.f104582h, 2.0f)));
                FontMetrics fontMetrics = paint.getFontMetrics();
                float f3 = fontMetrics.top;
                float f4 = fontMetrics.bottom;
                float f5 = (float) i7;
                float f6 = f5 + f3;
                canvas2.drawRect(new RectF(f2, f6, ((float) this.f104575a) + f2, f5 + f4), paint2);
                paint2.setColor(color);
                float f7 = f4 - f3;
                float b = C9738o.m28708b(this.f104582h, this.f104579e);
                float f8 = (f7 - b) / 2.0f;
                float b2 = C9738o.m28708b(this.f104582h, this.f104580f);
                Path path = new Path();
                float f9 = b2 + f2;
                float f10 = f6 + f8;
                path.moveTo(f9, f10);
                path.lineTo(f9, f10 + b);
                path.lineTo(f9 + (0.86f * b), f10 + (b / 2.0f));
                path.close();
                canvas2.drawPath(path, paint2);
                paint2.setPathEffect(pathEffect);
                paint2.setTextSize(C9738o.m28708b(this.f104582h, this.f104577c - 2.0f));
                if (TextUtils.isEmpty(this.f104581g)) {
                    canvas.drawText(charSequence, i8, i2, f2 + C9738o.m28708b(this.f104582h, this.f104578d), f5 - C9738o.m28708b(this.f104582h, 1.0f), paint);
                    return;
                }
                canvas2.drawText(this.f104581g, f2 + C9738o.m28708b(this.f104582h, this.f104578d), f5 - C9738o.m28708b(this.f104582h, 1.0f), paint2);
            } else {
                canvas2.drawText("…", f2, (float) i7, paint2);
            }
        }
    }
}
