package com.p280ss.android.ugc.aweme.commercialize.views.bottomdialog;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.bottomdialog.AdBottomDialogConfirmView */
public final class AdBottomDialogConfirmView extends DmtTextView {
    public AdBottomDialogConfirmView(Context context) {
        this(context, null, 0, 6, null);
    }

    public AdBottomDialogConfirmView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final void setClickable(boolean z) {
        super.setClickable(z);
        if (z) {
            setTextColor(Color.parseColor("#fe2c55"));
        } else {
            setTextColor(Color.parseColor("#80fe2c55"));
        }
    }

    public AdBottomDialogConfirmView(Context context, AttributeSet attributeSet, int i) {
        C7573i.m23587b(context, "context");
        super(context, attributeSet, i);
    }

    public /* synthetic */ AdBottomDialogConfirmView(Context context, AttributeSet attributeSet, int i, int i2, C7571f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
