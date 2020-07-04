package com.p280ss.android.ugc.aweme.photo.setfilter;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.support.p029v7.widget.AppCompatSeekBar;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.tools.avdmtview.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.photo.setfilter.FilterRateSeekBar */
public class FilterRateSeekBar extends AppCompatSeekBar {

    /* renamed from: a */
    private int f90761a;

    /* renamed from: b */
    private float f90762b;

    /* renamed from: c */
    private String f90763c;

    /* renamed from: d */
    private Paint f90764d;

    /* renamed from: e */
    private int f90765e;

    /* renamed from: f */
    private float f90766f;

    /* renamed from: g */
    private float f90767g;

    /* renamed from: h */
    private float f90768h;

    /* renamed from: i */
    private Context f90769i;

    public synchronized int getProgress() {
        int progress;
        progress = super.getProgress();
        this.f90763c = String.valueOf(progress);
        if (this.f90764d != null) {
            this.f90766f = this.f90764d.measureText(this.f90763c);
        }
        return progress;
    }

    public FilterRateSeekBar(Context context) {
        this(context, null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        invalidate();
        return super.onTouchEvent(motionEvent);
    }

    public synchronized void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        synchronized (this) {
            super.onDraw(canvas);
            float width = (float) ((getProgressDrawable().getBounds().width() * getProgress()) / getMax());
            canvas2.drawText(this.f90763c, (width - (this.f90766f / 2.0f)) + this.f90768h, C9738o.m28708b(this.f90769i, 11.0f), this.f90764d);
            float f = this.f90768h;
            float paddingTop = ((float) getPaddingTop()) + C9738o.m28708b(this.f90769i, 3.5f);
            float paddingTop2 = ((float) getPaddingTop()) + C9738o.m28708b(this.f90769i, 10.0f);
            float a = ((float) C9738o.m28691a(this.f90769i)) - this.f90768h;
            m112264a(canvas, f, paddingTop, f, paddingTop2, a, paddingTop);
            float b = paddingTop2 + C9738o.m28708b(this.f90769i, 2.0f);
            float b2 = b + C9738o.m28708b(this.f90769i, 6.5f);
            m112264a(canvas, f, b, f, b2, a, b2);
            m112263a(canvas2, width + this.f90768h, paddingTop2 + C9738o.m28708b(this.f90769i, 0.5f), C9738o.m28708b(this.f90769i, 11.0f));
        }
    }

    public FilterRateSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FilterRateSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f90769i = context;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.FilterRateSeekBar, i, 0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            if (index == 1) {
                this.f90761a = obtainStyledAttributes.getColor(index, -1);
            } else if (index == 3) {
                this.f90762b = obtainStyledAttributes.getDimension(index, 15.0f);
            } else if (index == 2) {
                this.f90765e = obtainStyledAttributes.getInt(index, 1);
            }
        }
        obtainStyledAttributes.recycle();
        this.f90764d = new Paint();
        this.f90764d.setAntiAlias(true);
        this.f90764d.setColor(this.f90761a);
        this.f90764d.setTextSize(this.f90762b);
        Rect rect = new Rect();
        this.f90763c = String.valueOf(getProgress());
        this.f90764d.getTextBounds(this.f90763c, 0, this.f90763c.length(), rect);
        this.f90767g = (float) rect.height();
        this.f90768h = C9738o.m28708b(context, 52.5f);
        if (this.f90765e == 1) {
            setPadding((int) this.f90768h, (int) (this.f90767g + C9738o.m28708b(context, 9.0f)), (int) this.f90768h, 0);
        } else {
            setPadding((int) this.f90768h, 0, (int) this.f90768h, (int) (this.f90767g + C9738o.m28708b(context, 5.0f)));
        }
    }

    /* renamed from: a */
    private void m112263a(Canvas canvas, float f, float f2, float f3) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Style.FILL);
        paint.setColor(getResources().getColor(R.color.a5d));
        canvas.drawCircle(f, f2, f3, paint);
    }

    /* renamed from: a */
    private void m112264a(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Style.FILL);
        paint.setColor(getResources().getColor(R.color.a6c));
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        path.lineTo(f5, f6);
        path.close();
        canvas.drawPath(path, paint);
    }
}
