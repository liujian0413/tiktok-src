package com.p280ss.android.ugc.aweme.account.p982ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.support.p022v4.content.C0683b;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.account.R$styleable;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.ui.ClearButton */
public final class ClearButton extends View {

    /* renamed from: a */
    public static final C22247a f59408a = new C22247a(null);

    /* renamed from: b */
    private Paint f59409b;

    /* renamed from: c */
    private Paint f59410c;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.ClearButton$a */
    public static final class C22247a {
        private C22247a() {
        }

        public /* synthetic */ C22247a(C7571f fVar) {
            this();
        }
    }

    public final void setButtonBackgroundColor(int i) {
        this.f59409b.setColor(i);
    }

    public final void setCrossLineColor(int i) {
        this.f59410c.setColor(i);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            m73760a(canvas);
        }
    }

    /* renamed from: a */
    private final void m73760a(Canvas canvas) {
        if (this.f59410c.getStrokeWidth() <= 0.0f) {
            this.f59410c.setStrokeWidth(((float) getHeight()) * 0.1f);
        }
        float height = ((float) getHeight()) / 2.0f;
        float height2 = ((float) getHeight()) / 2.0f;
        float height3 = ((float) getHeight()) * 0.5f;
        float height4 = (float) getHeight();
        float width = ((float) (getWidth() - getPaddingRight())) - ((height4 - height3) / 2.0f);
        float f = width - height3;
        float f2 = height3 / 2.0f;
        float f3 = height - f2;
        float f4 = height + f2;
        canvas.drawCircle(height2, height, height4 / 2.0f, this.f59409b);
        canvas.save();
        canvas.rotate(45.0f, height2, height);
        canvas.drawLine(f, height, width, height, this.f59410c);
        canvas.drawLine(height2, f3, height2, f4, this.f59410c);
        canvas.restore();
    }

    public ClearButton(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f59409b = new Paint();
        this.f59410c = new Paint();
        this.f59409b.setStyle(Style.FILL);
        this.f59409b.setAntiAlias(true);
        this.f59410c.setStyle(Style.STROKE);
        this.f59410c.setStrokeCap(Cap.ROUND);
        this.f59410c.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ClearButton);
        setButtonBackgroundColor(obtainStyledAttributes.getColor(0, C0683b.m2912c(context, R.color.a_j)));
        setCrossLineColor(obtainStyledAttributes.getColor(1, C0683b.m2912c(context, 17170443)));
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ ClearButton(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        this(context, null, 0);
    }
}
