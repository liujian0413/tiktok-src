package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.feed.model.RelationDynamicLabel;

/* renamed from: com.ss.android.ugc.aweme.views.RelationLabelTextView */
public class RelationLabelTextView extends DmtTextView {

    /* renamed from: b */
    private RelationDynamicLabel f112283b;

    public RelationLabelTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo105199a(RelationDynamicLabel relationDynamicLabel) {
        this.f112283b = relationDynamicLabel;
        if (this.f112283b == null || TextUtils.isEmpty(this.f112283b.getLabelInfo())) {
            setVisibility(8);
            return;
        }
        setText(this.f112283b.getLabelInfo());
        setVisibility(0);
    }

    public RelationLabelTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RelationLabelTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
