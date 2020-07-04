package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.support.p029v7.widget.AppCompatRadioButton;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtRadioButton */
public class DmtRadioButton extends AppCompatRadioButton {
    public DmtRadioButton(Context context) {
        this(context, null, R.attr.xe);
    }

    public void setFontType(String str) {
        C10832b.m31784a().mo26164a((TextView) this, str);
    }

    /* renamed from: a */
    private void m31611a(Context context, AttributeSet attributeSet) {
        C10832b.m31784a().mo26163a((TextView) this, attributeSet);
    }

    public DmtRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.xe);
    }

    public DmtRadioButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31611a(context, attributeSet);
    }
}
