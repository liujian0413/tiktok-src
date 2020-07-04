package com.bytedance.android.livesdk.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.R$styleable;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.util.Hashtable;
import java.util.Map;

public class WaveProgressView extends View {

    /* renamed from: a */
    private final Paint f25242a;

    /* renamed from: b */
    private final Map<Float, Path> f25243b;

    /* renamed from: c */
    private int f25244c;

    /* renamed from: d */
    private int f25245d;

    /* renamed from: e */
    private String f25246e;

    /* renamed from: f */
    private int f25247f;

    /* renamed from: g */
    private int f25248g;

    /* renamed from: h */
    private float f25249h;

    /* renamed from: i */
    private float f25250i;

    /* renamed from: j */
    private ValueAnimator f25251j;

    /* renamed from: k */
    private Path f25252k;

    public int getColor() {
        return this.f25248g;
    }

    public float getProgress() {
        return this.f25249h;
    }

    public String getText() {
        return this.f25246e;
    }

    public int getTextSize() {
        return this.f25247f;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.f25252k = null;
        this.f25243b.clear();
        super.onDetachedFromWindow();
    }

    private Path getWavePath() {
        float f = this.f25249h;
        if (!this.f25243b.containsKey(Float.valueOf(f))) {
            Path path = new Path();
            float f2 = 1.0f - f;
            path.moveTo(0.0f, ((float) this.f25245d) * f2);
            float f3 = (float) (this.f25244c / 4);
            float f4 = ((float) this.f25245d) * f2;
            for (int i = 0; i < 2; i++) {
                int i2 = i * 4;
                path.quadTo(((float) (i2 + 1)) * f3, f4 - (((float) this.f25245d) * 0.1f), ((float) (i2 + 2)) * f3, f4);
                path.quadTo(((float) (i2 + 3)) * f3, (((float) this.f25245d) * 0.1f) + f4, ((float) (i2 + 4)) * f3, f4);
            }
            path.lineTo((float) (this.f25244c * 2), (float) this.f25245d);
            path.lineTo(0.0f, (float) this.f25245d);
            path.close();
            this.f25243b.put(Float.valueOf(f), path);
        }
        return (Path) this.f25243b.get(Float.valueOf(f));
    }

    public void setColor(int i) {
        this.f25248g = i;
    }

    public void setText(String str) {
        this.f25246e = str;
    }

    public void setTextSize(int i) {
        this.f25247f = i;
    }

    public WaveProgressView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo22630a(ValueAnimator valueAnimator) {
        this.f25250i = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        postInvalidate();
    }

    public void setProgress(float f) {
        if (f <= 1.0f && f >= 0.0f) {
            this.f25249h = f;
            postInvalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f25244c = getWidth();
        this.f25245d = getHeight();
        this.f25242a.setColor(this.f25248g);
        float measureText = (float) ((int) (((float) (this.f25244c / 2)) - (this.f25242a.measureText(this.f25246e) / 2.0f)));
        float ascent = (float) ((int) (((float) (this.f25245d / 2)) - ((this.f25242a.ascent() + this.f25242a.descent()) / 2.0f)));
        canvas.drawText(this.f25246e, measureText, ascent, this.f25242a);
        if (this.f25252k == null) {
            this.f25252k = new Path();
            this.f25252k.addCircle((float) (this.f25244c / 2), (float) (this.f25245d / 2), (float) (this.f25245d / 2), Direction.CW);
            this.f25252k.close();
        }
        canvas.clipPath(this.f25252k);
        Path wavePath = getWavePath();
        canvas.translate(((float) this.f25244c) * this.f25250i, 0.0f);
        canvas.drawPath(wavePath, this.f25242a);
        canvas.clipPath(wavePath);
        this.f25242a.setColor(-1);
        canvas.drawText(this.f25246e, measureText - (((float) this.f25244c) * this.f25250i), ascent, this.f25242a);
    }

    public WaveProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            i = MeasureSpec.makeMeasureSpec(380, 1073741824);
        }
        if (MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            i2 = MeasureSpec.makeMeasureSpec(380, 1073741824);
        }
        setMeasuredDimension(i, i2);
    }

    public WaveProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25243b = new Hashtable();
        this.f25246e = "";
        this.f25247f = NormalGiftView.ALPHA_180;
        this.f25248g = -16776961;
        this.f25249h = 0.5f;
        this.f25250i = 1.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.WaveProgressView);
        this.f25247f = obtainStyledAttributes.getDimensionPixelSize(2, this.f25247f);
        this.f25248g = obtainStyledAttributes.getColor(0, this.f25248g);
        String string = obtainStyledAttributes.getString(1);
        if (string != null) {
            this.f25246e = string;
        }
        obtainStyledAttributes.recycle();
        this.f25242a = new Paint();
        this.f25242a.setColor(this.f25248g);
        this.f25242a.setTypeface(Typeface.DEFAULT_BOLD);
        this.f25242a.setStyle(Style.FILL);
        this.f25242a.setTextSize((float) this.f25247f);
        this.f25242a.setDither(true);
        this.f25251j = ValueAnimator.ofFloat(new float[]{-1.0f, 0.0f});
        this.f25251j.setDuration(1500);
        this.f25251j.setInterpolator(new LinearInterpolator());
        this.f25251j.setRepeatCount(-1);
        this.f25251j.setRepeatMode(1);
        this.f25251j.addUpdateListener(new C9268m(this));
    }
}
