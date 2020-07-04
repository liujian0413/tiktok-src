package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowVideoViewHolderPlanD */
public class InsFollowVideoViewHolderPlanD extends InsFollowVideoViewHolderPlanA {
    /* renamed from: a */
    private final void m110718a(int i, float f, int[] iArr) {
        if (f > 1.2533333f) {
            iArr[1] = (int) (((float) i) * 1.2533333f);
            iArr[0] = (int) (((float) iArr[1]) / 1.5933334f);
            return;
        }
        iArr[1] = (int) (((float) i) * f);
        iArr[0] = i - (((int) C9738o.m28708b(mo75261ab(), 16.0f)) * 2);
    }

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
            m110718a(C9738o.m28691a(mo75261ab()), ((float) i2) / ((float) i), iArr);
            layoutParams2.width = iArr[0];
            layoutParams2.height = iArr[1];
            layoutParams2.leftMargin = (int) C9738o.m28708b(mo75261ab(), 16.0f);
            layoutParams2.rightMargin = (int) C9738o.m28708b(mo75261ab(), 16.0f);
            view.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    public InsFollowVideoViewHolderPlanD(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
    }
}
