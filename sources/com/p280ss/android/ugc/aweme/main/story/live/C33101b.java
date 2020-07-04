package com.p280ss.android.ugc.aweme.main.story.live;

import android.content.Context;
import com.bytedance.common.utility.C9738o;
import com.p280ss.android.ugc.aweme.main.story.live.p1388a.C33093a;
import com.p280ss.android.ugc.aweme.main.story.live.p1388a.C33094b;
import com.p280ss.android.ugc.aweme.main.story.live.p1388a.C33097c;
import com.p280ss.android.ugc.aweme.main.story.live.view.AbsLiveStoryItemView;
import com.p280ss.android.ugc.aweme.main.story.live.view.C33107b;
import com.p280ss.android.ugc.aweme.main.story.live.view.C33108c;
import com.p280ss.android.ugc.aweme.setting.C7213d;

/* renamed from: com.ss.android.ugc.aweme.main.story.live.b */
public final class C33101b {
    /* renamed from: a */
    public static C33092a m106843a(Context context, boolean z) {
        C33093a aVar;
        int ae = C7213d.m22500a().mo18767ae();
        AbsLiveStoryItemView absLiveStoryItemView = null;
        if (ae == 1) {
            absLiveStoryItemView = new C33107b(context, z);
            absLiveStoryItemView.setPadding((int) C9738o.m28708b(context, 16.0f), 0, 0, 0);
            aVar = new C33094b();
        } else if (ae == 0) {
            absLiveStoryItemView = new C33108c(context, z);
            absLiveStoryItemView.setPadding((int) C9738o.m28708b(context, 16.0f), (int) C9738o.m28708b(context, 2.0f), 0, 0);
            aVar = new C33097c();
        } else {
            aVar = null;
        }
        aVar.mo64472a(absLiveStoryItemView);
        return new C33102c(absLiveStoryItemView, aVar);
    }
}
