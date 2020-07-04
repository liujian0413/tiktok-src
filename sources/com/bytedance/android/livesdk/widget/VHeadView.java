package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.bytedance.android.live.p169ui.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class VHeadView extends AppCompatImageView {

    /* renamed from: a */
    private int f25234a;

    /* renamed from: b */
    private int f25235b;

    /* renamed from: c */
    private Bitmap f25236c;

    /* renamed from: d */
    private Boolean f25237d = Boolean.valueOf(false);

    /* renamed from: e */
    private int f25238e;

    /* renamed from: f */
    private Bitmap f25239f;

    /* renamed from: g */
    private boolean f25240g = false;

    /* renamed from: h */
    private Paint f25241h = new Paint();

    public void setAuthor(boolean z) {
        if (this.f25240g != z) {
            this.f25240g = z;
            invalidate();
        }
    }

    public void setVResId(int i) {
        if (this.f25235b != i) {
            this.f25235b = i;
            this.f25236c = null;
            invalidate();
        }
    }

    public VHeadView(Context context) {
        super(context);
        m27458a(context, null);
    }

    public void setVAble(boolean z) {
        if (this.f25237d.booleanValue() != z) {
            this.f25237d = Boolean.valueOf(z);
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f25237d.booleanValue() || this.f25240g) {
            int width = getWidth();
            int height = getHeight();
            int min = Math.min(width, height);
            if (this.f25237d.booleanValue()) {
                if (this.f25236c == null) {
                    Bitmap decodeResource = BitmapFactory.decodeResource(getResources(), this.f25235b);
                    if (decodeResource != null) {
                        this.f25236c = decodeResource;
                    }
                }
                if (this.f25236c != null) {
                    int width2 = (min - this.f25236c.getWidth()) - this.f25234a;
                    int height2 = min - this.f25236c.getHeight();
                    if (width > height) {
                        width2 += (width - height) / 2;
                    } else {
                        height2 += (height - width) / 2;
                    }
                    canvas.drawBitmap(this.f25236c, (float) width2, (float) height2, this.f25241h);
                }
            }
            if (this.f25240g) {
                if (this.f25239f == null) {
                    Bitmap decodeResource2 = BitmapFactory.decodeResource(getResources(), this.f25238e);
                    if (decodeResource2 != null) {
                        this.f25239f = decodeResource2;
                    }
                }
                if (this.f25239f != null) {
                    Bitmap bitmap = this.f25239f;
                    canvas.drawBitmap(bitmap, (float) ((min - bitmap.getWidth()) / 2), (float) (min - this.f25239f.getHeight()), this.f25241h);
                }
            }
        }
    }

    public VHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m27458a(context, attributeSet);
    }

    /* renamed from: a */
    private void m27458a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.VHeadView);
        this.f25235b = obtainStyledAttributes.getResourceId(2, R.drawable.cdf);
        this.f25237d = Boolean.valueOf(obtainStyledAttributes.getBoolean(1, false));
        this.f25238e = obtainStyledAttributes.getResourceId(0, R.drawable.bln);
        obtainStyledAttributes.recycle();
    }

    public VHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m27458a(context, attributeSet);
    }
}
