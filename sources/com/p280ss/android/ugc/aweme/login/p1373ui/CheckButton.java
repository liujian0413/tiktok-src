package com.p280ss.android.ugc.aweme.login.p1373ui;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtButton;
import com.p280ss.android.ugc.aweme.p1416n.C34033b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.login.ui.CheckButton */
public class CheckButton extends DmtButton {
    public CheckButton(Context context) {
        this(context, null);
    }

    public CheckButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackgroundResource(R.drawable.oh);
        setOnTouchListener(new C34033b(1.2f, 100, null));
    }
}
