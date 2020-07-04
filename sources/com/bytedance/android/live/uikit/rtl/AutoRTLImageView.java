package com.bytedance.android.live.uikit.rtl;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.ImageView;

public class AutoRTLImageView extends ImageView {
    public AutoRTLImageView(Context context) {
        this(context, null);
    }

    public void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (drawable != null && VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(true);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null && VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(true);
        }
    }

    /* renamed from: a */
    private void m13141a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            if (background != null) {
                background.setAutoMirrored(true);
            }
        }
    }

    public AutoRTLImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoRTLImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m13141a(context);
    }
}
