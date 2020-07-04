package com.p280ss.android.ugc.aweme.detail.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.detail.views.SearchTabTextView */
public class SearchTabTextView extends DmtTextView {
    public SearchTabTextView(Context context) {
        super(context);
    }

    public void setSelected(boolean z) {
        super.setSelected(z);
        if (C6399b.m19945u()) {
            if (z) {
                getPaint().setFakeBoldText(true);
                return;
            }
            getPaint().setFakeBoldText(false);
        }
    }

    public SearchTabTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
