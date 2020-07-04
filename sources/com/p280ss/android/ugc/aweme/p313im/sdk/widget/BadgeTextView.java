package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView.BufferType;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.BadgeTextView */
public class BadgeTextView extends DmtTextView {
    public BadgeTextView(Context context) {
        super(context);
    }

    public void setBadgeCount(int i) {
        setText(m103807a(i));
    }

    /* renamed from: a */
    private static String m103807a(int i) {
        if (i < 0) {
            return null;
        }
        if (i > 99) {
            return "99+";
        }
        if (i <= 0 || i > 99) {
            return null;
        }
        return String.valueOf(i);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setText(CharSequence charSequence, BufferType bufferType) {
        if (charSequence == null || charSequence.toString().equalsIgnoreCase("0")) {
            setVisibility(8);
        } else {
            setVisibility(0);
        }
        super.setText(charSequence, bufferType);
    }

    public BadgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
