package com.p280ss.android.ugc.aweme.common.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.profile.R$styleable;

/* renamed from: com.ss.android.ugc.aweme.common.widget.CloseView */
public class CloseView extends View {

    /* renamed from: a */
    private Paint f67675a;

    /* renamed from: b */
    private Path f67676b;

    /* renamed from: c */
    private int f67677c;

    /* renamed from: d */
    private int f67678d;

    /* renamed from: e */
    private int f67679e;

    /* renamed from: f */
    private int f67680f;

    /* renamed from: g */
    private int f67681g;

    /* renamed from: h */
    private int f67682h;

    /* renamed from: i */
    private int f67683i;

    /* renamed from: j */
    private int f67684j;

    /* renamed from: b */
    private void m84488b() {
        this.f67676b = new Path();
    }

    /* renamed from: a */
    private void m84486a() {
        this.f67675a = new Paint();
        this.f67675a.setColor(this.f67677c);
        this.f67675a.setStrokeWidth((float) this.f67678d);
        this.f67675a.setAntiAlias(true);
        this.f67675a.setStyle(Style.STROKE);
        this.f67675a.setStrokeJoin(Join.ROUND);
        this.f67675a.setStrokeCap(Cap.ROUND);
    }

    public CloseView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m84487a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CloseView);
        this.f67677c = obtainStyledAttributes.getColor(0, -16777216);
        this.f67678d = obtainStyledAttributes.getDimensionPixelSize(1, C23486n.m77122a(1.0d));
        obtainStyledAttributes.recycle();
        m84486a();
        m84488b();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f67676b.reset();
        if (this.f67679e == 0 || this.f67680f == 0) {
            this.f67679e = getWidth();
            this.f67680f = getHeight();
        }
        this.f67681g = getPaddingLeft();
        this.f67682h = getPaddingRight();
        this.f67683i = getPaddingTop();
        this.f67684j = getPaddingBottom();
        this.f67676b.moveTo((float) this.f67681g, (float) this.f67683i);
        this.f67676b.lineTo((float) (this.f67679e - this.f67682h), (float) (this.f67680f - this.f67684j));
        this.f67676b.moveTo((float) this.f67681g, (float) (this.f67680f - this.f67684j));
        this.f67676b.lineTo((float) (this.f67679e - this.f67682h), (float) this.f67683i);
        canvas.save();
        canvas.drawPath(this.f67676b, this.f67675a);
        canvas.restore();
    }

    public CloseView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m84487a(attributeSet);
    }
}
