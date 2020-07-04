package com.p280ss.android.ugc.aweme.music.p1410ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.drawable.Drawable;
import android.text.style.ReplacementSpan;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;

/* renamed from: com.ss.android.ugc.aweme.music.ui.an */
public final class C33938an extends ReplacementSpan {

    /* renamed from: a */
    private final Paint f88553a = new Paint();

    /* renamed from: b */
    private int f88554b;

    /* renamed from: c */
    private Drawable f88555c;

    /* renamed from: d */
    private float f88556d;

    /* renamed from: e */
    private float f88557e;

    /* renamed from: f */
    private float f88558f;

    /* renamed from: g */
    private float f88559g;

    /* renamed from: h */
    private float f88560h;

    /* renamed from: i */
    private float f88561i;

    /* renamed from: a */
    public final void mo86598a(float f) {
        this.f88553a.setTextSize(f);
    }

    public C33938an(Drawable drawable) {
        this.f88553a.setStyle(Style.STROKE);
        this.f88553a.setColor(-16777216);
        this.f88553a.setAntiAlias(true);
        this.f88553a.setTypeface(C10832b.m31784a().mo26161a(C10834d.f29337g));
        this.f88555c = drawable;
    }

    /* renamed from: a */
    public final void mo86601a(int i) {
        this.f88553a.setColor(i);
    }

    /* renamed from: a */
    public final void mo86602a(Style style) {
        this.f88553a.setStyle(style);
    }

    /* renamed from: a */
    public final void mo86599a(float f, float f2) {
        this.f88560h = f;
        this.f88561i = 0.0f;
    }

    /* renamed from: a */
    public final void mo86600a(float f, float f2, float f3, float f4) {
        this.f88556d = f;
        this.f88557e = f2;
        this.f88559g = f3;
        this.f88558f = f4;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        this.f88554b = (int) (this.f88553a.measureText(charSequence, i, i2) + this.f88556d + this.f88559g);
        return (int) (((float) this.f88554b) + this.f88560h + this.f88561i);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        this.f88555c.setBounds((int) (this.f88560h + f), i3, (int) (((float) this.f88554b) + f + this.f88560h + this.f88561i), i5);
        Canvas canvas2 = canvas;
        this.f88555c.draw(canvas);
        canvas2.drawText(charSequence, i, i2, f + this.f88556d + this.f88560h, ((float) i4) - (this.f88559g / 2.0f), this.f88553a);
    }
}
