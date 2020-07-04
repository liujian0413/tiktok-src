package com.p280ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.StateDmtTextView */
public class StateDmtTextView extends DmtTextView {

    /* renamed from: b */
    private C25510a f67212b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.views.StateDmtTextView$a */
    public interface C25510a {
        /* renamed from: a */
        void mo66257a();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        C25510a aVar = this.f67212b;
        if (aVar != null) {
            aVar.mo66257a();
        }
    }

    public StateDmtTextView(Context context) {
        super(context);
    }

    public void setOnStateChangedListener(C25510a aVar) {
        this.f67212b = aVar;
    }

    public StateDmtTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StateDmtTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
