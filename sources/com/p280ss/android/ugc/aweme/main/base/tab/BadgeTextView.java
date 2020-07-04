package com.p280ss.android.ugc.aweme.main.base.tab;

import android.widget.TextView.BufferType;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.main.base.tab.BadgeTextView */
public class BadgeTextView extends DmtTextView {
    public void setBadgeCount(int i) {
        setText(m106471a(i));
    }

    /* renamed from: a */
    private static String m106471a(int i) {
        if (i < 0) {
            return "New";
        }
        if (i > 99) {
            return "99+";
        }
        if (i <= 0 || i > 99) {
            return null;
        }
        return String.valueOf(i);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (charSequence == null || charSequence.toString().equalsIgnoreCase("0")) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }
}
