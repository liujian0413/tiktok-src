package com.p280ss.android.ugc.aweme.hotsearch.p1296d;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.hotsearch.d.a */
public final class C30361a extends ReplacementSpan {

    /* renamed from: h */
    private static int[] f79786h = {R.drawable.bfa, R.drawable.bfl, R.drawable.bfw, R.drawable.bfy, R.drawable.bfz, R.drawable.bg0, R.drawable.bg1, R.drawable.bg2, R.drawable.bg3, R.drawable.bfb, R.drawable.bfc, R.drawable.bfd, R.drawable.bfe, R.drawable.bff, R.drawable.bfg, R.drawable.bfh, R.drawable.bfi, R.drawable.bfj, R.drawable.bfk, R.drawable.bfm, R.drawable.bfn, R.drawable.bfo, R.drawable.bfp, R.drawable.bfq, R.drawable.bfr, R.drawable.bfs, R.drawable.bft, R.drawable.bfu, R.drawable.bfv, R.drawable.bfx};

    /* renamed from: a */
    private int f79787a;

    /* renamed from: b */
    private Drawable f79788b;

    /* renamed from: c */
    private String f79789c;

    /* renamed from: d */
    private int f79790d = C23486n.m77127c(8.5d);

    /* renamed from: e */
    private int f79791e = Color.parseColor("#8b3312");

    /* renamed from: f */
    private Drawable f79792f;

    /* renamed from: g */
    private int f79793g;

    /* renamed from: a */
    private Drawable m99192a() {
        if (this.f79788b == null) {
            this.f79788b = C6399b.m19921a().getResources().getDrawable(R.drawable.yr);
            this.f79788b.setBounds(0, 0, this.f79788b.getIntrinsicWidth(), this.f79788b.getIntrinsicHeight());
        }
        return this.f79788b;
    }

    /* renamed from: a */
    private Drawable m99193a(int i) {
        if (this.f79792f == null) {
            this.f79792f = C6399b.m19921a().getResources().getDrawable(f79786h[i - 1]);
            this.f79792f.setBounds(0, 0, this.f79792f.getIntrinsicWidth(), this.f79792f.getIntrinsicHeight());
        }
        return this.f79792f;
    }

    public C30361a(int i, String str, int i2) {
        this.f79787a = i;
        this.f79789c = str;
        this.f79793g = i2;
    }

    /* renamed from: a */
    private void m99194a(Canvas canvas, float f, int i) {
        Drawable a = m99192a();
        canvas.save();
        canvas.translate(f, (float) (i + C23486n.m77122a((double) this.f79793g)));
        a.draw(canvas);
        Drawable a2 = m99193a(this.f79787a);
        canvas.translate(9.0f, 0.0f);
        a2.draw(canvas);
        canvas.restore();
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Rect bounds = m99192a().getBounds();
        if (TextUtils.isEmpty(this.f79789c)) {
            return bounds.right;
        }
        paint.setTextSize((float) this.f79790d);
        return bounds.right + ((int) paint.measureText(this.f79789c)) + 14;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        float f2 = f;
        int i6 = i3;
        Paint paint2 = paint;
        if (TextUtils.isEmpty(this.f79789c)) {
            m99194a(canvas2, f2, i6);
            return;
        }
        Drawable a = m99192a();
        if (!TextUtils.isEmpty(this.f79789c)) {
            canvas.save();
            canvas2.translate(f2, (float) (C23486n.m77122a((double) this.f79793g) + i6));
            canvas2.translate((float) (a.getBounds().right - 2), 0.0f);
            paint.reset();
            paint2.setTextSize((float) this.f79790d);
            float measureText = paint2.measureText(this.f79789c) + 16.0f;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, measureText, 0.0f, Color.parseColor("#FFD95E"), Color.parseColor("#FFB700"), TileMode.CLAMP);
            paint2.setShader(linearGradient);
            RectF rectF = new RectF(0.0f, (float) (a.getBounds().bottom - C23486n.m77122a(12.5d)), measureText, (float) a.getBounds().bottom);
            float a2 = (float) C23486n.m77122a(2.0d);
            canvas2.drawRoundRect(rectF, a2, a2, paint2);
            float f3 = a2;
            Paint paint3 = paint;
            canvas.drawRect(rectF.left, rectF.top, f3, a2, paint3);
            canvas.drawRect(rectF.left, rectF.bottom - a2, f3, rectF.bottom, paint3);
            paint.reset();
            paint2.setAntiAlias(true);
            paint2.setTypeface(Typeface.DEFAULT_BOLD);
            paint2.setTextSize((float) this.f79790d);
            paint2.setColor(this.f79791e);
            canvas2.drawText(this.f79789c, 8.0f, ((float) a.getBounds().bottom) - (((((((float) a.getBounds().bottom) + paint.getFontMetrics().descent) + ((float) a.getBounds().bottom)) + paint.getFontMetrics().ascent) / 2.0f) - ((rectF.bottom + rectF.top) / 2.0f)), paint2);
            canvas.restore();
        }
        canvas.save();
        canvas2.translate(f2, (float) (C23486n.m77122a((double) this.f79793g) + i6));
        a.draw(canvas2);
        Drawable a3 = m99193a(this.f79787a);
        canvas2.translate(9.0f, 0.0f);
        a3.draw(canvas2);
        canvas.restore();
    }
}
