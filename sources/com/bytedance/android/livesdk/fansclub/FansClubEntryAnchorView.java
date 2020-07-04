package com.bytedance.android.livesdk.fansclub;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class FansClubEntryAnchorView extends LinearLayout implements C5902e {
    public float getAnchorY() {
        return getY() + (((float) getHeight()) / 2.0f);
    }

    public float getAnchorX() {
        return getX() + ((((float) getWidth()) * 3.0f) / 4.0f);
    }

    public FansClubEntryAnchorView(Context context) {
        this(context, null);
    }

    public FansClubEntryAnchorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public FansClubEntryAnchorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
