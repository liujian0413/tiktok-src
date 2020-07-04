package com.p280ss.android.ugc.aweme.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.p280ss.android.ugc.aweme.i18n.C30538p;

/* renamed from: com.ss.android.ugc.aweme.views.FakeBoldTextView */
public class FakeBoldTextView extends DmtTextView {
    /* renamed from: a */
    private void m137581a() {
        if (getPaint() != null && C30538p.m99745a()) {
            getPaint().setFakeBoldText(true);
        }
    }

    public FakeBoldTextView(Context context) {
        super(context);
        m137581a();
    }

    public FakeBoldTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m137581a();
    }

    public FakeBoldTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m137581a();
    }
}
