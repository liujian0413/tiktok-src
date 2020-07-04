package com.p280ss.android.ugc.asve.p758e;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.p280ss.android.vesdk.model.BefTextLayout;

/* renamed from: com.ss.android.ugc.asve.e.a */
public final class C15457a {

    /* renamed from: a */
    public int f39760a;

    /* renamed from: b */
    public int f39761b;

    /* renamed from: c */
    public int f39762c;

    /* renamed from: d */
    private TextPaint f39763d = new TextPaint();

    /* renamed from: e */
    private int f39764e;

    /* renamed from: f */
    private int f39765f;

    /* renamed from: g */
    private long f39766g;

    /* renamed from: h */
    private long f39767h;

    /* renamed from: i */
    private int f39768i;

    /* renamed from: j */
    private float f39769j;

    /* renamed from: k */
    private String f39770k;

    public C15457a(BefTextLayout befTextLayout) {
        this.f39760a = befTextLayout.getLineWidth();
        this.f39764e = befTextLayout.getLineCount();
        this.f39769j = befTextLayout.getLineHeight();
        this.f39765f = befTextLayout.getSplit();
        this.f39768i = befTextLayout.getCharSize();
        this.f39766g = befTextLayout.getBackColor();
        this.f39767h = befTextLayout.getTextColor();
        this.f39770k = befTextLayout.getFamilyName();
        this.f39763d.setAntiAlias(true);
        this.f39763d.setTextSize((float) befTextLayout.getCharSize());
        this.f39763d.setTypeface(Typeface.create(this.f39770k, 0));
        this.f39763d.setColor(((((int) this.f39767h) >> 8) & 16777215) | ((((int) this.f39767h) << 24) & -16777216));
        if (VERSION.SDK_INT >= 21) {
            this.f39763d.setLetterSpacing((float) befTextLayout.getLetterSpacing());
        }
        this.f39763d.setTextAlign(Align.LEFT);
    }

    /* renamed from: a */
    public final Bitmap mo39009a(String str) {
        StaticLayout staticLayout;
        int i;
        if (this.f39765f != 2) {
            staticLayout = new StaticLayout(str, this.f39763d, this.f39760a, Alignment.ALIGN_NORMAL, this.f39769j, 0.0f, false);
        } else {
            String str2 = str;
            staticLayout = new StaticLayout(str2, 0, str.length(), this.f39763d, this.f39760a, Alignment.ALIGN_NORMAL, this.f39769j, 0.0f, false, TruncateAt.END, this.f39760a * this.f39764e);
        }
        if (this.f39764e == 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = this.f39764e;
        }
        this.f39762c = Math.min(i, staticLayout.getLineCount());
        Bitmap createBitmap = Bitmap.createBitmap(staticLayout.getWidth(), staticLayout.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(((((int) this.f39766g) >> 8) & 16777215) | ((((int) this.f39766g) << 24) & -16777216));
        staticLayout.draw(canvas);
        this.f39761b = Math.min(Math.round((((float) this.f39762c) * this.f39769j * ((float) this.f39768i)) + this.f39763d.getFontMetrics().descent), createBitmap.getHeight());
        return Bitmap.createBitmap(createBitmap, 0, 0, this.f39760a, this.f39761b);
    }
}
