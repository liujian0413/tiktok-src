package com.bytedance.ies.dmt.p262ui.widget;

import android.content.Context;
import android.support.p029v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;

/* renamed from: com.bytedance.ies.dmt.ui.widget.DmtButton */
public class DmtButton extends AppCompatButton {
    public DmtButton(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m31583a(AttributeSet attributeSet) {
        C10832b.m31784a().mo26163a((TextView) this, attributeSet);
    }

    public void setFontType(String str) {
        C10832b.m31784a().mo26164a((TextView) this, str);
    }

    public DmtButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m31583a(attributeSet);
    }

    public DmtButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m31583a(attributeSet);
    }
}
