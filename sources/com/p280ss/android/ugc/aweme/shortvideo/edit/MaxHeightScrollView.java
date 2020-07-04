package com.p280ss.android.ugc.aweme.shortvideo.edit;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.tools.R$styleable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.MaxHeightScrollView */
public final class MaxHeightScrollView extends ScrollView {

    /* renamed from: a */
    private int f102285a;

    public final void setMaxHeightDp(int i) {
        this.f102285a = i;
        invalidate();
    }

    public MaxHeightScrollView(Context context) {
        C7573i.m23587b(context, "context");
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, MeasureSpec.makeMeasureSpec(C23486n.m77122a((double) this.f102285a), Integer.MIN_VALUE));
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.MaxHeightScrollView, 0, 0);
        try {
            this.f102285a = obtainStyledAttributes.getInteger(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public MaxHeightScrollView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(attributeSet, "attrs");
        super(context, attributeSet, i);
    }
}
