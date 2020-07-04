package com.p280ss.android.ugc.aweme.shortvideo;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.p1416n.C34033b;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ScaleOnTouchTextView */
public class ScaleOnTouchTextView extends DmtTextView {
    /* renamed from: a */
    private void m122680a() {
        setOnTouchListener(new C34033b(1.2f, 200, null));
    }

    public ScaleOnTouchTextView(Context context) {
        super(context);
        m122680a();
    }

    public ScaleOnTouchTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m122680a();
    }

    public ScaleOnTouchTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m122680a();
    }
}
