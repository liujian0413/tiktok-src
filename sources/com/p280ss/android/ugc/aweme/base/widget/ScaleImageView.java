package com.p280ss.android.ugc.aweme.base.widget;

import android.content.Context;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.p280ss.android.ugc.aweme.p1416n.C34033b;

/* renamed from: com.ss.android.ugc.aweme.base.widget.ScaleImageView */
public final class ScaleImageView extends AppCompatImageView {
    /* renamed from: a */
    private void m77196a() {
        setOnTouchListener(new C34033b(1.2f, 100, null));
    }

    public ScaleImageView(Context context) {
        super(context);
        m77196a();
    }

    public ScaleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m77196a();
    }

    public ScaleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m77196a();
    }
}
