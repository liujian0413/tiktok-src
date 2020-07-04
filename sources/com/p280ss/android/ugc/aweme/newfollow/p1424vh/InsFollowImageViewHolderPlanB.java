package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29376j;
import com.p280ss.android.ugc.aweme.flowfeed.p1256ui.FollowFeedLayout;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21743a;
import com.p280ss.android.ugc.aweme.flowfeed.p969b.C21744b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.InsFollowImageViewHolderPlanB */
public class InsFollowImageViewHolderPlanB extends InsFollowImageViewHolderPlanA {
    public InsFollowImageViewHolderPlanB(FollowFeedLayout followFeedLayout, C21744b bVar, C29376j jVar, C21743a aVar) {
        C7573i.m23587b(followFeedLayout, "view");
        C7573i.m23587b(bVar, "provider");
        C7573i.m23587b(jVar, "scrollStateManager");
        C7573i.m23587b(aVar, "diggAwemeListener");
        super(followFeedLayout, bVar, jVar, aVar);
    }

    /* renamed from: a */
    public final void mo86991a(int i, int i2, float f, float f2, int[] iArr) {
        C7573i.m23587b(iArr, "dstSize");
        float f3 = ((float) i2) * 0.56f;
        if (f2 > 1.3333334f) {
            iArr[1] = (int) f3;
            iArr[0] = (int) (((float) iArr[1]) / 1.5933334f);
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
