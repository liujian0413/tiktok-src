package com.bytedance.android.livesdk.gift.dialog.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.utils.C9051ar;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public class GradientStrokeView extends View {

    /* renamed from: a */
    private Paint f21314a;

    /* renamed from: b */
    private Paint f21315b;

    /* renamed from: c */
    private int f21316c;

    /* renamed from: d */
    private RectF f21317d;

    /* renamed from: e */
    private RectF f21318e;

    /* renamed from: f */
    private boolean f21319f;

    /* renamed from: a */
    private void m24208a() {
        int b = (int) C9051ar.m27035b(getContext(), 89.0f);
        int b2 = (int) C9051ar.m27035b(getContext(), 33.0f);
        int b3 = (int) C9051ar.m27035b(getContext(), 1.0f);
        float f = (float) (b3 / 2);
        this.f21316c = (int) C9051ar.m27035b(getContext(), 17.0f);
        float f2 = (float) b;
        float f3 = (float) b2;
        this.f21317d = new RectF(f, f, f2, f3);
        float f4 = 2.0f * f;
        this.f21318e = new RectF(f4, f4, f2 - f, f3 - f);
        this.f21314a = new Paint();
        this.f21314a.setAntiAlias(true);
        this.f21314a.setColor(getResources().getColor(R.color.akb));
        this.f21315b = new Paint();
        this.f21315b.setAntiAlias(true);
        LinearGradient linearGradient = new LinearGradient(0.0f, f3, f2, 0.0f, getResources().getColor(R.color.akd), getResources().getColor(R.color.akc), TileMode.CLAMP);
        this.f21315b.setStyle(Style.STROKE);
        this.f21315b.setShader(linearGradient);
        this.f21315b.setStrokeWidth((float) b3);
    }

    public GradientStrokeView(Context context) {
        this(context, null);
    }

    public void setShowStroke(boolean z) {
        this.f21319f = z;
        postInvalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRoundRect(this.f21317d, (float) this.f21316c, (float) this.f21316c, this.f21314a);
        if (this.f21319f) {
            canvas.drawRoundRect(this.f21318e, (float) this.f21316c, (float) this.f21316c, this.f21315b);
        }
    }

    public GradientStrokeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GradientStrokeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m24208a();
    }
}
