package com.p280ss.android.ugc.aweme.comment.p1101h;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.comment.h.c */
public final class C24143c {

    /* renamed from: com.ss.android.ugc.aweme.comment.h.c$a */
    public static class C24144a extends ReplacementSpan {

        /* renamed from: a */
        private int f63805a;

        /* renamed from: b */
        private int f63806b;

        public C24144a(int i) {
            this.f63806b = i;
        }

        /* renamed from: a */
        public final TextPaint mo62572a(Paint paint) {
            int i;
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) C23486n.m77127c(10.0d));
            if (this.f63806b == 1) {
                i = C6399b.m19921a().getResources().getColor(R.color.lu);
            } else {
                i = C6399b.m19921a().getResources().getColor(R.color.a51);
            }
            textPaint.setColor(i);
            return textPaint;
        }

        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
            this.f63805a = (int) mo62572a(paint).measureText(charSequence.subSequence(i, i2).toString());
            return this.f63805a + C23486n.m77122a(16.0d);
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int i6;
            boolean z;
            int i7;
            int i8;
            Canvas canvas2 = canvas;
            int i9 = i3;
            int i10 = i5;
            Paint paint2 = new Paint();
            paint2.setStyle(Style.FILL);
            if (this.f63806b == 1) {
                i6 = C6399b.m19921a().getResources().getColor(R.color.lo);
            } else {
                i6 = C6399b.m19921a().getResources().getColor(R.color.lg);
            }
            paint2.setColor(i6);
            paint2.setAntiAlias(true);
            CharSequence subSequence = charSequence.subSequence(i, i2);
            FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            TextPaint a = mo62572a(paint);
            FontMetricsInt fontMetricsInt2 = a.getFontMetricsInt();
            if (C6399b.m19921a().getResources().getDisplayMetrics().density < 4.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i7 = (((i10 - i9) - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2) + C23486n.m77122a(1.0d);
            } else {
                i7 = ((i10 - i9) - (fontMetricsInt.descent - fontMetricsInt.ascent)) + 3;
            }
            float f2 = (float) i7;
            canvas2.drawRoundRect(new RectF(f + ((float) C23486n.m77122a(4.0d)), ((float) i9) + f2, (float) ((int) (f + ((float) this.f63805a) + ((float) C23486n.m77122a(12.0d)))), ((float) i10) - f2), (float) C23486n.m77122a(4.0d), (float) C23486n.m77122a(4.0d), paint2);
            String charSequence2 = subSequence.toString();
            float a2 = f + ((float) C23486n.m77122a(8.0d));
            int i11 = i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent));
            if (z) {
                i8 = 1;
            } else {
                i8 = 3;
            }
            canvas2.drawText(charSequence2, a2, (float) (i11 - i8), a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.h.c$b */
    public static class C24145b extends ReplacementSpan {

        /* renamed from: a */
        private int f63807a;

        /* renamed from: b */
        private int f63808b;

        /* renamed from: a */
        private TextPaint m79330a(Paint paint) {
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f63807a);
            textPaint.setColor(this.f63808b);
            return textPaint;
        }

        public C24145b(int i, int i2) {
            this.f63807a = i;
            this.f63808b = i2;
        }

        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
            return (int) m79330a(paint).measureText(charSequence.subSequence(i, i2).toString());
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            CharSequence subSequence = charSequence.subSequence(i, i2);
            FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            TextPaint a = m79330a(paint);
            FontMetricsInt fontMetricsInt2 = a.getFontMetricsInt();
            canvas.drawText(subSequence.toString(), f, (float) (i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.h.c$c */
    public static class C24146c extends ReplacementSpan {

        /* renamed from: a */
        private int f63809a = C6399b.m19921a().getResources().getColor(R.color.hx);

        /* renamed from: b */
        private int f63810b = C6399b.m19921a().getResources().getColor(R.color.ik);

        /* renamed from: c */
        private int f63811c = C23486n.m77122a(10.0d);

        /* renamed from: d */
        private int f63812d = C23486n.m77122a(15.0d);

        /* renamed from: e */
        private int f63813e = C23486n.m77122a(4.0d);

        /* renamed from: f */
        private int f63814f = C23486n.m77122a(4.0d);

        /* renamed from: g */
        private int f63815g = C23486n.m77122a(1.0d);

        /* renamed from: h */
        private int f63816h;

        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f63811c);
            this.f63816h = (int) textPaint.measureText(charSequence.subSequence(i, i2).toString());
            return this.f63816h + this.f63813e + this.f63814f;
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            CharSequence subSequence = charSequence.subSequence(i, i2);
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setColor(this.f63809a);
            int i6 = ((i5 - i3) - this.f63812d) / 2;
            canvas.drawRoundRect(new RectF(f, (float) (i3 + i6), ((float) this.f63816h) + f + ((float) this.f63813e) + ((float) this.f63814f), (float) (i5 - i6)), (float) this.f63815g, (float) this.f63815g, textPaint);
            textPaint.setTextSize((float) this.f63811c);
            textPaint.setColor(this.f63810b);
            FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
            canvas.drawText(subSequence.toString(), f + ((float) this.f63813e), (float) (i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), textPaint);
        }
    }
}
