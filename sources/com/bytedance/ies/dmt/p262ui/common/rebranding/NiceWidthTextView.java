package com.bytedance.ies.dmt.p262ui.common.rebranding;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.bytedance.ies.dmt.p262ui.common.rebranding.C10779a.C10780a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.NiceWidthTextView */
public class NiceWidthTextView extends DmtTextView {

    /* renamed from: b */
    public C10781b f28894b;

    public NiceWidthTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final NiceWidthTextView mo25767a(C10781b bVar) {
        this.f28894b = bVar;
        return this;
    }

    public NiceWidthTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        if (this.f28894b != null) {
            C10780a a = C10779a.m31456a(this.f28894b.getClass());
            if (a == null || !a.f28898a) {
                i3 = this.f28894b.mo25768a(this);
                C10779a.m31458a(this.f28894b.getClass(), new C10780a(i3));
            } else {
                i3 = a.f28899b;
            }
            i = MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public NiceWidthTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
