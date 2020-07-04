package com.p280ss.android.ugc.aweme.account.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;

/* renamed from: com.ss.android.ugc.aweme.account.views.AutoRTLTextView */
public class AutoRTLTextView extends DmtTextView {
    public AutoRTLTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m74045a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            Drawable background = getBackground();
            Drawable[] compoundDrawables = getCompoundDrawables();
            Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
            if (background != null) {
                background.setAutoMirrored(true);
            }
            for (Drawable drawable : compoundDrawables) {
                if (drawable != null) {
                    drawable.setAutoMirrored(true);
                }
            }
            for (Drawable drawable2 : compoundDrawablesRelative) {
                if (drawable2 != null) {
                    drawable2.setAutoMirrored(true);
                }
            }
        }
    }

    public AutoRTLTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public AutoRTLTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m74045a(context);
    }
}
