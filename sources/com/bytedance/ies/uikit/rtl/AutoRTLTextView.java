package com.bytedance.ies.uikit.rtl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class AutoRTLTextView extends AppCompatTextView {
    public AutoRTLTextView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private void m32420a(Context context) {
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
        m32420a(context);
    }
}
