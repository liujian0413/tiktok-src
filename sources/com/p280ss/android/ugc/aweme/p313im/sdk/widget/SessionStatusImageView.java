package com.p280ss.android.ugc.aweme.p313im.sdk.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.SessionStatusImageView */
public class SessionStatusImageView extends AutoRTLImageView {
    public SessionStatusImageView(Context context) {
        super(context);
    }

    public void setImageDrawable(Drawable drawable) {
        int i;
        if (drawable == null) {
            i = 8;
        } else {
            i = 0;
        }
        setVisibility(i);
        super.setImageDrawable(drawable);
    }

    public SessionStatusImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SessionStatusImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
