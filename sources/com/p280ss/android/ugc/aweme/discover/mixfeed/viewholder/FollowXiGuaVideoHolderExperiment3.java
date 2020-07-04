package com.p280ss.android.ugc.aweme.discover.mixfeed.viewholder;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import kotlin.TypeCastException;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.viewholder.FollowXiGuaVideoHolderExperiment3 */
public final class FollowXiGuaVideoHolderExperiment3 extends FollowXiGuaVideoHolderExperiment12 {
    /* renamed from: a */
    public final void mo68503a(View view, int i, int i2) {
        LayoutParams layoutParams;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int[] iArr = new int[2];
            m87823a(C9738o.m28691a(mo75261ab()), C9738o.m28709b(mo75261ab()), C9738o.m28708b(mo75261ab(), 16.0f), ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: a */
    private static void m87823a(int i, int i2, float f, float f2, int[] iArr) {
        float f3 = ((float) i2) * 0.56f;
        if (f2 > 1.0f) {
            iArr[1] = (int) f3;
            iArr[0] = (int) (((float) iArr[1]) / 1.0f);
            int i3 = (int) ((((float) i) * 0.85f) - f);
            if (iArr[0] > i3) {
                iArr[0] = i3;
            }
        } else {
            iArr[0] = (int) (((float) i) - (f * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) * f2);
            if (((float) iArr[1]) > f3) {
                iArr[1] = (int) f3;
                iArr[0] = (int) (((float) iArr[1]) / f2);
            }
        }
    }
}
