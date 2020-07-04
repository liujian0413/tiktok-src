package com.p280ss.android.ugc.aweme.favorites.p1215ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.favorites.ui.DmtTabTextView */
public class DmtTabTextView extends DmtTextView {
    public DmtTabTextView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo25769a(AttributeSet attributeSet) {
        super.mo25769a(attributeSet);
    }

    public void setSelected(boolean z) {
        String str;
        super.setSelected(z);
        if (z) {
            str = C10834d.f29337g;
        } else {
            str = C10834d.f29331a;
        }
        setFontType(str);
        if (!C6399b.m19944t()) {
            if (z) {
                getPaint().setFakeBoldText(true);
                setTextColor(getResources().getColor(R.color.ab0));
                return;
            }
            getPaint().setFakeBoldText(false);
            setTextColor(getResources().getColor(R.color.so));
        }
    }
}
