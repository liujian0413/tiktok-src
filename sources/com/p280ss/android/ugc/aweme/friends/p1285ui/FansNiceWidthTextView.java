package com.p280ss.android.ugc.aweme.friends.p1285ui;

import com.bytedance.ies.dmt.p262ui.common.rebranding.C10781b;
import com.bytedance.ies.dmt.p262ui.common.rebranding.NiceWidthTextView;
import kotlin.TypeCastException;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.FansNiceWidthTextView */
public final class FansNiceWidthTextView extends NiceWidthTextView {
    public final void onMeasure(int i, int i2) {
        if (this.f28894b instanceof FansFollowUserBtn) {
            C10781b bVar = this.f28894b;
            if (bVar != null) {
                FansFollowUserBtn fansFollowUserBtn = (FansFollowUserBtn) bVar;
                if (fansFollowUserBtn.getMaxWidth() <= fansFollowUserBtn.getDefaultMeasureNiceWidth()) {
                    fansFollowUserBtn.mo76490a();
                }
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.friends.ui.FansFollowUserBtn");
            }
        }
        super.onMeasure(i, i2);
    }
}
