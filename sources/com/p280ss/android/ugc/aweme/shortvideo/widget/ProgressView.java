package com.p280ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.ProgressView */
public class ProgressView extends DmtTextView {

    /* renamed from: b */
    private int f108322b;

    /* renamed from: c */
    private Paint f108323c;

    /* renamed from: d */
    private int f108324d;

    /* renamed from: e */
    private int f108325e;

    /* renamed from: f */
    private int f108326f;

    /* renamed from: g */
    private RectF f108327g;

    public void setProgress(int i) {
        if (i >= 0 && i <= 100 && this.f108322b != i) {
            this.f108322b = i;
            StringBuilder sb = new StringBuilder();
            sb.append(this.f108322b);
            sb.append("%");
            setText(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        int i = width / 2;
        int i2 = height / 2;
        int i3 = this.f108324d / 2;
        int min = Math.min(i, i2) - i3;
        this.f108323c.setColor(this.f108325e);
        this.f108323c.setStrokeWidth((float) this.f108324d);
        this.f108323c.setStyle(Style.STROKE);
        canvas.drawCircle((float) i, (float) i2, (float) min, this.f108323c);
        this.f108323c.setColor(this.f108326f);
        float f = (float) (i3 + 0);
        this.f108327g.set(f, f, (float) (width - i3), (float) (height - i3));
        canvas.drawArc(this.f108327g, 270.0f, (float) ((this.f108322b * 360) / 100), false, this.f108323c);
    }
}
