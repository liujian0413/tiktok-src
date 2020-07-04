package com.bytedance.ies.bullet.p551ui.common.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p029v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.ui.common.view.AutoRTLImageView */
public final class AutoRTLImageView extends AppCompatImageView {
    public AutoRTLImageView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AutoRTLImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setBackground(Drawable drawable) {
        super.setBackground(drawable);
        if (drawable != null && VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(true);
        }
    }

    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        if (drawable != null && VERSION.SDK_INT >= 19) {
            drawable.setAutoMirrored(true);
        }
    }

    /* renamed from: a */
    private final void m31252a(Context context) {
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

    public AutoRTLImageView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
        m31252a(context);
    }

    public /* synthetic */ AutoRTLImageView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
