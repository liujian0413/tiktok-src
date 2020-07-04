package com.p280ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint.FontMetrics;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.support.p022v4.view.C0991u;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.p280ss.android.ugc.aweme.common.feed.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.MarqueeView */
public class MarqueeView extends View {

    /* renamed from: a */
    private TextPaint f76530a;

    /* renamed from: b */
    private FontMetrics f76531b;

    /* renamed from: c */
    private String f76532c;

    /* renamed from: d */
    private int f76533d;

    /* renamed from: e */
    private long f76534e;

    /* renamed from: f */
    private float f76535f;

    /* renamed from: g */
    private float f76536g;

    /* renamed from: h */
    private int f76537h;

    /* renamed from: i */
    private long f76538i;

    /* renamed from: j */
    private boolean f76539j;

    /* renamed from: k */
    private int f76540k;

    /* renamed from: b */
    public final void mo74412b() {
        if (this.f76537h != 1) {
            this.f76537h = 1;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f76537h == 0) {
            mo74413c();
        }
    }

    /* renamed from: c */
    public final void mo74413c() {
        if (this.f76537h != 2) {
            this.f76537h = 2;
            this.f76535f = 0.0f;
            this.f76538i = 0;
            invalidate();
        }
    }

    /* renamed from: a */
    public final void mo74411a() {
        if (this.f76537h != 0) {
            if (this.f76537h == 1) {
                this.f76537h = 0;
                invalidate();
                return;
            }
            if (this.f76537h == 2) {
                this.f76535f = 0.0f;
                this.f76538i = 0;
                this.f76537h = 0;
                invalidate();
            }
        }
    }

    public void setSpeed(int i) {
        this.f76533d = i;
    }

    public MarqueeView(Context context) {
        this(context, null);
    }

    public void setText(int i) {
        setText(getResources().getString(i));
    }

    public void setTextColor(int i) {
        if (this.f76530a != null) {
            this.f76530a.setColor(i);
        }
    }

    public void setTextShadow(int i) {
        if (this.f76530a != null) {
            this.f76530a.setShadowLayer(1.0f, 1.0f, 1.0f, i);
        }
    }

    public void setTextSize(int i) {
        if (this.f76530a != null) {
            this.f76530a.setTextSize((float) i);
        }
    }

    public void setText(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        this.f76532c = sb.toString();
        this.f76536g = this.f76530a.measureText(this.f76532c);
        while (this.f76536g < ((float) this.f76540k)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f76532c);
            sb2.append(this.f76532c);
            this.f76532c = sb2.toString();
            this.f76536g = this.f76530a.measureText(this.f76532c);
        }
        this.f76535f = 0.0f;
        this.f76538i = 0;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f76532c)) {
            float f = 0.0f;
            if (this.f76536g != 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f76538i > 0) {
                    float f2 = ((float) ((uptimeMillis - this.f76538i) * ((long) this.f76533d))) / 1000.0f;
                    float f3 = this.f76535f;
                    if (this.f76539j) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                    this.f76535f = f3 + (f2 * ((float) i3));
                    this.f76535f %= this.f76536g;
                }
                if (this.f76537h == 0) {
                    this.f76538i = uptimeMillis;
                }
                this.f76530a.getFontMetrics(this.f76531b);
                while (true) {
                    float measuredWidth = (float) getMeasuredWidth();
                    float f4 = this.f76535f;
                    if (this.f76539j) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    if (f >= measuredWidth + (f4 * ((float) i))) {
                        break;
                    }
                    String str = this.f76532c;
                    float f5 = this.f76535f;
                    if (this.f76539j) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    canvas.drawText(str, f5 + (((float) i2) * f), -this.f76531b.top, this.f76530a);
                    f += this.f76536g;
                }
                if (this.f76537h == 0) {
                    postInvalidateDelayed(this.f76534e);
                }
            }
        }
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void m95300a(Context context, AttributeSet attributeSet) {
        this.f76530a = new TextPaint();
        this.f76530a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MarqueeView);
        this.f76533d = obtainStyledAttributes.getDimensionPixelSize(0, this.f76533d);
        int color = obtainStyledAttributes.getColor(1, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 28);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        this.f76530a.setTextSize((float) dimensionPixelSize);
        this.f76530a.setShadowLayer(1.0f, 1.0f, 1.0f, color2);
        this.f76530a.setColor(color);
        Typeface a = C10832b.m31784a().mo26161a(C10834d.f29331a);
        if (a != null) {
            this.f76530a.setTypeface(a);
        }
        this.f76537h = 2;
        this.f76540k = context.getResources().getDimensionPixelSize(R.dimen.kc);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        super.onMeasure(i, i2);
        this.f76530a.getFontMetrics(this.f76531b);
        int i4 = (int) (this.f76531b.bottom - this.f76531b.top);
        if (!TextUtils.isEmpty(this.f76532c)) {
            i3 = (int) this.f76530a.measureText(this.f76532c);
        } else {
            i3 = 0;
        }
        if (MeasureSpec.getSize(i) <= i3) {
            i3 = MeasureSpec.getSize(i);
        }
        setMeasuredDimension(i3, i4);
        boolean z = true;
        if (C0991u.m4220h(this) != 1) {
            z = false;
        }
        this.f76539j = z;
    }

    public MarqueeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f76531b = new FontMetrics();
        this.f76533d = 25;
        this.f76534e = 16;
        this.f76540k = 0;
        m95300a(context, attributeSet);
    }
}
