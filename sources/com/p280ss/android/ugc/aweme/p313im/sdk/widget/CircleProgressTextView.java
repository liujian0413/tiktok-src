package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.p313im.sdk.R$styleable;
import java.text.NumberFormat;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.CircleProgressTextView */
public class CircleProgressTextView extends View {

    /* renamed from: a */
    private boolean f83490a;

    /* renamed from: b */
    private float f83491b;

    /* renamed from: c */
    private float f83492c;

    /* renamed from: d */
    private float f83493d;

    /* renamed from: e */
    private String f83494e;

    /* renamed from: f */
    private int f83495f;

    /* renamed from: g */
    private int f83496g;

    /* renamed from: h */
    private int f83497h;

    /* renamed from: i */
    private Paint f83498i;

    /* renamed from: j */
    private Paint f83499j;

    /* renamed from: k */
    private Paint f83500k;

    /* renamed from: l */
    private RectF f83501l;

    /* renamed from: m */
    private NumberFormat f83502m;

    /* renamed from: a */
    private void m103809a() {
        this.f83498i = new Paint(1);
        this.f83498i.setStyle(Style.STROKE);
        this.f83499j = new Paint(1);
        this.f83499j.setStyle(Style.STROKE);
        this.f83500k = new Paint(1);
        this.f83501l = new RectF();
    }

    /* renamed from: b */
    private void m103813b() {
        setProgressWidth(this.f83492c);
        setProgressColor(this.f83495f);
        setHintProgressWidth(this.f83492c);
        setHintProgressColor(this.f83496g);
        setTextSize(this.f83493d);
        setTextColor(this.f83497h);
    }

    /* renamed from: c */
    private void m103815c() {
        if (!this.f83490a) {
            int width = getWidth();
            int height = getHeight();
            if (this.f83501l == null) {
                this.f83501l = new RectF();
            }
            float f = this.f83492c / 2.0f;
            this.f83501l.left = f;
            this.f83501l.right = ((float) width) - f;
            this.f83501l.top = f;
            this.f83501l.bottom = ((float) height) - f;
            this.f83490a = true;
        }
    }

    public void setText(String str) {
        this.f83494e = str;
    }

    public CircleProgressTextView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        m103811a(canvas);
        m103814b(canvas);
    }

    public void setHintProgressWidth(float f) {
        this.f83499j.setStrokeWidth(f);
    }

    /* renamed from: a */
    private int m103808a(int i) {
        return (int) ((((float) i) - this.f83500k.measureText(this.f83494e)) / 2.0f);
    }

    public void setProgressWidth(float f) {
        this.f83492c = f;
        this.f83498i.setStrokeWidth(this.f83492c);
    }

    public void setTextSize(float f) {
        this.f83493d = f;
        this.f83500k.setTextSize(this.f83493d);
    }

    /* renamed from: b */
    private int m103812b(int i) {
        return (int) ((((float) i) / 2.0f) - ((this.f83500k.descent() + this.f83500k.ascent()) / 2.0f));
    }

    public void setHintProgressColor(int i) {
        this.f83496g = i;
        if (this.f83499j == null) {
            this.f83499j = new Paint(1);
        }
        this.f83499j.setStrokeWidth(this.f83492c);
        this.f83499j.setColor(this.f83496g);
    }

    public void setProgressColor(int i) {
        this.f83495f = i;
        if (this.f83498i == null) {
            this.f83498i = new Paint(1);
        }
        this.f83498i.setColor(this.f83495f);
    }

    public void setTextColor(int i) {
        this.f83497h = i;
        if (this.f83500k == null) {
            this.f83500k = new Paint(1);
        }
        this.f83500k.setColor(this.f83497h);
    }

    public void setProgress(double d) {
        if (d > 1.0d) {
            d = 1.0d;
        }
        double max = Math.max(d, 0.0d);
        if (this.f83502m == null) {
            this.f83502m = NumberFormat.getPercentInstance();
            this.f83502m.setMinimumFractionDigits(0);
        }
        this.f83491b = (float) max;
        setText(this.f83502m.format(max));
        postInvalidate();
    }

    /* renamed from: b */
    private void m103814b(Canvas canvas) {
        canvas.drawText(this.f83494e, (float) m103808a(canvas.getWidth()), (float) m103812b(canvas.getHeight()), this.f83500k);
    }

    /* renamed from: a */
    private void m103811a(Canvas canvas) {
        m103815c();
        this.f83498i.setColor(this.f83495f);
        this.f83499j.setColor(this.f83496g);
        float f = this.f83491b * 360.0f;
        canvas.drawArc(this.f83501l, -90.0f, f, false, this.f83498i);
        canvas.drawArc(this.f83501l, f - 0.049804688f, 360.0f - f, false, this.f83499j);
    }

    public CircleProgressTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m103810a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CircleProgressTextView);
        this.f83492c = (float) obtainStyledAttributes.getDimensionPixelSize(2, 10);
        this.f83495f = obtainStyledAttributes.getColor(1, -1);
        this.f83493d = (float) obtainStyledAttributes.getDimensionPixelSize(4, 15);
        this.f83497h = obtainStyledAttributes.getColor(3, -16776961);
        this.f83496g = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        m103813b();
    }

    public CircleProgressTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f83492c = 10.0f;
        this.f83493d = 20.0f;
        this.f83494e = "";
        this.f83495f = -1;
        this.f83497h = -16776961;
        m103809a();
        m103810a(context, attributeSet);
    }
}
