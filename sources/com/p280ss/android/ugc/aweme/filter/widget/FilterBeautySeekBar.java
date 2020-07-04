package com.p280ss.android.ugc.aweme.filter.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p029v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.themechange.base.C42111b;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar */
public class FilterBeautySeekBar extends AppCompatSeekBar {

    /* renamed from: a */
    protected String f77341a;

    /* renamed from: b */
    protected Paint f77342b;

    /* renamed from: c */
    private float f77343c;

    /* renamed from: d */
    private float f77344d;

    /* renamed from: e */
    private float f77345e;

    /* renamed from: f */
    private float f77346f;

    /* renamed from: g */
    private float f77347g;

    /* renamed from: h */
    private float f77348h;

    /* renamed from: i */
    private float f77349i;

    /* renamed from: j */
    private int f77350j;

    /* renamed from: k */
    private boolean f77351k;

    /* renamed from: l */
    private int f77352l;

    /* renamed from: m */
    private int f77353m;

    /* renamed from: n */
    private float f77354n;

    /* renamed from: o */
    private Paint f77355o;

    public synchronized int getProgress() {
        int progress;
        progress = super.getProgress();
        this.f77341a = String.valueOf(progress);
        if (this.f77342b != null) {
            this.f77344d = this.f77342b.measureText(this.f77341a);
        }
        return progress;
    }

    public FilterBeautySeekBar(Context context) {
        this(context, null, 0);
    }

    public void setDefaultDotProgress(int i) {
        this.f77352l = i;
        invalidate();
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Rect bounds = getProgressDrawable().getBounds();
        canvas.drawText(this.f77341a, (((float) ((bounds.width() * getProgress()) / getMax())) - (this.f77344d / 2.0f)) + this.f77345e, m96229a(getContext(), 10.0f - this.f77349i), this.f77342b);
        if (this.f77352l != -1 && this.f77351k) {
            canvas.drawCircle(((float) ((bounds.width() * this.f77352l) / 100)) + m96229a(getContext(), this.f77354n) + this.f77345e, (float) (getHeight() / 2), m96229a(getContext(), this.f77354n), this.f77355o);
        }
    }

    public FilterBeautySeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private static float m96229a(Context context, float f) {
        return (f * context.getResources().getDisplayMetrics().density) + 0.5f;
    }

    public FilterBeautySeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f77341a = "";
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FilterBeautySeekBar, i, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        boolean z = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 5) {
                this.f77350j = obtainStyledAttributes.getColor(index, -1);
            } else {
                if (index == 6) {
                    this.f77343c = obtainStyledAttributes.getDimension(index, 15.0f);
                }
                if (index == 10) {
                    z = obtainStyledAttributes.getBoolean(index, false);
                }
            }
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.f77345e = obtainStyledAttributes.getDimension(4, 0.0f);
        } else {
            this.f77345e = m96229a(context, 10.0f);
        }
        if (obtainStyledAttributes.hasValue(7)) {
            this.f77346f = obtainStyledAttributes.getDimension(7, 0.0f);
        } else {
            this.f77346f = this.f77345e;
        }
        if (obtainStyledAttributes.hasValue(11)) {
            this.f77347g = obtainStyledAttributes.getDimension(11, 0.0f);
        } else {
            this.f77347g = m96229a(context, 13.0f);
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.f77348h = obtainStyledAttributes.getDimension(0, 0.0f);
        } else {
            this.f77348h = this.f77347g;
        }
        if (obtainStyledAttributes.hasValue(9)) {
            this.f77349i = obtainStyledAttributes.getDimension(9, 0.0f);
        }
        this.f77351k = obtainStyledAttributes.getBoolean(8, false);
        this.f77352l = obtainStyledAttributes.getInt(2, -1);
        this.f77353m = obtainStyledAttributes.getColor(1, -1);
        this.f77354n = obtainStyledAttributes.getFloat(3, 2.5f);
        obtainStyledAttributes.recycle();
        if (z) {
            this.f77350j = C42111b.f109618a.mo103546b(false);
        }
        this.f77342b = new Paint();
        this.f77342b.setAntiAlias(true);
        this.f77342b.setColor(this.f77350j);
        this.f77342b.setTextSize(this.f77343c);
        Rect rect = new Rect();
        this.f77341a = String.valueOf(getProgress());
        this.f77342b.getTextBounds(this.f77341a, 0, this.f77341a.length(), rect);
        this.f77355o = new Paint();
        this.f77355o.setAntiAlias(true);
        this.f77355o.setColor(this.f77353m);
        setPadding((int) this.f77345e, (int) this.f77347g, (int) this.f77346f, (int) this.f77348h);
    }
}
