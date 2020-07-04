package com.p280ss.android.ugc.aweme.poi.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.RoundBgTextView */
public class RoundBgTextView extends DmtTextView {

    /* renamed from: b */
    private Paint f93070b;

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (width > 0 && height > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
            float f = (float) (height / 2);
            canvas.drawRoundRect(rectF, f, f, this.f93070b);
        }
        super.onDraw(canvas);
    }
}
