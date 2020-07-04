package com.p280ss.android.ugc.aweme.tools.draft;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.p280ss.android.ugc.aweme.shortvideo.p1587q.C40245b;
import com.p280ss.android.ugc.aweme.views.MentionTextView;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ExpandableMentionTextView */
public final class ExpandableMentionTextView extends MentionTextView implements C40245b {

    /* renamed from: d */
    private int f110023d;

    public final int getHookAtMaxWidth() {
        return this.f110023d;
    }

    public ExpandableMentionTextView(Context context) {
        C7573i.m23587b(context, "ctx");
        super(context);
    }

    public final void onMeasure(int i, int i2) {
        this.f110023d = MeasureSpec.getSize(i);
        super.onMeasure(i, i2);
    }

    public ExpandableMentionTextView(Context context, AttributeSet attributeSet) {
        C7573i.m23587b(context, "ctx");
        super(context, attributeSet);
    }

    public ExpandableMentionTextView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "ctx");
        super(context, attributeSet, i);
    }
}
