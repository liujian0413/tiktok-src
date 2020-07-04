package com.p280ss.android.ugc.aweme.account.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.account.views.AutoRTLImageView */
public class AutoRTLImageView extends AppCompatImageView {
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
    private void m74044a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            Drawable drawable2 = null;
            if (VERSION.SDK_INT >= 23) {
                drawable2 = getForeground();
            }
            if (drawable != null) {
                drawable.setAutoMirrored(true);
            }
            if (background != null) {
                background.setAutoMirrored(true);
            }
            if (drawable2 != null) {
                drawable2.setAutoMirrored(true);
            }
        }
    }

    public AutoRTLImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AutoRTLImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m74044a(context);
    }
}
