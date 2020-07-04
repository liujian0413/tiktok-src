package com.zhihu.matisse.internal.p1856ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.p022v4.content.res.C0700e;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.zhihu.matisse.internal.ui.widget.CheckView */
public class CheckView extends View {

    /* renamed from: a */
    private boolean f121534a;

    /* renamed from: b */
    private boolean f121535b;

    /* renamed from: c */
    private int f121536c;

    /* renamed from: d */
    private Paint f121537d;

    /* renamed from: e */
    private Paint f121538e;

    /* renamed from: f */
    private TextPaint f121539f;

    /* renamed from: g */
    private Paint f121540g;

    /* renamed from: h */
    private Drawable f121541h;

    /* renamed from: i */
    private float f121542i;

    /* renamed from: j */
    private Rect f121543j;

    /* renamed from: k */
    private boolean f121544k = true;

    /* renamed from: c */
    private void m147904c() {
        if (this.f121539f == null) {
            this.f121539f = new TextPaint();
            this.f121539f.setAntiAlias(true);
            this.f121539f.setColor(-1);
            this.f121539f.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
            this.f121539f.setTextSize(this.f121542i * 12.0f);
        }
    }

    private Rect getCheckRect() {
        if (this.f121543j == null) {
            int i = (int) (((this.f121542i * 48.0f) / 2.0f) - ((this.f121542i * 16.0f) / 2.0f));
            float f = (float) i;
            this.f121543j = new Rect(i, i, (int) ((this.f121542i * 48.0f) - f), (int) ((this.f121542i * 48.0f) - f));
        }
        return this.f121543j;
    }

    /* renamed from: a */
    private void m147901a() {
        if (this.f121540g == null) {
            this.f121540g = new Paint();
            this.f121540g.setAntiAlias(true);
            Paint paint = this.f121540g;
            float f = (this.f121542i * 48.0f) / 2.0f;
            RadialGradient radialGradient = new RadialGradient(f, (this.f121542i * 48.0f) / 2.0f, this.f121542i * 19.0f, new int[]{Color.parseColor("#00000000"), Color.parseColor("#0D000000"), Color.parseColor("#0D000000"), Color.parseColor("#00000000")}, new float[]{0.21052632f, 0.5263158f, 0.68421054f, 1.0f}, TileMode.CLAMP);
            paint.setShader(radialGradient);
        }
    }

    /* renamed from: b */
    private void m147903b() {
        if (this.f121538e == null) {
            this.f121538e = new Paint();
            this.f121538e.setAntiAlias(true);
            this.f121538e.setStyle(Style.FILL);
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.ox});
            int color = obtainStyledAttributes.getColor(0, C0700e.m2983b(getResources(), R.color.azx, getContext().getTheme()));
            obtainStyledAttributes.recycle();
            this.f121538e.setColor(color);
        }
    }

    public void setCountable(boolean z) {
        this.f121534a = z;
    }

    public CheckView(Context context) {
        super(context);
        m147902a(context);
    }

    public void setEnabled(boolean z) {
        if (this.f121544k != z) {
            this.f121544k = z;
            invalidate();
        }
    }

    public void setChecked(boolean z) {
        if (!this.f121534a) {
            this.f121535b = z;
            invalidate();
            return;
        }
        throw new IllegalStateException("CheckView is countable, call setCheckedNum() instead.");
    }

    public void setCheckedNum(int i) {
        if (!this.f121534a) {
            throw new IllegalStateException("CheckView is not countable, call setChecked() instead.");
        } else if (i == Integer.MIN_VALUE || i > 0) {
            this.f121536c = i;
            invalidate();
        } else {
            throw new IllegalArgumentException("checked num can't be negative.");
        }
    }

    /* renamed from: a */
    private void m147902a(Context context) {
        this.f121542i = context.getResources().getDisplayMetrics().density;
        this.f121537d = new Paint();
        this.f121537d.setAntiAlias(true);
        this.f121537d.setStyle(Style.STROKE);
        this.f121537d.setXfermode(new PorterDuffXfermode(Mode.SRC_OVER));
        this.f121537d.setStrokeWidth(this.f121542i * 3.0f);
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(new int[]{R.attr.oy});
        int color = obtainStyledAttributes.getColor(0, C0700e.m2983b(getResources(), R.color.azy, getContext().getTheme()));
        obtainStyledAttributes.recycle();
        this.f121537d.setColor(color);
        this.f121541h = C0700e.m2981a(context.getResources(), R.drawable.a52, context.getTheme());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        m147901a();
        canvas.drawCircle((this.f121542i * 48.0f) / 2.0f, (this.f121542i * 48.0f) / 2.0f, this.f121542i * 19.0f, this.f121540g);
        canvas.drawCircle((this.f121542i * 48.0f) / 2.0f, (this.f121542i * 48.0f) / 2.0f, this.f121542i * 11.5f, this.f121537d);
        if (this.f121534a) {
            if (this.f121536c != Integer.MIN_VALUE) {
                m147903b();
                canvas.drawCircle((this.f121542i * 48.0f) / 2.0f, (this.f121542i * 48.0f) / 2.0f, this.f121542i * 11.0f, this.f121538e);
                m147904c();
                String valueOf = String.valueOf(this.f121536c);
                canvas.drawText(valueOf, (float) (((int) (((float) canvas.getWidth()) - this.f121539f.measureText(valueOf))) / 2), (float) (((int) ((((float) canvas.getHeight()) - this.f121539f.descent()) - this.f121539f.ascent())) / 2), this.f121539f);
            }
        } else if (this.f121535b) {
            m147903b();
            canvas.drawCircle((this.f121542i * 48.0f) / 2.0f, (this.f121542i * 48.0f) / 2.0f, this.f121542i * 11.0f, this.f121538e);
            this.f121541h.setBounds(getCheckRect());
            this.f121541h.draw(canvas);
        }
        if (this.f121544k) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        setAlpha(f);
    }

    public CheckView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m147902a(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int makeMeasureSpec = MeasureSpec.makeMeasureSpec((int) (this.f121542i * 48.0f), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public CheckView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m147902a(context);
    }
}
