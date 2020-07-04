package com.p280ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.p280ss.android.ugc.aweme.tools.R$styleable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.view.DmtPlusView */
public final class DmtPlusView extends View {

    /* renamed from: a */
    private final Paint f101626a;

    /* renamed from: b */
    private int f101627b;

    /* renamed from: c */
    private int f101628c;

    /* renamed from: d */
    private int f101629d;

    /* renamed from: e */
    private int f101630e;

    /* renamed from: f */
    private final RectF f101631f;

    /* renamed from: g */
    private final RectF f101632g;

    public DmtPlusView(Context context) {
        this(context, null, 0, 6, null);
    }

    public DmtPlusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setBgColor(int i) {
        this.f101626a.setColor(i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        C7573i.m23587b(canvas, "canvas");
        canvas.drawRoundRect(this.f101631f, (float) this.f101627b, (float) this.f101627b, this.f101626a);
        canvas.drawRoundRect(this.f101632g, (float) this.f101627b, (float) this.f101627b, this.f101626a);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f101629d = MeasureSpec.getSize(i);
        this.f101630e = MeasureSpec.getSize(i2);
        this.f101631f.set(0.0f, (float) ((this.f101630e - this.f101628c) / 2), (float) this.f101629d, (float) ((this.f101630e + this.f101628c) / 2));
        this.f101632g.set((float) ((this.f101629d - this.f101628c) / 2), 0.0f, (float) ((this.f101629d + this.f101628c) / 2), (float) this.f101630e);
    }

    public DmtPlusView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        this.f101626a = new Paint();
        this.f101631f = new RectF();
        this.f101632g = new RectF();
        this.f101626a.setAntiAlias(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.AVDmtView);
            this.f101627b = (int) obtainStyledAttributes.getDimension(29, 0.0f);
            this.f101628c = (int) obtainStyledAttributes.getDimension(22, 0.0f);
        }
    }

    public /* synthetic */ DmtPlusView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
