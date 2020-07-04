package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.FollowXiGuaVideoHolderExperiment6 */
public final class FollowXiGuaVideoHolderExperiment6 extends FollowXiGuaVideoHolderExperiment12 {
    /* renamed from: a */
    public final void mo68503a(View view, int i, int i2) {
        C7573i.m23587b(view, "view");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            m87831a(C9738o.m28691a(mo75261ab()), C9738o.m28708b(mo75261ab(), 16.0f), ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: a */
    private static void m87831a(int i, float f, float f2, int[] iArr) {
        if (f2 >= 1.0f) {
            iArr[0] = (int) ((((float) i) - (f * 2.0f)) * 0.56f);
            iArr[1] = (int) (((float) iArr[0]) * 1.0f);
            return;
        }
        iArr[0] = (int) ((((float) i) - (f * 2.0f)) * 0.7f);
        iArr[1] = (int) (((float) iArr[0]) * f2);
    }
}
