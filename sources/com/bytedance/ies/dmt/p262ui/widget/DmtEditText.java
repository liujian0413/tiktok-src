package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.support.p029v7.widget.AppCompatEditText;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtEditText */
public class DmtEditText extends AppCompatEditText {
    public DmtEditText(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m31601a(AttributeSet attributeSet) {
        C10832b.m31784a().mo26163a((TextView) this, attributeSet);
    }

    public void setFontType(String str) {
        C10832b.m31784a().mo26164a((TextView) this, str);
    }

    public DmtEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m31601a(attributeSet);
    }

    public DmtEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31601a(attributeSet);
    }
}
