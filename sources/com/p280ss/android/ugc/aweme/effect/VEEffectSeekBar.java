package com.p280ss.android.ugc.aweme.effect;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.bytedance.common.utility.C9738o;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.effect.VEEffectSeekBar */
public class VEEffectSeekBar extends View {

    /* renamed from: a */
    private float f72171a;

    /* renamed from: b */
    private int f72172b;

    /* renamed from: c */
    private int f72173c;

    /* renamed from: d */
    private Paint f72174d;

    /* renamed from: e */
    private Paint f72175e;

    /* renamed from: f */
    private ArrayList<EffectPointModel> f72176f;

    /* renamed from: g */
    private boolean f72177g;

    /* renamed from: h */
    private RectF f72178h;

    /* renamed from: i */
    private RectF f72179i;

    /* renamed from: j */
    private int f72180j;

    /* renamed from: k */
    private int f72181k;

    /* renamed from: l */
    private int f72182l;

    /* renamed from: m */
    private boolean f72183m;

    /* renamed from: a */
    private void m89683a() {
        this.f72172b = C27421d.f72341b;
        this.f72173c = (int) C9738o.m28708b(getContext(), 5.0f);
        this.f72174d = new Paint();
        this.f72174d.setAntiAlias(true);
        this.f72175e = new Paint();
        this.f72175e.setAntiAlias(true);
        this.f72176f = new ArrayList<>();
        this.f72179i = new RectF();
    }

    public void setFromEnd(boolean z) {
        this.f72177g = z;
    }

    public VEEffectSeekBar(Context context) {
        this(context, null);
    }

    public void setEffectPointModels(ArrayList<EffectPointModel> arrayList) {
        this.f72176f = arrayList;
        postInvalidate();
    }

    /* renamed from: a */
    public final void mo70412a(boolean z) {
        if (this.f72183m != z) {
            this.f72183m = z;
            invalidate();
        }
    }

    public void setNormalColor(int i) {
        this.f72181k = i;
        if (!this.f72183m) {
            invalidate();
        }
    }

    public void setOverlayColor(int i) {
        if (this.f72182l != i) {
            this.f72182l = i;
            invalidate();
        }
    }

    public void setTime(int i) {
        this.f72180j = i;
        this.f72171a = ((float) this.f72172b) / ((float) i);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f72183m) {
            this.f72174d.setAlpha(230);
            this.f72174d.setColor(this.f72182l);
            canvas.drawRect(this.f72178h, this.f72174d);
            return;
        }
        this.f72174d.setColor(this.f72181k);
        canvas.drawRoundRect(this.f72178h, (float) (this.f72173c / 2), (float) (this.f72173c / 2), this.f72174d);
        for (int i = 0; i < this.f72176f.size(); i++) {
            EffectPointModel effectPointModel = (EffectPointModel) this.f72176f.get(i);
            if (effectPointModel.getSelectColor() != 0) {
                this.f72175e.setColor(effectPointModel.getSelectColor());
                this.f72175e.setAlpha(230);
                if (!effectPointModel.isFromEnd()) {
                    this.f72179i.set(((float) effectPointModel.getStartPoint()) * this.f72171a, 0.0f, ((float) effectPointModel.getEndPoint()) * this.f72171a, (float) this.f72173c);
                } else {
                    this.f72179i.set(((float) effectPointModel.getEndPoint()) * this.f72171a, 0.0f, ((float) effectPointModel.getStartPoint()) * this.f72171a, (float) this.f72173c);
                }
                if (effectPointModel.getStartPoint() == 0 && effectPointModel.getEndPoint() == this.f72180j) {
                    canvas.drawRoundRect(this.f72179i, (float) (this.f72173c / 2), (float) (this.f72173c / 2), this.f72175e);
                } else {
                    canvas.drawRect(this.f72179i, this.f72175e);
                }
            }
        }
    }

    public VEEffectSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f72173c = MeasureSpec.getSize(i2);
        if (this.f72178h == null) {
            this.f72178h = new RectF();
        }
        this.f72178h.set(0.0f, 0.0f, (float) this.f72172b, (float) this.f72173c);
    }

    public VEEffectSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m89683a();
    }
}
