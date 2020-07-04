package com.p280ss.android.ugc.aweme.poi.widget;

import android.content.Context;
import android.graphics.Paint.FontMetrics;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.poi.widget.VerticalCenteredTextView */
public class VerticalCenteredTextView extends DmtTextView {
    public VerticalCenteredTextView(Context context) {
        super(context);
    }

    public VerticalCenteredTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        FontMetrics fontMetrics = getPaint().getFontMetrics();
        setTranslationY(((fontMetrics.descent - fontMetrics.ascent) / 2.0f) - ((float) (measuredHeight / 2)));
    }

    public VerticalCenteredTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
