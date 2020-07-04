package com.p280ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.view.View;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.audiorecord.Point;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Stack;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.a */
public final class C39471a extends View {

    /* renamed from: a */
    private final float f102454a;

    /* renamed from: b */
    private final Stack<Point> f102455b = new Stack<>();

    /* renamed from: c */
    private int f102456c = -1;

    /* renamed from: d */
    private Paint f102457d = new Paint();

    /* renamed from: e */
    private int f102458e = 1;

    /* renamed from: f */
    private float f102459f = 1.0f;

    public final int getCoverColor() {
        return this.f102456c;
    }

    public final int getMMax() {
        return this.f102458e;
    }

    public final Paint getMPaint() {
        return this.f102457d;
    }

    public final Stack<Point> getMStack() {
        return this.f102455b;
    }

    public final float getPADDING_BORDER() {
        return this.f102454a;
    }

    public final float getPadding() {
        return this.f102459f;
    }

    public final void setCoverColor(int i) {
        this.f102456c = i;
    }

    public final void setMMax(int i) {
        this.f102458e = i;
    }

    public final void setPadding(float f) {
        this.f102459f = f;
    }

    public final void setMPaint(Paint paint) {
        C7573i.m23587b(paint, "<set-?>");
        this.f102457d = paint;
    }

    public C39471a(Context context) {
        C7573i.m23587b(context, "mContext");
        super(context);
        setBackgroundResource(R.drawable.k4);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Point point : this.f102455b) {
            double x = (double) point.getX();
            double d = (double) this.f102458e;
            Double.isNaN(x);
            Double.isNaN(d);
            double d2 = x / d;
            double width = (double) getWidth();
            Double.isNaN(width);
            float f = (float) (d2 * width);
            double y = (double) point.getY();
            double d3 = (double) this.f102458e;
            Double.isNaN(y);
            Double.isNaN(d3);
            double d4 = y / d3;
            double width2 = (double) getWidth();
            Double.isNaN(width2);
            float f2 = (float) (d4 * width2);
            if (canvas != null) {
                canvas.drawRect(f, 0.0f, f2, (float) getHeight(), this.f102457d);
            }
        }
    }

    /* renamed from: a */
    public final void mo98299a(int i, int i2) {
        this.f102456c = i;
        this.f102457d.setColor(this.f102456c);
        this.f102457d.setStyle(Style.FILL);
        this.f102458e = i2;
        this.f102459f = C9738o.m28708b(getContext(), this.f102454a);
    }
}
