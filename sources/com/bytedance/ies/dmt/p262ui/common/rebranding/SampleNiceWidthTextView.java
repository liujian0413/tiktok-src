package com.bytedance.ies.dmt.p262ui.common.rebranding;

import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;

/* renamed from: com.bytedance.ies.dmt.ui.common.rebranding.SampleNiceWidthTextView */
public class SampleNiceWidthTextView extends NiceWidthTextView implements C10781b {

    /* renamed from: c */
    private int f28895c;

    /* renamed from: d */
    private int f28896d;

    /* renamed from: a */
    public final void mo25769a(AttributeSet attributeSet) {
        super.mo25769a(attributeSet);
        mo25767a(this);
    }

    /* renamed from: a */
    public final int mo25768a(TextView textView) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(R.string.jf));
        arrayList.add(Integer.valueOf(R.string.cv7));
        arrayList.add(Integer.valueOf(R.string.cjs));
        return C10782c.m31460a(textView, arrayList, (int) C9738o.m28708b(getContext(), (float) this.f28895c), (int) C9738o.m28708b(getContext(), (float) this.f28896d));
    }
}
