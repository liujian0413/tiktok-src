package com.p280ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.shortvideo.cutmusic.C39312e.C39314b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.b */
public final class C39308b {

    /* renamed from: a */
    public int f102102a;

    /* renamed from: b */
    public int f102103b;

    /* renamed from: c */
    public boolean f102104c = true;

    /* renamed from: d */
    private int f102105d;

    /* renamed from: e */
    private int f102106e;

    /* renamed from: f */
    private int f102107f;

    /* renamed from: g */
    private int f102108g;

    /* renamed from: h */
    private Paint f102109h;

    /* renamed from: i */
    private float[] f102110i = new float[0];

    /* renamed from: j */
    private int f102111j = -1;

    /* renamed from: k */
    private Paint f102112k;

    /* renamed from: a */
    public final boolean mo97870a() {
        return C39314b.m125640a(this.f102110i);
    }

    public C39308b() {
    }

    /* renamed from: a */
    public final void mo97864a(int i) {
        this.f102111j = i;
        Paint paint = this.f102109h;
        if (paint == null) {
            C7573i.m23583a("mPaint");
        }
        paint.setColor(i);
    }

    public C39308b(Context context) {
        C7573i.m23587b(context, "context");
        mo97866a(context);
    }

    /* renamed from: a */
    public final void mo97869a(float[] fArr) {
        if (C39314b.m125640a(fArr)) {
            if (fArr == null) {
                C7573i.m23580a();
            }
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            C7573i.m23582a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
            this.f102110i = copyOf;
        }
    }

    /* renamed from: a */
    public final void mo97867a(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        if (this.f102104c) {
            float f = (float) ((this.f102107f / 2) + this.f102103b);
            float f2 = (float) this.f102105d;
            float f3 = (float) ((this.f102107f / 2) + this.f102103b);
            Paint paint = this.f102112k;
            if (paint == null) {
                C7573i.m23583a("centerLinePaint");
            }
            canvas.drawLine(0.0f, f, f2, f3, paint);
        }
        int length = this.f102110i.length;
        for (int i = 0; i < length; i++) {
            int i2 = (int) (this.f102110i[i] * ((float) this.f102107f));
            int i3 = ((this.f102106e + this.f102102a) * i) + this.f102102a;
            int i4 = ((this.f102107f - i2) / 2) + this.f102103b;
            RectF rectF = new RectF((float) i3, (float) i4, (float) (this.f102106e + i3), (float) (i2 + i4));
            float f4 = (float) this.f102108g;
            float f5 = (float) this.f102108g;
            Paint paint2 = this.f102109h;
            if (paint2 == null) {
                C7573i.m23583a("mPaint");
            }
            canvas.drawRoundRect(rectF, f4, f5, paint2);
        }
    }

    /* renamed from: a */
    public final void mo97866a(Context context) {
        C7573i.m23587b(context, "context");
        this.f102109h = new Paint();
        Paint paint = this.f102109h;
        if (paint == null) {
            C7573i.m23583a("mPaint");
        }
        paint.setColor(this.f102111j);
        Paint paint2 = this.f102109h;
        if (paint2 == null) {
            C7573i.m23583a("mPaint");
        }
        paint2.setStyle(Style.FILL);
        Paint paint3 = this.f102109h;
        if (paint3 == null) {
            C7573i.m23583a("mPaint");
        }
        paint3.setAntiAlias(true);
        this.f102112k = new Paint();
        if (C6399b.m19946v()) {
            Paint paint4 = this.f102112k;
            if (paint4 == null) {
                C7573i.m23583a("centerLinePaint");
            }
            paint4.setColor(context.getResources().getColor(R.color.i3));
        } else {
            Paint paint5 = this.f102112k;
            if (paint5 == null) {
                C7573i.m23583a("centerLinePaint");
            }
            paint5.setColor(context.getResources().getColor(R.color.ho));
        }
        Paint paint6 = this.f102112k;
        if (paint6 == null) {
            C7573i.m23583a("centerLinePaint");
        }
        paint6.setStrokeWidth((float) ((int) C9738o.m28708b(context, 1.0f)));
        Paint paint7 = this.f102112k;
        if (paint7 == null) {
            C7573i.m23583a("centerLinePaint");
        }
        paint7.setStyle(Style.FILL);
        Paint paint8 = this.f102112k;
        if (paint8 == null) {
            C7573i.m23583a("centerLinePaint");
        }
        paint8.setAntiAlias(true);
        this.f102108g = (int) C9738o.m28708b(context, 3.0f);
        this.f102102a = (int) C9738o.m28708b(context, 3.0f);
        this.f102106e = (int) C9738o.m28708b(context, 2.0f);
    }

    /* renamed from: a */
    public final void mo97865a(int i, int i2) {
        this.f102105d = i;
        this.f102107f = i2;
        this.f102107f -= this.f102103b * 2;
    }

    /* renamed from: a */
    public final void mo97868a(Canvas canvas, Paint paint) {
        C7573i.m23587b(canvas, "canvas");
        C7573i.m23587b(paint, "paint");
        int length = this.f102110i.length;
        for (int i = 0; i < length; i++) {
            int i2 = (int) (this.f102110i[i] * ((float) this.f102107f));
            int i3 = ((this.f102106e + this.f102102a) * i) + this.f102102a;
            int i4 = ((this.f102107f - i2) / 2) + this.f102103b;
            canvas.drawRoundRect(new RectF((float) i3, (float) i4, (float) (this.f102106e + i3), (float) (i2 + i4)), (float) this.f102108g, (float) this.f102108g, paint);
        }
    }
}
